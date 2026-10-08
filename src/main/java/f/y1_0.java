package f;

import cn.pokemmo.net.packet.outbound.ScriptDialogResponsePacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ScriptDialogResponsePacket
 * 操作码: 28
 * 原始混淆类: f.y1_0
 * 现代实现: cn.pokemmo.net.packet.outbound.ScriptDialogResponsePacket
 */
public class y1_0 extends ScriptDialogResponsePacket {

    public y1_0(byte[] v1) {
        super(v1);
    }
    public y1_0(byte i1, String v2) {
        super(i1, v2);
    }
}
