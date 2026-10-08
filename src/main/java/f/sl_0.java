package f;

import cn.pokemmo.battle.action.BattleAction024Packet;
import java.util.*;
import java.nio.ByteBuffer;

/**
 * 双向兼容垫片 - sl_0 -> BattleAction024Packet
 */
public class sl_0 extends BattleAction024Packet {
    public sl_0(byte b, short s, short s2) {
        super(b, s, s2);
    }
}
