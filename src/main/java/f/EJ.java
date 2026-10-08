package f;

import cn.pokemmo.battle.action.BattleAction044Packet;
import java.util.*;
import java.nio.ByteBuffer;

/**
 * 双向兼容垫片 - EJ -> BattleAction044Packet
 */
public class EJ extends BattleAction044Packet {
    public EJ(byte type) {
        super(type);
    }
}
