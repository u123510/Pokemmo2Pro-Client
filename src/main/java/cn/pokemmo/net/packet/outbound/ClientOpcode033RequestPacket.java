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
 * Renamed from f.On
 */
public class ClientOpcode033RequestPacket
extends RE {
    public final byte NI;
    public final byte jZ;

    public ClientOpcode033RequestPacket(byte by, byte by2) {
        super(33);
        this.NI = by;
        this.jZ = by2;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put(this.NI);
        byteBuffer.put(this.jZ);
    }
}

