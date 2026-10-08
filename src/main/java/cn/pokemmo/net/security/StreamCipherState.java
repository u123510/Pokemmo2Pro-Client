package cn.pokemmo.net.security;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


import java.security.SecureRandom;

public abstract class StreamCipherState {
    public static final IX Ak0;
    public static final IX Vl0;
    public static volatile long CD0;

    public static int r4(int bound) {
        return (int) (Ak0.MC0.nextDouble() * bound);
    }

    public static int j40(int min, int max) {
        return min + (int) (Ak0.MC0.nextDouble() * (max - min + 1));
    }

    public static Object G30(Object[] values) {
        return values[r4(values.length)];
    }

    static {
        Object ignored = tx_1.Sy0;
        // JASM's synthetic a2_0.Hh0 table has entries [2, 1].
        int mode = 1;
        IX random;
        if (mode == 1) {
            random = new IX(new Lk());
        } else if (mode == 2) {
            random = new IX(new SecureRandom());
        } else {
            throw new IllegalArgumentException();
        }
        Ak0 = random;

        ignored = tx_1.Sy0;
        mode = 2;
        if (mode == 1) {
            random = new IX(new Lk());
        } else if (mode == 2) {
            random = new IX(new SecureRandom());
        } else {
            throw new IllegalArgumentException();
        }
        Vl0 = random;
        CD0 = 8682522807148012L;
    }
}
