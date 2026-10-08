package cn.pokemmo.net.buffer.stream;

import f.kd_1;

/**
 * BaseNetworkByteBuffer - 内存级网络字节流缓冲区抽象基类
 */
public abstract class BaseNetworkByteBuffer extends kd_1 {

    public BaseNetworkByteBuffer() {
        super();
    }

    public BaseNetworkByteBuffer(int n) {
        super(n);
    }

    public BaseNetworkByteBuffer(int n, int n2) {
        super(n, n2);
    }
}
