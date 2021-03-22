package com.zoo.animals;

public class AnimalSecond extends Animals {


    public AnimalSecond(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void voice() {
        System.out.println("VoiceSecond");
    }

    @Override
    public void laserBeams() {
        super.laserBeams();
    }

    public void mine(){
        System.out.println("mine");
    }
    public void set(){
        System.out.println("Set");
    }
}
