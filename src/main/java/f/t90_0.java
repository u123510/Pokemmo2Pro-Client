package f;

import cn.pokemmo.battle.action.BattleAction019Packet;
import java.util.*;
import java.nio.ByteBuffer;

/**
 * 双向兼容垫片 - t90_0 -> BattleAction019Packet
 */
public class t90_0 extends BattleAction019Packet {
    public t90_0(short value) {
        super(value);
    }
}
