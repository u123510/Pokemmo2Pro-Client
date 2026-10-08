package cn.pokemmo.world.tile.behavior;

import f.nt_1;

/**
 * 地图图块交互行为基类
 * 对应混淆基类: f.nt_1
 * 负责大世界角色在不同地图图块上的物理阻挡、位移过渡、音效触发、遇敌判定及状态切换。
 */
public abstract class BaseTileBehavior extends nt_1 {

    public BaseTileBehavior() {
        super();
    }

    @SuppressWarnings("unchecked")
    public final <T extends nt_1> T asBridge() {
        return (T) (Object) this;
    }
}
