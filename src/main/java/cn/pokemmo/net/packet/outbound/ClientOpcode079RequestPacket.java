/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.RE;
import f.k20_0;
import java.nio.ByteBuffer;

public class ClientOpcode079RequestPacket
extends RE {
    public final byte hv;
    public final byte gm;
    public final byte W8;
    public final short ZM;

    public ClientOpcode079RequestPacket(byte by, byte by2, byte by3, short s) {
        super(79);
        this.hv = by;
        this.gm = by2;
        this.W8 = by3;
        this.ZM = s;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put(this.hv);
        byteBuffer.put(this.gm);
        byteBuffer.put(this.W8);
        byteBuffer.putShort(this.ZM);
    }
}

