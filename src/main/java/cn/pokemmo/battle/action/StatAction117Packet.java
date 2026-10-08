package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class StatAction117Packet extends Nt implements eb0_0 {
    public final CH0 Ox;
    public final String LPT1;

    public StatAction117Packet(CH0 target, String text) {
        this.Ox = target;
        this.LPT1 = text;
    }

    public static void Ip(tb0_1 target) {
        target.Ua0.oj0(target);
    }

    @Override
    public final byte BL0() {
        return 117;
    }

    @Override
    public final void IE0(
            PF first,
            PF second,
            boolean flag1,
            boolean flag2,
            short value,
            boolean flag3,
            ML0 manager,
            qn_1 request) {
        a10_0 registry = tw0_0.PK0;
        if (registry == null) {
            return;
        }

        tb0_1 target = registry.yD0(this.Ox);
        if (target == null) {
            return;
        }

        String text = this.LPT1;
        if (text.startsWith("{STRING_")) {
            text = sm0_0.dd(text);
        }

        String message = sm0_0.wa0(200368, text);
        manager.wJ("", message, () -> Ip(target));
    }
}
