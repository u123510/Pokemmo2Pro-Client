/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.GH;
import f.k20_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.sx
 */
public class ServerOpcode114Packet
extends GH {
    public short g8;

    public ServerOpcode114Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        this.g8 = this.Rj.getShort();
    }

    @Override
    public final void os0() {
        this.sr0().zA = this.g8;
    }
}

