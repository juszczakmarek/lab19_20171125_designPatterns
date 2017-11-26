package designPatterns.Strukturalny.Dekorator.Kawa;

public class Doppio extends Napoj {
    public Doppio() {
        this.opis = "Doppio";
    }

    @Override
    public double cost() {
        return 10.0;
    }
}
