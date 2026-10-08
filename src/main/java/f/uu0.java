package f;

import cn.pokemmo.rom.nds.audio.SdatRecordTable;
import java.nio.ByteBuffer;

/**
 * 兼容垫片 (Shim) - SdatRecordTable
 * 职责: SDAT 记录条目映射表
 * 原始混淆类: f.uu0
 * 现代实现: cn.pokemmo.rom.nds.audio.SdatRecordTable
 */
public final class uu0 extends SdatRecordTable {
    public uu0(ByteBuffer v1, xd_1 v2) {
        super(v1, v2);
    }
}
