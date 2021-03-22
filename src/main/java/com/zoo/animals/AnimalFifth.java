package com.zoo.animals;

public class AnimalFifth extends Animals {
    public AnimalFifth(String name) {
        super(name);
    }

    @Override
    public void laserBeams() {
        super.laserBeams();
    }

    @Override
    public void voice() {
        System.out.println("VoiceFifth");
    }

    @Override
    public void eat() {
        super.eat();
    }
    public void heal(){
        System.out.println("Heal");
    }
    public void syringe(){
        System.out.println("syringe");
    }
}
