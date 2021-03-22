package com.zoo.animals;

public class AnimalSeventh extends Animals {
    @Override
    public void laserBeams() {
        super.laserBeams();
    }

    public AnimalSeventh(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("VoiceSeven");
    }

    @Override
    public void eat() {
        super.eat();
    }
    public void power(){
        System.out.println("Power");
    }
    public void extra(){
        System.out.println("extra");
    }
}
