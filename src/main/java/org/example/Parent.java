package org.example;

public abstract class Parent {
    protected String name;
    protected double maxHeighJump;
    protected double maxDistance;

    static int counter;
    public Parent(String name, double maxHeighJump, double maxDistance){
        this.name = name;
        this.maxHeighJump = maxHeighJump;
        this.maxDistance = maxDistance;
        counter++;
    }

    abstract void run();
    abstract void runThrough(double distance);
    abstract void jump(double distance);
    abstract void endRace();
    public String getName() {
        return name;
    }
}

















