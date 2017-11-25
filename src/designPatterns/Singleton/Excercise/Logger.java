package designPatterns.Singleton.Excercise;

//w logu wpisana yyyy-mm-dd hh:mm:ss, typ logu, wiadomość
//wykorzystac metodę PrintWriter
//flush
//printLn

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger {

    private static Logger instance;
    private PrintWriter printWriter;
    private String fileName;
    private File logFile;

    private Logger () {
        this.fileName = "logfile.txt";
        try {
            logFile = new File(fileName);
            printWriter = new PrintWriter(logFile);
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
        stringBuilder.append(";\n");

        return stringBuilder.toString();
    }

}
