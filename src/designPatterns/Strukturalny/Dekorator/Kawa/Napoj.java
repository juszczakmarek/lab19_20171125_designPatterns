package designPatterns.Strukturalny.Dekorator.Kawa;

//metoda info mowiaca ile wzial dodatkow
//metoda cost zwracajaca kwote
//espresso 1.0
//esrpesso lungo 1.5
//doppio 10.0
//cappucino 40.0
//latte 60.0
//flatwhie 90.0

//dodatki
//mleko 0.5
//syrop 0.5
//bita 3.0
//cukier 0.1
//cynamo 0.3


public abstract class Napoj {

    protected String opis;

    public abstract double cost();

    public String getOpis() {
        return this.opis;
    }

}
