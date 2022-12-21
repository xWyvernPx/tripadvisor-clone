package tech.wyvernp.tripadvisor.javaserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import tech.wyvernp.tripadvisor.javaserver.accomodation.hotel.repository.HotelRepository;

@SpringBootApplication
        (exclude = {SecurityAutoConfiguration.class } )
public class JavaServerApplication implements CommandLineRunner {
    @Autowired
    HotelRepository hotelRepository;
    public static void main(String[] args) {
        SpringApplication.run(JavaServerApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {

    }
}
