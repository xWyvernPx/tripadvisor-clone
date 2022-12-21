package tech.wyvernp.tripadvisor.javaserver.accomodation.hotel.repository;

import org.springframework.data.repository.CrudRepository;
import tech.wyvernp.tripadvisor.javaserver.accomodation.hotel.entity.HotelPhoto;

public interface HotelPhotoRepository extends CrudRepository<HotelPhoto,Long> {

}
