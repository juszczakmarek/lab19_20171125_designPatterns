package designPatterns.Singleton.Excercise;

//w logu wpisana yyyy-mm-dd hh:mm:ss, typ logu, wiadomość
//wykorzystac metodę PrintWriter
//flush
//printLn

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger {

    private static Logger instance;
    private PrintWriter printWriter;
    private String fileName = "logfile.txt";

    private Logger () {
        try {
            printWriter = new PrintWriter(new FileOutputStream(new File(fileName),true));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        if (instance==null) {
            synchronized (Logger.class) {
                if (instance==null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void Log(Level level, String msg) {
        printWriter.print(createLogMessage(level,msg));
        printWriter.flush();
    }

    private String createLogMessage(Level level, String msg) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()));
        stringBuilder.append("; ");
        stringBuilder.append(level);
        stringBuilder.append("; ");
        stringBuilder.append(msg);
        stringBuilder.append(";(");
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(") \n");
        return stringBuilder.toString();
    }

}
