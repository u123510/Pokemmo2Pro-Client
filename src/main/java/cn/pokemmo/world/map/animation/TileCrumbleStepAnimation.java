/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.map.animation;

import f.*;

import f.D2;
import f.Hr0;
import f.ao_1;
import f.as_0;
import f.pw_1;
import f.t50_0;
import f.tw0_0;

/*
 * Renamed from f.jS
 */
public class TileCrumbleStepAnimation {
    public final int W20;
    public final int WA;
    public boolean QE = false;
    public int ty0 = 0;
    public int Rb = 0;
    public pw_1 Oi = null;
    public final t50_0 uy0;

    public final void c80() {
        int n2 = this.W20;
        this.uy0.Fo.J9.IU((int)n2, (int)this.WA).ro = 0;
        if (this.QE) {
            return;
        }
        TileCrumbleStepAnimation js_12 = this;
        pw_1 pw_12 = pw_1.xC().TD0();
        pw_12 = Hr0.Ri0((n, d2) -> {
            this.ty0 = 1;
        }, pw_12, 0.033f);
        pw_12 = Hr0.Ri0((n, d2) -> {
            this.ty0 = 2;
        }, pw_12, 0.066f);
        pw_12 = Hr0.Ri0((n, d2) -> {
            this.ty0 = 3;
        }, pw_12, 0.033f);
        pw_1 pw_13 = Hr0.Ri0((n, d2) -> {
            this.ty0 = 4;
        }, pw_12, 0.066f);
        pw_13.y80(ao_1.pc((n, d2) -> {
            this.Oi = null;
        }));
        js_12.Oi = (pw_1)pw_13.mz0().Ms(tw0_0.LD0.Ov);
    }

    public final void mh0(pw_1 pw_12) {
        TileCrumbleStepAnimation js_12 = this;
        this.Oi = pw_12;
        pw_12 = pw_12.TD0();
        pw_12 = Hr0.Ri0((n, d2) -> {
            this.ty0 = 3;
        }, pw_12, 0.033f);
        pw_12 = Hr0.Ri0((n, d2) -> {
            this.ty0 = 2;
        }, pw_12, 0.066f);
        Hr0.Ri0((n, d2) -> {
            this.ty0 = 1;
        }, pw_12, 0.033f).y80(ao_1.pc((n, d2) -> {
            this.ty0 = 0;
        })).mz0();
    }

    public final void wR() {
        as_0 as_02 = this.uy0.Fo.J9.IU(this.W20, this.WA);
        if (as_02.UN && !this.QE) {
            this.QE = true;
            boolean bl = this.uy0.Fo.J9.Oq0();
            pw_1 pw_12 = Hr0.Ri0(js_1::z1, Hr0.Ri0((n, d2) -> {
                this.ty0 = 3;
            }, Hr0.Ri0((n, d2) -> {
                this.ty0 = 2;
            }, Hr0.Ri0((n, d2) -> {
                this.ty0 = 1;
            }, pw_1.xC().TD0(), 0.033f), 0.066f), 0.033f).y80(ao_1.pc((n, d2) -> {
                this.ty0 = 4;
            })), 0.066f);
            if (as_02.Rl0 > 0) {
                Hr0.Ri0((n, d2) -> {
                    this.Rb = 4;
                }, Hr0.Ri0((n, d2) -> {
                    this.Rb = 3;
                }, Hr0.Ri0((n, d2) -> {
                    this.Rb = 2;
                }, Hr0.Ri0((n, d2) -> {
                    this.Rb = 1;
                }, pw_12, 0.1f), 0.1f), 0.1f), 0.1f).y80(ao_1.pc((n, d2) -> {
                    this.Rb = 0;
                }));
            } else {
                Hr0.Ri0((n, d2) -> {
                    this.Rb = 28;
                }, Hr0.Ri0((n, d2) -> {
                    this.Rb = 27;
                }, Hr0.Ri0((n, d2) -> {
                    this.Rb = 26;
                }, Hr0.Ri0((n, d2) -> {
                    this.Rb = 25;
                }, Hr0.Ri0((n, d2) -> {
                    this.Rb = 24;
                }, Hr0.Ri0((n, d2) -> {
                    this.Rb = 23;
                }, Hr0.Ri0((n, d2) -> {
                    this.Rb = 31;
                }, Hr0.Ri0((n, d2) -> {
                    this.Rb = 30;
                }, Hr0.Ri0((n, d2) -> {
                    this.Rb = 29;
                }, pw_12, 0.133f), 0.133f), 0.066f).y80(ao_1.pc((n, d2) -> tw0_0.RE0.Hq0((byte)4, (short)2345))), 0.066f), 0.066f), 0.1f), 0.1f), 0.1f), 0.066f).y80(ao_1.pc((n, d2) -> {
                    this.Rb = 0;
                }));
            }
            pw_1 pw_13 = pw_12;
            pw_12.y80(ao_1.pc((n, d2) -> {
                this.Oi = null;
            }));
            pw_13.y80(ao_1.pc((n, d2) -> {
                if (bl) {
                    tw0_0.RE0.SA0((byte)4, (short)1203);
                }
            }));
            this.Oi = (pw_1)pw_13.mz0().Ms(tw0_0.LD0.Ov);
        }
    }

    public TileCrumbleStepAnimation(t50_0 t50_02, int n) {
        this.uy0 = t50_02;
        this.W20 = n / 5;
        this.WA = n % 5;
    }

    public static void z1(int n, D2 d2) {
        n = 2348;
        tw0_0.RE0.d00(true, (byte)4, (short)n, 0.0f);
    }
}

