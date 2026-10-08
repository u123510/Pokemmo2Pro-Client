package cn.pokemmo.net.packet.system;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.nio.ByteBuffer;
import cn.pokemmo.net.packet.system.BaseProtocolPacketWrapper;

import java.nio.ByteBuffer;

public abstract class ProtocolWorldEventPacket extends BaseProtocolPacketWrapper {
    public static final int vp0 = 0;

    public ProtocolWorldEventPacket(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }
}
