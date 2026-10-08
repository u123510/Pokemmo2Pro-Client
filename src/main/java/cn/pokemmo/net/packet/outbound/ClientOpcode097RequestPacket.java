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
 * Renamed from f.hP
 */
public class ClientOpcode097RequestPacket
extends RE {
    public final String ps0;

    public ClientOpcode097RequestPacket(String string) {
        super(97);
        this.ps0 = string;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        bo_1.cK(this.ps0, byteBuffer);
    }
}

