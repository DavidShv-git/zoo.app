package com.zoo.animals;

import com.zoo.Action;
import com.zoo.exceptions.ToFlyException;

import java.io.IOException;

public class Bird extends Animals implements Action {


    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(toString());
        System.out.println("Hrum-hrum");
    }

    @Override
    public void voice() {
        System.out.println("Chik-chirik");
    }

    @Override
    public void lasersBeam() {
        System.out.println("Piy-Piy");
    }

    public void rostrum(){
        System.out.println("Rostrum");
    }
    public void deadliest(){
        System.out.println("deadliest");
    }

    public void toFly(String place) {
        if (!place.equalsIgnoreCase("Air"))
            try {
                throw new ToFlyException("Wrong environment");
            } catch (ToFlyException a) {
                a.printStackTrace();
            }

        System.out.println("Flying");
    }

    @Override
    void getHome() {

    }
}
