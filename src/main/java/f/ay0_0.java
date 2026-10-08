package f;

import cn.pokemmo.battle.action.BattleActionNeg026Packet;
import java.util.*;
import java.nio.ByteBuffer;

/**
 * 双向兼容垫片 - ay0_0 -> BattleActionNeg026Packet
 */
public class ay0_0 extends BattleActionNeg026Packet {
    public ay0_0(short value) {
        super(value);
    }
}
