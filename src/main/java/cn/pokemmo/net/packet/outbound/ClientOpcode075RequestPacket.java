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

public class ClientOpcode075RequestPacket
extends RE {
    public final byte N50;
    public final String H90;

    public ClientOpcode075RequestPacket(byte by, String string) {
        super(75);
        this.N50 = by;
        this.H90 = string;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put(this.N50);
        bo_1.cK(this.H90, byteBuffer);
    }
}

