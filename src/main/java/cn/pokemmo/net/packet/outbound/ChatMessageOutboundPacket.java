package cn.pokemmo.net.packet.outbound;

import f.RE;
import f.bo_1;
import f.k20_0;
import f.zo_0;
import java.nio.ByteBuffer;

/**
 * 客户端聊天消息与远程命令出站协议数据包 (Chat Message & Command Outbound Packet)
 * 操作码: 8
 *
 * 职责: 封装客户端向游戏服务端发送的公开聊天、频道消息、私聊以及 GM 远程脚本命令 (//moveto 等)。
 *
 * 原混淆类: f.ex_1
 */
public class ChatMessageOutboundPacket extends RE {
    public final zo_0 In0;
    public final String R40;
    public final String p0;

    public ChatMessageOutboundPacket(zo_0 zo_02, String string, String string2) {
        super(8);
        this.In0 = zo_02;
        this.R40 = string == null ? "" : string.replace('\u0000', ' ');
        this.p0 = string2 == null ? "" : string2.replace('\u0000', ' ');
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put(this.In0.y80);
        bo_1.cK(this.R40, byteBuffer);
        if (this.In0 == zo_0.YL) {
            bo_1.cK(this.p0, byteBuffer);
        }
    }
}
