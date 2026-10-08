package cn.pokemmo.world.render.blend;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.world.render.blend.BaseTerrainTileBlender;

import com.badlogic.gdx.graphics.Color;

public class WeatherAnimatedDecalBlender extends BaseTerrainTileBlender {
    public final long k;
    public final _else j80;
    public final db0_2 pB0;
    public final boolean k00;
    public final boolean p1;
    public final boolean Du0;

    public WeatherAnimatedDecalBlender(_else _elseVar, LT lt, db0_2 db0_2Var, boolean z, boolean z2, boolean z3) {
        this.k = hk0_1.lQ();
        this.j80 = _elseVar;
        this.pB0 = db0_2Var;
        this.k00 = z;
        this.p1 = z2;
        this.Du0 = z3;
        if (!z3 && (db0_2Var.C90() & 512) != 0) {
            LT lt2 = _elseVar.A40(lt.Tz() + 1, lt.HR());
            lt2.ZD0(new WeatherAnimatedDecalBlender(_elseVar, lt2, db0_2Var, z, z2, true));
        }
        short soundId;
        if ((db0_2Var.C90() & 1) != 0) {
            soundId = 1671;
        } else if (!z) {
            soundId = 1669;
        } else {
            soundId = 1670;
        }
        if (soundId > 0) {
            tw0_0.RE0.Ay(soundId);
        }
    }

    @Override
    public final void x8(hl0_1 v1, int i2, int i3, int i4) {
        long elapsed = hk0_1.KG - this.k;
        int frame = 0;
        if (this.k00) {
            if (elapsed < 380L) {
                frame = 2;
            } else if (elapsed < 440L) {
                frame = 1;
            } else if (elapsed < 500L) {
                frame = 0;
            }
        } else if (elapsed >= 60L) {
            if (elapsed < 120L) {
                frame = 1;
            } else if (elapsed < 600L) {
                frame = 2;
            } else if (this.p1) {
                frame = 2;
            } else if (elapsed < 660L) {
                frame = 1;
            } else if (elapsed < 720L) {
                frame = 0;
            }
        }
        Color.abgr8888ToColor(v1.oH, Vs0.lv);
        v1.og = Vs0.lv;
        db0_2 db0_2Var = this.pB0;
        int nextFrame = frame;
        if ((db0_2Var.bm & 256) != 0) {
            int idx = frame * 2;
            LPT6_ lpt6_ = (db0_2Var.zC != null && idx < db0_2Var.zC.length) ? db0_2Var.zC[idx] : null;
            if (lpt6_ == null) {
                return;
            }
            if (i2 != 0) {
                float x = (float) i3;
                float y = (float) (i4 - 16);
                v1.Lz(lpt6_, x, y);
                if (Vs0.cOM7 > 0) {
                    int key = (this.j80.dw * 10000) + this.pB0.cY;
                    B5 b5 = (B5) tw0_0.ys0.go.get((frame * 131072) + key);
                    if (b5 != null) {
                        v1.oH.set(Color.WHITE);
                        v1.og = Color.WHITE.toFloatBits();
                        b5.NL0(x);
                        b5.ZJ(y);
                        b5.jN(v1);
                        Color.abgr8888ToColor(v1.oH, Vs0.lv);
                        v1.og = Vs0.lv;
                    }
                }
            }
            nextFrame = idx + 1;
        }
        db0_2 db0_2Var2 = this.pB0;
        int nextFrame2 = nextFrame;
        if ((db0_2Var2.bm & 512) != 0) {
            int baseIdx = nextFrame * 4;
            int offset = this.Du0 ? 2 : 0;
            int idx2 = baseIdx + offset;
            LPT6_ lpt6_2 = (db0_2Var2.zC != null && idx2 < db0_2Var2.zC.length) ? db0_2Var2.zC[idx2] : null;
            if (lpt6_2 == null) {
                return;
            }
            if (i2 != 0) {
                float x2 = (float) i3;
                float y2 = (float) (i4 - 16);
                v1.Lz(lpt6_2, x2, y2);
                if (Vs0.cOM7 > 0) {
                    int key2 = (this.j80.dw * 10000) + this.pB0.cY;
                    B5 b5_2 = (B5) tw0_0.ys0.go.get((nextFrame * 262144) + key2);
                    if (b5_2 != null) {
                        v1.oH.set(Color.WHITE);
                        v1.og = Color.WHITE.toFloatBits();
                        b5_2.NL0(x2);
                        b5_2.ZJ(y2);
                        b5_2.jN(v1);
                        Color.abgr8888ToColor(v1.oH, Vs0.lv);
                        v1.og = Vs0.lv;
                    }
                }
            }
            nextFrame2 = baseIdx + 1;
        }
        if (i2 != 0) {
            return;
        }
        int offset2 = this.Du0 ? 2 : 0;
        int idx3 = nextFrame2 + offset2;
        LPT6_ lpt6_3 = (this.pB0.zC != null && idx3 < this.pB0.zC.length) ? this.pB0.zC[idx3] : null;
        if (lpt6_3 != null) {
            v1.Lz(lpt6_3, (float) i3, (float) i4);
        }
        if (Vs0.cOM7 > 0) {
            int key3 = (this.j80.dw * 10000) + this.pB0.cY;
            B5 b5_3 = (B5) tw0_0.ys0.go.get(((nextFrame2 + offset2) * 65536) + key3);
            if (b5_3 != null) {
                v1.oH.set(Color.WHITE);
                v1.og = Color.WHITE.toFloatBits();
                b5_3.NL0((float) i3);
                b5_3.ZJ((float) i4);
                b5_3.jN(v1);
                Color.abgr8888ToColor(v1.oH, Vs0.lv);
                v1.og = Vs0.lv;
            }
        }
    }

    @Override
    public final boolean qR() {
        if (this.p1) {
            return false;
        }
        long elapsed = hk0_1.KG - this.k;
        long limit = this.k00 ? 500L : 720L;
        return elapsed > limit;
    }
}
