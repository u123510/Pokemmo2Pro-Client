package cn.pokemmo.net.packet.outbound.action;

import f.lpt5__3;
import java.nio.ByteBuffer;

public abstract class BaseOutboundActionPacket extends lpt5__3 {
    public BaseOutboundActionPacket(int opcode) {
        super(opcode);
    }
}
