package cn.pokemmo.particle;

import com.badlogic.gdx.graphics.g3d.particles.values.ScaledNumericValueExt;

/**
 * 粒子扩展数值缩放计算工具类 (Particle Scale Ext Utils)
 * 对扩展标量数值 (ScaledNumericValueExt) 按时间百分比提供缩放与基础偏移计算。
 *
 * 原混淆类: f.TG0
 */
public abstract class ParticleScaleExtUtils {

    public static float calculateScale(ScaledNumericValueExt scaledNumericValueExt, float percent, float scale, float offset) {
        return scaledNumericValueExt.getScale(percent) * scale + offset;
    }

    public static float u9(ScaledNumericValueExt scaledNumericValueExt, float f, float f2, float f3) {
        return calculateScale(scaledNumericValueExt, f, f2, f3);
    }
}
