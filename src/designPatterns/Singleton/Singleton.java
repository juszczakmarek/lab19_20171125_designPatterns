package designPatterns.Singleton;

//Singleton w wersji sekwencyjnej
/**
 * if (instance==null) { - jeżeli zmienna instance nie zawiera jeszcze obiektu typu Singleton
 *  synchronized (Singleton.class) { - w ten kod wchodzi tylko pierwszy wątek, pozostałe czekają
 *      if (instance==null) { - pierwszy wątek widzi, że nie ma jeszcze nic pod zmienną instance, każdy kolejny zobaczy że już jest
 *          instance = new Singleton(); pierwszy wątek utworzy obiekt, każdy kolejny potem nie spełni warunków
 *          }
 *      }
 * }
 * volataile - dostęp do tej zmiennej jest NIEPODZIELNE, oznacza, że wszystkie operacje dotyczące tej zmiennej, muszą zostać wykonane w całości,
 * np. te wołane w konstruktorze.
 * @return
 */
public class Singleton {

    private volatile static Singleton instance;

    private Singleton() {
        System.out.println("konstruktor");
    }


    public static Singleton getInstance() {
        if (instance==null) {
            synchronized (Singleton.class) {
                if (instance==null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void kto() {
        System.out.println("Wiwała nie jest moim idolem");
    }

}
