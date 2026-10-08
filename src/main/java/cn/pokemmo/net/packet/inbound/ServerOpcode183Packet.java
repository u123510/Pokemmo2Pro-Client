/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.GH;
import f.k20_0;
import f.yt_1;
import java.nio.ByteBuffer;

/*
 * Renamed from f.h5
 */
public class ServerOpcode183Packet
extends GH {
    public short b;

    public ServerOpcode183Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        ServerOpcode183Packet h5_02 = this;
        h5_02.Rj.get();
        h5_02.b = h5_02.Rj.getShort();
    }

    @Override
    public final void os0() {
        yt_1 yt_12 = this.sr0().cJ0;
        if (yt_12 == null) {
            return;
        }
        yt_12.qu0(this.b);
    }
}

