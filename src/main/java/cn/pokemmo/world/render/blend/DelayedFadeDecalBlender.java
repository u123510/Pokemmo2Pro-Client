package cn.pokemmo.world.render.blend;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.world.render.blend.BaseTerrainTileBlender;

import com.badlogic.gdx.graphics.Texture;

public class DelayedFadeDecalBlender extends BaseTerrainTileBlender {
    public final long FZ;
    public final int coM3;
    public final int D60;
    public final LT yV;

    public DelayedFadeDecalBlender(int delay, int duration, LT target) {
        super();
        this.FZ = hk0_1.lQ();
        this.coM3 = duration;
        this.D60 = delay;
        this.yV = target;
    }

    public final void x8(hl0_1 renderer, int stage, int x, int y) {
        if (stage == 10) {
            return;
        }
        long elapsed = hk0_1.KG - this.FZ;
        int duration = this.coM3;
        if (elapsed <= duration) {
            if (stage == 0) {
                Texture texture = QI.Py.kN((byte) 1, 252, false).li0(1).H8();
                renderer.CH0(texture, (float) x, (float) y);
            }
            return;
        }
        int current = duration + this.D60;
        int next = stage;
        if (elapsed < current + 100L) {
            next = 2;
            if (stage == 0) {
                return;
            }
        } else if (elapsed < current + 200L) {
            next = 3;
            if (stage == 0) {
                return;
            }
            short id = this.yV.xl0();
            if (id == 519 || id == 522) {
                short replacement = id == 519 ? (short) 518 : (short) 530;
                this.yV.HU(this.yV.uj(), replacement);
            }
        } else if (elapsed < current + 300L) {
            next = 4;
            if (stage == 0) {
                return;
            }
        } else {
            next = 4;
        }
        Texture texture = QI.Py.kN((byte) 1, 252, false).li0(next).H8();
        renderer.CH0(texture, (float) x, (float) y);
    }

    @Override
    public final boolean qR() {
        return hk0_1.KG - this.FZ > (long) this.D60 + this.coM3 + 400L;
    }
}
