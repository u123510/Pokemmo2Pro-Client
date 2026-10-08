package cn.pokemmo.particle.effect;

import com.badlogic.gdx.graphics.g3d.particles.ParticleController;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffectExt;
import com.badlogic.gdx.graphics.g3d.particles.batches.BillboardParticleBatchExt;
import com.badlogic.gdx.graphics.g3d.particles.influencers.RegionInfluencerExt;
import f.*;

/**
 * 花岩怪 / 怨灵系 3D 粒子战斗特效 (Spiritomb / Menacing Spirit Particle Effect)
 * 控制 442 号花岩怪（闪光/普通）在进场时的多层粒子特效与 NDS 动画区域贴图注入
 * 原混淆类: f.K50
 */
public class SpiritombParticleEffect extends MU {
    public final boolean isShiny;
    public final boolean ks0;

    static {
        Cq0.E1(SpiritombParticleEffect.class);
    }

    public SpiritombParticleEffect(PF participant, boolean isShiny) {
        super(participant);
        this.isShiny = isShiny;
        this.ks0 = isShiny;
    }

    @Override
    public MU us() {
        pw_1 chain = pw_1.xC().Xf0()
                .xi0(this.i6((byte) 2, (short) 1702, 1, 14, 900.0F, 0.1F, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1408, 2, 14, 7500.0F, 0.25F, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1429, 2, 14, 8000.0F, 0.5F, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1001, 1, 14, 7500.0F, 0.1F, this.Vz0));
        String effectName = this.isShiny ? "spawn_shiny_menacing_spirit_enemy" : "spawn_menacing_spirit_enemy";
        this.E8 = chain.y80(this.wn0(effectName)).mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }

    @Override
    public ao_1 wn0(String effectName) {
        ParticleEffectExt effect = this.Jv("custom/".concat(effectName));
        BillboardParticleBatchExt batch = (BillboardParticleBatchExt) effect.getBatches().get(0);
        I2 controllers = effect.getControllers().ZD();

        while (controllers.hasNext()) {
            ParticleController controller = (ParticleController) controllers.next();
            if ("spirit".equals(controller.name)) {
                RegionInfluencerExt.NDSRegionInfluencer influencer = new RegionInfluencerExt.NDSRegionInfluencer(
                        batch, (short) 442, this.isShiny, !this.nn0()
                );
                influencer.set(controller);
                influencer.allocateChannels();
                controller.replaceInfluencer(RegionInfluencerExt.AnimatedExt.class, influencer);
            }
        }

        return ao_1.pc((index, tween) -> this.pn0(effect, index, tween));
    }

    @Override
    public boolean Bv0(boolean ignored) {
        return false;
    }
}
