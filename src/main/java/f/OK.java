package f;

import cn.pokemmo.battle.action.BattleAction006Packet;
import java.util.*;
import java.nio.ByteBuffer;

/**
 * 双向兼容垫片 - OK -> BattleAction006Packet
 */
public class OK extends BattleAction006Packet {
    public OK(short value) {
        super(value);
    }
}
