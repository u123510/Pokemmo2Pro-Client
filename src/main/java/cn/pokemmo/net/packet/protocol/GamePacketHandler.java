/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.protocol;

import f.*;

import f.Bp0;
import f.KB;
import f.ZK;
import f.le0_2;
import f.ni0_2;
import f.ql_0;
import f.qq_0;

public class GamePacketHandler
implements ZK {
    public final /* synthetic */ ni0_2 xG0;

    public GamePacketHandler(ni0_2 ni0_22) {
        this.xG0 = ni0_22;
    }

    @Override
    public final void Qc() {
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
        return false;
    }

    @Override
    public final boolean s70(float f, float f2, float f3, float f4) {
        Object object = this.xG0;
        if (((le0_2)object).K20 != null && ((le0_2)object).Em0 != null && this.xG0.Of()) {
            if (this.xG0.Gn0.Of()) {
                return false;
            }
            OE oE = (OE) this;
            object = ni0_2.xr;
            ((Bp0)object).x = f;
            ni0_2.xr.y = f2;
            ((qq_0)oE.xG0.Em0.AK).va.lPt8((Bp0)object);
            ni0_2 ni0_22 = oE.xG0;
            ql_0 ql_02 = ni0_22.pz;
            Object object2 = object;
            ql_0 ql_03 = ql_02;
            ni0_2 ni0_23 = ni0_22;
            float f5 = ni0_23.SB0;
            float f6 = ni0_23.Mx;
            float f7 = ni0_23.OB;
            ql_03.j80 = ni0_22.A20;
            ql_03.Wm0 = f5;
            ql_03.IA = f6;
            ql_03.Eu0 = f7;
            f5 = ((Bp0)object2).x;
            if (ql_02.Ur0(f5, ((Bp0)object2).y)) {
                ni0_2 ni0_24 = this.xG0;
                ni0_24.lPT1 += f4;
                int n = ni0_24.Me0 / 4;
                while (true) {
                    f6 = n;
                    if (!(Math.abs(this.xG0.lPT1) > f6)) break;
                    OE oE2 = (OE) this;
                    ni0_2 ni0_25 = oE2.xG0;
                    KB kB = ni0_25.Gn0;
                    float f9 = -ni0_25.lPT1 / f6;
                    kB.jd0(kB.VP + (int)f9, true);
                    ni0_2 ni0_26 = oE2.xG0;
                    float f10 = ni0_26.lPT1;
                    if (!(f4 > 0.0f)) {
                        f6 = -n;
                    }
                    ni0_26.lPT1 = f10 - f6;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean mO(float f, float f2) {
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

