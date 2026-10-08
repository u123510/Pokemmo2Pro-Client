package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 闪光与秘密闪光质子登场粒子特效 (Shiny & Secret Shiny Particle Effect)
 * 自动识别闪光类型：
 * 1. 秘密/方块闪光 (Secret Shiny): 编排 2060/1554 音效序列并加载 "spawn_secret_shiny" 粒子系统；
 * 2. 普通/星星闪光 (Star Shiny): 编排 1556/1554 音效并播放 152/422 星光闪烁粒子补间序列。
 *
 * 原混淆类: f.Fq0
 */
public class ShinyParticleEffect extends MU {

    public ShinyParticleEffect(PF participant) {
        super(participant);
    }

    @Override
    public MU us() {
        PF participant = this.Vz0;
        boolean isSecretShiny = participant.rm0 != 0 ? participant.Q7 : participant.zi0.Bn.u3();

        if (isSecretShiny) {
            // 秘密闪光 (Secret / Square Shiny)
            pw_1 chain = pw_1.xC().Xf0()
                    .xi0(this.i6((byte) 2, (short) 2060, 0, 14, 0.0f, 0.9375f, this.Vz0))
                    .xi0(this.i6((byte) 2, (short) 1554, 1, 14, 650.0f, 0.859375f, this.Vz0))
                    .y80(this.wn0("spawn_secret_shiny"))
                    .mz0();
            this.E8 = chain;
        } else {
            // 普通星星闪光 (Star / Standard Shiny)
            pw_1 chain = pw_1.xC().Xf0()
                    .y80(this.Qh0(152))
                    .xi0(this.i6((byte) 2, (short) 1556, 1, 14, 0.0f, 0.9375f, this.Vz0))
                    .xi0(this.fE0(-1, 152, 0, 9, 8, 0.4f))
                    .xi0(this.fE0(-1, 152, 1, 9, 8, 0.4f))
                    .y80(this.Qh0(422))
                    .xi0(this.i6((byte) 2, (short) 1554, 1, 14, 700.0f, 0.859375f, this.Vz0))
                    .xi0(this.fE0(-1, 422, 2, 9, 8, 0.4f))
                    .xi0(this.i6((byte) 2, (short) 1556, 1, 14, 0.0f, 0.9375f, this.Vz0))
                    .xi0(this.fE0(-1, 152, 0, 13, 8, 0.4f))
                    .xi0(this.fE0(-1, 152, 1, 13, 8, 0.4f))
                    .y80(this.Qh0(422))
                    .xi0(this.i6((byte) 2, (short) 1554, 1, 14, 700.0f, 0.859375f, this.Vz0))
                    .xi0(this.fE0(-1, 422, 2, 13, 8, 0.4f))
                    .mz0();
            this.E8 = chain;
        }

        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }

    @Override
    public boolean Bv0(boolean bl) {
        return false;
    }
}
