package com.zoo.animals;

public class AnimalForth extends Animals{

    public AnimalForth(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("VoiceForth");
    }

    @Override
    public void laserBeams() {
        super.laserBeams();
    }

    @Override
    public void eat() {
        super.eat();
    }
    public void holy(){
        System.out.println("Holy");
    }
    public void grenade(){
        System.out.println("grenade");
    }
}
