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
 * Renamed from f.rp
 */
public class ClientOpcode016RequestPacket
extends RE {
    public final byte CV;

    public ClientOpcode016RequestPacket(byte by) {
        super(16);
        this.CV = by;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put(this.CV);
    }
}

