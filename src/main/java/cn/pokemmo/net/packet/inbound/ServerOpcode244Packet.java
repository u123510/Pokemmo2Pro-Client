/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.text.NumberFormat;

public class ServerOpcode244Packet
extends GH {
    public int Yh0;
    public int WJ0;

    public ServerOpcode244Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        ServerOpcode244Packet c1 = this;
        c1.Yh0 = c1.Rj.getInt();
        c1.WJ0 = c1.Rj.getInt();
    }

    @Override
    public final void os0() {
        ServerOpcode244Packet c1 = this;
        int n = c1.Yh0;
        int n2 = c1.WJ0;
        BR bR = (BR)this.sr0();
        ZY zY = bR.Cl;
        int n3 = zY.coN;
        zY.coN = n;
        zY.LPT9 = n2;
        if (n3 > n) {
            bR.qK(sm0_0.wa0(3008, NumberFormat.getInstance().format(n3 - n) + ""));
        } else if (n > n3) {
            bR.qK(sm0_0.wa0(3018, NumberFormat.getInstance().format(n - n3) + ""));
        }
        BR bR2 = bR;
        bR2.VI();
        le0_2 le0_22 = bR2.lZ.zK0;
        if (le0_22 != null && (le0_22 = ((BU)le0_22).kx) != null) {
            ((LF0)le0_22).Hn();
        }
    }
}

