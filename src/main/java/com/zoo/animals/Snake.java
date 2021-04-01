package com.zoo.animals;

import com.zoo.Action;

public class Snake extends Animals implements Action {
    public Snake(String name) {
        super(name);
    }

    @Override
    public void lasersBeam() {
        System.out.println("Piy-Piy");
    }

    @Override
    public void voice() {
        System.out.println("Ssssss");
    }

    @Override
    public void eat() {
        System.out.println(toString());
        System.out.println("Hrum-hrum");
    }

    public void poison(){
        System.out.println("poison");
    }
    public void strike(){
        System.out.println("strike");
    }
}
