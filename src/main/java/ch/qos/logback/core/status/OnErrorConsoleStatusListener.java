package ch.qos.logback.core.status;

import java.io.PrintStream;

public class OnErrorConsoleStatusListener extends OnPrintStreamStatusListenerBase {
    public OnErrorConsoleStatusListener() {}
    @Override public PrintStream getPrintStream() { return System.err; }
}
