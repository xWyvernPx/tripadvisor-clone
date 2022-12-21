package tech.wyvernp.tripadvisor.javaserver.accomodation.hotel.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;
import tech.wyvernp.tripadvisor.javaserver.user.User;
import tech.wyvernp.tripadvisor.javaserver.user.entity.Invoice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class HotelReservation {
    @Id
    @GeneratedValue
    private long id;

    private LocalDateTime startDate;

    private LocalDateTime endDate;
    @Column(nullable = true)
    private float discount_percent;
    @Column(nullable = true)
    private double totalPrice;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;
    @ManyToMany(mappedBy = "reservations")
    private Collection<HotelRoom> rooms;

    @OneToMany(mappedBy = "reservation")
    private Collection<Invoice> invoives = new ArrayList<>();

}
