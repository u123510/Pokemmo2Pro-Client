package f;

import cn.pokemmo.net.session.ShopSession;
import java.nio.channels.SocketChannel;

/**
 * 商城服务网络会话兼容垫片
 * 核心业务已重构迁移至 cn.pokemmo.net.session.ShopSession
 */
public final class k20_0 extends ShopSession {

    public k20_0(SocketChannel socketChannel, fk_1 fk_1, Ge0 ge0, dx_1 dx_1) {
        super(socketChannel, fk_1, ge0, dx_1);
    }
}
