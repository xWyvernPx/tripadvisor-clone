package tech.wyvernp.tripadvisor.javaserver.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tech.wyvernp.tripadvisor.javaserver.hotel.entity.HotelPhoto;

import java.util.List;

public interface HotelPhotoRepository extends CrudRepository<HotelPhoto,Long> {

}
