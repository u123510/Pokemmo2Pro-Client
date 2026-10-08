package f;

import cn.pokemmo.battle.action.StatAction051Packet;
import java.util.*;

/**
 * 对战行动数据包垫片 - StatAction051Packet
 * 行动编码: 51
 * 原始混淆类: f.bv_0
 * 现代实现: cn.pokemmo.battle.action.StatAction051Packet
 */
public class bv_0 extends StatAction051Packet {

    public bv_0(byte flags, short effect, CH0 target, CH0 secondaryTarget, short itemId, short value) {
        super(flags, effect, target, secondaryTarget, itemId, value);
    }
}
