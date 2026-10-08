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
 * Renamed from f.wH0
 */
public class ClientOpcode129RequestPacket
extends RE {
    public final String Il;

    public ClientOpcode129RequestPacket(String string) {
        super(129);
        this.Il = string;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        bo_1.cK(this.Il, byteBuffer);
    }
}

