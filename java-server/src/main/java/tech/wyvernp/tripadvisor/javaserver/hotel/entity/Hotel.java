package tech.wyvernp.tripadvisor.javaserver.hotel.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column(columnDefinition = "TEXT")
    private String description;
    @Column
    private String hotelClass;
    @Column
    private String phoneNumber;
    @Column
    private String email;
    @Column
    private int hotelTypeId;

    @Column
    private int addressId;
}