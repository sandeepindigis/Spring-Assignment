package org.example;

public class Car {

    private IEngine engine;

    public Car() {
        System.out.println("Car constructor");
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }
    public Car(IEngine engine) {
        this.engine = engine;
    }

    public void drive() {
        int status=engine.start();

        if(status>=1){
            System.out.println("Car is running");
        }else {
            System.out.println("Car is stopped");
        }
    }


}
