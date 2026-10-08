package f;

import cn.pokemmo.net.packet.inbound.CharacterSpawnPacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - CharacterSpawnPacket
 * 操作码: 5
 * 原始混淆类: f.ga_0
 * 现代实现: cn.pokemmo.net.packet.inbound.CharacterSpawnPacket
 */
public class ga_0 extends CharacterSpawnPacket {

    public ga_0(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
