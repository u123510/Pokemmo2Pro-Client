package cn.pokemmo.battle.animation.special;

import f.*;

import java.util.ArrayList;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleLpt23Animation
 * 原始类: f.lpt2__3
 */
public class BattleLpt23Animation extends MU {
    public final float instanceof$;
    public final pw_1 VE0;
    public final ArrayList cd;
    public boolean nL;

    public BattleLpt23Animation(PF effect, float delay, Runnable callback) {
        super(effect);
        this.cd = new ArrayList();
        this.nL = false;
        this.instanceof$ = delay;
        this.VE0 = pw_1.xC();
        if (callback != null) {
            this.cd.add(callback);
        }
    }

    @Override
    public final MU us() {
        this.VE0.TD0().p1(this.instanceof$).Ms(this.Vs.wP);
        this.Vc();
        return this;
    }

    @Override
    public final boolean bL() {
        if (this.VE0.BJ0()) {
            if (!this.nL) {
                this.nL = true;
                for (Object callback : this.cd) {
                    ((Runnable) callback).run();
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean Bv0(boolean ignored) {
        return false;
    }
}
