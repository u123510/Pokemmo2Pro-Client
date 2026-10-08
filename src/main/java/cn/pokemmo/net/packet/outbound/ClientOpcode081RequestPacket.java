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

public class ClientOpcode081RequestPacket
extends RE {
    public final String OZ;

    public ClientOpcode081RequestPacket(String string) {
        super(81);
        this.OZ = string;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        bo_1.cK(this.OZ, byteBuffer);
    }
}

