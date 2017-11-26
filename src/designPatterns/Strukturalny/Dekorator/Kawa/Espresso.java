package designPatterns.Strukturalny.Dekorator.Kawa;

public class Espresso extends Napoj {

    public Espresso() {
        this.opis = "Espresso";
    }

    @Override
    public double cost() {
        return 1.0;
    }
}
