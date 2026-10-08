/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.RE;
import f.b30_0;
import f.k20_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.sn
 */
public class ClientOpcode055RequestPacket
extends RE {
    public final b30_0 I4;
    public final byte U40;

    public ClientOpcode055RequestPacket(b30_0 b30_02, byte by) {
        super(55);
        this.I4 = b30_02;
        this.U40 = by;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put(this.I4.bG());
        byteBuffer.put(this.U40);
    }
}

