package cn.pokemmo.net.security;

/**
 * 空操作数据包校验和引擎 (No-Op Packet Checksum Engine - 无签名/长度为0)
 * 对应混淆类: f.bz0_0
 */
public class NoOpPacketChecksumEngine extends PacketChecksumEngine {
    public static final NoOpPacketChecksumEngine INSTANCE = new NoOpPacketChecksumEngine();
    public static final NoOpPacketChecksumEngine Xs = INSTANCE;

    @Override
    public final int jR() {
        return 0;
    }

    @Override
    public final void SG(byte[] data, int offset, int length) {
    }

    @Override
    public final boolean Jm(byte[] data, int offset, int length) {
        return true;
    }
}
