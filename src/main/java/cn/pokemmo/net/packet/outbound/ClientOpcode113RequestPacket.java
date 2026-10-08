/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.RE;
import f.k20_0;
import java.nio.ByteBuffer;

public class ClientOpcode113RequestPacket
extends RE {
    public final int gp0;
    public final int yj;
    public final byte YC0;

    public ClientOpcode113RequestPacket(byte by, int n, int n2) {
        super(113);
        this.gp0 = n;
        this.yj = n2;
        this.YC0 = by;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.gp0);
        byteBuffer.putInt(this.yj);
        byteBuffer.put(this.YC0);
    }
}

