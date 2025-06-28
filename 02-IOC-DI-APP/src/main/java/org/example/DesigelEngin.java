package org.example;

public class DesigelEngin implements IEngine{

    public  DesigelEngin(){
        System.out.println("Inside DesigelEngin");
    }
    @Override
    public int start() {
        System.out.println(" Desigel");
        return 1;
    }
}
