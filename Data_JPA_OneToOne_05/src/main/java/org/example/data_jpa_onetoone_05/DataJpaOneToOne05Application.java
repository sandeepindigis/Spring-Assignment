package org.example.data_jpa_onetoone_05;

import org.example.data_jpa_onetoone_05.entity.Address;
import org.example.data_jpa_onetoone_05.entity.Employee;
import org.example.data_jpa_onetoone_05.repository.AddRepository;
import org.example.data_jpa_onetoone_05.repository.EmpRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DataJpaOneToOne05Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context=SpringApplication.run(DataJpaOneToOne05Application.class, args);

        EmpRepository empRepository=context.getBean(EmpRepository.class);

        AddRepository addRepository=context.getBean(AddRepository.class);

        Employee e=new Employee();
        e.setEmp_name("Sandeep");
        e.setEmp_salary(40000.00);

        Address address=new Address();
        address.setCity("San Francisco");
        address.setState("CA");
        address.setCountry("US");
        address.setEmp(e);

        Address address1=new Address();
        address1.setCity("New York");
        address1.setState("NY");
        address1.setCountry("US");
        address1.setEmp(e);

        List<Address> addresses= Arrays.asList(address,address1);
        e.setEmp_addresses(addresses);


//        empRepository.save(e);

//          empRepository.findById(2);

//        empRepository.deleteById(1);

        empRepository.findById(3);

        System.out.println("Record Inserted....");



    }

}
