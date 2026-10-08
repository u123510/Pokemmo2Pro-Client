package cn.pokemmo.net.packet.protocol;

import f.k1_0;
import java.nio.ByteBuffer;

/**
 * 网络底层子协议命令数据包统一基类
 * 封装双字节子命令分发逻辑 (主 Opcode + 子 Opcode: HU)
 */
public abstract class BaseSubProtocolPacket extends k1_0 {
    public BaseSubProtocolPacket(byte mainOpcode, byte subOpcode) {
        super(mainOpcode, subOpcode);
    }

    public byte getSubOpcode() {
        return this.HU;
    }
}
