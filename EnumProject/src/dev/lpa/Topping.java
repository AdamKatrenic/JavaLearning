package dev.lpa;

public enum Topping {

    MUSTARD,
    PICKLES,
    BACON,
    CHEDAR,
    TOMATO;

    public double getPrice(){
        return switch (this){
            case BACON -> 1.5;
            case CHEDAR -> 1.0;
            default -> 0.0;
        };
    }
}
