package designPatterns.Strukturalny.Dekorator;

import designPatterns.Strukturalny.Dekorator.Dodatek.Cukier;
import designPatterns.Strukturalny.Dekorator.Dodatek.Mleko;
import designPatterns.Strukturalny.Dekorator.Kawa.Espresso;
import designPatterns.Strukturalny.Dekorator.Kawa.Napoj;

public class MainDeco {

    public static void main(String[] args) {
        Napoj pierwszy = new Espresso();
        System.out.println(pierwszy.cost());
        System.out.println(pierwszy.getOpis());

//        Napoj drugi = new Cukier(new Cukier(new Mleko(new Mleko(new Espresso()))));
        Napoj drugi = new Mleko(new Cukier(new Cukier(new Espresso())));
        System.out.println(drugi.cost());
        System.out.println(drugi.getOpis());
    }

}
