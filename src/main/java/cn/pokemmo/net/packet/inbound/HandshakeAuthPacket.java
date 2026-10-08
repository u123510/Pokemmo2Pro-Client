/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.Cq0;
import f.GH;
import f.ZY;
import f.aw_0;
import f.c8_0;
import f.k20_0;
import f.lpt5__5;
import f.rg0_2;
import f.we_2;
import java.nio.ByteBuffer;

/*
 * Renamed from f.Ni0
 */
public class HandshakeAuthPacket
extends GH {
    public boolean Qr;
    public int QN;
    public int sB;

    public HandshakeAuthPacket(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    static {
        Cq0.E1(HandshakeAuthPacket.class);
    }

    @Override
    public final void Oj0() {
        boolean bl = (this.Rj.get() & 0xFF) == 1;
        this.Qr = bl;
        if (bl) {
            HandshakeAuthPacket ni0_02 = this;
            ZY zY = ni0_02.sr0().Cl;
            this.q60();
            zY.getClass();
            ZY zY2 = ni0_02.sr0().Cl;
            this.Rj.get();
            zY2.getClass();
            ni0_02.sr0().Cl.Lx0 = this.Rj.getInt();
            ni0_02.sr0().Cl.coN = this.Rj.getInt();
            ni0_02.sr0().Cl.LPT9 = this.Rj.getInt();
            ni0_02.QN = ni0_02.Rj.getInt();
            ni0_02.sB = ni0_02.Rj.getInt();
        }
    }

    @Override
    public final void km() {
        if (this.Qr) {
            k20_0 k20_02 = (k20_0)this.uk;
            if (k20_02.Co0 == 2) {
                k20_02.Co0 = 3;
                this.je(new aw_0());
            }
            HandshakeAuthPacket ni0_02 = this;
            int n = ni0_02.QN;
            int n2 = ni0_02.sB;
            this.sr0().getClass();
            lpt5__5.hL.ZD(new we_2(), rg0_2.r4(4000) + 45000);
            int n3 = n;
            n = (int)(System.currentTimeMillis() / 1000L) - n2;
            c8_0.JD0.qu = n3;
            c8_0.JD0.HY = n;
            c8_0.JD0.run();
        } else {
            ((k20_0)this.uk).yK0();
        }
    }

    @Override
    public final void os0() {
    }
}

