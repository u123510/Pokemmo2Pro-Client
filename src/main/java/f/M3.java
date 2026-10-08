package f;

import cn.pokemmo.battle.BattleActionPayload;
import java.nio.ByteBuffer;

/**
 * Shim: M3 -> BattleActionPayload
 * @see cn.pokemmo.battle.BattleActionPayload
 */
public final class M3 extends BattleActionPayload {
    public M3(ByteBuffer data) {
        super(data);
    }

    public M3(ib0_0 type, byte[] values) {
        super(type, values);
    }
}
