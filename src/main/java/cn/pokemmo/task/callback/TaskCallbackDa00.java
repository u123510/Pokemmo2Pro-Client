/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.CH0;
import f.Qy0;
import f.ab_1;
import f.ce0_0;
import f.eh_0;
import f.fn_2;
import f.le0_2;
import f.lpt3__4;
import f.pg0_0;
import f.sm0_0;
import f.tw0_0;

/*
 * Renamed from f.dA0
 */
public class TaskCallbackDa00
implements Runnable  {
    public final /* synthetic */ pg0_0 jG0;
    public final /* synthetic */ ce0_0 xj;
    public final /* synthetic */ ab_1 S9;

    public TaskCallbackDa00(ab_1 ab_12, pg0_0 pg0_02, ce0_0 ce0_02) {
        this.S9 = ab_12;
        this.jG0 = pg0_02;
        this.xj = ce0_02;
    }

    @Override
    public final void run() {
        pg0_0 pg0_02 = this.jG0;
        if (pg0_02.b8 == pg0_0.ze0.b8) {
            String string = sm0_0.wa0(2724, this.xj.GG0.DR);
            fn_2 fn_22 = new fn_2((da0_0) this);
            Qy0.yI0.sr0(new lpt3__4(string, fn_22, this.S9));
        } else {
            CH0 cH0 = this.xj.YX;
            tw0_0.rl.fk0.uQ(new eh_0(cH0, pg0_02));
        }
    }
}

