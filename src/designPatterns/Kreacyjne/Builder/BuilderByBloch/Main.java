package designPatterns.Kreacyjne.Builder.BuilderByBloch;

public class Main {

    public static void main(String[] args) {
        Bloch produkt = new Bloch.Builder(10,10,10)
                .setGlutaminianSodu(10)
                .setNiacyna(10)
                .setSol(20)
                .setVitB12(10)
                .build();
    }

}
