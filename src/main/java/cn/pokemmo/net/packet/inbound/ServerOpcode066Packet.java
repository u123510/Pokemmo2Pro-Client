/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode066Packet
extends GH {
    public A5 a10;
    public hl0_0 LpT7;

    public ServerOpcode066Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        ServerOpcode066Packet jJ = this;
        byte by = jJ.Rj.get();
        jJ.a10 = (A5)t_0.BI0(A5.N8.BM(by), A5.class, by);
        jJ.LpT7 = jJ.BM();
    }

    @Override
    public final void os0() {
        Object object = this.sr0().Bb(this.a10);
        if (object == null) {
            return;
        }
        ((RJ0)object).cq0(this.LpT7);
        object = this.sr0();
        hl0_0 hl0_02 = this.LpT7;
        object.getClass();
        short[][][] sArray = Ge0.wn;
        int n = Ge0.wn.length;
        block0: for (int j = 0; j < n; ++j) {
            for (short[] sArray2 : sArray[j]) {
                int n2 = sArray2.length;
                for (int k = 0; k < n2; ++k) {
                    if (sArray2[k] != hl0_02.wQ) continue;
                    ((Ge0)object).lPt9();
                    break block0;
                }
            }
        }
        this.sr0().yt0();
    }
}

