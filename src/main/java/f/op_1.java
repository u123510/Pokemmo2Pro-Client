package f;

import cn.pokemmo.net.packet.protocol.ProtocolPacketDecoder;
import java.util.function.Function;

/**
 * Shim: op_1 -> ProtocolPacketDecoder
 * @see cn.pokemmo.net.packet.protocol.ProtocolPacketDecoder
 */
public final class op_1 extends ProtocolPacketDecoder {
    public op_1(Function function, Function function2) {
        super(function, function2);
    }
}
