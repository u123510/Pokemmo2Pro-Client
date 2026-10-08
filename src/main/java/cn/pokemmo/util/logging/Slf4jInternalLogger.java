package cn.pokemmo.util.logging;

import f.J90;
import f.qi0_2;
import java.io.PrintStream;

public abstract class Slf4jInternalLogger {
    public static final int g80;
    public static final int op0;

    public static PrintStream n50() {
        return J90.Qj(g80) == 1 ? System.out : System.err;
    }

    public static void rf(String message) {
        if (qi0_2.ih0(2) >= qi0_2.ih0(op0)) {
            n50().println("SLF4J(W): " + message);
        }
    }

    public static void y80(String message, Throwable error) {
        n50().println("SLF4J(E): " + message);
        n50().println("SLF4J(E): Reported exception:");
        error.printStackTrace(n50());
    }

    static {
        String stream = System.getProperty("slf4j.internal.report.stream");
        int streamMode = 1;
        if (stream != null && !stream.isEmpty()) {
            String[] names = {"System.out", "stdout", "sysout"};
            for (String name : names) {
                if (name.equalsIgnoreCase(stream)) { streamMode = 2; break; }
            }
        }
        g80 = streamMode;
        String verbosity = System.getProperty("slf4j.internal.verbosity");
        int level = 1;
        if (verbosity != null && !verbosity.isEmpty()) {
            if ("ERROR".equalsIgnoreCase(verbosity)) level = 3;
            else if ("WARN".equalsIgnoreCase(verbosity)) level = 2;
        }
        op0 = level;
    }
}
