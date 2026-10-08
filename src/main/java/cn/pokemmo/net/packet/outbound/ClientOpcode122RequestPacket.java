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

/*
 * Renamed from f.dE0
 */
public class ClientOpcode122RequestPacket
extends RE {
    public final byte CC0;
    public final String kF;

    public ClientOpcode122RequestPacket(byte by, String string) {
        super(122);
        this.CC0 = by;
        this.kF = string;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put(this.CC0);
        bo_1.cK(this.kF, byteBuffer);
    }
}

