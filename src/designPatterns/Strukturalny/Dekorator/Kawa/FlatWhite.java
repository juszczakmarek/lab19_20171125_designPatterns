package designPatterns.Strukturalny.Dekorator.Kawa;

public class FlatWhite extends Napoj {
    public FlatWhite() {
        this.opis = "Flat White";
    }

    @Override
    public double cost() {
        return 9.0;
    }
}
