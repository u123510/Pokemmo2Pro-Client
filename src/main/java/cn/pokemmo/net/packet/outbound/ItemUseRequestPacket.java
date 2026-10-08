package cn.pokemmo.net.packet.outbound;

import f.zo_0;

/**
 * 兼容垫片 - ItemUseRequestPacket -> ChatMessageOutboundPacket
 * 操作码: 8 (实为聊天/命令数据包)
 */
public class ItemUseRequestPacket extends ChatMessageOutboundPacket {
    public ItemUseRequestPacket(zo_0 zo_02, String string, String string2) {
        super(zo_02, string, string2);
    }
}
