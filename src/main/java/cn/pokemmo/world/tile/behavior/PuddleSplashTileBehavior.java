package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class PuddleSplashTileBehavior extends BaseTileBehavior {
    public PuddleSplashTileBehavior() { super(); }
    @Override public final boolean aH(LT first, bi0_1 value, byte b3, byte b4) { return value.oI0() || false; }
    @Override public final boolean xB(LT first, LT second, bi0_1 value, byte b4) {
        if (value.vx0() && !tw0_0.LD0.nv()) {
            first.ZD0(new q70_0(value.oI0() ? 75 : (value.uv() ? 100 : 150)));
            if (value.Ou()) tw0_0.RE0.d00(true, (byte)2, (short)1662, 0.0F);
        }
        return false;
    }
    @Override public final void K40(bi0_1 value, LT target) {
        if (value.vx0() && !target.lW() && !tw0_0.LD0.nv()) target.ZD0(new q70_0(0));
    }
    @Override public final boolean Xc() { return false; }
}
