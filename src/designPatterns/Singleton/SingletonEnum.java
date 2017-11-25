package designPatterns.Singleton;

public enum SingletonEnum {
    INSTANCE;

    SingletonEnum() {
        System.out.println("Konstruktor");
    }

    public void kto() {
        System.out.println("Wiwała nie jest moim idolem (ENUM)");
    }
}
