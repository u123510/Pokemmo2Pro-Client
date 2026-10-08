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
 * Renamed from f.sq0
 */
public class ClientOpcode144RequestPacket
extends RE {
    public final short du0;
    public final byte bI;
    public final byte CJ0;

    public ClientOpcode144RequestPacket(byte by, byte by2, short s) {
        super(144);
        this.du0 = s;
        this.bI = by;
        this.CJ0 = by2;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.du0);
        byteBuffer.put(this.bI);
        byteBuffer.put(this.CJ0);
    }
}

