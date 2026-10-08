package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class TeleportPadTileBehavior extends BaseTileBehavior {
    public TeleportPadTileBehavior() {
        super();
    }

    @Override
    public final boolean xB(LT lt1, LT lt2, bi0_1 bi0_1, byte b) {
        if (tw0_0.rl != null && tw0_0.e60 != null) {
            yt_1 yt1 = tw0_0.e60;
            if (yt1.jB0 == bi0_1) {
                if (bi0_1.oI0() || (b & -128) != 0) {
                    tw0_0.rl.fw = true;
                } else if (lt1.S80() <= -1.0f) {
                    tw0_0.rl.fw = true;
                }
            }
        }
        return false;
    }
}
