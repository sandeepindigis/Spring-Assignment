package org.example.sb_rest_api_02.controller;

import org.example.sb_rest_api_02.binding.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping(value="/customer",
    produces = {"application/xml","application/json"})
    public Customer getCustomer() {
        Customer customer = new Customer();
        customer.setName("Jack");
        customer.setEmail("jack@gmail.com");
        customer.setGender("male");

        return customer;
    }

    @PostMapping(value = "/customer",
    consumes = {"application/xml","application/json"},
    produces = {"text/plain"})
    public ResponseEntity<String> getCustomerResponse(@RequestBody Customer customer) {

        System.out.println(customer);

        return new ResponseEntity<>("Customer Saved", HttpStatus.CREATED);

    }
}
