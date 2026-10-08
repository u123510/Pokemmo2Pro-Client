package cn.pokemmo.data;

import f.mc0_1;
import f.sm0_0;

/**
 * 物品与字节标志描述符
 */
public class ByteFlagDescriptor {
    public final mc0_1 qB;
    public final byte AV;

    public ByteFlagDescriptor(mc0_1 mc0_12, byte by) {
        this.qB = mc0_12;
        this.AV = by;
    }

    @Override
    public String toString() {
        return sm0_0.Bx(8601, Byte.toString(this.AV), sm0_0.c0(this.qB.Nl));
    }
}
