/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.RE;
import f.jb0_0;
import f.k20_0;
import java.nio.ByteBuffer;

public class ClientOpcode009RequestPacket
extends RE {
    public final jb0_0[] AA0;
    public final jb0_0[] mz;

    public ClientOpcode009RequestPacket(jb0_0[] jb0_0Array, jb0_0[] jb0_0Array2) {
        super(9);
        this.AA0 = jb0_0Array;
        this.mz = jb0_0Array2;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put((byte)this.AA0.length);
        int n = 0;
        while (true) {
            jb0_0[] jb0_0Array = this.AA0;
            if (n >= this.AA0.length) break;
            byteBuffer.put(jb0_0Array[n].h80().Go0);
            byteBuffer.putShort(this.AA0[n].Xh0());
            byteBuffer.put(this.mz[n].h80().Go0);
            byteBuffer.putShort(this.mz[n].Xh0());
            ++n;
        }
    }
}

