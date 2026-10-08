package cn.pokemmo.battle.slot;

import f.Mj;
import f._volatile;

/**
 * BaseBattleParticipantSlot - 战斗参与者槽位与场地属性模型基类
 * 封装单打/双打/三打/团体战等各类战斗槽位的站位标识、行动顺序以及场地状态映射。
 */
public abstract class BaseBattleParticipantSlot extends Mj {

    public BaseBattleParticipantSlot(_volatile container) {
        super(container);
    }
}
