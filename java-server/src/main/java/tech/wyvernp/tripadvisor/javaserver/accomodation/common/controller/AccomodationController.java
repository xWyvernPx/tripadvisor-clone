package tech.wyvernp.tripadvisor.javaserver.accomodation.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.wyvernp.tripadvisor.javaserver.accomodation.common.dto.AccomodationSearchDTO;
import tech.wyvernp.tripadvisor.javaserver.accomodation.common.entity.Accomodation;
import tech.wyvernp.tripadvisor.javaserver.accomodation.common.repository.AccomodationRepository;
import tech.wyvernp.tripadvisor.javaserver.dto.SimplePagination;

import java.util.List;
import java.util.function.Predicate;

@RestController
@RequestMapping(path = "/api/v1/accomodation")
public class AccomodationController {

    @Autowired
    AccomodationRepository accomodationRepository;
    @PostMapping(path = "/search")
    public Page<Accomodation> searchAccomodation(@RequestBody AccomodationSearchDTO body){
        System.out.println(body);
        Page<Accomodation> results = null ;
        Pageable pagable = PageRequest.of(body.getPagination().getPage(), body.getPagination().getLimit());
        if(body.getLocation() == null) {
            results = accomodationRepository.findAllByNameContainingIgnoreCase(body.getName(),pagable);
            return results;
        }
        switch (body.getLocation().getType()){
            case CITY -> {
                results = accomodationRepository.findAllByNameContainingIgnoreCaseAndLocation_CityContainingIgnoreCase(body.getName(),body.getLocation().getName(),pagable);
            }
            case COUNTRY -> {
                results = accomodationRepository.findAllByNameContainingIgnoreCaseAndLocation_CountryNameContainingIgnoreCase(body.getName(),body.getLocation().getName(),pagable);
            }
        }

//        return accomodationRepository.findAllByNameContainingIgnoreCaseAndLocation_CityContainingIgnoreCase("","Ha Noi");
            return results;
    }

}
