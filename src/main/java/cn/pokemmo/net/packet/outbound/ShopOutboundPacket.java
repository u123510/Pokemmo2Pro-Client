package cn.pokemmo.net.packet.outbound;

import f.k20_0;
import f.so_2;
import java.nio.ByteBuffer;

/**
 * 商城与通用网络请求出站数据包基类
 * 原始类: f.RE
 */
public abstract class ShopOutboundPacket extends so_2 {
    public ShopOutboundPacket(int n) {
        super(n);
    }

    public abstract void ig0(k20_0 var1, ByteBuffer var2);
}
