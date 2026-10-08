package f;

import cn.pokemmo.net.codec.binary.GameDataPayloadReader;
import java.nio.ByteBuffer;

/**
 * 兼容垫片 (Shim) - GameDataPayloadReader
 * 职责: 业务协议二进制数据载荷解码器
 * 原始混淆类: f.yq0_0
 * 现代实现: cn.pokemmo.net.codec.binary.GameDataPayloadReader
 */
public abstract class yq0_0 extends GameDataPayloadReader {

    public yq0_0(ByteBuffer var1, int var2) {
        super(var1, var2);
    }
}
