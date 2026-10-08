/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.BR;
import f.BU;
import f.GH;
import f.k20_0;
import java.nio.ByteBuffer;

public class ServerOpcode157Packet
extends GH {
    public boolean ka;

    public ServerOpcode157Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        boolean bl = (this.Rj.get() & 0xFF) == 1;
        this.ka = bl;
    }

    @Override
    public final void os0() {
        BR br = (BR)this.sr0();
        boolean bl = this.ka;
        BU bu = br.lZ.zK0;
        if (bu != null) {
            bu.U1(null, bl, true);
        }
    }
}
