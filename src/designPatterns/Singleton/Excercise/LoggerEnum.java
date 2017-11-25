package designPatterns.Singleton.Excercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public enum LoggerEnum {

    INSTANCE;

    private PrintWriter printWriter;
    private String fileName = "logfile.txt";

    LoggerEnum() {

        try {
            printWriter = new PrintWriter(new FileOutputStream(new File(fileName),true));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
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
        stringBuilder.append(")\n");

        return stringBuilder.toString();
    }
}
