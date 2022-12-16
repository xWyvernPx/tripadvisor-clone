package tech.wyvernp.tripadvisor.javaserver.dto;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
public class SimplePagination  {
    private int page;
    private int limit;
    private String sort;
    private Sort.Direction direction = Sort.Direction.ASC;
}
