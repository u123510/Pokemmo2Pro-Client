package f;

import cn.pokemmo.battle.action.BattleAction013Packet;
import java.util.*;
import java.nio.ByteBuffer;

/**
 * 双向兼容垫片 - xr_1 -> BattleAction013Packet
 */
public class xr_1 extends BattleAction013Packet {
    public xr_1(d70_0 mode, short value) {
        super(mode, value);
    }
}
