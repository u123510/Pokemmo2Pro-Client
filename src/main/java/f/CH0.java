package f;

import cn.pokemmo.battle.BattleParticipantId;

/**
 * 对战参与者标识兼容垫片
 * 核心业务已重构迁移至 cn.pokemmo.battle.BattleParticipantId
 */
public final class CH0 extends BattleParticipantId {
    public static final CH0 j1 = new CH0(0L);

    public CH0(long var1) {
        super(var1);
    }

    public static CH0 Ab(long var0) {
        return var0 == 0L ? j1 : new CH0(var0);
    }
}
