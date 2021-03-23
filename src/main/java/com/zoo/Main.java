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
        tiger.laserBeams();
        tiger.attack();
        tiger.claw();


        Bird bird = new Bird("Petya");
        bird.eat();
        bird.voice();
        bird.laserBeams();
        bird.deadliest();
        bird.rostrum();

        Kitten kitten = new Kitten("Dasha");
        kitten.eat();
        kitten.voice();
        kitten.laserBeams();
        kitten.meow();
        kitten.cuteness();

        Elephant elephant = new Elephant("Masha");
        elephant.eat();
        elephant.voice();
        elephant.laserBeams();
        elephant.stamp();
        elephant.great();

        Snake snake = new Snake("Borya");
        snake.eat();
        snake.voice();
        snake.laserBeams();
        snake.strike();
        snake.poison();

        Wolf wolf = new Wolf("Robin");
        wolf.eat();
        wolf.voice();
        wolf.laserBeams();
        wolf.bite();
        wolf.rabies();

        Bear bear = new Bear("Nastya");
        bear.eat();
        bear.voice();
        bear.laserBeams();
        bear.power();
        bear.extra();








    }





}
