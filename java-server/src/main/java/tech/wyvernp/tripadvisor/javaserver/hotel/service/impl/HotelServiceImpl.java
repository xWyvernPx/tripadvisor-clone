package tech.wyvernp.tripadvisor.javaserver.hotel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.wyvernp.tripadvisor.javaserver.hotel.entity.Hotel;
import tech.wyvernp.tripadvisor.javaserver.hotel.repository.HotelRepository;
import tech.wyvernp.tripadvisor.javaserver.hotel.service.HotelService;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    HotelRepository hotelRepository;

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }
}
