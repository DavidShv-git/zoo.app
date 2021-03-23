package com.zoo.animals;

public class Bear extends Animals {
    @Override
    public void laserBeams() {
        super.laserBeams();
    }

    public Bear(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Raur");
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
