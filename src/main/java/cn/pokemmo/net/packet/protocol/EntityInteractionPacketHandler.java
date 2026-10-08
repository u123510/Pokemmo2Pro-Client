/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.protocol;

import f.*;

import f.Bp0;
import f.Qy0;
import f.ZK;
import f.hy0_0;
import f.ir_0;
import f.qq_0;
import f.tw0_0;
import f.yt_1;
import java.util.ArrayList;

public class EntityInteractionPacketHandler
implements ZK {
    public final /* synthetic */ Qy0 Jy;

    public EntityInteractionPacketHandler(Qy0 qy0) {
        this.Jy = qy0;
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
        yt_1 yt_12 = tw0_0.e60;
        if (yt_12 != null && !this.Jy.y4() && tw0_0.PK0 == null) {
            hy0_0 hy0_02 = tw0_0.LD0.sy;
            ir_0 ir_02 = hy0_02.pz0;
            Bp0 bp0 = hy0_02.IG;
            bp0.x = f;
            bp0.y = f2;
            ir_02.Prn.lPt8(bp0);
            Bp0 bp02 = hy0_02.IG;
            float f3 = bp02.x;
            if (hy0_02.pz0.Ic(f3, bp02.y, false) != null) {
                return false;
            }
            Qy0 qy0 = this.Jy;
            Bp0 bp03 = qy0.nY;
            bp03.x = f;
            bp03.y = f2;
            Bp0 bp04 = this.Jy.nY;
            ((qq_0)qy0.Em0.AK).va.lPt8(bp04);
            ArrayList arrayList = yt_12.YK0();
            Bp0 bp05 = this.Jy.nY;
            int n = (int)bp05.x;
            int n2 = (int)bp05.y;
            qy0.lJ(true, arrayList, n, n2);
            return false;
        }
        return false;
    }

    @Override
    public final boolean lPT7(int n, float f, float f2) {
        return false;
    }

    @Override
    public final boolean s70(float f, float f2, float f3, float f4) {
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
