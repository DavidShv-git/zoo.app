package com.zoo;

import com.zoo.animals.*;

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


        Tiger tiger = new Tiger("Vasya");
        tiger.eat();
        tiger.voice();
        tiger.lasersBeam();
        tiger.attack();
        tiger.toHunt("Mammals with hoofs");
        tiger.heightAndWeight(23,32);





        Bird bird = new Bird("Petya");
        tiger.eat();
        bird.voice();
        bird.lasersBeam();
        bird.deadliest();
        bird.rostrum();
        bird.toFly("Air");

        Kitten kitten = new Kitten("Dasha");
        kitten.eat();
        kitten.voice();
        kitten.lasersBeam();
        kitten.meow();
        kitten.cuteness();

        Elephant elephant = new Elephant("Masha");
        elephant.eat();
        elephant.voice();
        elephant.lasersBeam();
        elephant.stamp();
        elephant.great();
        elephant.heightAndWeight(2.05 , 203.2);

        Snake snake = new Snake("Borya");
        snake.eat();
        snake.voice();
        snake.lasersBeam();
        snake.strike();
        snake.poison();

        Wolf wolf = new Wolf("Robin");
        wolf.eat();
        wolf.voice();
        wolf.lasersBeam();
        wolf.bite();
        wolf.rabies();

        Bear bear = new Bear("Nastya");
        bear.eat();
        bear.voice();
        bear.lasersBeam();
        bear.power();
        bear.extra();








    }





}
