/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.Lt0;
import f.W9;
import f.xn0_0;

/*
 * Renamed from f.du0
 */
public class TaskCallbackDu00
implements Runnable  {
    public final /* synthetic */ xn0_0 CK;

    public TaskCallbackDu00(xn0_0 xn0_02) {
        this.CK = xn0_02;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void run() {
        boolean bl;
        W9 w9;
        xn0_0 xn0_02 = this.CK;
        Lt0 lt0 = xn0_02.xl;
        if (lt0 == null) {
            xn0_02.vc();
            w9 = this.CK.Ze0;
            bl = true;
        } else {
            xn0_02.u3(lt0);
            w9 = this.CK.Ze0;
            bl = false;
        }
        w9.ER.lK0(bl);
        this.CK.f00();
    }
}

