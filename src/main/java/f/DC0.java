package f;

import cn.pokemmo.net.codec.binary.BinaryDataPayloadTask;
import java.nio.ByteBuffer;

/**
 * 兼容垫片 (Shim) - 二进制数据载荷任务基类
 * 核心逻辑已迁移至 cn.pokemmo.net.codec.binary.BinaryDataPayloadTask
 */
public abstract class DC0 extends BinaryDataPayloadTask {
    public DC0(ByteBuffer byteBuffer, Ry ry, int n) {
        super(byteBuffer, ry, n);
    }
}
