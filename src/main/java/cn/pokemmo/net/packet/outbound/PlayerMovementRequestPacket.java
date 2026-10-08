/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.RE;
import f.k20_0;
import f.zv_2;
import java.nio.ByteBuffer;

/*
 * Renamed from f.bw0
 */
public class PlayerMovementRequestPacket
extends RE {
    public final zv_2 kr0;
    public final boolean i9;
    public final boolean yh;

    public PlayerMovementRequestPacket(zv_2 zv_22, boolean bl, boolean bl2) {
        super(6);
        this.kr0 = zv_22;
        this.i9 = bl;
        this.yh = bl2;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        PlayerMovementRequestPacket bw0_02 = this;
        byteBuffer.putShort(this.kr0.Lq0);
        byteBuffer.putShort(this.kr0.B5);
        byte by = bw0_02.kr0.Y30;
        if (bw0_02.i9) {
            by = (byte)(by | 0x80);
        }
        if (this.yh) {
            by = (byte)(by | 0x40);
        }
        byteBuffer.put(by);
    }
}

