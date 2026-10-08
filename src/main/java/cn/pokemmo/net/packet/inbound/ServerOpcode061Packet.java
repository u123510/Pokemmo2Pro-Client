/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.GH;
import f.k20_0;
import f.sm0_0;
import f.zo_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.r10
 */
public class ServerOpcode061Packet
extends GH {
    public String cB;

    public ServerOpcode061Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        ServerOpcode061Packet r10_02 = this;
        r10_02.pE();
        r10_02.cB = r10_02.q60();
    }

    @Override
    public final void os0() {
        this.sr0().jC(sm0_0.wa0(5003, this.cB), zo_0.n4);
    }
}

