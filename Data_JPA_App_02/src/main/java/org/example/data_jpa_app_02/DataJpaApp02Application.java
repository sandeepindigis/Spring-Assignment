package org.example.data_jpa_app_02;

import org.example.data_jpa_app_02.Repository.ProductReopository;
import org.example.data_jpa_app_02.entity.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataJpaApp02Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context=SpringApplication.run(DataJpaApp02Application.class, args);

        ProductReopository productRepository=context.getBean(ProductReopository.class);

        Product p=new Product();

        p.setProductName("Pepsi");
        p.setProductPrice(10.00);
        Product p1=new Product();
        p1.setProductName("Cola");
        p1.setProductPrice(20.00);

        productRepository.save(p);

    }

}
