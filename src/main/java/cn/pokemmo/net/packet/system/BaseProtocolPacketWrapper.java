package cn.pokemmo.net.packet.system;

import f.yq0_0;
import java.nio.ByteBuffer;

/**
 * BaseProtocolPacketWrapper - 底层协议封包基础抽象包装类
 */
public abstract class BaseProtocolPacketWrapper extends yq0_0 {

    public BaseProtocolPacketWrapper(ByteBuffer var1, int var2) {
        super(var1, var2);
    }
}
