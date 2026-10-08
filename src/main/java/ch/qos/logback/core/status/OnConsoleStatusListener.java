package ch.qos.logback.core.status;

import java.io.PrintStream;

public class OnConsoleStatusListener extends OnPrintStreamStatusListenerBase {
    public OnConsoleStatusListener() {}
    @Override public PrintStream getPrintStream() { return System.out; }
}
