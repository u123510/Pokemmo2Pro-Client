package f;

import cn.pokemmo.net.packet.inbound.ScriptDialogPacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ScriptDialogPacket
 * 操作码: 33
 * 原始混淆类: f.kt_0
 * 现代实现: cn.pokemmo.net.packet.inbound.ScriptDialogPacket
 */
public class kt_0 extends ScriptDialogPacket {

    public kt_0(String v1, jm_1 v2, CH0 v3, S0 v4) {
        super(v1, v2, v3, v4);
    }
    public kt_0(k20_0 v1, ByteBuffer v2) {
        super(v1, v2);
    }
}
