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

public class BattleActionChoiceRequestPacket
extends RE {
    public final byte dZ;
    public final CH0 ju0;
    public final short NX;
    public final boolean tc0;

    public BattleActionChoiceRequestPacket(byte by, CH0 cH0, short s, boolean bl) {
        super(48);
        this.dZ = by;
        this.ju0 = cH0;
        this.NX = s;
        this.tc0 = bl;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put(this.dZ);
        byteBuffer.put((byte)(this.tc0 ? 1 : 0));
        if (this.tc0) {
            byteBuffer.putShort(this.NX);
        } else {
            byteBuffer.putLong(this.ju0.Sa);
        }
    }
}

