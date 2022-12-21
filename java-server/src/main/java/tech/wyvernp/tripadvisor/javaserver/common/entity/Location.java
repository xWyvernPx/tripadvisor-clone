package tech.wyvernp.tripadvisor.javaserver.common.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;
import tech.wyvernp.tripadvisor.javaserver.accomodation.common.entity.Accomodation;
import tech.wyvernp.tripadvisor.javaserver.accomodation.hotel.entity.Hotel;

@Entity
@Table
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String label;
    @Column

    private String title;
@Column
    private double lat;
@Column
private double lng;
@Column
private String countryCode;
@Column
private String countryName;
@Column
private String stateCode;
@Column
private String state;
   @Column
    private String countyCode;
    @Column
    private String county;
    @Column
    private String city;
    @Column
    private String district;
    @Column
    private String street;
    @Column
    private String postalCode;
    @Column
    private String houseNumber;
    @Column
    private double mapWest;
    @Column
    private double mapSouth;
    @Column
    private double mapEast;
    @Column
    private double mapNorth;
    @OneToOne
    @JoinColumn(name = "accomodation_id",unique = true)
    private Accomodation accomodation;
}
