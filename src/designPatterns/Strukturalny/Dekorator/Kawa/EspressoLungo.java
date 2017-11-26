package designPatterns.Strukturalny.Dekorator.Kawa;

public class EspressoLungo extends Napoj {

    public EspressoLungo() {
        this.opis = "Espresso Lungo";
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
