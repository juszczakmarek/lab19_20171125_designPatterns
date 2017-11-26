package designPatterns.Strukturalny.Dekorator.Kawa;

public class Latte extends Napoj {

    public Latte() {
        this.opis = "Latte";
    }

    @Override
    public double cost() {
        return 6.0;
    }
}
