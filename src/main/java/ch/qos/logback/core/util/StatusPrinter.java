/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.util.StatusPrinter2;
import java.io.PrintStream;
import java.util.List;

public class StatusPrinter {
    private static final StatusPrinter2 SINGLETON = new StatusPrinter2();

    public static void setPrintStream(PrintStream printStream) {
        SINGLETON.setPrintStream(printStream);
    }

    public static void printInCaseOfErrorsOrWarnings(Context context) {
        SINGLETON.printInCaseOfErrorsOrWarnings(context, 0L);
    }

    public static void printInCaseOfErrorsOrWarnings(Context context, long l) {
        SINGLETON.printInCaseOfErrorsOrWarnings(context, l);
    }

    public static void printIfErrorsOccured(Context context) {
        SINGLETON.printIfErrorsOccured(context);
    }

    public static void print(Context context) {
        SINGLETON.print(context, 0L);
    }

    public static void print(Context context, long l) {
        SINGLETON.print(context, l);
    }

    public static void print(StatusManager statusManager) {
        SINGLETON.print(statusManager, 0L);
    }

    public static void print(StatusManager statusManager, long l) {
        SINGLETON.print(statusManager, l);
    }

    public static void print(List list) {
        SINGLETON.print(list);
    }

    public static void buildStr(StringBuilder stringBuilder, String string, Status status) {
        SINGLETON.buildStr(stringBuilder, string, status);
    }
}

