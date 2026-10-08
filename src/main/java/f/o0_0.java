package f;

import cn.pokemmo.battle.action.BattleAction003Packet;
import java.util.*;
import java.nio.ByteBuffer;

/**
 * 双向兼容垫片 - o0_0 -> BattleAction003Packet
 */
public class o0_0 extends BattleAction003Packet {
    public o0_0(short value) {
        super(value);
    }
}
