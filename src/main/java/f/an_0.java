package f;

import cn.pokemmo.rom.nds.model.NdsFieldLayoutTable;
import java.nio.ByteBuffer;

/**
 * 兼容垫片 (Shim) - NdsFieldLayoutTable
 * 职责: NDS 地图建筑大世界布局表
 * 原始混淆类: f.an_0
 * 现代实现: cn.pokemmo.rom.nds.model.NdsFieldLayoutTable
 */
public final class an_0 extends NdsFieldLayoutTable {
    public static an_0 Y3(ByteBuffer data) {
        return (an_0) NdsFieldLayoutTable.Y3(data);
    }
}
