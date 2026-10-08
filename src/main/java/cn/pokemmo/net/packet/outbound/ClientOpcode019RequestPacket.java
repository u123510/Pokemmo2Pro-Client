/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.RE;
import f.k20_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.Ii0
 */
public class ClientOpcode019RequestPacket
extends RE {
    public final int Yk;

    public ClientOpcode019RequestPacket(int n) {
        super(19);
        this.Yk = n;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.Yk);
    }
}

