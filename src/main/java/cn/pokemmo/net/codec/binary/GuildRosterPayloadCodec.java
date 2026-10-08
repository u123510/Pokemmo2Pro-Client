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

public class GuildRosterPayloadCodec extends BasePacketBinaryCodec {
    @Override
    public final void N00(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        byteBuffer2.getShort();
        byteBuffer2.getShort();
        byteBuffer2.get();
        byteBuffer2.get();
        byteBuffer2.get();
        byteBuffer2.position(byteBuffer2.position() + 5);
    }
}

