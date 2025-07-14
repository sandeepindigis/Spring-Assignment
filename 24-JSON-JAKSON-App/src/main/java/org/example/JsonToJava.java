package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.binding.Passenger;

import java.io.File;
import java.io.IOException;

public class JsonToJava  {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
       Passenger passenger=mapper.readValue(new File("passenger.json"), Passenger.class);
       System.out.println(passenger);
    }
}
