package Places;

import Places.Place;

import java.util.ArrayList;
import java.util.Objects;

import Persons.Creature;

public class City extends Place {
    private ArrayList<Creature> guests;


    {
        guests = new ArrayList<Creature>();
    }

    public City(){
        super.setName("Имаджинариум");
    }
    public City(String sname){
        super.setName(sname);
    }

    public City(String sname, Creature... creatures){
        super.setName(sname);
        for(Creature c:creatures){
            guests.add(c);
            System.out.println(c.getName() + " is already in the town.");
        }

    }

    public void arrive(Creature creature){
        System.out.println(creature.getName() + " came to the town " + super.getName() + ".");
    }



}

