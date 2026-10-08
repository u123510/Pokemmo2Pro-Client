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
 * Renamed from f.px0
 */
public class ClientOpcode035RequestPacket
extends RE {
    public final short RN;
    public final short PK;
    public final byte Yt0;

    public ClientOpcode035RequestPacket(byte by, short s, short s2) {
        super(35);
        this.RN = s;
        this.PK = s2;
        this.Yt0 = by;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.RN);
        byteBuffer.putShort(this.PK);
        byteBuffer.put(this.Yt0);
    }
}

