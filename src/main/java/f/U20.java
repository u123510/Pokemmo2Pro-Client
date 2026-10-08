package f;

import cn.pokemmo.rom.nds.bw.BwTrainerDataEntry;
import java.nio.ByteBuffer;

/**
 * Shim: U20 -> BwTrainerDataEntry
 * @see cn.pokemmo.rom.nds.bw.BwTrainerDataEntry
 */
public final class U20 extends BwTrainerDataEntry {
    public U20(short var1, nj0_0 var2, ByteBuffer var3) {
        super(var1, var2, var3);
    }
}
