package f;

import cn.pokemmo.battle.action.BattleAction018Packet;
import java.util.*;
import java.nio.ByteBuffer;

/**
 * 双向兼容垫片 - nb0_0 -> BattleAction018Packet
 */
public class nb0_0 extends BattleAction018Packet {
    public nb0_0(short base, byte mode) {
        super(base, mode);
    }
}
