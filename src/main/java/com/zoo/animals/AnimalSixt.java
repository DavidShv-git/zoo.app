package com.zoo.animals;

public class AnimalSixt extends Animals {
    public AnimalSixt(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void voice() {
        System.out.println("VoiceSixt");
    }

    @Override
    public void laserBeams() {
        super.laserBeams();
    }
    public void bow(){
        System.out.println("Bow");
    }
    public void shoot(){
        System.out.println("shoot");
    }

}
