package tech.wyvernp.tripadvisor.javaserver.hotel.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "hotel")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String thumbnail;

    @Column(columnDefinition = "TEXT")
    private String description;
    @Column
    private String hotelClass;
    @Column
    private String phoneNumber;
    @Column
    private String email;
    @OneToMany(cascade=CascadeType.ALL,
    mappedBy = "hotel"
    )
//    @JsonManagedReference
    private Collection<HotelPhoto> photos = new ArrayList<>() ;
    public void setPhotos(List<HotelPhoto> photos){
        for(var photo : photos){
            photo.setHotel(this);
        }
        this.photos = photos;
    }
    @OneToMany(cascade =  CascadeType.ALL,mappedBy = "hotel")
    private Collection<HotelReview> reviews = new ArrayList<>();
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_type_id" , nullable = false)
    private HotelType hotelType;
}