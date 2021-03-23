package com.zoo.animals;

public class Bird extends Animals {


    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void voice() {
        System.out.println("Chik-chirik");
    }

    @Override
    public void laserBeams() {
        super.laserBeams();
    }

    public void rostrum(){
        System.out.println("Rostrum");
    }
    public void deadliest(){
        System.out.println("deadliest");
    }
}
