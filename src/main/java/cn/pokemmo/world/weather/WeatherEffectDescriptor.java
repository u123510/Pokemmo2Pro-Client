package cn.pokemmo.world.weather;

import f.*;

public class WeatherEffectDescriptor extends gb0_1 {
    public lr0[] V8;
    public int Wu0;

    public WeatherEffectDescriptor(s4_0 direction, boolean enabled) {
        super(direction, enabled);
    }

    public final void lI() {
        super.lI();
        int count;
        if (this.ra == s4_0.SA0) {
            this.Wu0 = 20;
            count = 40;
        } else {
            this.Wu0 = 35;
            count = 30;
        }
        this.V8 = new lr0[(int) (count * 1.4D)];
        for (int index = 0; index < this.V8.length; index++) {
            this.V8[index] = new lr0(this);
            this.V8[index].lq0(this.ig0);
        }
    }

    public final void ro0(hl0_1 batch) {
        super.ro0(batch);
        for (lr0 sprite : this.V8) {
            if (sprite.fj) {
                continue;
            }
            if (sprite.yI0 + this.Wu0 < hk0_1.KG) {
                sprite.yI0 = hk0_1.KG;
                if (sprite.gY > sprite.qG) {
                    sprite.gY -= 16;
                    sprite.cb += 32;
                } else if (this.ra != s4_0.SB && this.ra != s4_0.Nh) {
                    switch (sprite.kb0) {
                        case 0:
                        case 1:
                        case 2:
                            sprite.kb0++;
                            break;
                        case 3:
                            sprite.lq0(false);
                            break;
                        default:
                            break;
                    }
                } else {
                    switch (sprite.kb0) {
                        case 0:
                            sprite.kb0 = 1;
                            break;
                        case 1:
                            sprite.kb0 = 4;
                            break;
                        case 4:
                            sprite.kb0 = 5;
                            break;
                        case 5:
                            sprite.lq0(false);
                            break;
                        default:
                            break;
                    }
                }
            }

            AG0 frame = null;
            ph_1 frames = ph_1.Ry();
            if (sprite.kb0 >= 0 && sprite.kb0 < frames.LL0.length) {
                frame = frames.LL0[sprite.kb0];
            }
            batch.Lz(frame.d3(), (float) sprite.gY, (float) sprite.cb);
        }
    }
}
