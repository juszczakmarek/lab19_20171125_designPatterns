package designPatterns.PizzeriaExample;

public class Capriciosa extends Pizza {

    private String name;
    private String ingrendients;
    private String dip;
    private String dough;

    public Capriciosa(String name, String ingrendients, String dip, String dough) {
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
