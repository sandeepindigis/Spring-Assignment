package org.example;

import org.example.beans.AppConfig;
import org.example.beans.Motor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Motor m1=context.getBean(Motor.class);
        System.out.println(m1.hashCode());

        Motor m2=context.getBean(Motor.class);
        System.out.println(m2.hashCode());
    }
}