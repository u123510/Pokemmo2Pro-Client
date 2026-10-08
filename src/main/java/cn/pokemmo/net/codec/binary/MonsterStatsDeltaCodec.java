/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.codec.binary;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.nio.ByteBuffer;
import cn.pokemmo.net.codec.binary.BasePacketBinaryCodec;

import f.Hn0;
import f.yb_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.Kx
 */
public class MonsterStatsDeltaCodec extends BasePacketBinaryCodec {
    public int s30;
    public Hn0[] KV;

    @Override
    public final void N00(ByteBuffer byteBuffer) {
        int n;
        MonsterStatsDeltaCodec kx_02 = this;
        kx_02.s30 = n = byteBuffer.getInt();
        kx_02.KV = new Hn0[n];
        for (n = 0; n < this.s30; ++n) {
            Hn0 hn02 = new Hn0();
            byteBuffer.getInt();
            byteBuffer.getInt();
            this.KV[n] = hn02;
        }
    }
}

