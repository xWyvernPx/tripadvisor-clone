package tech.wyvernp.tripadvisor.javaserver.user;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.context.annotation.Primary;


@Entity
@Table(name = "account")
@Data()

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    @Column(length = 100)
    private String firstname;
    @Column(length = 100)

    private String lastname;

    private String password;
    private String email;
    private String phone ;

}
