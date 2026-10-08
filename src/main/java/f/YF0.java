package f;

import cn.pokemmo.rom.nds.bw.BwBuildingPlacementRecord;
import java.nio.ByteBuffer;

/**
 * Shim: YF0 -> BwBuildingPlacementRecord
 * @see cn.pokemmo.rom.nds.bw.BwBuildingPlacementRecord
 */
public final class YF0 extends BwBuildingPlacementRecord {
    public YF0(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }
}
