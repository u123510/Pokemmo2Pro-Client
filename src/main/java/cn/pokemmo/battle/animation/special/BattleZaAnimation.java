package cn.pokemmo.battle.animation.special;

import f.*;

import com.badlogic.gdx.graphics.Color;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleZaAnimation
 * 原始类: f.ZA
 */
public class BattleZaAnimation extends MU {
    public static final Color nl0;

    public BattleZaAnimation(PF source) {
        super(source);
    }

    static {
        nl0 = Color.valueOf("#DF41FF");
    }

    @Override
    public final MU us() {
        pw_1 root = pw_1.xC().Xf0();
        Color color = nl0;
        root = root.xi0(this.WW(14, 1.0F, 0.0F, 0.625F, color));
        root = root.xi0(this.nM(14, 1));
        root = root.mz0().Xf0();
        root = root.xi0(this.i6((byte) 2, (short) 1859, 1, 14, 0.0F, 1.0F, this.Vz0));
        root = root.y80(this.wn0("boss_cleared_status"));
        root = root.mz0().p1(0.2F).Xf0();
        root = root.xi0(this.WW(14, 1.0F, 0.625F, 0.0F, color));
        root = root.xi0(this.nM(14, 0));
        this.E8 = root.mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }

    @Override
    public final boolean Bv0(boolean ignored) {
        return false;
    }
}
