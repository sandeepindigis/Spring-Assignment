package org.example;

public class PatrolEngine implements IEngine {

    public PatrolEngine() {
        System.out.println("PatrolEngine");
    }
    @Override
    public int start() {
        System.out.println(" Patrol");
        return 1;
    }
}
