package f;

import cn.pokemmo.battle.action.BattleAction055Packet;
import java.util.*;
import java.nio.ByteBuffer;

/**
 * 双向兼容垫片 - tz_2 -> BattleAction055Packet
 */
public class tz_2 extends BattleAction055Packet {
    public tz_2(short first, short second) {
        super(first, second);
    }
}
