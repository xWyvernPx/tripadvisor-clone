package tech.wyvernp.tripadvisor.javaserver.accomodation.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.wyvernp.tripadvisor.javaserver.accomodation.hotel.entity.HotelReservation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<HotelReservation,Long> {
    List<HotelReservation> findAllByStartDateAfter(LocalDateTime startDate);
}
