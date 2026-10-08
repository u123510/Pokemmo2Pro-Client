package f;

import cn.pokemmo.battle.action.BattleAction039Packet;
import java.util.*;
import java.nio.ByteBuffer;

/**
 * 双向兼容垫片 - C20 -> BattleAction039Packet
 */
public class C20 extends BattleAction039Packet {
    public C20(short var1) {
        super(var1);
    }
}
