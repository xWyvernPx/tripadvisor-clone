package tech.wyvernp.tripadvisor.javaserver.accomodation.common.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.FetchProfile;
import tech.wyvernp.tripadvisor.javaserver.accomodation.hotel.entity.Hotel;
import tech.wyvernp.tripadvisor.javaserver.accomodation.restaurant.entity.Restaurant;
import tech.wyvernp.tripadvisor.javaserver.common.entity.Location;

@Entity
@Table
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
@NamedEntityGraph(name = "Accomodation.detail",attributeNodes = {@NamedAttributeNode("hotel"),@NamedAttributeNode("restaurant")})

public class Accomodation {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY )
	private long id;

	@Column 
	private String name;

	@Column(columnDefinition = "TEXT")
	private String description;


	@Fetch(FetchMode.JOIN)
	@OneToOne(mappedBy = "accomodation" ,optional = false)
	private Hotel hotel;
	@Fetch(FetchMode.JOIN)
	@OneToOne(mappedBy = "accomodation" , optional = false)
	private Restaurant restaurant ;
	@Fetch(FetchMode.JOIN)

	@OneToOne(mappedBy = "accomodation" , optional = false,fetch = FetchType.LAZY)
	private Location location;

	
}
