/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode096Packet
extends GH {
    public byte bx;
    public HZ[] nl0;

    public ServerOpcode096Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        ServerOpcode096Packet pE0 = this;
        pE0.bx = pE0.Rj.get();
        pE0.nl0 = pE0.Q10();
    }

    @Override
    public final void os0() {
        BU bU = BU.T50;
        if (bU != null) {
            kf0_2 kf0_22;
            ServerOpcode096Packet pE0 = this;
            byte by = pE0.bx;
            HZ[] hZArray = pE0.nl0;
            kf0_2 kf0_23 = bU.yQ;
            if (kf0_23 != null) {
                kf0_23.xe0();
                bU.yQ = null;
            }
            BU bU2 = bU;
            kf0_23 = new kf0_2(bU, by, hZArray);
            bU2.yQ = kf0_23;
            bU2.SL(kf0_23);
            bU2.yQ.lt0();
            bU2.yQ.E40(tw0_0.LD0.ew0() / 2 - bU.yQ.Mx / 2, tw0_0.LD0.Hv0() / 2 - bU.yQ.OB / 2);
        }
    }
}

