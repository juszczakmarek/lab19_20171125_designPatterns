package designPatterns.Builder.PizzeriaWithoutBuilder;

public class Pepperoni extends Pizza {

    public Pepperoni(String name, String ingrendients, String dip, String dough) {
        this.name = name;
        this.ingrendients = ingrendients;
        this.dip = dip;
        this.dough = dough;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getIngrendients() {
        return ingrendients;
    }
}
