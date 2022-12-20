package tech.wyvernp.tripadvisor.javaserver.hotel.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import tech.wyvernp.tripadvisor.javaserver.hotel.entity.Hotel;

import java.util.List;

public interface HotelService {
    public List<Hotel> getAll();
    public Page<Hotel> searchHotelsWithName(String term);
    public HotelService setPagination(Pageable pageable);
    public Hotel getById (long id);

}
