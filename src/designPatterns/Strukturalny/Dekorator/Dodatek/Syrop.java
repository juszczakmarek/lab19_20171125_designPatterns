package designPatterns.Strukturalny.Dekorator.Dodatek;

import designPatterns.Strukturalny.Dekorator.Kawa.Napoj;

public class Syrop extends Dodatek {

    public Syrop(Napoj napoj) {
        super(napoj);
    }

    @Override
    public double cost() {
        return napoj.cost()+0.5;
    }

    @Override
    public String getOpis() {
        return napoj.getOpis() + " syrop";
    }
}
