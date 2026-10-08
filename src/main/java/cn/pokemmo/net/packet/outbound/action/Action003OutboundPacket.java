package cn.pokemmo.net.packet.outbound.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.lpt5__3;
import java.nio.ByteBuffer;


public class Action003OutboundPacket
extends BaseOutboundActionPacket {
    public final byte ks0;

    public Action003OutboundPacket(byte by) {
        super(3);
        this.ks0 = by;
    }

    @Override
    public final void Xn0(ByteBuffer byteBuffer) {
        byteBuffer.put(this.ks0);
    }
}
