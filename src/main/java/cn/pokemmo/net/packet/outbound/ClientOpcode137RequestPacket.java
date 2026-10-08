/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.RE;
import f.k20_0;
import java.nio.ByteBuffer;

public class ClientOpcode137RequestPacket
extends RE {
    public final short TL0;

    public ClientOpcode137RequestPacket(short s) {
        super(137);
        this.TL0 = s;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.TL0);
    }
}

