package cn.pokemmo.particle.animation;

import f.Ae;
import f.Gv0;

/**
 * 动态变换与缩放的关键帧动画轨迹 (Transformed Keyframe Track)
 * 对采样分量进行轴向重映射 (X<->Z 轴翻转) 并按时间步长应用动态拉伸缩放曲线
 * 原混淆类: f.mw_0 (f.Mw)
 */
public class TransformedKeyframeTrack extends Gv0 {

    public TransformedKeyframeTrack(Ae source) {
        super(source);
    }

    @Override
    public float getSample(int component, int frameIndex) {
        if (component == 0) {
            return super.getSample(2, frameIndex);
        }
        float scale = frameIndex > 34 ? Math.min(2.25f, (float) frameIndex / 34.0f * 1.15f) : 1.0f;
        if (component == 1) {
            return super.getSample(1, frameIndex) * scale;
        }
        if (component == 2) {
            return super.getSample(0, frameIndex) * scale;
        }
        return super.getSample(component, frameIndex);
    }

    @Override
    public float Fx0(int component, int frameIndex) {
        return getSample(component, frameIndex);
    }
}
