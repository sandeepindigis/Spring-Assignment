package org.example;

import com.google.gson.Gson;
import org.example.binding.Passenger;

import java.io.FileReader;
import java.io.IOException;

public class JsonToJava {

    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        Passenger p= gson.fromJson(new FileReader("passenger.json"), Passenger.class);
        System.out.println(p);
    }
}
