package org.example.data_jpa_procedure_04;

import org.example.data_jpa_procedure_04.entity.Products;
import org.example.data_jpa_procedure_04.repository.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class DataJpaProcedure04Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext=SpringApplication.run(DataJpaProcedure04Application.class, args);

        ProductRepository productRepository=applicationContext.getBean(ProductRepository.class);
        List<Products> pr=productRepository.getAllProduct();

        pr.forEach(System.out::println);
    }

}
