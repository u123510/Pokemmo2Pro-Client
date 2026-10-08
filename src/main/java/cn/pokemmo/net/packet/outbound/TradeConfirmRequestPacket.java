/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.RE;
import f.bo_1;
import f.k20_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.m60
 */
public class TradeConfirmRequestPacket
extends RE {
    public final short G10;
    public final String A3;
    public final String XF;
    public final boolean Ly;

    public TradeConfirmRequestPacket(short s, String string, String string2, boolean bl) {
        super(42);
        this.G10 = s;
        this.A3 = string;
        this.XF = string2;
        this.Ly = bl;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        TradeConfirmRequestPacket m60_02 = this;
        byteBuffer.put((byte)(this.Ly ? 1 : 0));
        byteBuffer.putShort(this.G10);
        bo_1.cK(m60_02.A3, byteBuffer);
        bo_1.cK(m60_02.XF, byteBuffer);
    }
}

