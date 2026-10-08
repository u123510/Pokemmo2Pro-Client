package f;

import cn.pokemmo.rom.nds.bw.BwMapConnectionEntry;
import java.nio.ByteBuffer;

/**
 * Shim: qg0_0 -> BwMapConnectionEntry
 * @see cn.pokemmo.rom.nds.bw.BwMapConnectionEntry
 */
public final class qg0_0 extends BwMapConnectionEntry {
    public qg0_0(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }
}
