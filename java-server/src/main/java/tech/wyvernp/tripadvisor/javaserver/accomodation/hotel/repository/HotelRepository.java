package tech.wyvernp.tripadvisor.javaserver.accomodation.hotel.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.wyvernp.tripadvisor.javaserver.accomodation.hotel.entity.Hotel;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Long>{

//    @Query(value = "Select * from Hotel  where UPPER(Hotel.name) LIKE UPPER(CONCAT('%',:name,'%')) \n-- #pageable\n"
//            ,countQuery = "Select count(*) from Hotel  where UPPER(Hotel.name) LIKE UPPER(CONCAT('%',:name,'%')) \n-- #pageable\n"
//            ,nativeQuery = true)
//    List<Hotel> findHotelsByNameContainingIgnoreCase( String name);

//    Page<Hotel> findAllByNameContainingIgnoreCase(String name, Pageable pageable);

}
