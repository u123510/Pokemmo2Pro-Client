package cn.pokemmo.particle.effect;

import cn.pokemmo.particle.influencer.AnimatedParticleRegionInfluencer;
import com.badlogic.gdx.graphics.g3d.particles.ParticleController;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffectExt;
import com.badlogic.gdx.graphics.g3d.particles.batches.BillboardParticleBatchExt;
import com.badlogic.gdx.graphics.g3d.particles.influencers.RegionInfluencerExt;
import f.*;

/**
 * 幽灵/幻影系 3D 粒子战斗特效 (Phantom 3D Particle Effect)
 * 动态加载 41 帧幽灵序列贴图，实例化 41 帧动画影响器并替换 dummy 控制器
 * 原混淆类: f.eo_2
 */
public class PhantomParticleEffect extends MU {
    public final hd0_2 assetManager;
    public final hd0_2 bL0;

    public final String spritePathPrefix;
    public final String kN;

    public final boolean isShiny;
    public final boolean mW;

    public PhantomParticleEffect(PF participant, boolean isShiny) {
        super(participant);
        this.isShiny = isShiny;
        this.mW = isShiny;
        this.spritePathPrefix = isShiny ? "sprites/shiny_phantom/" : "sprites/phantom/";
        this.kN = this.spritePathPrefix;

        Oz0 current = tw0_0.LD0.S30();
        if (current instanceof vr_1) {
            this.assetManager = ((vr_1) current).protected$().FF();
            this.bL0 = this.assetManager;
            int i = 0;
            while (i < 41) {
                String uD = fp0_0.uD(new StringBuilder().append(this.spritePathPrefix), ++i, ".png");
                if (!this.assetManager.AA0(uD)) {
                    this.assetManager.qh0(uD);
                } else {
                    this.assetManager.v9(this.assetManager.R80(uD) + 1, uD);
                }
            }
        } else {
            this.assetManager = null;
            this.bL0 = null;
        }
    }

    @Override
    public MU us() {
        pw_1 chain = pw_1.xC().Xf0();
        String effectName;
        if (nn0()) {
            effectName = this.isShiny ? "spawn_shiny_phantom_enemy" : "spawn_phantom_enemy";
        } else {
            effectName = this.isShiny ? "spawn_shiny_phantom" : "spawn_phantom";
        }
        chain.y80(wn0(effectName));
        this.E8 = chain.xi0(i6((byte) 10, (short) 16, 1, 14, 900.0F, 0.9F, this.Vz0))
                       .xi0(i6((byte) 10, (short) 17, 1, 14, 3500.0F, 0.9F, this.Vz0))
                       .mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        Vc();
        return this;
    }

    @Override
    public boolean Bv0(boolean ignored) {
        return false;
    }

    public ao_1 wn0(String effectName) {
        ParticleEffectExt effect = Jv("custom/".concat(effectName));
        if (!effect.isLoaded()) {
            ao_1 ao = (ao_1) ao_1.Sk0.u9();
            ao.r70(null, -1, 0.0F);
            return ao;
        }
        BillboardParticleBatchExt batch = (BillboardParticleBatchExt) effect.getBatches().get(0);
        I2 controllers = effect.getControllers().ZD();
        while (controllers.hasNext()) {
            ParticleController pc = (ParticleController) controllers.next();
            if ("dummy".equals(pc.name)) {
                AnimatedParticleRegionInfluencer influencer = new AnimatedParticleRegionInfluencer(this, batch);
                influencer.set(pc);
                influencer.allocateChannels();
                pc.replaceInfluencer(RegionInfluencerExt.AnimatedExt.class, influencer);
            }
        }
        return ao_1.pc((i, d2) -> Gw0(effect, i, d2));
    }
}
