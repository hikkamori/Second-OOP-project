package Stuff;

import Enums.Harp–°haracteristic;
import Interfaces.IMusicalInstrument;

public class Harp implements IMusicalInstrument {
    public Harp(Harp–°haracteristic stat){
        this.charac = stat;

    }
    private Harp–°haracteristic charac;

    @Override
    public String name() {
        return charac.name() + " harp";
    }
}
