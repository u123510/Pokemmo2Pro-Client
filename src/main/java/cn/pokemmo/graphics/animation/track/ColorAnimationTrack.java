package cn.pokemmo.graphics.animation.track;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class ColorAnimationTrack extends BaseAnimationTrack {
    public int dt;
    public B5 YA;
    public long CH0;

    public ColorAnimationTrack(s4_0 source, boolean enabled) {
        super(source, enabled);
        this.YA = null;
        this.CH0 = -1L;
    }

    public void lI() {
        this.YA = new B5(fn_0.qz0().YZ);
        this.dt = this.ig0 ? 50 : 0;
    }

    public void ro0(hl0_1 renderer) {
        long now = hk0_1.KG;
        if (this.CH0 + 100L < now) {
            this.CH0 = now;
            if (this.CJ) {
                if (this.dt > 0) {
                    this.dt -= 2;
                }
                if (this.dt < 0) {
                    this.dt = 0;
                }
            } else {
                if (this.dt < 50) {
                    this.dt += 2;
                }
                if (this.dt > 50) {
                    this.dt = 50;
                }
            }
            this.YA.Ha0(this.dt / 255.0F);
        }
        if (this.dt < 1) {
            return;
        }
        ly0_0 position = tw0_0.LD0.Sc.Ej0();
        this.YA.An(position.ec0.x, position.ec0.y);
        this.YA.ak0(position.jG0.x, position.jG0.y);
        this.YA.jN(renderer);
    }
}
