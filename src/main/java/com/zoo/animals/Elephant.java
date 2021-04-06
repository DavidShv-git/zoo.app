package com.zoo.animals;

import com.zoo.Action;

public class Elephant extends Animals implements Action {

    public Elephant(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Truuuu");
    }

    @Override
    public void lasersBeam() {
        System.out.println("Piy-Piy");
    }

    @Override
    public void eat() {
        System.out.println(toString());
        System.out.println("Hrum-hrum");
    }

    public void stamp(){
        System.out.println("Top-top");
    }
    public void great(){
        System.out.println("great");
    }

    @Override
    void getHome() {

    }
}
