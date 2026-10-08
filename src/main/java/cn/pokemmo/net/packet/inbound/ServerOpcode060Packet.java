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
 * Renamed from f.e5
 */
public class ServerOpcode060Packet
extends GH {
    public String N00;

    public ServerOpcode060Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        ServerOpcode060Packet e5_02 = this;
        e5_02.pE();
        e5_02.N00 = e5_02.q60();
    }

    @Override
    public final void os0() {
        this.sr0().jC(sm0_0.wa0(5002, this.N00), zo_0.n4);
    }
}

