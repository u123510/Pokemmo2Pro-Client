package f;

import cn.pokemmo.net.packet.outbound.MailboxActionRequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - MailboxActionRequestPacket
 * 操作码: 50
 * 原始混淆类: f.oj_2
 * 现代实现: cn.pokemmo.net.packet.outbound.MailboxActionRequestPacket
 */
public class oj_2 extends MailboxActionRequestPacket {

    public oj_2(b30_0 format, K5 key, CH0 id, byte flags) {
        super(format, key, id, flags);
    }
    public oj_2(b30_0 format) {
        super(format);
    }
    public oj_2(b30_0 format, kt_2 type, short value) {
        super(format, type, value);
    }
    public oj_2(b30_0 format, short value, byte flags) {
        super(format, value, flags);
    }
    public oj_2(b30_0 format, kt_2 type) {
        super(format, type);
    }
}
