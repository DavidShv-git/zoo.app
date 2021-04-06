package com.zoo.animals;

import com.zoo.Action;

public class Bear extends Animals implements Action {
    @Override
    public void lasersBeam() {

    }

    @Override
    public void eat() {
        System.out.println(toString());
        System.out.println("Hrum-hrum");
    }

    public Bear(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Raur");
    }

    public void power(){
        System.out.println("Power");
    }
    public void extra(){
        System.out.println("extra");
    }

    @Override
    void getHome() {

    }
}
