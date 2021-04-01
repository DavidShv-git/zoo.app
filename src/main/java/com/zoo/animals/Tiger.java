package com.zoo.animals;

import com.zoo.Action;
import com.zoo.exceptions.ToHuntException;

public  class Tiger extends Animals implements Action   {

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(toString());
        System.out.println("Hrum-hrum");
    }

    @Override
    public void voice() {
        System.out.println("Grrrrr");
    }

    @Override
    public void lasersBeam() {
        System.out.println("Piy-Piy");
    }

    public  void attack(){
        System.out.println("attack");
    }

    public void toHunt(String typeOfPray){
        if(!typeOfPray.equalsIgnoreCase("Mammals with hoofs"))
            try {
                throw new ToHuntException("Wrong type of pray");
            }
        catch (ToHuntException a){
                a.printStackTrace();
        }
        System.out.println("Nom-nom-nom");
    }


}
