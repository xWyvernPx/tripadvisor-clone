package tech.wyvernp.tripadvisor.javaserver.accomodation.restaurant.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;
import tech.wyvernp.tripadvisor.javaserver.accomodation.common.entity.Accomodation;

@Entity
@Table
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "accomodation_id",nullable = false,unique = true)
    private Accomodation accomodation;




}
