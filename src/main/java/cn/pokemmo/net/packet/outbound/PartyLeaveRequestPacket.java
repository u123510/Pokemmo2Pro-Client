/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.RE;
import f.bo_1;
import f.bx_0;
import f.k20_0;
import java.nio.ByteBuffer;

public class PartyLeaveRequestPacket
extends RE {
    public final byte aA;
    public final bx_0 ZF0;

    public PartyLeaveRequestPacket(byte by, bx_0 bx_02) {
        super(224);
        this.aA = by;
        this.ZF0 = bx_02;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        PartyLeaveRequestPacket fR = this;
        byteBuffer.put(this.aA);
        bo_1.cK(fR.ZF0.pF0, byteBuffer);
        byteBuffer.put(fR.ZF0.W30.xZ);
        byteBuffer.put((byte)this.ZF0.G80.length);
        byteBuffer.put(this.ZF0.G80);
    }
}

