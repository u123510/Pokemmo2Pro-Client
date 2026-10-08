package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.util.Arrays;

public class BattleActionNeg022Packet extends Nt implements eb0_0 {
    public final String Ry;
    public final CH0 Eg;

    public BattleActionNeg022Packet(CH0 type, String name) {
        super();
        this.Ry = name;
        this.Eg = type;
    }

    public final byte BL0() {
        return (byte)-22;
    }

    public final void IE0(PF first, PF second, boolean flag1, boolean flag2, short value,
                          boolean flag3, ML0 target, qn_1 context) {
        a10_0 registry = tw0_0.PK0;
        if (registry == null) {
            return;
        }
        tb0_1 entry = registry.yD0(this.Eg);
        if (entry == null) {
            return;
        }
        PF candidate = Arrays.stream(registry.wI0[entry.Ni])
                .filter(this::wm0)
                .findFirst()
                .orElse(null);
        if (candidate == null) {
            return;
        }
        String message = sm0_0.Bx(16804143, new String[]{
                this.Ry, entry.B3.Ky0(), candidate.Yp()
        });
        target.wJ(message, "", null);
    }

    public final boolean Hm() {
        return false;
    }

    public final boolean wm0(PF value) {
        return !value.Zo0().equals(this.Eg);
    }
}
