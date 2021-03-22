package com.zoo.animals;

public class AnimalFirst extends Animals {

    public AnimalFirst(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void voice() {
        System.out.println("VoiceFirst");
    }

    @Override
    public void laserBeams() {
        super.laserBeams();
    }

    public void grenade(){
        System.out.println("grenade");
    }
    public void throwG(){
        System.out.println("Throw");
    }
}
