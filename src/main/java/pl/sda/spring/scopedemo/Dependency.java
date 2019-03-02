package pl.sda.spring.scopedemo;

import org.springframework.stereotype.Component;

@Component
public class Dependency {
    public String hello(){
        return this.toString();
    }
}
