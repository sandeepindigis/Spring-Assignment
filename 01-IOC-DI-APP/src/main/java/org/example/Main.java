package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //starting ioc container
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Car car=context.getBean(Car.class);
        car.drive();


    }
}