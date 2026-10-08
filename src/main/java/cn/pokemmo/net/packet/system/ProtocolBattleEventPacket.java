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

public abstract class ProtocolBattleEventPacket extends BaseProtocolPacketWrapper {
    public static final int uI0 = 0;

    protected ProtocolBattleEventPacket(ByteBuffer buffer, int value) {
        super(buffer, value);
    }
}
