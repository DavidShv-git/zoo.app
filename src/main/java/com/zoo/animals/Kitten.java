package com.zoo.animals;

public class Kitten extends Animals{
    public Kitten(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    public void laserBeams() {
        super.laserBeams();
    }

    @Override
    public void eat() {
        super.eat();
    }

    public void cuteness(){
        System.out.println("cuteness");
    }
    public void meow(){
        System.out.println("meow");
    }
}
