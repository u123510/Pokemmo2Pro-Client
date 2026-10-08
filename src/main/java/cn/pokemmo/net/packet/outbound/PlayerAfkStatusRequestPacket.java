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
 * Renamed from f.b4
 */
public class PlayerAfkStatusRequestPacket
extends RE {
    public final boolean Kt0;

    public PlayerAfkStatusRequestPacket(boolean bl) {
        super(70);
        this.Kt0 = bl;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put((byte)(this.Kt0 ? 1 : 0));
    }
}

