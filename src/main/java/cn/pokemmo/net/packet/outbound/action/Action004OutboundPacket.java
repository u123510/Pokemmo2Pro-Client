package cn.pokemmo.net.packet.outbound.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.lpt5__3;
import java.nio.ByteBuffer;

public class Action004OutboundPacket
extends BaseOutboundActionPacket {
    public final byte t70;

    public Action004OutboundPacket(byte by) {
        super(4);
        this.t70 = by;
    }

    @Override
    public final void Xn0(ByteBuffer byteBuffer) {
        byteBuffer.put(this.t70);
    }
}
