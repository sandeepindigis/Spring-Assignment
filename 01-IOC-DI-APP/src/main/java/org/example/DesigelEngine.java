package org.example;

public class DesigelEngine implements IEngine {

    public DesigelEngine() {
        System.out.println("Desigel Engine: constructor");
    }
    @Override
    public int start() {
        System.out.println("Desigel Engine Started");
        return 1;
    }
}
