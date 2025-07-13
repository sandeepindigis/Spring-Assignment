package org.example.springboot02app;

import org.example.springboot02app.utils.PWDUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBoot02AppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot02AppApplication.class, args);
    }

    @Bean
    public PWDUtils getPwdUtils() {
        return new PWDUtils();
    }

}
