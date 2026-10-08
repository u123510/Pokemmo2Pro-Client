package cn.pokemmo.particle;

import com.badlogic.gdx.graphics.g3d.particles.values.ScaledNumericValue;

/**
 * 粒子数值缩放计算工具类 (Particle Scale Utils)
 * 提供粒子生命周期曲线上的插值与缩放偏移计算。
 *
 * 原混淆类: f.hk0_0
 */
public abstract class ParticleScaleUtils {
    public static float calculateScale(ScaledNumericValue scaledNumericValue, float percent, float scale, float offset) {
        return scaledNumericValue.getScale(percent) * scale + offset;
    }

    public static float gb0(ScaledNumericValue scaledNumericValue, float f, float f2, float f3) {
        return calculateScale(scaledNumericValue, f, f2, f3);
    }
}
