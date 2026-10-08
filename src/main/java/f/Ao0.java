package f;

import cn.pokemmo.rom.nds.dppt.DpptMapHeaderEntry;
import java.nio.ByteBuffer;

/**
 * 第4世代 (DPPt / HGSS) 单张地图描述符兼容垫片
 * 已重构至 cn.pokemmo.rom.nds.dppt.DpptMapHeaderEntry
 */
public final class Ao0 extends DpptMapHeaderEntry {
    public Ao0(short var1, l50_0 var2, ByteBuffer var3) {
        super(var1, var2, var3);
    }

    @Override
    public Ao0 or() {
        return (Ao0) super.or();
    }
}
