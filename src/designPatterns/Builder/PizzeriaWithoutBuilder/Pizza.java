package designPatterns.Builder.PizzeriaWithoutBuilder;

public abstract class Pizza {
    protected String name;
    protected String ingrendients;
    protected String dip;
    protected String dough;

    public abstract String getName();
    public abstract String getIngrendients();
}
