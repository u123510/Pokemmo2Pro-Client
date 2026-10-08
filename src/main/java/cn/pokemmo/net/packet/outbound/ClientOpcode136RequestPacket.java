/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.RE;
import f.bo_1;
import f.k20_0;
import f.pg0_0;
import java.nio.ByteBuffer;

public class ClientOpcode136RequestPacket
extends RE {
    public final pg0_0 E6;
    public final String lG0;

    public ClientOpcode136RequestPacket(pg0_0 pg0_02, String string) {
        super(136);
        this.E6 = pg0_02;
        this.lG0 = string;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put(this.E6.b8);
        bo_1.cK(this.lG0, byteBuffer);
    }
}

