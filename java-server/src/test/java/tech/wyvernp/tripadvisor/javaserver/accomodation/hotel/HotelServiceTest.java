package tech.wyvernp.tripadvisor.javaserver.accomodation.hotel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;
import tech.wyvernp.tripadvisor.javaserver.hotel.entity.Hotel;
import tech.wyvernp.tripadvisor.javaserver.hotel.repository.HotelRepository;
import tech.wyvernp.tripadvisor.javaserver.hotel.service.HotelService;

import java.util.ArrayList;

@TestComponent
@SpringBootTest
public class HotelServiceTest {
    @Autowired
    HotelService hotelService;
    @Autowired
    HotelRepository hotelRepository;
    @Test
    public void TestSearchHotelsByNameWithValidArgsInRepository() {
        String term = "nang";
//        Page 1
        Pageable pagi = PageRequest.of(0,10);
        int expectedSizeOfResults = 10;
        Assertions.assertEquals(expectedSizeOfResults,hotelRepository.findAllByNameContainingIgnoreCase(term,pagi).stream().toArray().length);
//        Page 2
        pagi = PageRequest.of(1,10);
        expectedSizeOfResults = 9;
        Assertions.assertEquals(expectedSizeOfResults,hotelRepository.findAllByNameContainingIgnoreCase(term,pagi).stream().toArray().length);

    }
    @Test
    public void TestGetHotelByIdInRepository() {
        long id  = 1;
        String expectedHotelNameContainWords = "HAIAN";
        Assertions.assertEquals(true,hotelRepository.findById(id).get().getName().contains(expectedHotelNameContainWords));
    }
    @Test
    public void TestSearchHotelsByNameWithValidArgsInService() {
        String term = "nang";
//        Page 1
        Pageable pagi = PageRequest.of(0,10);
        int expectedSizeOfResults = 10;
        Assertions.assertEquals(expectedSizeOfResults,hotelService.setPagination(pagi).searchHotelsWithName(term).stream().toArray().length);
//        Page 2
        pagi = PageRequest.of(1,10);
        expectedSizeOfResults = 9;
        Assertions.assertEquals(expectedSizeOfResults,hotelService.setPagination(pagi).searchHotelsWithName(term).stream().toArray().length);

    }
    @Test
    public void TestGetHotelByIdInService() {
        long id  = 1;
        String expectedHotelNameContainWords = "HAIAN";
        Assertions.assertEquals(true,hotelService.getById(id).getName().contains(expectedHotelNameContainWords));
    }


}
