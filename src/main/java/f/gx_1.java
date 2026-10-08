package f;

import cn.pokemmo.net.packet.outbound.action.Action003OutboundPacket;
import java.util.*;
import java.nio.ByteBuffer;

/**
 * 双向兼容垫片 - gx_1 -> Action003OutboundPacket
 */
public class gx_1 extends Action003OutboundPacket {
    public gx_1(byte by) {
        super(by);
    }
}
