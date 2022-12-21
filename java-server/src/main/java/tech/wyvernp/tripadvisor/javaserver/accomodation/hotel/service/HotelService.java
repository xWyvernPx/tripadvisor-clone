package tech.wyvernp.tripadvisor.javaserver.hotel.service;

import tech.wyvernp.tripadvisor.javaserver.hotel.entity.Hotel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface HotelService {
    public List<Hotel> getAll();
    public Page<Hotel> searchHotelsWithName(String term);
    public HotelService setPagination(Pageable pageable);
    public Hotel getById (long id);

}
