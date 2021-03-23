package com.zoo.animals;

public class Snake extends Animals {
    public Snake(String name) {
        super(name);
    }

    @Override
    public void laserBeams() {
        super.laserBeams();
    }

    @Override
    public void voice() {
        System.out.println("Ssssss");
    }

    @Override
    public void eat() {
        super.eat();
    }
    public void poison(){
        System.out.println("poison");
    }
    public void strike(){
        System.out.println("strike");
    }
}
