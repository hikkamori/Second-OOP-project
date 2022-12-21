package Enums;

public enum ChillActions {
    sit,
    lay,
    sleep;


    public ChillActions increase(){
        switch(this){
            case lay -> {return ChillActions.sleep;}
            case sit -> {return ChillActions.lay;}
            default -> {return ChillActions.sit;}
        }
    }
}

