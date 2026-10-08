package cn.pokemmo.particle.vanity;

import f.Cq;
import f.Cq0;
import f.MU;
import f.N60;
import f.NU;
import f.Oz0;
import f.PF;
import f.QL;
import f.a10_0;
import f.dl_1;
import f.tw0_0;

/**
 * 战斗质子入场特效触发动作 (Battle Particle Vanity Spawn Action)
 * 当宝可梦出场或被换上场时，在战斗动画队列中创建并播放其对应的质子特效（包括闪光质子与专属个性化质子）。
 *
 * 原混淆类: f.cg0_0
 */
public class BattleParticleVanityAction extends N60 {

    public static final dl_1 L3 = Cq0.E1(BattleParticleVanityAction.class);

    public final a10_0 GC;
    public final PF xB0;
    public final QL dr0;
    public MU u3;

    public BattleParticleVanityAction(a10_0 layout, QL vanity, PF participant) {
        this.GC = layout;
        this.dr0 = vanity;
        this.xB0 = participant;
    }

    @Override
    public boolean lPt1() {
        MU effect = this.u3;
        if (effect == null) {
            return false;
        }
        return this.GC.nf == Cq.yL && this.xB0.cD0 == 0 ? effect.bL() : true;
    }

    @Override
    public void ii() {
        MU effect = this.u3;
        if (effect != null) {
            Oz0 battleController = tw0_0.LD0.he0;
            battleController.OC0.put(this.xB0, effect);
        }
    }

    @Override
    public void U40() {
        long now = System.currentTimeMillis();
        super.qI = now;

        QL vanity = this.dr0;
        if (vanity == null) {
            PF participant = this.xB0;
            vanity = participant != null ? participant.getParticleVanity() : QL.lQ;
        }

        int caseId = (vanity != null && vanity.uw0 >= 0 && vanity.uw0 < ParticleVanityMapping.MAPPING.length)
                ? ParticleVanityMapping.MAPPING[vanity.uw0]
                : -1;

        if (caseId >= 2 && caseId <= 5) {
            // 无质子特效 (如 QL.lQ, QL.Ll 等)，直接返回
            return;
        }

        this.u3 = ParticleVanityMapping.createEffect(vanity, this.xB0);

        MU effect = this.u3;
        if (effect == null) {
            L3.error("Error", new RuntimeException());
        } else {
            effect.Tc0 = true;
            effect.us();
        }
    }

    @Override
    public NU gJ0() {
        return NU.Yt;
    }
}
