package org.example.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example", "com.example"})
public class AppConfig {

    public AppConfig() {
        System.out.println("AppConfigClass constructor");
    }

    @Bean
    public Robot robot() {
        return new Robot();
    }
}
