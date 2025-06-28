package org.example;

public class Car {

    IEngine engine;

    public Car() {
        System.out.println("Car(): constructor");

    }
    public void setEngine(IEngine engine) {
        System.out.println("SetEngine() method called");
        this.engine = engine;
    }

    public void drive() {
        int status=engine.start();
        if(status>=1) {
            System.out.println("journey Started");
        }else {
            System.out.println("Engine have trouble");
        }

    }
}
