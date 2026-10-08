package cn.pokemmo.net.codec.binary;

import java.nio.ByteBuffer;

/**
 * 二进制载荷解码器抽象基类 (Binary Payload Codec)
 * 所有网络数据包和二进制流反序列化类的统一基类。
 *
 * 对应混淆类: f.yb_0
 */
public abstract class BinaryPayloadCodec {

    public abstract void N00(ByteBuffer buffer);

    public void decode(ByteBuffer buffer) {
        N00(buffer);
    }
}
