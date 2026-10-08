package cn.pokemmo.net.packet.diagnostic;

import f.Cq0;
import f.X40;
import f.dl_1;
import f.tx_1;
import java.nio.ByteBuffer;

/**
 * 登录服务封包与操作码诊断日志工具 (Server Packet Opcode Logger)
 * <p>
 * 原始混淆类: {@code f.th0_0}，主要供 {@link cn.pokemmo.net.session.LoginSession} 记录未处理或调试封包。
 */
public abstract class ServerPacketOpcodeLogger {
    public static final dl_1 X70 = Cq0.E1(ServerPacketOpcodeLogger.class);

    /**
     * 记录并转储登录封包操作码与诊断日志
     *
     * @param state      登录状态码
     * @param opcode     封包操作码 (Opcode)
     * @param byteBuffer 封包数据缓冲区
     */
    public static void St0(int state, int opcode, ByteBuffer byteBuffer) {
        logPacketOpcode(state, opcode, byteBuffer);
    }

    public static void logPacketOpcode(int state, int opcode, ByteBuffer byteBuffer) {
        Object[] args = new Object[3];
        args[0] = String.format("0x%02X", opcode);
        args[1] = X40.f3(state);
        args[2] = tx_1.dE(byteBuffer);
        X70.warn("{}, {} \n{}", args);
    }
}
