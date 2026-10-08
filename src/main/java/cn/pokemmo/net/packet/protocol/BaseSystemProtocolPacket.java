package cn.pokemmo.net.packet.protocol;

import f.CE;
import f.Mg;
import f.cq_0;
import java.nio.ByteBuffer;

/**
 * 网络底层系统协议数据包统一基类
 * 封装客户端核心系统指令、信道控制与心跳维护 (主 Opcode: mG)
 */
public abstract class BaseSystemProtocolPacket extends Mg {
    public BaseSystemProtocolPacket(byte opcode) {
        super(opcode);
    }

    public byte getOpcode() {
        return this.mG;
    }
}
