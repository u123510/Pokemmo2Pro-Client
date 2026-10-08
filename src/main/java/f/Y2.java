package f;

import cn.pokemmo.net.packet.outbound.action.Action008OutboundPacket;
import java.util.*;
import java.nio.ByteBuffer;

/**
 * 双向兼容垫片 - Y2 -> Action008OutboundPacket
 */
public class Y2 extends Action008OutboundPacket {
    public Y2(String string) {
        super(string);
    }
}
