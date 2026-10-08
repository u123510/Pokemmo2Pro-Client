package cn.pokemmo.world.map;

import f.*;
import java.util.BitSet;

public class MapWarpPositionTuple {
    public final X90 Im;
    public final ew0_0 r0;
    public final yy0[] ku0;
    public BitSet[] VZ;
    public cn.pokemmo.graphics.sprite.GdxAddonSpriteManager YR;
    public boolean s1;

    public MapWarpPositionTuple(X90 v1, ew0_0 v2, byte i3) {
        this.VZ = null;
        this.YR = null;
        this.s1 = false;
        this.Im = v1;
        this.r0 = v2;
        this.ku0 = new yy0[i3];
        byte b = 0;
        while (b < i3) {
            this.ku0[b] = new yy0();
            b = (byte) (b + 1);
        }
    }

    public final LPT6_ bO(byte i1, byte i2) {
        cn.pokemmo.graphics.sprite.GdxAddonSpriteManager nat = this.YR;
        if (nat != null) {
            this.YR = null;
            nat.bH0(this.Im, this.r0, false);
        }
        if (i2 < 0 || i2 >= this.ku0.length) {
            return null;
        }
        return this.ku0[i2].DD0[i1];
    }

    public final void Pu(boolean i1) {
        cn.pokemmo.graphics.sprite.GdxAddonSpriteManager nat = this.YR;
        if (nat != null) {
            this.YR = null;
            nat.bH0(this.Im, this.r0, i1);
        }
    }
}
