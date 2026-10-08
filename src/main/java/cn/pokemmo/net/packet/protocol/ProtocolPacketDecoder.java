package cn.pokemmo.net.packet.protocol;

import f.Mg;
import java.nio.ByteBuffer;
import java.util.function.Function;

/**
 * 协议数据包解码与构造器 (Protocol Packet Decoder)
 * <p>
 * 原始混淆类: {@code f.op_1}
 */
public class ProtocolPacketDecoder {
    public final Function XR;
    public final Function n8;

    @SuppressWarnings("unchecked")
    public ProtocolPacketDecoder(Function parser, Function reader) {
        this.XR = parser;
        this.n8 = reader;
    }

    @SuppressWarnings("unchecked")
    public Mg decode(ByteBuffer byteBuffer) {
        return (Mg) this.XR.apply(this.n8.apply(byteBuffer));
    }

    public Mg yl(ByteBuffer byteBuffer) {
        return decode(byteBuffer);
    }
}
