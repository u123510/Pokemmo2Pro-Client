package f;

import cn.pokemmo.net.packet.inbound.InventoryItemUpdatePacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - InventoryItemUpdatePacket
 * 操作码: 11
 * 原始混淆类: f.PV
 * 现代实现: cn.pokemmo.net.packet.inbound.InventoryItemUpdatePacket
 */
public class PV extends InventoryItemUpdatePacket {

    public PV(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
