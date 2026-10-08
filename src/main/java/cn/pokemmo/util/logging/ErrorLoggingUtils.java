package cn.pokemmo.util.logging;

import f.UX;
import java.io.PrintStream;

public abstract class ErrorLoggingUtils {
    public static UX A00;
    public static boolean sA = false;

    public static void Ha(String string, Exception exception) {
        PrintStream printStream = System.err;
        printStream.println(string);
        printStream.println("Reported exception:");
        exception.printStackTrace();
    }
}
