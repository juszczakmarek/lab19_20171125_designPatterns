package designPatterns.Builder.PizzeriaUsingBuilder.Implementation2;

public class Pizza {

    private String ciasto;
    private String skladniki;
    private String sos;
    private String nazwa;

    public void setCiasto(String ciasto) {
        this.ciasto = ciasto;
    }

    public void setSkladniki(String skladniki) {
        this.skladniki = skladniki;
    }

    public void setSos(String sos) {
        this.sos = sos;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void showPizza() {
        System.out.println("Nazwa: "+nazwa+",\nRodzaj ciasta: "+ciasto+", Sos: "+sos+",\nSkładniki: "+skladniki);
    }
}

abstract class PizzaBuilder {
    protected Pizza pizza;

    public void zbudujNowaPizze() {
        pizza = new Pizza();
    }

    public Pizza getPizza() {
        return pizza;
    }

    public abstract void zbudujSos();
    public abstract void zbudujNazwe();
    public abstract void zbudujSkladniki();
    public abstract void zbudujCiasto();
}

class CapriciosaBuilder extends PizzaBuilder {

    @Override
    public void zbudujSos() {
        pizza.setSos("Sos Mieszany");
    }

    @Override
    public void zbudujNazwe() {
        pizza.setNazwa("Capriciosa");
    }

    @Override
    public void zbudujSkladniki() {
        pizza.setSkladniki("Ser, Szynka, Pieczarki");
    }

    @Override
    public void zbudujCiasto() {
        pizza.setCiasto("Cienkie");
    }
}

class PepperoniBuilder extends PizzaBuilder {

    @Override
    public void zbudujSos() {
        pizza.setSos("Sos Ostry");
    }

    @Override
    public void zbudujNazwe() {
        pizza.setNazwa("Pepperoni");
    }

    @Override
    public void zbudujSkladniki() {
        pizza.setSkladniki("Ser, Salami, Pomidor");
    }

    @Override
    public void zbudujCiasto() {
        pizza.setCiasto("Grube");
    }
}

class Director {
    private PizzaBuilder pizzaBuilder;

    public void setPizza(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void buildPizza() {
        pizzaBuilder.zbudujNowaPizze();
        pizzaBuilder.zbudujCiasto();
        pizzaBuilder.zbudujNazwe();
        pizzaBuilder.zbudujSos();
        pizzaBuilder.zbudujSkladniki();
    }

    public static void main(String[] args) {
        int wybor = 2;

        Director director = new Director();
        if (wybor==1) {
            director.setPizza(new PepperoniBuilder());
        } else {
            director.setPizza(new CapriciosaBuilder());
        }
        director.buildPizza();
        director.getPizza().showPizza();
    }
}