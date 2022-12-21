package Persons;

import Enums.Mood;

public class Babies extends Creature{
    public Babies(){
        super.setName("бэйбы");
        super.setMood(Mood.Normal);
    }


    public void scream(Creature creature, Mood reaction){
        System.out.println("Малышки закричали.");
        this.setMood(Mood.Angry);
        creature.setMood(reaction);
        System.out.println(creature.getName() + " became " + reaction.name());
    }
}
