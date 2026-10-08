package cn.pokemmo.net.packet.system;

import f.Ey0;
import f.TX;
import java.nio.ByteBuffer;

/**
 * BaseNetworkSessionEvent - 网络会话生命周期事件抽象基类
 */
public abstract class BaseNetworkSessionEvent extends Ey0 {

    public BaseNetworkSessionEvent(TX owner, ByteBuffer buffer) {
        super(owner, buffer);
    }
}
