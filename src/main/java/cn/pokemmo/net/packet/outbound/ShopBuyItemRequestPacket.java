/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.RE;
import f.k20_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.cOm1
 */
public class ShopBuyItemRequestPacket
extends RE {
    public final long Cr0;
    public final ByteBuffer us;
    public final int gJ0;

    public ShopBuyItemRequestPacket(long l, ByteBuffer byteBuffer, int n) {
        super(241);
        this.Cr0 = l;
        this.us = byteBuffer;
        this.gJ0 = n;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        ShopBuyItemRequestPacket com1__12 = this;
        byteBuffer.putLong(this.Cr0);
        byteBuffer.putInt(this.us.limit());
        int n = com1__12.gJ0 * 8000;
        int n2 = Math.min(com1__12.us.limit() - this.gJ0 * 8000, 8000);
        byteBuffer.putShort((short)n2);
        byteBuffer.put(((ByteBuffer)this.us.duplicate().position(n).limit(n + n2)).slice());
    }
}

