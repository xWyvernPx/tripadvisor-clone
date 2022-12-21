package tech.wyvernp.tripadvisor.javaserver.hotel.service.impl;

import tech.wyvernp.tripadvisor.javaserver.hotel.entity.Hotel;
import tech.wyvernp.tripadvisor.javaserver.hotel.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import tech.wyvernp.tripadvisor.javaserver.hotel.service.HotelService;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    HotelRepository hotelRepository;

    private Pageable pageable;

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Page<Hotel> searchHotelsWithName(String term) {
        return hotelRepository.findAllByNameContainingIgnoreCase(term,this.pageable);
    }

    @Override
    public HotelService setPagination(Pageable pageable) {
        this.pageable = pageable;
        return this;
    }
    @Override
    public Hotel getById (long id) {
        return hotelRepository.findById(id).get();
    }
}
