package com.zoo.animals;

import com.zoo.Action;

public class Wolf extends Animals implements Action {
    public Wolf(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(toString());
        System.out.println("Hrum-hrum");
    }

    @Override
    public void voice() {
        System.out.println("Rrrrr");
    }

    @Override
    public void lasersBeam() {
        System.out.println("Piy-Piy");
    }

    public void bite(){
        System.out.println("Bite");
    }
    public void rabies(){
        System.out.println("Rabies");
    }

    @Override
    void getHome() {

    }
}
