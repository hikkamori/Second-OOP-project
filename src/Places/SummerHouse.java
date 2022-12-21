package Places;

import Enums.Decorations;
import Exceptions.UncheckedHouseOverflowException;
import Persons.Creature;

import java.util.ArrayList;

public class SummerHouse extends Place {
    public SummerHouse(){
        super.setName("Summer House");
    }


    private ArrayList<Creature> chillers = new ArrayList<Creature>();
    private ArrayList<Decorations> decorationsList = new ArrayList<Decorations>();

    public void visitTheHouse(Creature creature){
        System.out.println(creature.getName() + " пытается зайти в беседочку)");
        creature.setPlace(this);
        chillers.add(creature);
        if (1 - chillers.size()*0.03 < Math.random()){
            chillers.clear();
            throw new UncheckedHouseOverflowException("в беседке кончились места ;(");

        }
        System.out.println(creature.getName() + " пришел в беседочку)");

    }

    public void groupVisitingOfHouse(Creature... creatures){
        for(Creature c:creatures){
            visitTheHouse(c);
        }
    }

    public void setDecorations(Decorations... decorations){
        for(Decorations d:decorations){
            decorationsList.add(d);
            System.out.println("House is now decorated with" + d);
        }
    }

    public int getVisitorsAmount(){
        return chillers.size();
    }





}
