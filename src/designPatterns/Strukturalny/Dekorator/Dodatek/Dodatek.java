package designPatterns.Strukturalny.Dekorator.Dodatek;

import designPatterns.Strukturalny.Dekorator.Kawa.Napoj;

public abstract class Dodatek extends Napoj {

    Napoj napoj;

    public Dodatek(Napoj napoj) {
        this.napoj = napoj;
    }

}
