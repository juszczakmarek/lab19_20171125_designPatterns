package designPatterns.Kreacyjne.Builder.JavaBeans;

public class JavaBeans {

    public static void main(String[] args) {
        JavaBeans javaBeans = new JavaBeans(10,20,30);
        javaBeans.setSol(10)
                .setNiacyna(10)
                .setVitB12(10)
                .setGlutaminianSodu(10);
    }

    private final int bialko;
    private final int weglowodany;
    private final int tluszcze;

    private int sol;
    private int niacyna;
    private int vitB12;
    private int glutaminianSodu;

    private int kcal;

    public JavaBeans(int bialko, int weglowodany, int tluszcze) {
        this.bialko = bialko;
        this.weglowodany = weglowodany;
        this.tluszcze = tluszcze;
        this.kcal = bialko+weglowodany+tluszcze;
    }

    public JavaBeans setSol(int sol) {
        this.sol = sol;
        return this;
    }

    public JavaBeans setNiacyna(int niacyna) {
        this.niacyna = niacyna;
        return this;
    }

    public JavaBeans setVitB12(int vitB12) {
        this.vitB12 = vitB12;
        return this;
    }

    public JavaBeans setGlutaminianSodu(int glutaminianSodu) {
        this.glutaminianSodu = glutaminianSodu;
        return this;
    }
}
