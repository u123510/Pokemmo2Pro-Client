package f;

import cn.pokemmo.net.codec.binary.BinaryPayloadCodec;
import java.nio.ByteBuffer;

/**
 * 二进制载荷解码器兼容门面 (Binary Payload Codec Shim)
 * 核心逻辑与现代 API 已重构至 cn.pokemmo.net.codec.binary.BinaryPayloadCodec
 */
public abstract class yb_0 extends BinaryPayloadCodec {

    @Override
    public abstract void N00(ByteBuffer buffer);
}
