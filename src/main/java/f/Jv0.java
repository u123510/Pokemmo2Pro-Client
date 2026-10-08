package f;

import cn.pokemmo.net.packet.system.MultiTargetBroadcastPacket;
import java.nio.ByteBuffer;

public abstract class Jv0 extends MultiTargetBroadcastPacket {
    protected Jv0(ByteBuffer buffer, int value) {
        super(buffer, value);
    }
}
