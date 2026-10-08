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
 * Renamed from f.aM0
 */
public class ClientOpcode077RequestPacket
extends RE {
    public final byte fH;
    public final byte E30;
    public final byte LG0;

    public ClientOpcode077RequestPacket(byte by, byte by2, byte by3) {
        super(77);
        this.fH = by;
        this.E30 = by2;
        this.LG0 = by3;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put(this.fH);
        byteBuffer.put(this.E30);
        byteBuffer.put(this.LG0);
    }
}

