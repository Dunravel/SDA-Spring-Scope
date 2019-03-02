package pl.sda.spring.scopedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ScopeDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext con = SpringApplication.run(ScopeDemoApplication.class, args);

    }

}
