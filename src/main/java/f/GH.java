package f;

import cn.pokemmo.net.packet.system.BinaryDataStreamPacket;
import java.nio.ByteBuffer;

public abstract class GH extends BinaryDataStreamPacket {
    public GH(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
