package tech.wyvernp.tripadvisor.javaserver.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.beans.support.SortDefinition;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.wyvernp.tripadvisor.javaserver.dto.SimplePagination;
import tech.wyvernp.tripadvisor.javaserver.hotel.entity.Hotel;
import tech.wyvernp.tripadvisor.javaserver.hotel.repository.HotelRepository;
import tech.wyvernp.tripadvisor.javaserver.hotel.service.HotelService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(allowCredentials = "true",origins = {"http://localhost:5173"})
@RequestMapping("/api/v1/hotels")
public class HotelController {
    @Autowired
    HotelService hotelService;
    @Autowired
    HotelRepository hotelRepository;

    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotels() {
        return ResponseEntity.ok(hotelService.getAll());
    }

    @PostMapping
    public ResponseEntity<Hotel> addNewHotel(@RequestBody Hotel hotel) {
        System.out.println(hotel.getPhotos().size());
//
        return ResponseEntity.ok(hotelRepository.save(hotel));
//            return ResponseEntity.ok(null);
    }
    @PostMapping(path = "/name")
    public ResponseEntity<Page<Hotel>> findHotelsByName(@RequestBody SimplePagination pagi,@RequestParam String q) {

        Pageable pageable =  PageRequest.of(pagi.getPage(), pagi.getLimit(),Sort.by(pagi.getDirection(),pagi.getSort())) ;

        var results = hotelRepository.findHotelsByNameContainingIgnoreCase(q);
        PagedListHolder<Hotel> pageResult = new PagedListHolder<>(results);
        pageResult.setPage( pagi.getPage());
        pageResult.setPageSize(pagi.getLimit());
        pageResult.setSort(new SortDefinition() {
            @Override
            public String getProperty() {
                return "name";
            }

            @Override
            public boolean isIgnoreCase() {
                return true;
            }

            @Override
            public boolean isAscending() {
                return true;
            }
        });
        return ResponseEntity.ok(hotelRepository.findAllByNameContainingIgnoreCase(q,pageable));
    }
}
