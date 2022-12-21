package Persons;

import Enums.ChillActions;
import Enums.Mood;
import Interfaces.IChillable;
import Interfaces.IMovable;
import Interfaces.IWatchable;
import Interfaces.IWelcomable;
import Persons.Creature;
import Places.ChillablePlace;
import Places.Place;

public class UnknowingBoy extends Creature implements IChillable, IWatchable, IWelcomable, IMovable {
    public UnknowingBoy(){
        super.setName("Незнайка");
        super.setMood(Mood.Normal);

    }

    @Override
    public void chill(ChillActions chillAction, ChillablePlace where) {
        System.out.println(super.getName()+ " " + chillAction + " in the " + where.getName());
    }

    @Override
    public void seeSomeoneCome(Creature creature, Place place){
        System.out.println(this.getName() + " увидел, что " + creature.getName() + " пришел/ли на/в " + place.getName());
    }

    @Override
    public void welcome(Creature creature) {
        System.out.println(this.getName() + " отвесил поклон " + creature.getName());
    }


    @Override
    public void go(Place place) {
        System.out.println(this.getName() + " ушел в " + place.getName());
        this.setPlace(place);
    }
}
