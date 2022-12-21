package tech.wyvernp.tripadvisor.javaserver.user.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;
import tech.wyvernp.tripadvisor.javaserver.accomodation.hotel.entity.HotelReservation;
import tech.wyvernp.tripadvisor.javaserver.user.User;

import java.time.LocalDateTime;

@Entity
@Table
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Invoice {
    @Id
    @GeneratedValue
    private long id;

    private double invoice_amount;
    private LocalDateTime ts_issued;
    private LocalDateTime ts_paid;
    private LocalDateTime ts_canceled;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;

    @ManyToOne
    @JoinColumn(name= "reservation_id")
    private HotelReservation reservation;

}
