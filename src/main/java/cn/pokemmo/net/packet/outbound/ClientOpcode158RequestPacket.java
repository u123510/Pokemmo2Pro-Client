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

/*
 * Renamed from f.Pz
 */
public class ClientOpcode158RequestPacket
extends RE {
    public final CH0[] gA;

    public ClientOpcode158RequestPacket(CH0[] cH0Array) {
        super(158);
        this.gA = cH0Array;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put((byte)this.gA.length);
        int n = 0;
        while (true) {
            CH0[] cH0Array = this.gA;
            if (n >= this.gA.length) break;
            byteBuffer.putLong(cH0Array[n].Sa);
            ++n;
        }
    }
}

