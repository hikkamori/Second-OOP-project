package Persons;

import Enums.ChillActions;
import Enums.Mood;

public class Viewer{
    public void conclude(Creature creature, ChillActions chillAction){
        System.out.println("To tell the truth " + creature.getName() + " was " + chillAction.increase() + "ing.");
    }


}
