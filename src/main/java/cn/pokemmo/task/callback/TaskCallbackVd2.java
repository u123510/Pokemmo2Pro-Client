package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackVd2 implements Runnable  {
    public final String AG;
    public final float WJ0;
    public final re_1 Xp0;

    public TaskCallbackVd2(re_1 owner, String text, float progress) {
        this.Xp0 = owner;
        this.AG = text;
        this.WJ0 = progress;
    }

    @Override public final void run() {
        re_1 owner = this.Xp0;
        if (owner.fV.K20 == null) return;
        owner.xG0.Sk(this.AG);
        if (this.WJ0 < 0.0f) {
            if (owner.vh0.K20 != null) {
                owner.fV.em();
                owner.fV.WQ(owner.fV.hb(owner.xG0));
                owner.fV.x40(owner.fV.C7(owner.xG0));
            }
            return;
        }
        if (this.WJ0 >= 0.0f) {
            if (owner.vh0.K20 == null) {
                owner.fV.WQ(owner.fV.hb(owner.xG0, owner.vh0));
                owner.fV.x40(owner.fV.C7(owner.xG0).p70(20).Kn0(owner.vh0));
            }
            owner.vh0.aE(this.WJ0);
            owner.vh0.B(new StringBuilder(owner.Vp0.format(this.WJ0 * 100.0f)).append("%").toString());
        }
    }
}
