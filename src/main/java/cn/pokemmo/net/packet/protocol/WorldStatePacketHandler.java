/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.protocol;

import f.*;

public class WorldStatePacketHandler
implements ZK {
    public final /* synthetic */ ng_2 C00;

    public WorldStatePacketHandler(ng_2 ng_22) {
        this.C00 = ng_22;
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

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean lPT7(int n, float f, float f2) {
        ng_2 ng_22 = this.C00;
        if (ng_22.K20 == null) return false;
        if (ng_22.Em0 == null) return false;
        if (!this.C00.Of()) {
            return false;
        }
        if (Math.abs(f) > Math.abs(f2)) {
            int n2;
            P8 p8;
            P8 p82;
            if (f < -250.0f && this.C00.Ru.g6.size() > this.C00.Ru.Bb() + 1) {
                P8 p83 = this.C00.Ru;
                p82 = p83;
                p8 = p83;
                n2 = p83.Bb() + 1;
            } else {
                if (!(f > 250.0f)) return false;
                if (this.C00.Ru.Bb() <= 0) return false;
                P8 p84 = this.C00.Ru;
                p82 = p84;
                p8 = p84;
                n2 = p84.Bb() - 1;
            }
            p82.Zd((com2__3)p8.g6.get(n2));
            return false;
        }
        if (f2 < -150.0f) {
            this.C00.Ru(false);
            return false;
        }
        if (!(f2 > 150.0f)) return false;
        this.C00.Ru(true);
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

