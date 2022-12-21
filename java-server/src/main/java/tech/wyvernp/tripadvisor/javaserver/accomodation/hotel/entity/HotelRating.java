package tech.wyvernp.tripadvisor.javaserver.accomodation.hotel.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class)
public class HotelRating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private float serviceRate;
    @Column
    private float qualityRate;
    @Column
    private float cleanlinessRate;
    @Column
    private float overallRate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "review_id")
    private HotelReview review;
}
