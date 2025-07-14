package org.example.sb_rest_api_01.rest;

import org.example.sb_rest_api_01.binding.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {

    @GetMapping("/customer")
    public Customer getCustomer() {
        Customer customer = new Customer();
        customer.setName("Jack");
        customer.setEmail("jack@gmail.com");
        customer.setGender("male");

        return customer;
    }
}
