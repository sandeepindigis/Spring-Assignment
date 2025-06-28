package org.example;

public class PatrolEngine implements IEngine{

    public PatrolEngine() {
        System.out.println("Patrol Engine: constructor");

    }
    @Override
    public int start() {
        System.out.println("Patrol Engine Started");
        return 1;
    }
}
