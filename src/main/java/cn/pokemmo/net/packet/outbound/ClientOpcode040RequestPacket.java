/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.RE;
import f.k20_0;
import java.nio.ByteBuffer;

public class ClientOpcode040RequestPacket
extends RE {
    public final byte cr;
    public final byte[] Ej;

    public ClientOpcode040RequestPacket(byte by, byte[] byArray) {
        super(40);
        this.cr = by;
        this.Ej = byArray;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put(this.cr);
        byteBuffer.put((byte)this.Ej.length);
        int n = 0;
        while (true) {
            byte[] byArray = this.Ej;
            if (n >= this.Ej.length) break;
            byteBuffer.put(byArray[n]);
            ++n;
        }
    }
}

