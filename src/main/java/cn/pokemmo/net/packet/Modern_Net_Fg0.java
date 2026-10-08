package cn.pokemmo.net.packet;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.Fg0
 */
public abstract class Modern_Net_Fg0 {

    public Modern_Net_Fg0() {
        super();
    }

    public static final Sm0 Tl;

    public static void Yi(String string, String string2) {
        Sm0 sm0 = Tl;
        if (sm0 != null) {
            sm0.put(string, string2);
            return;
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }

    public static void l1(String string) {
        Sm0 sm0 = Tl;
        if (sm0 != null) {
            sm0.remove(string);
            return;
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }

    static {
        lf_0 lf_02 = Cq0.vr();
        if (lf_02 != null) {
            Tl = lf_02.getMDCAdapter();
        } else {
            gc_1.n50().println("SLF4J(E): Failed to find provider.");
            gc_1.n50().println("SLF4J(E): Defaulting to no-operation MDCAdapter implementation.");
            Tl = new VS();
        }
    }
}


