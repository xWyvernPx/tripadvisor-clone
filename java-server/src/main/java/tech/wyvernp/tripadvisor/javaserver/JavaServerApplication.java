package tech.wyvernp.tripadvisor.javaserver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class } )
public class JavaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaServerApplication.class, args);
    }
    CommandLineRunner runner = args ->{
        System.out.println("RUN");
    };

    public CommandLineRunner getRunner() {
        return runner;
    }
}
