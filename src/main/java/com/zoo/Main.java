package com.zoo;

import com.zoo.animals.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        /*
        String animalsName = null;

        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            animalsName =  bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

         */


        AnimalFirst animalFirst = new AnimalFirst("Vasya");
        animalFirst.eat();
        animalFirst.voice();
        animalFirst.laserBeams();
        animalFirst.throwG();
        animalFirst.grenade();


        AnimalSecond animalSecond = new AnimalSecond("Petya");
        animalSecond.eat();
        animalSecond.voice();
        animalSecond.laserBeams();
        animalSecond.set();
        animalSecond.mine();

        AnimalThird animalThird = new AnimalThird("Dasha");
        animalThird.eat();
        animalThird.voice();
        animalThird.laserBeams();
        animalThird.pistol();
        animalThird.shoot();

        AnimalForth animalForth = new AnimalForth("Masha");
        animalForth.eat();
        animalForth.voice();
        animalForth.laserBeams();
        animalForth.holy();
        animalForth.grenade();

        AnimalFifth animalFifth = new AnimalFifth("Borya");
        animalFifth.eat();
        animalFifth.voice();
        animalFifth.laserBeams();
        animalFifth.syringe();
        animalFifth.heal();

        AnimalSixt animalSixt = new AnimalSixt("Robin");
        animalSixt.eat();
        animalSixt.voice();
        animalSixt.laserBeams();
        animalSixt.bow();
        animalSixt.shoot();

        AnimalSeventh animalSeventh = new AnimalSeventh("Nastya");
        animalSeventh.eat();
        animalSeventh.voice();
        animalSeventh.laserBeams();
        animalSeventh.power();
        animalSeventh.extra();








    }





}
