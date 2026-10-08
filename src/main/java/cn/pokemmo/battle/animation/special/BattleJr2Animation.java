package cn.pokemmo.battle.animation.special;

import f.*;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleJr2Animation
 * 原始类: f.jr_2
 */
public class BattleJr2Animation extends MU {

    public BattleJr2Animation(PF v1) {
        super(v1);
    }

    @Override
    public final MU o() {
        pw_1 v1 = pw_1.xC().Xf0().y80(this.m20(i40_0.c90)).TD0().p1(0.1f).Xf0();
        com3__3[] v2 = (com3__3[]) this.aZ.Mo0(com3__3.class);
        pw_1 v2_timeline;
        if (v2 == null && this.aZ != null) {
            float f2 = 0.25f;
            pw_1 v3 = pw_1.xC().TD0().p1(0.0f).Xf0();
            I2 v7 = this.aZ.ZD();
            while (v7.hasNext()) {
                com3__3 v8 = (com3__3) v7.next();
                v3.TD0().Xf0();
                v3.y80(ao_1.DX(v8, 7, 0.1f).UD(1.1f, 0.5f));
                ao_1 ao1 = ao_1.DX(v8, 2, 0.1f);
                ao1.h5[0] = v8.j.y - f2;
                v3.y80(ao1);
                v3.mz0().Xf0();
                v3.y80(ao_1.DX(v8, 7, 0.1f).UD(1.0f, 1.0f));
                ao_1 ao2 = ao_1.DX(v8, 2, 0.1f);
                ao2.h5[0] = v8.j.y;
                v3.y80(ao2);
                v3.mz0().mz0();
            }
            v2_timeline = v3.mz0().mz0();
        } else if (v2 != null) {
            float f7 = 0.25f;
            pw_1 v8 = pw_1.xC();
            int length = v2.length;
            for (int i = 0; i < length; i++) {
                com3__3 v11 = v2[i];
                v8.TD0().p1(0.0f).Xf0();
                v8.y80(ao_1.DX(v11, 7, 0.1f).UD(1.1f, 0.5f));
                ao_1 ao1 = ao_1.DX(v11, 2, 0.1f);
                ao1.h5[0] = v11.j.y - f7;
                v8.y80(ao1);
                v8.mz0().Xf0();
                v8.y80(ao_1.DX(v11, 7, 0.1f).UD(1.0f, 1.0f));
                ao_1 ao2 = ao_1.DX(v11, 2, 0.1f);
                ao2.h5[0] = v11.j.y;
                v8.y80(ao2);
                v8.mz0().mz0();
            }
            v2_timeline = v8;
        } else {
            UF.info("{} called getHitAnimation animation with null targetDecal.", this.toString());
            v2_timeline = pw_1.xC();
        }
        v1.xi0(v2_timeline).mz0().mz0().mz0();
        this.E8 = v1;
        v1.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }

    @Override
    public final boolean Bv0(boolean z) {
        return false;
    }
}
