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
 * Renamed from f.fL0
 */
public class MovementSyncPayloadCodec extends BasePacketBinaryCodec {
    public short hF0;

    @Override
    public final void N00(ByteBuffer byteBuffer) {
        this.hF0 = byteBuffer.getShort();
        byteBuffer.getShort();
    }
}

