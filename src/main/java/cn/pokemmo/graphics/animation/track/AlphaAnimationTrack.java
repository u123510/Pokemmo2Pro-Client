package cn.pokemmo.graphics.animation.track;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.graphics.Texture;

public class AlphaAnimationTrack extends BaseAnimationTrack {
    public qh0_1[] WN;
    public int vx;

    public AlphaAnimationTrack(s4_0 type, boolean enabled) {
        super(type, enabled);
    }

    @Override
    public final void lI() {
        this.vx = 18;
        this.WN = new qh0_1[80];
        for (int i = 0; i < this.WN.length; i++) {
            this.WN[i] = new qh0_1((kk0_2) (Object) this);
            this.WN[i].tp(this.ig0);
        }
    }

    @Override
    public final void ro0(hl0_1 renderer) {
        for (qh0_1 value : this.WN) {
            if (value.TB) {
                continue;
            }
            long next = value.Xc + this.vx;
            if (next < hk0_1.KG) {
                value.Xc = next;
                if (value.Bl0 > value.OY) {
                    value.Bl0--;
                    value.Xk0 += 3;
                } else {
                    switch (value.Co0) {
                        case 0:
                            value.f0++;
                            if (value.f0 > 8) {
                                value.f0 = 0;
                                value.Co0 = 0;
                                value.tp(false);
                            }
                            break;
                        case 1:
                            value.f0++;
                            if (value.f0 > 8) {
                                value.f0 = 0;
                                value.Co0 = 0;
                            }
                            break;
                        case 2:
                            value.f0++;
                            if (value.f0 > 8) {
                                value.f0 = 0;
                                value.Co0 = 1;
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
            fn_0 assets = fn_0.qz0();
            int tile = value.Co0;
            if (tile < 0 || tile > 3) {
                tile = 0;
            }
            int textureIndex = tile + 3;
            Texture texture = textureIndex < assets.jF.length ? assets.jF[textureIndex] : assets.bz;
            renderer.CH0(texture, value.Bl0, value.Xk0);
        }
    }
}
