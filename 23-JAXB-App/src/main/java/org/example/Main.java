package org.example;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import org.example.binding.Address;
import org.example.binding.Person;

import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws JAXBException {

        Address address = new Address();
        address.setStreet("Street");
        address.setCity("City");
        address.setState("State");
        address.setZip("Zip");
        address.setCountry("Country");

        Person person = new Person();
        person.setName("John");
        person.setAge(22);
        person.setGender("Male");
        person.setAddress(address);

        JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
        // For marshlling
//        Marshaller marshaller = jaxbContext.createMarshaller();
//        marshaller.marshal(person, new File("person.xml"));
//        System.out.println("done.....");

//        For Unmarshlling
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Person p=(Person)jaxbUnmarshaller.unmarshal(new File("person.xml"));
        System.out.println(p);
    }
}