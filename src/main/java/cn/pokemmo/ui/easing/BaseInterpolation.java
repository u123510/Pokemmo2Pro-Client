package cn.pokemmo.ui.easing;

import f.by_0;

/**
 * 动画缓动插值算法基类
 * 对应混淆基类: f.by_0
 * 负责 UI 动效、视窗平滑过渡与数值插值计算。
 */
public abstract class BaseInterpolation extends by_0 {

    public BaseInterpolation() {
        super();
    }

    /**
     * 计算指定归一化时间 t [0, 1] 下的插值结果
     */
    public float F0(float t) {
        return t;
    }

    @SuppressWarnings("unchecked")
    public final <T extends by_0> T asBridge() {
        return (T) (Object) this;
    }
}
