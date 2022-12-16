package tech.wyvernp.tripadvisor.javaserver.hotel.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

@Entity
@Table
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class)
public class HotelReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Temporal(TemporalType.DATE)
    private Calendar travelTime;

    private String partner;

    @Column(columnDefinition = "TEXT")
    private String reviewContent;
    @Column
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_id",nullable = false)
    private Hotel hotel;

    @OneToOne(mappedBy = "review", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private HotelRating rating;

    @OneToMany(mappedBy = "review")
    private Collection<HotelPhoto> photos = new ArrayList<>();
}
