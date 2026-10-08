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
 * Renamed from f.jv
 */
public class TradeRequestPacket
extends GH {
    public boolean Bc;

    public TradeRequestPacket(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        boolean bl = (this.Rj.get() & 0xFF) == 1;
        this.Bc = bl;
    }

    @Override
    public final void os0() {
        this.sr0().Am(this.Bc);
    }
}

