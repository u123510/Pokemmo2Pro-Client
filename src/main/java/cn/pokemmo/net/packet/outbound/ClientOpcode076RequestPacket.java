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

public class ClientOpcode076RequestPacket
extends RE {
    public final boolean hJ;
    public final int El;
    public final CH0 CX;
    public final short Ci;

    public ClientOpcode076RequestPacket(int n) {
        super(76);
        this.CX = CH0.j1;
        this.hJ = false;
        this.El = n;
        this.Ci = 0;
    }

    public ClientOpcode076RequestPacket(CH0 cH0, short s) {
        super(76);
        this.hJ = true;
        this.CX = cH0;
        this.Ci = s;
        this.El = 0;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put((byte)(this.hJ ? 1 : 0));
        if (this.hJ) {
            byteBuffer.putLong(this.CX.Sa);
            byteBuffer.putShort(this.Ci);
        } else {
            byteBuffer.putInt(this.El);
        }
    }
}

