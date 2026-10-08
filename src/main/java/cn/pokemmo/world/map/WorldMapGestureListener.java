/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.map;

import f.*;

import f.Bp0;
import f.KB;
import f.ZK;
import f.le0_2;
import f.lo0_0;
import f.ql_0;
import f.qq_0;

/*
 * Renamed from f.jN
 */
public class WorldMapGestureListener
implements ZK {
    public final /* synthetic */ lo0_0 xb0;

    public WorldMapGestureListener(lo0_0 lo0_02) {
        this.xb0 = lo0_02;
    }

    @Override
    public final void Qc() {
        this.xb0.NUL = 0.0f;
    }

    @Override
    public final boolean EA(float f, float f2) {
        return false;
    }

    @Override
    public final boolean fJ0(float f, float f2) {
        return false;
    }

    @Override
    public final boolean lPT7(int n, float f, float f2) {
        lo0_0 lo0_02 = this.xb0;
        if (lo0_02.K20 != null && lo0_02.Em0 != null && !this.xb0.Em0.f2()) {
            lo0_02 = this.xb0;
            if (System.currentTimeMillis() - lo0_02.Eb <= 2000L && lo0_02.Of()) {
                lo0_0 lo0_03 = lo0_02 = this.xb0;
                float f3 = lo0_03.SB0;
                float f4 = lo0_03.Mx;
                float f5 = lo0_03.OB;
                lo0_02.QD.j80 = lo0_02.A20;
                lo0_02.QD.Wm0 = f3;
                lo0_02.QD.IA = f4;
                lo0_02.QD.Eu0 = f5;
                Bp0 bp0 = lo0_0.wd0;
                f3 = bp0.x;
                if (!lo0_02.QD.Ur0(f3, bp0.y)) {
                    return false;
                }
                if (Math.abs(f) > 150.0f) {
                    KB kB = this.xb0.nh0;
                    if (kB.eE) {
                        if (System.currentTimeMillis() - kB.QP < 100L) {
                            return false;
                        }
                        this.xb0.NUL = this.xb0.lpt4;
                        this.xb0.bE0 = f;
                    }
                }
                if (Math.abs(f2) > 150.0f) {
                    KB kB = this.xb0.g1;
                    if (kB.eE) {
                        if (System.currentTimeMillis() - kB.QP < 100L) {
                            return false;
                        }
                        this.xb0.NUL = this.xb0.lpt4;
                        this.xb0.PF0 = f2;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean s70(float f, float f2, float f3, float f4) {
        Object object = this.xb0;
        if (((le0_2)object).K20 != null && ((le0_2)object).Em0 != null && !this.xb0.Em0.f2()) {
            object = this.xb0;
            if (System.currentTimeMillis() - ((lo0_0)object).Eb <= 2000L && ((le0_2)object).Of()) {
                WorldMapGestureListener jn_12 = this;
                object = lo0_0.wd0;
                ((Bp0)object).x = f;
                lo0_0.wd0.y = f2;
                ((qq_0)jn_12.xb0.Em0.AK).va.lPt8((Bp0)object);
                lo0_0 lo0_02 = jn_12.xb0;
                ql_0 ql_02 = lo0_02.QD;
                Object object2 = object;
                ql_0 ql_03 = ql_02;
                lo0_0 lo0_03 = lo0_02;
                float f5 = lo0_03.SB0;
                float f6 = lo0_03.Mx;
                float f7 = lo0_03.OB;
                ql_03.j80 = lo0_02.A20;
                ql_03.Wm0 = f5;
                ql_03.IA = f6;
                ql_03.Eu0 = f7;
                f5 = ((Bp0)object2).x;
                if (ql_02.Ur0(f5, ((Bp0)object2).y)) {
                    WorldMapGestureListener jn_13 = this;
                    KB kB = jn_13.xb0.nh0;
                    f5 = -f3;
                    kB.jd0(kB.VP + (int)f5, true);
                    KB kB2 = jn_13.xb0.g1;
                    f5 = -f4;
                    kB2.jd0(kB2.VP + (int)f5, true);
                    lo0_0 lo0_04 = jn_13.xb0;
                    KB kB3 = lo0_04.nh0;
                    if (kB3.OI && kB3.eE) {
                        lo0_04.t1 += f3;
                    }
                    kB3 = lo0_04.g1;
                    if (kB3.OI && kB3.eE) {
                        lo0_04.LQ += f4;
                    }
                    if (!lo0_04.Zx && (Math.abs(lo0_04.t1) > 50.0f || Math.abs(this.xb0.LQ) > 50.0f)) {
                        this.xb0.Zx = true;
                        this.xb0.lPT3();
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean mO(float f, float f2) {
        lo0_0 lo0_02 = this.xb0;
        lo0_02.t1 = 0.0f;
        lo0_02.LQ = 0.0f;
        lo0_02.Zx = false;
        return false;
    }

    @Override
    public final boolean Vq0(float f, float f2) {
        return false;
    }

    @Override
    public final boolean SV(Bp0 bp0, Bp0 bp02, Bp0 bp03, Bp0 bp04) {
        return false;
    }

    @Override
    public final void Ar0() {
    }
}

