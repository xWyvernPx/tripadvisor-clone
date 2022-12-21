package tech.wyvernp.tripadvisor.javaserver.user;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.springframework.context.annotation.Primary;
import tech.wyvernp.tripadvisor.javaserver.accomodation.hotel.entity.HotelReservation;
import tech.wyvernp.tripadvisor.javaserver.user.entity.Invoice;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "customer")
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 100)
    private String firstname;
    @Column(length = 100)

    private String lastname;

    private String password;
    @Column(unique = true)
    private String email;
    @Column (unique = true)
    private String phone;

    @OneToMany(mappedBy = "customer")
    private Collection<HotelReservation> reservations = new ArrayList<>();

    @OneToMany(mappedBy = "customer")
    private Collection<Invoice> invoices = new ArrayList<>();

}
