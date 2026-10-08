package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class TrapdoorTileBehavior extends BaseTileBehavior {
    public final Ou0 lt0;
    public boolean jc;

    public TrapdoorTileBehavior(Ou0 ou0) {
        super();
        this.jc = false;
        this.lt0 = ou0;
    }

    @Override
    public final boolean xB(LT lt, LT lt2, bi0_1 bi0_1, byte b) {
        if (!this.jc) {
            this.lt0.sC0(1, false, new qy_0((eq_0)(Object)this));
            this.jc = true;
        }
        return false;
    }
}
