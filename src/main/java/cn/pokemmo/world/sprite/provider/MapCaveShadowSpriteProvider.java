package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class MapCaveShadowSpriteProvider extends BaseSpriteFrameProvider {
    // $FF: synthetic field
    public final qa0_1 gH0;

    public MapCaveShadowSpriteProvider(qa0_1 var1) {
        this.gH0 = var1;
    }

    @Override
    public final i4_0 KN() {
        ByteBuffer var1 = this.gH0.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        XG0 var2 = XG0.fP;
        Q20 var3 = new Q20(this.gH0.EZ.V(br_2.Ck0), 233, 1, var2, var1);
        int var4 = this.gH0.EZ.V(br_2.cb0);
        int var5 = this.gH0.EZ.V(br_2.xV) + 12;
        return fp_2.bB(this.gH0, var3, var4, var5, 512, 160, var2, null);
    }
}
