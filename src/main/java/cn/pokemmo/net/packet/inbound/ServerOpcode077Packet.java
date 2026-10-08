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
 * Renamed from f.al0
 */
public class ServerOpcode077Packet
extends GH {
    public byte pV;

    public ServerOpcode077Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        this.pV = this.Rj.get();
    }

    @Override
    public final void os0() {
        this.sr0().lt = this.pV;
    }
}

