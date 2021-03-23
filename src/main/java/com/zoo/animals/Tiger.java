package com.zoo.animals;

public class Tiger extends Animals {

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void voice() {
        System.out.println("Grrrrr");
    }

    @Override
    public void laserBeams() {
        super.laserBeams();
    }

    public void claw(){
        System.out.println("claw");
    }
    public void attack(){
        System.out.println("attack");
    }
}
