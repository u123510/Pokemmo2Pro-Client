package f;

import cn.pokemmo.net.packet.outbound.action.Action004OutboundPacket;
import java.util.*;
import java.nio.ByteBuffer;

/**
 * 双向兼容垫片 - C10 -> Action004OutboundPacket
 */
public class C10 extends Action004OutboundPacket {
    public C10(byte by) {
        super(by);
    }
}
