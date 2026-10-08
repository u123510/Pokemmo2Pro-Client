/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.GI0;
import f.RE;
import f.k20_0;
import java.nio.ByteBuffer;

public class ClientOpcode069RequestPacket
extends RE {
    public final GI0 i10;
    public final byte Pg0;
    public final short IF;

    public ClientOpcode069RequestPacket(GI0 gI0, byte by, short s) {
        super(69);
        this.i10 = gI0;
        this.Pg0 = by;
        this.IF = s;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put(this.i10.ST);
        byteBuffer.put(this.Pg0);
        if (this.i10 == GI0.Xd0 && this.Pg0 != 0) {
            byteBuffer.putShort(this.IF);
        }
    }
}

