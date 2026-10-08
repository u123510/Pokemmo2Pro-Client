package f;

import cn.pokemmo.battle.move.BattleMoveEffectRegistry;

/**
 * 兼容垫片 (Shim) - 对战招式动作效果工厂注册中心
 * 核心实现已迁移至 {@link BattleMoveEffectRegistry}
 */
public final class qk_2 extends BattleMoveEffectRegistry {
    public static qk_2 cR = new qk_2();

    public qk_2() {
        super();
        cR = this;
    }
}
