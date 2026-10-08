package cn.pokemmo.particle.effect;

import cn.pokemmo.particle.modifier.ParticleVectorPathModifier;
import com.badlogic.gdx.graphics.g3d.particles.DynamicsModifierExt;
import com.badlogic.gdx.graphics.g3d.particles.ParticleController;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffectExt;
import com.badlogic.gdx.graphics.g3d.particles.batches.BillboardParticleBatchExt;
import com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsInfluencerExt;
import com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier;
import com.badlogic.gdx.graphics.g3d.particles.influencers.Influencer;
import com.badlogic.gdx.graphics.g3d.particles.influencers.RegionInfluencerExt;
import f.*;

import java.util.Arrays;
import java.util.Random;

/**
 * 多向量动力学路径与三段区域贴图粒子战斗特效 (Multi-Vector Path Particle Effect)
 * 组合使用 ParticleVectorPathModifier (E) 计算贝塞尔/动力学向量轨迹，并结合三路 NDS 动画区域影响器
 * 原混淆类: f.mo0_0
 */
public class MultiVectorPathParticleEffect extends MU {
    public static final short[] vI;
    public final boolean isShiny;
    public final boolean cn0;

    static {
        Cq0.E1(MultiVectorPathParticleEffect.class);
        vI = new short[] { 1, 4, 7 };
    }

    public MultiVectorPathParticleEffect(PF participant, boolean isShiny) {
        super(participant);
        this.isShiny = isShiny;
        this.cn0 = isShiny;
    }

    public static void bT(float f, int idx, D2 tween) {
        tw0_0.RE0.IE((byte) 2, (short) 1382, (short) -1, true, f, 1.0f, 1.0f, 0);
    }

    public static void L0(float f, int idx, D2 tween) {
        tw0_0.RE0.IE((byte) 2, (short) 1382, (short) -1, true, f, 1.0f, 1.0f, 150);
    }

    public static void QI(float f, int idx, D2 tween) {
        tw0_0.RE0.IE((byte) 2, (short) 1382, (short) -1, true, f, 1.0f, 1.0f, 300);
    }

    public static void RD0(float f, int idx, D2 tween) {
        tw0_0.RE0.IE((byte) 2, (short) 1383, (short) -1, true, f, 1.0f, 0.7f, 1000);
    }

    public static void qp0(float f, int idx, D2 tween) {
        tw0_0.RE0.IE((byte) 2, (short) 1383, (short) -1, true, f, 1.0f, 0.7f, 1150);
    }

    public static void Ud(float f, int idx, D2 tween) {
        tw0_0.RE0.IE((byte) 2, (short) 1383, (short) -1, true, f, 1.0f, 0.7f, 1300);
    }

    public static void XQ(short[] ids, float f, int idx, D2 tween) {
        tw0_0.RE0.IE((byte) 2, (short) 1, ids[0], true, f, 1.0f, 0.5f, 2500);
    }

    public static void BI(short[] ids, float f, int idx, D2 tween) {
        tw0_0.RE0.IE((byte) 2, (short) 1, ids[1], true, f, 1.0f, 0.5f, 2700);
    }

    public static void N30(short[] ids, float f, int idx, D2 tween) {
        tw0_0.RE0.IE((byte) 2, (short) 1, ids[2], true, f, 1.0f, 0.5f, 2900);
    }

    public static void R8(short[] ids, float f, int idx, D2 tween) {
        tw0_0.RE0.IE((byte) 2, (short) 1, ids[3], true, f, 1.0f, 0.5f, 3050);
    }

    public static void gC(short[] ids, float f, int idx, D2 tween) {
        tw0_0.RE0.IE((byte) 2, (short) 1, ids[4], true, f, 1.0f, 0.5f, 3200);
    }

    public static void fU(short[] ids, float f, int idx, D2 tween) {
        tw0_0.RE0.IE((byte) 2, (short) 1, ids[5], true, f, 1.0f, 0.5f, 3350);
    }

    public static void fN(short[] ids, float f, int idx, D2 tween) {
        tw0_0.RE0.IE((byte) 2, (short) 1, ids[6], true, f, 1.0f, 0.5f, 3500);
    }

    public static void Xc0(short[] ids, float f, int idx, D2 tween) {
        tw0_0.RE0.IE((byte) 2, (short) 1, ids[7], true, f, 1.0f, 0.5f, 3650);
    }

    public static void j6(short[] ids, float f, int idx, D2 tween) {
        tw0_0.RE0.IE((byte) 2, (short) 1, ids[8], true, f, 1.0f, 0.5f, 3800);
    }

    @Override
    public MU us() {
        String effectName;
        if (this.nn0()) {
            effectName = this.isShiny ? "spawn_10th_anniv_friends_shiny_enemy" : "spawn_10th_anniv_friends_enemy";
        } else {
            effectName = this.isShiny ? "spawn_10th_anniv_friends_shiny_friendly" : "spawn_10th_anniv_friends_friendly";
        }

        short[] ids = new short[] { 1, 4, 7 };
        Random random = rg0_2.Ak0.MC0;
        int n = 3;
        while (n > 1) {
            int r = random.nextInt(n);
            n--;
            short tmp = ids[n];
            ids[n] = ids[r];
            ids[r] = tmp;
        }

        float dir = !this.nn0() ? -1.0f : 1.0f;
        float factor = dir * dw_2.ej;

        pw_1 chain = pw_1.xC().Xf0()
            .y80(this.wn0(effectName))
            .y80(ao_1.pc((idx, tween) -> bT(factor, idx, tween)))
            .y80(ao_1.pc((idx, tween) -> L0(factor, idx, tween)))
            .y80(ao_1.pc((idx, tween) -> QI(factor, idx, tween)))
            .y80(ao_1.pc((idx, tween) -> RD0(factor, idx, tween)))
            .y80(ao_1.pc((idx, tween) -> qp0(factor, idx, tween)))
            .y80(ao_1.pc((idx, tween) -> Ud(factor, idx, tween)))
            .y80(ao_1.pc((idx, tween) -> XQ(ids, factor, idx, tween)))
            .y80(ao_1.pc((idx, tween) -> BI(ids, factor, idx, tween)))
            .y80(ao_1.pc((idx, tween) -> N30(ids, factor, idx, tween)));

        this.E8 = chain;
        if (this.isShiny) {
            this.E8 = chain
                .xi0(this.i6((byte) 2, (short) 1556, 1, 14, 2650.0f, 0.7f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1554, 1, 14, 3300.0f, 0.7f, this.Vz0));
        }

        this.E8.mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }

    @Override
    public ao_1 wn0(String effectName) {
        ParticleEffectExt effect = this.Jv("custom/".concat(effectName));
        for (int i = 0; i < 6; ++i) {
            ParticleController controller = (ParticleController) effect.getControllers().get(i);
            if (i < 3) {
                BillboardParticleBatchExt batch = (BillboardParticleBatchExt) effect.getBatches().get(i);
                RegionInfluencerExt.NDSRegionInfluencer influencer = new RegionInfluencerExt.NDSRegionInfluencer(
                        batch, vI[i], this.isShiny, !this.nn0()
                );
                influencer.set(controller);
                influencer.allocateChannels();
                controller.replaceInfluencer(RegionInfluencerExt.AnimatedExt.class, influencer);
            }

            DynamicsInfluencerExt dynamicsInfluencer = null;
            I2 it = controller.influencers.ZD();
            while (it.hasNext()) {
                Influencer inf = (Influencer) it.next();
                if (inf instanceof DynamicsInfluencerExt) {
                    dynamicsInfluencer = (DynamicsInfluencerExt) inf;
                }
            }

            if (dynamicsInfluencer != null) {
                DynamicsModifierExt.VectorPathModifier modifier = (DynamicsModifierExt.VectorPathModifier) ((DynamicsModifier[]) dynamicsInfluencer.velocities.rZ)[0];
                ParticleVectorPathModifier e = new E(modifier, this.Vz0.LpT9.j);
                e.initPath(0);
                modifier.finalVectorPath = (C8[]) Arrays.copyOf(e.finalVectorPath, e.finalVectorPath.length);
                modifier.pathCache.n3(0, new tl_0(modifier.finalVectorPath, false));
                modifier.dispose();
            }
        }
        return ao_1.pc((idx, tween) -> this.ZX(effect, idx, tween));
    }

    @Override
    public boolean Bv0(boolean ignored) {
        return false;
    }
}
