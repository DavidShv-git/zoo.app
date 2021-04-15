package com.zoo.animals;

import com.zoo.exceptions.AviaryCountException;

import java.util.LinkedList;
import java.util.List;



public  class Aviary {

    private Integer animalCount = 0;

    private List<String> aviaryList = new LinkedList<String>();

    public void addAnimal(String aviary ){
       if(animalCount<=20) {
           aviaryList.add(aviary);
           ++animalCount;
       }
       else
           throw new AviaryCountException();
    }

    public void removeAnimal(String aviary){
        if(animalCount>0)
        aviaryList.remove(aviary);
        else throw new AviaryCountException();

    }

    public void animalsInAviary(){
        System.out.println(aviaryList);
    }



}
