package f;

import cn.pokemmo.net.packet.outbound.ShopBuyItemRequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - ShopBuyItemRequestPacket
 * 操作码: 241
 * 原始混淆类: f.com1__1
 * 现代实现: cn.pokemmo.net.packet.outbound.ShopBuyItemRequestPacket
 */
public class com1__1 extends ShopBuyItemRequestPacket {

    public com1__1(long l, ByteBuffer byteBuffer, int n) {
        super(l, byteBuffer, n);
    }
}
