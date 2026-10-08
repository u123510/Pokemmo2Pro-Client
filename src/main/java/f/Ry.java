package f;

import cn.pokemmo.net.session.LoginSession;
import java.nio.channels.SocketChannel;

/**
 * 登录认证网络会话兼容垫片
 * 核心业务已重构迁移至 cn.pokemmo.net.session.LoginSession
 */
public final class Ry extends LoginSession {

    public Ry(SocketChannel var1, fk_1 var2, uc_2 var3, dx_1 var4) {
        super(var1, var2, var3, var4);
    }
}
