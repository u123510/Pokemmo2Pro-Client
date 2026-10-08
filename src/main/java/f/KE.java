package f;

import cn.pokemmo.battle.action.BattleAction041Packet;
import java.util.*;
import java.nio.ByteBuffer;

/**
 * 双向兼容垫片 - KE -> BattleAction041Packet
 */
public class KE extends BattleAction041Packet {
    public KE(short var1, CH0 var2, short var3) {
        super(var1, var2, var3);
    }
}
