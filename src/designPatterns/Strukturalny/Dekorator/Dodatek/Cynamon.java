package designPatterns.Strukturalny.Dekorator.Dodatek;

import designPatterns.Strukturalny.Dekorator.Kawa.Napoj;

public class Cynamon extends Dodatek {

    public Cynamon(Napoj napoj) {
        super(napoj);
    }

    @Override
    public double cost() {
        return napoj.cost()+0.3;
    }

    @Override
    public String getOpis() {
        return napoj.getOpis() + " cynamon";
    }
}
