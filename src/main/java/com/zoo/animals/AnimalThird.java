package com.zoo.animals;

public class AnimalThird extends Animals{
    public AnimalThird(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("VoiceThird");
    }

    @Override
    public void laserBeams() {
        super.laserBeams();
    }

    @Override
    public void eat() {
        super.eat();
    }

    public void shoot(){
        System.out.println("shoot");
    }
    public void pistol(){
        System.out.println("Pistol");
    }
}
