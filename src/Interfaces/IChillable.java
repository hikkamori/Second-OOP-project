package Interfaces;
import Enums.ChillActions;
import Places.ChillablePlace;

public interface IChillable {
    void chill(ChillActions ChillAction, ChillablePlace where);
}
