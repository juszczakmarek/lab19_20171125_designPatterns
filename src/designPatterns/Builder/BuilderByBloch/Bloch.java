package designPatterns.Builder.BuilderByBloch;

public class Bloch {

    private final int bialko;
    private final int weglowodany;
    private final int tluszcze;

    private final int sol;
    private final int niacyna;
    private final int vitB12;
    private final int glutaminianSodu;

    private int kcal;

    private Bloch(Builder builder) {
        this.bialko = builder.bialko;
        this.weglowodany = builder.weglowodany;
        this.tluszcze = builder.tluszcze;
        this.glutaminianSodu = builder.glutaminianSodu;
        this.niacyna = builder.niacyna;
        this.sol = builder.sol;
        this.vitB12 = builder.vitB12;
        this.kcal = builder.kcal;
    }

    public static class Builder {
        private int bialko;
        private int weglowodany;
        private int tluszcze;

        private int sol = 0;
        private int niacyna = 0;
        private int vitB12 = 0;
        private int glutaminianSodu = 0;

        private int kcal;

        Builder(int bialko, int weglowodany, int tluszcze) {
            this.bialko = bialko;
            this.weglowodany = weglowodany;
            this.tluszcze = tluszcze;
            this.kcal = bialko+weglowodany+tluszcze;
        }

        public Builder setSol(int sol) {
            this.sol = sol;
            return this;
        }

        public Builder setNiacyna(int niacyna) {
            this.niacyna = niacyna;
            return this;
        }

        public Builder setVitB12(int vitB12) {
            this.vitB12 = vitB12;
            return this;
        }

        public Builder setGlutaminianSodu(int glutaminianSodu) {
            this.glutaminianSodu = glutaminianSodu;
            return this;
        }

        public Bloch build() {
            return new Bloch(this);
        }
    }

}
