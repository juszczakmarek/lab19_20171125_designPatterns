package designPatterns.Kreacyjne.Builder.TelescopeConstructor;
//punkt 1 - klasa ma byc niemutowalna
//punkt 2 - tylko bialko/weglowodany/tluszcze sa obowiazkowe, pozostale sa opcjonalne
//puntk 3 - kalorie to ma byc suma

public class TelescopeConstructor {

    private final int bialko;
    private final int weglowodany;
    private final int tluszcze;

    private int sol=0;
    private int niacyna=0;
    private int vitB12=0;
    private int glutaminianSodu=0;

    private final int kcal;

    public TelescopeConstructor(int bialko, int weglowodany, int tluszcze) {
        this.bialko = bialko;
        this.weglowodany = weglowodany;
        this.tluszcze = tluszcze;
        this.kcal = bialko+weglowodany+tluszcze;
    }

    public TelescopeConstructor(int bialko, int weglowodany, int tluszcze, int niacyna) {
        this(bialko, weglowodany, tluszcze);
        this.niacyna = niacyna;
    }

    public TelescopeConstructor(int bialko, int weglowodany, int tluszcze, int niacyna, int vitB12) {
        this(bialko, weglowodany, tluszcze, niacyna);
        this.vitB12 = vitB12;
    }

    public TelescopeConstructor(int bialko, int weglowodany, int tluszcze, int niacyna, int vitB12, int glutaminianSodu) {
        this(bialko, weglowodany, tluszcze, niacyna, vitB12);
        this.glutaminianSodu = glutaminianSodu;
    }
}
