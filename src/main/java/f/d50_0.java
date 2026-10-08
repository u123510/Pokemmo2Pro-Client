package f;

import cn.pokemmo.net.connection.NetworkConnection;
import java.nio.channels.SocketChannel;

/**
 * 物理网络连接兼容垫片
 * 核心业务已重构迁移至 cn.pokemmo.net.connection.NetworkConnection
 */
public abstract class d50_0 extends NetworkConnection {

    public d50_0(SocketChannel socketChannel, fk_1 fk_1) {
        super(socketChannel, fk_1);
    }
}
