package f;

import cn.pokemmo.battle.BattleStatusChangeEntry;
import java.nio.ByteBuffer;

/**
 * Shim: HU -> BattleStatusChangeEntry
 * @see cn.pokemmo.battle.BattleStatusChangeEntry
 */
public final class HU extends BattleStatusChangeEntry {
    public HU(byte by, ByteBuffer byteBuffer) {
        super(by, byteBuffer);
    }

    public HU(byte by) {
        super(by);
    }
}
