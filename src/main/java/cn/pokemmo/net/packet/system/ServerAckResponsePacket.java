package cn.pokemmo.net.packet.system;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public abstract class ServerAckResponsePacket extends yq0_0 {
    public static final int St = 0;

    protected ServerAckResponsePacket(ByteBuffer buffer, int value) {
        super(buffer, value);
    }
}
