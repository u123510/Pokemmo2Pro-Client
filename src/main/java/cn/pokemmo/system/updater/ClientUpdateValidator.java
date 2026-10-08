package cn.pokemmo.system.updater;

import f.Cq0;
import f.Qy0;
import f.dl_1;
import f.lo_1;
import f.lpt3__1;
import f.nf0_0;
import f.sm0_0;
import f.yo_1;

public abstract class ClientUpdateValidator {
    public static final dl_1 jZ;

    static {
        jZ = Cq0.E1(ClientUpdateValidator.class);
    }

    public ClientUpdateValidator() {
    }

    public static boolean j9() {
        if (!yo_1.OS) {
            if (!lpt3__1.coM5.isEmpty()) {
                yo_1.RV = "true";
            }
            yo_1.Rh0();
        }
        if (!yo_1.Jf) {
            fc0(sm0_0.c0(nf0_0.zg0), new RuntimeException());
            return false;
        }
        if (yo_1.kz.length >= 1 && !yo_1.ym.isEmpty()) {
            return true;
        }
        fc0("Updater location/hash missing. Please report this on the forums.",
                new RuntimeException());
        return false;
    }

    public static void fc0(String message, Exception error) {
        Qy0 logger = Qy0.yI0;
        if (logger != null) {
            logger.e80(message, new lo_1());
        }
        jZ.error(message, error);
    }
}
