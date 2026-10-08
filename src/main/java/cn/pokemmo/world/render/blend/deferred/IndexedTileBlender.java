package cn.pokemmo.world.render.blend.deferred;

import cn.pokemmo.world.render.blend.BaseDeferredTileBlender;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class IndexedTileBlender extends BaseDeferredTileBlender {
    public final byte th;
    public final LT o6;
    public final Ou0 DH;
    public float Wh;

    public IndexedTileBlender(byte index, LT tile) {
        super();
        this.Wh = 0.0F;
        this.th = index;
        this.o6 = tile;

        int modelIndex;
        short animationId;
        switch (tile.re()) {
            case 4:
            case 6:
            case 33:
                modelIndex = c8_0.A90().YG();
                animationId = 1749;
                break;
            case 5:
                modelIndex = c8_0.A90().YG() + 4;
                animationId = 1749;
                break;
            case 8:
                modelIndex = c8_0.A90().YG() + 8;
                animationId = 1749;
                break;
            case 10:
                modelIndex = 16;
                animationId = 1752;
                break;
            case 61:
                modelIndex = 13;
                animationId = 1750;
                break;
            case 63:
                modelIndex = 14;
                animationId = 1750;
                break;
            default:
                modelIndex = 15;
                animationId = 1751;
                break;
        }

        Ou0 model = fi_0.xL().cOM6(modelIndex);
        this.DH = model;
        model.TU(0, true);
        model.TU(1, true);
        model.s30(animationId);

        if (tile.gr0()) {
            C8 position = tile.Ki();
            model.ho.el0(
                    position.x * 0.25F + 0.125F,
                    position.y * 0.25F + 0.0500000007F,
                    position.z * 0.25F + 0.174999997F
            );
        } else {
            model.ho.el0(
                    tile.Tz() * 0.25F + 0.125F,
                    tile.S80() * 0.25F + 0.0500000007F,
                    tile.HR() * 0.25F + 0.174999997F
            );
        }
    }

    @Override
    public final void gd(ER renderer, U5 context, BJ0 unused, float unusedX, float unusedY, float unusedZ) {
        this.Wh += lg_0.S4.uL;
        this.DH.bo0(this.Wh);
        renderer.Lh0(this.DH, context);
    }

    public final boolean qR() {
        return this.o6 != this.o6.F2().Hy[this.th];
    }
}
