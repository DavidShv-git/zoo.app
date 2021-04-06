package com.zoo.animals;

import com.zoo.Action;

public class Kitten extends Animals implements Action {
    public Kitten(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(toString());
        System.out.println("Hrum-hrum");
    }

    @Override
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    public void lasersBeam() {
        System.out.println("Piy-Piy");
    }

    public void cuteness(){
        System.out.println("cuteness");
    }
    public void meow(){
        System.out.println("meow");
    }

    @Override
    void getHome() {

    }
}
