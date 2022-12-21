package tech.wyvernp.tripadvisor.javaserver.accomodation.hotel.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@Table
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class HotelRoom {
    @Id
    @GeneratedValue
    private long id;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column
    private Double current_price;

    @Column
    private int number_of_bed;


    @ManyToOne
    @JoinColumn(name = "room_type_id")
    private HotelRoomType roomType;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    @ManyToMany
    @JoinTable(name = "room_reservation",joinColumns = @JoinColumn(name = "room_id"),inverseJoinColumns = @JoinColumn(name = "reservation_id"))
    private Collection<HotelReservation> reservations = new ArrayList<>();

    public void addReservation(HotelReservation reservation){
        reservations.add(reservation);
        reservation.getRooms().add(this);
    }
    public void removeReservation(HotelReservation reservation) {
        reservations.remove(reservation);
        reservation.getRooms().remove(this);
    }

}
