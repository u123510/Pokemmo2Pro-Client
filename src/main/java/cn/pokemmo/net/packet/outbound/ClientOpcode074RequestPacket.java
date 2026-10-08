/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.RE;
import f.av_1;
import f.k20_0;
import java.nio.ByteBuffer;

public class ClientOpcode074RequestPacket
extends RE {
    public final byte Zo;
    public final av_1 rl0;

    public ClientOpcode074RequestPacket(byte by, av_1 av_12) {
        super(74);
        this.Zo = by;
        this.rl0 = av_12;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put(this.Zo);
        byteBuffer.put(this.rl0.NR);
    }
}

