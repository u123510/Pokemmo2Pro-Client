package f;

import cn.pokemmo.net.packet.system.ProtocolBattleEventPacket;
import java.nio.ByteBuffer;
import cn.pokemmo.net.packet.system.BaseProtocolPacketWrapper;

public abstract class EH0 extends ProtocolBattleEventPacket {
    protected EH0(ByteBuffer buffer, int value) {
        super(buffer, value);
    }
}
