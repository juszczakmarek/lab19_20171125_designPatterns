package designPatterns.Strukturalny.Dekorator.Dodatek;

import designPatterns.Strukturalny.Dekorator.Kawa.Napoj;

public class Mleko extends Dodatek {

    public Mleko(Napoj napoj) {
        super(napoj);
    };

    @Override
    public double cost() {
        return napoj.cost()+0.4;
    }

    @Override
    public String getOpis() {
        return napoj.getOpis() + " mleko";
    }
}
