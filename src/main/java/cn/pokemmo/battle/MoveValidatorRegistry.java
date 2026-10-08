package cn.pokemmo.battle;

import f.AI;
import f.S;
import f.jt_0;

public class MoveValidatorRegistry {
    public AI lY;

    public MoveValidatorRegistry() {
        this.lY = new AI();
    }

    public static void w0(short s) {
        if ((s >= 288 && s <= 395)
                || (s >= 407 && s <= 433)
                || (s >= 800 && s <= 1010)
                || s == 2567
                || s == 1533
                || (s >= 1045 && s <= 1502)
                || s == 1044
                || s == 1043
                || s == 1504
                || S.J9(s, jt_0.Qy0)) {
            return;
        }
        throw new IllegalArgumentException();
    }
}
