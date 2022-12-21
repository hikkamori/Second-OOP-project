package Persons;


import Interfaces.IMusicalInstrument;

import java.util.ArrayList;

public class Orchestra{
    private String name;
    public Orchestra(){
        this.name = "Orchestra";
    }



    private ArrayList<Musician> musicians = new ArrayList<Musician>();

    public void addMusicians(Musician... musicians1){
        for(Musician m:musicians1){
            musicians.add(m);
            System.out.println(m.getName() + " has now joined the Orchestra");
        }
    }

    public ArrayList<Musician> getOrchestraCreatures(){
        return musicians;
    }

    public void playMusic() {
        for (int i = 0; i < musicians.size(); i++) {
            musicians.get(i).playInstrument();
        }
         }

    public void giveInstrument(IMusicalInstrument musicalInstruments){
        for (int i = 0; i < musicians.size(); i++) {
            musicians.get(i).setInstrument(musicalInstruments);
        }
    }


}
