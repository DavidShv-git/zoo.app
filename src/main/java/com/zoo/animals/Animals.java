package com.zoo.animals;

public class Animals {

    private String name;

    public Animals(String name) {
        this.name = name;
    }

    public Animals() {
    }

    public String getName() {


        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                '}';
    }

    public void voice(){

    }

     public void laserBeams(){
         System.out.println("Piy-Piy");
     }




    public void eat(){
        System.out.println(toString());
        System.out.println("Hrum-Hrum");
    }






}
