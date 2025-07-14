package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.binding.Address;
import org.example.binding.Passenger;

import java.io.File;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        Address address = new Address();
        address.setStreet("Las Angles Street");
        address.setCity("Las Angles City");
        address.setState("New York");
        address.setCountry("USA");
        address.setZip("1111111");


        Passenger passenger = new Passenger();
        passenger.setName("John Doe");
        passenger.setAge(22);
        passenger.setGender("Male");
        passenger.setSeatNumber(12342);
        passenger.setAddress(address);

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("passenger.json"), passenger);
        System.out.println("Done......");
    }
}