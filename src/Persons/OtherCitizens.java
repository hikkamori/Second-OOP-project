package Persons;

import Enums.Mood;
import Interfaces.IRecievable;
import Interfaces.IThankable;
import Persons.Creature;
import Places.Place;
import Stuff.Reason;

public class OtherCitizens extends Creature implements IThankable, IRecievable {
    public OtherCitizens(){
        super.setName("Жители Змеевки");
        super.setMood(Mood.Normal);
    }

    @Override
    public void thank(Creature creature, Reason reason){
        System.out.println("Thank you so much, " + creature.getName() + " for  " + reason.getName() + "." + " - said " + this.getName());
    }
    @Override
    public void recieveInvitation(Place place){
        System.out.println(this.getName() + " recieved invitation to the " + place.getName());
    }

}

