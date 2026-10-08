package cn.pokemmo.world.render.blend;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.world.render.blend.BaseTerrainTileBlender;

import com.badlogic.gdx.graphics.Texture;

public class TimedDecalTransitionBlender extends BaseTerrainTileBlender {
    public final long oM;
    public final int z40;
    public final int IH;
    public final bi0_1 Bs0;
    public final short pA;
    public final short Fh0;

    public TimedDecalTransitionBlender(bi0_1 source, int delay, int duration) {
        super();
        this.oM = hk0_1.lQ();
        this.z40 = delay;
        this.IH = duration;
        this.Bs0 = source;
        this.pA = source.try$();
        this.Fh0 = source.WR();
        source.z90();
        source.nB0();
    }

    @Override
    public final void x8(hl0_1 target, int type, int y, int x) {
        if (type == 10) {
            return;
        }
        long elapsed = hk0_1.KG - this.oM;
        int offset = this.z40;
        if ((long)offset > elapsed) {
            return;
        }
        int frame = this.IH + offset;
        if (elapsed > (long)frame) {
            if (elapsed < (long)(frame + 75)) {
                frame = 1;
                if (type == 0) {
                    return;
                }
            } else if (elapsed < (long)(frame + 150)) {
                frame = 2;
                if (type == 0) {
                    return;
                }
            } else if (elapsed < (long)(frame + 225)) {
                frame = 3;
                if (type == 0) {
                    return;
                }
            } else {
                frame = 4;
            }
            Texture texture = QI.Py.kN((byte)0, 167, false).li0(frame).H8();
            float drawX = x;
            float drawY = y;
            target.CH0(texture, drawX, drawY);
        }
    }

    @Override
    public final boolean qR() {
        boolean expired = hk0_1.KG - this.oM
            > (long)(this.IH + 300 + this.z40);
        zv_2 state = this.Bs0.ba0;
        if ((state.Lq0 != this.pA || state.B5 != this.Fh0) && state.Y30 == 0) {
            expired = true;
        }
        return expired;
    }
}
