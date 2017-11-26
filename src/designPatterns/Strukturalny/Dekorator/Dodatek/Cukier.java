package designPatterns.Strukturalny.Dekorator.Dodatek;

import designPatterns.Strukturalny.Dekorator.Kawa.Napoj;

public class Cukier extends Dodatek {

    public Cukier(Napoj napoj) {
        super(napoj);
    }

    @Override
    public double cost() {
        return napoj.cost()+0.1;
    }

    @Override
    public String getOpis() {
        return napoj.getOpis() + " cukier";
    }
}
