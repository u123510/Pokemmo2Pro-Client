package cn.pokemmo.net.codec.binary;

import f.Cq0;
import f.Ry;
import f.dl_1;
import f.yq0_0;
import java.nio.ByteBuffer;

/**
 * 二进制数据载荷任务基类
 * 原始类: f.DC0
 */
public abstract class BinaryDataPayloadTask extends yq0_0 implements Cloneable {
    public static final dl_1 Cn = Cq0.E1(BinaryDataPayloadTask.class);

    public BinaryDataPayloadTask(ByteBuffer byteBuffer, Ry ry, int n) {
        super(byteBuffer, n);
        this.VR(ry);
    }

    @Override
    public final void run() {
        try {
            this.os0();
        } catch (Throwable throwable) {
            Cn.warn(this.toString(), throwable);
        }
    }

    public void pF0() {
    }
}
