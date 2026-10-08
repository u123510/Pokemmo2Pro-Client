package cn.pokemmo.particle.effect;

import cn.pokemmo.particle.influencer.DragonAnimatedRegionInfluencer;
import com.badlogic.gdx.graphics.g3d.particles.ParticleController;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffect;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffectExt;
import com.badlogic.gdx.graphics.g3d.particles.batches.BillboardParticleBatchExt;
import com.badlogic.gdx.graphics.g3d.particles.influencers.Influencer;
import com.badlogic.gdx.graphics.g3d.particles.influencers.RegionInfluencerExt;
import f.*;

/**
 * 龙之波动 / 龙系技能 3D 粒子战斗特效 (Dragon Move 3D Particle Effect)
 * 动态加载 24 帧龙形序列贴图，实例化龙系专用帧动画影响器并替换 dummy 控制器
 * 原混淆类: f.Bv0
 */
public class DragonParticleEffect extends MU {
    public final hd0_2 assetManager;
    public final hd0_2 NG0;

    public DragonParticleEffect(PF participant) {
        super(participant);
        Oz0 current = tw0_0.LD0.S30();
        if (current instanceof vr_1) {
            this.assetManager = ((vr_1) current).protected$().FF();
            this.NG0 = this.assetManager;
            int n = 0;
            while (n < 24) {
                String spritePath = fp0_0.uD(new StringBuilder("sprites/way_of_the_dragon/"), ++n, ".png");
                if (!this.assetManager.AA0(spritePath)) {
                    this.assetManager.qh0(spritePath);
                } else {
                    this.assetManager.v9(this.assetManager.R80(spritePath) + 1, spritePath);
                }
            }
        } else {
            this.assetManager = null;
            this.NG0 = null;
        }
    }

    @Override
    public MU us() {
        PF target = this.Vz0;
        String effectName = this.nn0() ? "way_of_the_dragon_enemy" : "way_of_the_dragon";
        this.E8 = pw_1.xC().Xf0()
                .y80(this.wn0(effectName))
                .xi0(this.i6((byte) 10, (short) 8, 3, 14, 1400.0f, 0.8f, target))
                .mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }

    @Override
    public boolean Bv0(boolean ignored) {
        return false;
    }

    @Override
    public ao_1 wn0(String effectName) {
        ParticleEffectExt effect = this.Jv("custom/".concat(effectName));
        BillboardParticleBatchExt batch = (BillboardParticleBatchExt) effect.getBatches().get(0);
        I2 controllers = ((ParticleEffect) effect).getControllers().ZD();
        while (controllers.hasNext()) {
            ParticleController controller = (ParticleController) controllers.next();
            if ("dummy".equals(controller.name)) {
                DragonAnimatedRegionInfluencer replacement = new DragonAnimatedRegionInfluencer(this, batch);
                replacement.set(controller);
                replacement.allocateChannels();
                controller.replaceInfluencer(RegionInfluencerExt.AnimatedExt.class, (Influencer) replacement);
                break;
            }
        }
        return ao_1.pc((int type, D2 tween) -> this.ze0(effect, type, tween));
    }
}
