package com.zoo.animals;





public abstract class Animals {

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

    public void heightAndWeight(int height, int weight){
        height = 120;
        weight = 50;
    }

    public void heightAndWeight(double height , double weight){
        height = 123.3;
        weight = 45.3;
    }

    abstract void getHome();





}
