package org.example.springbootdiapp;

import org.example.springbootdiapp.services.ReportService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDiAppApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context=SpringApplication.run(SpringBootDiAppApplication.class, args);
        ReportService reportService=context.getBean(ReportService.class);
        reportService.printName(100);
    }

}
