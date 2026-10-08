/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.IL0;
import f.Qy0;
import f.Ym0;
import f.le0_2;
import f.lg_0;
import f.lpt5__5;

/*
 * Renamed from f.aZ
 */
public class TaskCallbackAz1
implements Runnable  {
    public final /* synthetic */ Qy0 Kz0;

    public TaskCallbackAz1(Qy0 qy0) {
        this.Kz0 = qy0;
    }

    @Override
    public final void run() {
        Qy0 qy0 = this.Kz0;
        qy0.getClass();
        lg_0.k.lPT5(new IL0(qy0, true));
        if (qy0.G30 != null) {
            qy0.G30.xe0();
        }
        if (qy0.Ur0 != null) {
            qy0.Ur0.xe0();
        }
        lpt5__5.hL.Com4.execute(new Ym0());
    }
}
