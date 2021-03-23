package com.zoo.animals;

public class Elephant extends Animals{

    public Elephant(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Truuuu");
    }

    @Override
    public void laserBeams() {
        super.laserBeams();
    }

    @Override
    public void eat() {
        super.eat();
    }
    public void stamp(){
        System.out.println("Top-top");
    }
    public void great(){
        System.out.println("great");
    }
}
