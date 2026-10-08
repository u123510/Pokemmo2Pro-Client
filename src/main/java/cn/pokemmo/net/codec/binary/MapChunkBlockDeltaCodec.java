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

import f.yb_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.LPT9
 */
public class MapChunkBlockDeltaCodec extends BasePacketBinaryCodec {
    public short[] BE;

    @Override
    public final void N00(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        byteBuffer2.getShort();
        byteBuffer2.getShort();
        this.BE = new short[4];
        for (int j = 0; j < 4; ++j) {
            this.BE[j] = byteBuffer.getShort();
        }
    }
}

