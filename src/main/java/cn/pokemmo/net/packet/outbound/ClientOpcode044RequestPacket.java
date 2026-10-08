/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.RE;
import f.bo_1;
import f.k20_0;
import java.nio.ByteBuffer;

public class ClientOpcode044RequestPacket
extends RE {
    public final byte SV;
    public final String AT;

    public ClientOpcode044RequestPacket(byte by, String string) {
        super(44);
        this.SV = by;
        this.AT = string;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put(this.SV);
        bo_1.cK(this.AT, byteBuffer);
    }
}

