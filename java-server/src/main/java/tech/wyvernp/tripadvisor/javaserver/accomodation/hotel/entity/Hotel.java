package tech.wyvernp.tripadvisor.javaserver.accomodation.hotel.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.BatchSize;
import tech.wyvernp.tripadvisor.javaserver.accomodation.common.entity.Accomodation;
import tech.wyvernp.tripadvisor.javaserver.common.entity.Location;

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
    private String thumbnail;

    @Column
    private String hotelClass;
    @Column
    private String phoneNumber;
    @Column
    private String email;
    @OneToMany(cascade=CascadeType.ALL,
    mappedBy = "hotel"
    )
    @BatchSize(size = 20)
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
    @JsonBackReference

    private HotelType hotelType;

    @OneToOne
    @JoinColumn(name = "accomdation_id",nullable = false,unique = true)
    private Accomodation accomodation;

    @OneToMany(mappedBy = "hotel")
    private Collection<HotelRoom> rooms = new ArrayList<>();


}