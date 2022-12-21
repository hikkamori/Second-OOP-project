package Persons;

import Enums.Mood;
import Enums.MusicalInstruments;
import Interfaces.IMusicalInstrument;
import Interfaces.IMusically;
import Places.Place;

import javax.sound.midi.Instrument;
import javax.sound.midi.spi.SoundbankReader;

public class Musician extends Creature implements IMusically {
    public Musician(){
        super.setName("трубоеб виталя");
        super.setMood(Mood.Normal);
    }
    public Musician(String name){
        super.setName(name);
        super.setMood(Mood.Normal);
    }

    private IMusicalInstrument musicalInstrument;
    @Override
    public void playInstrument() {
        System.out.println(this.getName() + " is playing the " + musicalInstrument.name());
    }


    public void setInstrument(IMusicalInstrument musicalInstruments){
        this.musicalInstrument = musicalInstruments;
        System.out.println(musicalInstruments.name() + " was recieved by " + this.getName());
    }

    public IMusicalInstrument getInstrument() {
        return musicalInstrument;
    }

}
