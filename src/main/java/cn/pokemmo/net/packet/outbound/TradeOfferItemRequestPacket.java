/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.CH0;
import f.RE;
import f.k20_0;
import java.nio.ByteBuffer;

public class TradeOfferItemRequestPacket
extends RE {
    public final CH0 W50;
    public final short a80;
    public final CH0 Bb0;
    public final CH0 JI;

    public TradeOfferItemRequestPacket(CH0 cH0, short s, CH0 cH02, CH0 cH03) {
        super(20);
        this.W50 = cH0;
        this.a80 = s;
        this.Bb0 = cH02;
        this.JI = cH03;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.W50.Sa);
        byteBuffer.putShort(this.a80);
        byteBuffer.putLong(this.Bb0.Sa);
        byteBuffer.putLong(this.JI.Sa);
    }
}

