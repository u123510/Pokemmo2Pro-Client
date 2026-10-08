package f;

import cn.pokemmo.rom.nds.bw.BwMapZoneEventRecord;
import java.nio.ByteBuffer;

/**
 * Shim: aa0_0 -> BwMapZoneEventRecord
 * @see cn.pokemmo.rom.nds.bw.BwMapZoneEventRecord
 */
public final class aa0_0 extends BwMapZoneEventRecord {
    public aa0_0(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }
}
