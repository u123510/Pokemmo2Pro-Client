package f;

import cn.pokemmo.net.packet.PacketHeaderDescriptor;

/**
 * 兼容垫片 (Shim) - 网络数据包头部标识与状态标志 (Packet Header Descriptor)
 * 实际实现已迁移至 {@link PacketHeaderDescriptor}
 */
public final class NA0 extends PacketHeaderDescriptor {
    public NA0(int value, byte flag, boolean first, boolean second) {
        super(value, flag, first, second);
    }
}
