package cn.pokemmo.battle.animation.special;

import f.*;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleLfAnimation
 * 原始类: f.LF
 */
public class BattleLfAnimation extends MU {
    public BattleLfAnimation(PF source, PF target) {
        super(source);
        this.vv(target);
    }

    @Override
    public final MU us() {
        pw_1 tween = pw_1.xC().p1(0.6f).TD0().Xf0().y80(this.wn0("thief"))
                .xi0(this.i6((byte)2, (short)1510, 1, 2, 0.0f, 0.9375f, this.Vz0))
                .xi0(this.i6((byte)2, (short)1358, 2, 14, 833.3333f, 0.9375f, this.Vz0)).mz0().mz0();
        this.E8 = tween;
        tween.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }

    @Override
    public final boolean Bv0(boolean value) { return false; }
}
