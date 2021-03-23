package com.zoo.animals;

public class Wolf extends Animals {
    public Wolf(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void voice() {
        System.out.println("Rrrrr");
    }

    @Override
    public void laserBeams() {
        super.laserBeams();
    }
    public void bite(){
        System.out.println("Bite");
    }
    public void rabies(){
        System.out.println("Rabies");
    }

}
