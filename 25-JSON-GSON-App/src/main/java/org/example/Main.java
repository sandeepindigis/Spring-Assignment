package org.example;

import com.google.gson.Gson;
import org.example.binding.Address;
import org.example.binding.Passenger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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

        Gson gson = new Gson();
        String json = gson.toJson(passenger);
        System.out.println(json);

        System.out.println("Done.....");
    }
}