package Places;

import Persons.Creature;

import java.util.ArrayList;

public class Playground extends Place{
    public Playground(){
        super.setName("Playground");
    }
    private ArrayList<Creature> guests = new ArrayList<Creature>();

    public void goToPlayground(Creature creature){
        System.out.println(creature.getName() + " пришел на площаду)");
        creature.setPlace(this);
        guests.add(creature);
    }

    public void raidThePlayground(Creature... creatures){
        for(Creature c:creatures){
            guests.add(c);
            c.setPlace(this);
            System.out.println(c.getName() + " is already in the " + this.getName());
        }

    }



}

