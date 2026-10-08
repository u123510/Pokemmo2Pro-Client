/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.BR;
import f.e30_0;
import f.tw0_0;
import f.zo_0;

/*
 * Renamed from f.Li0
 */
public class TaskCallbackLi00
implements Runnable  {
    public final /* synthetic */ e30_0 ZI;

    public TaskCallbackLi00(e30_0 e30_02) {
        this.ZI = e30_02;
    }

    @Override
    public final void run() {
        BR bR = tw0_0.rl;
        String string = "//moveto " + this.ZI.kC + " " + this.ZI.Oq0 + " " + this.ZI.Zl0 + " " + this.ZI.sL0 + " " + this.ZI.t60;
        bR.getClass();
        bR.Cp(zo_0.Pk, string, "", true);
    }
}

