package designPatterns.Singleton;

//enum - pierwsza instancja enum tworzona jest zawsze
//wtedy kiedy jest odwolanie

import designPatterns.Singleton.Excercise.Level;
import designPatterns.Singleton.Excercise.Logger;

public class MainSingleton {

    public static void main(String[] args) {
        Logger.getInstance().Log(Level.INFO,"wiadomość numer 1");
        Logger.getInstance().Log(Level.ERROR,"wiadomość numer 2");
        Logger.getInstance().Log(Level.INFO,"wiadomość numer 3");

    }
}

//        Singleton.getInstance().kto();
//        Singleton.getInstance().kto();
//        SingletonEnum.INSTANCE.kto();
//        SingletonEnum.INSTANCE.kto();
//        SingletonEnum.INSTANCE.kto();
//        SingletonEnum.INSTANCE.kto();
