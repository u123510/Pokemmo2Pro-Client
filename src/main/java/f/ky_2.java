package f;

import cn.pokemmo.net.session.ProtocolSession;
import java.nio.channels.SocketChannel;
import java.security.PublicKey;

/**
 * 加密协议会话兼容垫片
 * 核心业务已重构迁移至 cn.pokemmo.net.session.ProtocolSession
 */
public abstract class ky_2 extends ProtocolSession {

    public ky_2(SocketChannel channel, fk_1 fk, PublicKey key) {
        super(channel, fk, key);
    }
}
