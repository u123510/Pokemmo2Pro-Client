package cn.pokemmo.graphics.animation.tween;

/**
 * Universal Tween Engine 缓动插值访问器统一接口
 * 负责在动画插值计算期间读取与设置目标对象的物理属性（坐标、旋转、缩放、颜色、透明度等）
 * 原始接口: {@code f.BD}
 */
public interface BaseTweenAccessor {
    /**
     * 读取目标对象指定类型的当前属性值至 returnValues
     * (对应混淆方法 AJ)
     */
    int AJ(Object target, int tweenType, float[] returnValues);

    /**
     * 将插值计算后的 newValues 设置到目标对象的相应物理属性上
     * (对应混淆方法 wl)
     */
    void wl(Object target, int tweenType, float[] newValues);

    /**
     * 面向对象友好别名：读取属性
     */
    default int getValues(Object target, int tweenType, float[] returnValues) {
        return AJ(target, tweenType, returnValues);
    }

    /**
     * 面向对象友好别名：写入属性
     */
    default void setValues(Object target, int tweenType, float[] newValues) {
        wl(target, tweenType, newValues);
    }
}
