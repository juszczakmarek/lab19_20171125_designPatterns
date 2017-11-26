package designPatterns.Strukturalny.Dekorator.Kawa;

public class Cappuccino extends Napoj {

    public Cappuccino() {
        this.opis = "Cappucino";
    }

    @Override
    public double cost() {
        return 4.0;
    }
}
