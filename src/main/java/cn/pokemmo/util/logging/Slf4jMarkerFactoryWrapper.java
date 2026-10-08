package cn.pokemmo.util.logging;

import f.Cq0;
import f.HA0;
import f.ZK0;
import f.gc_1;
import f.lf_0;
import f.nf0_1;
import f.zr_1;
import java.io.PrintStream;

public abstract class Slf4jMarkerFactoryWrapper {
    public static final ZK0 tU;

    static {
        lf_0 provider = Cq0.vr();
        if (provider != null) {
            tU = provider.getMarkerFactory();
        } else {
            PrintStream out = gc_1.n50();
            out.println("SLF4J(E): Failed to find provider");
            gc_1.n50().println("SLF4J(E): Defaulting to BasicMarkerFactory.");
            tU = new zr_1();
        }
    }

    public static HA0 N3(String name) {
        zr_1 factory = (zr_1) tU;
        if (factory != null) {
            HA0 value = (HA0) factory.yc0.get(name);
            if (value == null) {
                HA0 created = new nf0_1(name);
                HA0 previous = (HA0) factory.yc0.putIfAbsent(name, created);
                value = previous == null ? created : previous;
            }
            return value;
        }
        factory.getClass();
        throw new IllegalArgumentException("Marker name cannot be null");
    }
}
