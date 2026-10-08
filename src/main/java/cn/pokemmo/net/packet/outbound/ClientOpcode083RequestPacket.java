/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.CH0;
import f.RE;
import f.k20_0;
import java.nio.ByteBuffer;

public class ClientOpcode083RequestPacket
extends RE {
    public final short mZ;
    public final CH0 ag;
    public final short ux0;

    public ClientOpcode083RequestPacket(CH0 cH0, short s, short s2) {
        super(83);
        this.mZ = s;
        this.ag = cH0;
        this.ux0 = s2;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.mZ);
        byteBuffer.putLong(this.ag.Sa);
        byteBuffer.putShort(this.ux0);
    }
}

