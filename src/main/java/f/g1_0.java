package f;

import cn.pokemmo.battle.action.BattleAction026Packet;
import java.util.*;
import java.nio.ByteBuffer;

/**
 * 双向兼容垫片 - g1_0 -> BattleAction026Packet
 */
public class g1_0 extends BattleAction026Packet {
    public g1_0(fq_2 fq_2Var, short s) {
        super(fq_2Var, s);
    }
}
