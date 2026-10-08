package f;

import cn.pokemmo.rom.nds.base.AbstractMapEntry;
import java.nio.ByteBuffer;

/**
 * NDS 单张地图描述基类兼容垫片
 * 已重构至 cn.pokemmo.rom.nds.base.AbstractMapEntry
 */
public abstract class Z50 extends AbstractMapEntry {
    public Z50(short s, l50_0 l50_0Var, ByteBuffer byteBuffer) {
        super(s, l50_0Var, byteBuffer);
    }

    @Override
    public Z50 or() {
        return (Z50) super.or();
    }
}
