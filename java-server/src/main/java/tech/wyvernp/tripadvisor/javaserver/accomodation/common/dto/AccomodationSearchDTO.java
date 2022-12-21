package tech.wyvernp.tripadvisor.javaserver.accomodation.common.dto;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import tech.wyvernp.tripadvisor.javaserver.dto.SimplePagination;

import java.io.Serializable;

@Data
public class AccomodationSearchDTO implements Serializable {
    public enum LocationType {
        CITY,
        COUNTRY
    }
    @Data
    public class Location {
     private LocationType type;
     private String name;

        @Override
        public String toString() {
            return "Location{" +
                    "type=" + type +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    private Location location;
    private String name;
    private SimplePagination pagination;

    @Override
    public String toString() {
        return "AccomodationSearchDTO{" +
                "location=" + location +
                ", name='" + name + '\'' +
                '}';
    }
}
