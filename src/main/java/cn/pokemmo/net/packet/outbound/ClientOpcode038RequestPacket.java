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

/*
 * Renamed from f.gu
 */
public class ClientOpcode038RequestPacket
extends RE {
    public final short J30;
    public final CH0 vz;
    public final short et;
    public final byte K7;
    public final byte IO;

    public ClientOpcode038RequestPacket(short s, CH0 cH0, short s2, byte by, byte by2) {
        super(38);
        this.J30 = s;
        this.vz = cH0;
        this.et = s2;
        this.K7 = by;
        this.IO = by2;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.J30);
        byteBuffer.putLong(this.vz.Sa);
        byteBuffer.putShort(this.et);
        byteBuffer.put(this.K7);
        byteBuffer.put(this.IO);
    }
}

