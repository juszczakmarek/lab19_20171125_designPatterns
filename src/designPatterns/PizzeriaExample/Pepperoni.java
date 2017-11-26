package designPatterns.PizzeriaExample;

public class Pepperoni extends Pizza {

    public Pepperoni(String name, String ingrendients, String dip, String dough) {
        super.name = name;
        super.ingrendients = ingrendients;
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
