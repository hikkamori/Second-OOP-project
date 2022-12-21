package Stuff;

import Enums.HarpСharacteristic;
import Interfaces.IMusicalInstrument;

public class Harp implements IMusicalInstrument {
    public Harp(HarpСharacteristic stat){
        this.charac = stat;

    }
    private HarpСharacteristic charac;

    @Override
    public String name() {
        return charac.name() + " harp";
    }
}
