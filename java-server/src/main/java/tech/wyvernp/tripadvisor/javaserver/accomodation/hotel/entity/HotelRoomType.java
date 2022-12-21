package tech.wyvernp.tripadvisor.javaserver.accomodation.hotel.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class HotelRoomType {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private String typeName;

    @OneToMany(mappedBy = "roomType")
    private List<HotelRoom> rooms = new ArrayList<>();

}
