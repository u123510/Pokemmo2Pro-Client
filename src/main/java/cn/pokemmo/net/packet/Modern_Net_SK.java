package cn.pokemmo.net.packet;

import f.*;
import java.io.PrintStream;

/**
 * 现代化重构类 - 原始混淆类: f.SK
 */
public class Modern_Net_SK implements mk0_2 {

    public Modern_Net_SK() {
        super();
    }

    public final void ba0(int error) {
        String caller = null;
        try {
            StackTraceElement[] trace = Thread.currentThread().getStackTrace();
            for (int index = 0; index < trace.length; index++) {
                if ("check".equals(trace[index].getMethodName())) {
                    if (++index < trace.length) {
                        caller = trace[index].getMethodName();
                    }
                    break;
                }
            }
        } catch (Exception ignored) {
        }

        if (caller != null) {
            lg_0.k.Xd0("GLProfiler", "Error " + ok0_0.sa0(error) + " from " + caller);
            return;
        }

        Dt0 client = lg_0.k;
        String message = "Error " + ok0_0.sa0(error) + " at: ";
        Exception trace = new Exception();
        if (client.ai >= 1) {
            client.eA.getClass();
            PrintStream output = System.err;
            output.println("[GLProfiler] " + message);
            trace.printStackTrace(output);
        }
    }
}

