package cn.pokemmo.graphics.particle;

import f.FF0;
import f.LPT6_;

/**
 * 粒子发射器与纹理坐标偏移描述符
 */
public class ParticleEmitterOffset extends FF0 {
    public final LPT6_ Am;
    public final float so;
    public final float bk0;

    public ParticleEmitterOffset(LPT6_ lPT6_, float f, float f2) {
        this.Am = lPT6_;
        this.so = f;
        this.bk0 = f2;
    }
}
