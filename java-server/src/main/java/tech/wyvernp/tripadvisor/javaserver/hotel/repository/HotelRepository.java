package tech.wyvernp.tripadvisor.javaserver.hotel.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tech.wyvernp.tripadvisor.javaserver.hotel.entity.Hotel;

import java.util.List;
@Repository
public interface HotelRepository extends JpaRepository<Hotel,Long>{

    @Query(value = "Select * from Hotel  where Hotel.name LIKE CONCAT('%',:name,'%') \n-- #pageable\n"
            ,countQuery = "Select count(*) from Hotel  where Hotel.name LIKE CONCAT('%',:name,'%')"
            ,nativeQuery = true)
    Page<Hotel> searchHotelsByName(@Param("name") String name,Pageable pageable);
}
