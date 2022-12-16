package tech.wyvernp.tripadvisor.javaserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import tech.wyvernp.tripadvisor.javaserver.hotel.entity.Hotel;
import tech.wyvernp.tripadvisor.javaserver.hotel.entity.HotelPhoto;
import tech.wyvernp.tripadvisor.javaserver.hotel.repository.HotelRepository;

import java.util.Arrays;

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
        HotelPhoto photo = new HotelPhoto();
        HotelPhoto photo2 = new HotelPhoto();
        HotelPhoto photo3 = new HotelPhoto();
        HotelPhoto photo4 = new HotelPhoto();
        photo.setDescription("Hehe");
        photo.setUrl("https://source.unsplash.com/random");
        photo2.setDescription("Phto Demo 1");
        photo2.setUrl("https://source.unsplash.com/random");
        photo3.setDescription("Photo Demo 2");
        photo3.setUrl("https://source.unsplash.com/random");
        photo4.setDescription("Photo Demo 3");
        photo4.setUrl("https://source.unsplash.com/random");
//        repo.save(photoType);
        var hotel1 = new Hotel();
        hotel1.setName("REX");
        hotel1.setPhotos(Arrays.asList(photo,photo2,photo3,photo4));
        var hotel2 = new Hotel();

//        System.out.println("YEH YEH");
    }
}
