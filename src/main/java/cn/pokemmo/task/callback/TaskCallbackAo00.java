/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

/*
 * Renamed from f.ao0
 */
public class TaskCallbackAo00
implements Runnable  {
    public final /* synthetic */ HV EY;
    public final /* synthetic */ zg0_2 Jq;

    public TaskCallbackAo00(zg0_2 zg0_22, HV hV) {
        this.Jq = zg0_22;
        this.EY = hV;
    }

    @Override
    public final void run() {
        Object object = this.EY;
        if (tw0_0.rl.Cl.coN < ((HV)object).yx0) {
            String string = sm0_0.c0(3011);
            String string2 = sm0_0.c0(3012);
            String string3 = sm0_0.c0(nf0_0.Bq0);
            rk_1 rk_12 = new rk_1((ao0_0) this);
            Qy0.yI0.sr0(new lpt3__4(string, string2, string3, rk_12, null));
            return;
        }
        String string = sm0_0.Bx(3005, ((HV)object).wG0(), fp0_0.uD(new StringBuilder(), this.EY.yx0, ""));
        Ev0 ev0 = new Ev0((ao0_0) this);
        Qy0.yI0.sr0(new lpt3__4(string, ev0, this.Jq));
    }
}
