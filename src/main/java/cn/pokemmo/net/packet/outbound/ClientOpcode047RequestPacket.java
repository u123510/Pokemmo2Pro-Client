/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.RE;
import f.k20_0;
import java.nio.ByteBuffer;

public class ClientOpcode047RequestPacket
extends RE {
    public final boolean uL0;
    public final short Fi0;

    public ClientOpcode047RequestPacket(short s, boolean bl) {
        super(47);
        this.uL0 = bl;
        this.Fi0 = s;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put((byte)(this.uL0 ? 1 : 0));
        byteBuffer.putShort(this.Fi0);
    }
}

