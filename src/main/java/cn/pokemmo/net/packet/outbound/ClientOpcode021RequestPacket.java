/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.G50;
import f.RE;
import f.dw_2;
import f.k20_0;
import java.nio.ByteBuffer;

public class ClientOpcode021RequestPacket
extends RE {
    public ClientOpcode021RequestPacket() {
        super(21);
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        byteBuffer.put(G50.Rw((String)dw_2.fP).Sf0);
        byteBuffer2.putShort(k20_02.uH0.Wv0);
        byteBuffer2.putShort(dw_2.Mt0);
    }
}

