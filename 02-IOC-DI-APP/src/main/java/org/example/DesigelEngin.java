package org.example;

public class DesigelEngin implements IEngine{

    public  DesigelEngin(){
        System.out.println("Inside DesigelEngin");
    }
    @Override
    public int start() {
        return 1;
    }
}
