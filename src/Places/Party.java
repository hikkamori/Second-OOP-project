package Places;

import Persons.Creature;

import java.util.ArrayList;
import java.util.Objects;

public class Party extends Place{

    private ArrayList<Creature> participants = new ArrayList<Creature>();


    public Party(String sname, Creature... creatures){
        super.setName(sname);
        this.raidTheParty(creatures);
    }

    public void attendTheParty(Creature creature){
        System.out.println(creature.getName() + " пришел на тусовочку)");
        creature.setPlace(this);
        participants.add(creature);
    }

    public void raidTheParty(Creature... creatures){
        for(Creature c:creatures){
            participants.add(c);
            c.setPlace(this);
            System.out.println(c.getName() + " is already in the party house " + this.getName());
        }

    }
}

