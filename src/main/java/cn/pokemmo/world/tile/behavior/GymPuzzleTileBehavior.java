package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.util.HashMap;

public class GymPuzzleTileBehavior extends BaseTileBehavior {
    public final es_1 hg;
    public final kq0_0 LI0;

    public GymPuzzleTileBehavior(kq0_0 owner) {
        this.LI0 = owner;
        this.hg = new es_1();
    }

    public final void J2(us_1 value) {
        this.hg.Ue0(value);
    }

    @Override
    public final boolean fu(LT ignored, bi0_1 ignored2, byte kind) {
        I2 iterator = this.hg.ZD();
        while (iterator.hasNext()) {
            us_1 value = (us_1) iterator.next();
            if (value.new$ != kind) {
                continue;
            }
            HashMap map = this.LI0.z;
            ma0_1 state = (ma0_1) map.get(Integer.valueOf(value.Xb));
            if (state == null) {
                continue;
            }
            state.ah(value.ch > 0, false);
        }
        return false;
    }
}
