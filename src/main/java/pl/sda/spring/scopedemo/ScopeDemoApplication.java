package pl.sda.spring.scopedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ScopeDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ScopeDemoApplication.class, args);
        MainClass mainClass = context.getBean(MainClass.class);
        System.out.println(mainClass.hello());

        MainClass mainClass2 = context.getBean(MainClass.class);
        System.out.println(mainClass2.hello());

        MainClass mainClass3 = context.getBean(MainClass.class);
        System.out.println(mainClass3.hello());
    }

}
