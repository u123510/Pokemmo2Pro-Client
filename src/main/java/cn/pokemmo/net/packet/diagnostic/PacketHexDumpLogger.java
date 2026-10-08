package cn.pokemmo.net.packet.diagnostic;

import f.Cq0;
import f.dl_1;
import f.tx_1;
import f.zx_2;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * 网络封包诊断与十六进制转储日志工具 (Packet Hex Dump Logger)
 * <p>
 * 原始混淆类: {@code f.x80_0}
 */
public abstract class PacketHexDumpLogger {
    public static final dl_1 VC = Cq0.E1(PacketHexDumpLogger.class);

    /** 共享压缩包缓冲区 (30,000 字节，Little-Endian) */
    public static final ByteBuffer NJ0;

    /** 共享解压包缓冲区 (30,000 字节，Little-Endian) */
    public static final ByteBuffer Vx0;

    static {
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        NJ0 = ByteBuffer.allocate(30000).order(byteOrder);
        Vx0 = ByteBuffer.allocate(30000).order(byteOrder);
    }

    /**
     * 转储并打印封包诊断信息与十六进制内容
     *
     * @param state      会话/协议状态
     * @param packetId   协议操作码 (Opcode)
     * @param byteBuffer 封包数据缓冲区
     */
    public static void dM0(int state, int packetId, ByteBuffer byteBuffer) {
        logPacketDump(state, packetId, byteBuffer);
    }

    public static void logPacketDump(int state, int packetId, ByteBuffer byteBuffer) {
        Object[] args = new Object[3];
        args[0] = String.format("0x%02X", packetId);
        args[1] = zx_2.vC0(state);
        args[2] = tx_1.dE(byteBuffer);
        VC.warn("{}, {} \n{}", args);
    }
}
