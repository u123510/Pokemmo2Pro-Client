package f;

import cn.pokemmo.net.session.GameSession;
import java.nio.channels.SocketChannel;

/**
 * 游戏世界主网络会话兼容垫片
 * 核心业务已重构迁移至 cn.pokemmo.net.session.GameSession
 */
public final class TX extends GameSession {

    public TX(SocketChannel var1, fk_1 var2, Ge0 var3, dx_1 var4) {
        super(var1, var2, var3, var4);
    }
}
