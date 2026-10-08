package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class WildEncounterTileBehavior extends BaseTileBehavior {
    public WildEncounterTileBehavior() {
    }

    @Override
    public final boolean aH(LT var1, bi0_1 var2, byte var3, byte var4) {
        if (!(var2 instanceof E90)) {
            return false;
        }
        if (var3 != 2) {
            return false;
        }
        return var2.il0.Zw(var1, true, new nk_0[]{nk_0.pM});
    }

    @Override
    public final boolean tm(LT var1, bi0_1 var2, boolean var3) {
        var2.ba0.JT = var1.Es();
        var2.ba0.pq = null;
        if (!var1.lW()) {
            byte var4 = var1.B3().oB;
            int var5 = var3 ? 107 : 106;
            boolean var6 = (var4 == var5);
            var1.ZD0(new D8(var1, var2, var6, var3));
        }
        return true;
    }
}
