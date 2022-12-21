package tech.wyvernp.tripadvisor.javaserver.hotel.repository;

import org.springframework.data.repository.CrudRepository;
import tech.wyvernp.tripadvisor.javaserver.hotel.entity.HotelPhoto;

public interface HotelPhotoRepository extends CrudRepository<HotelPhoto,Long> {

}
