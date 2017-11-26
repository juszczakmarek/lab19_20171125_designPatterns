package designPatterns.Strukturalny.Dekorator.Dodatek;

import designPatterns.Strukturalny.Dekorator.Kawa.Napoj;

public class BitaSmietana extends Dodatek {

    public BitaSmietana(Napoj napoj) {
        super(napoj);
    }

    @Override
    public double cost() {
        return napoj.cost()+0.7;
    }

    @Override
    public String getOpis() {
        return napoj.getOpis() + " bita śmietana";
    }
}
