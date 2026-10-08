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
 * Renamed from f.gy
 */
public class TaskCallbackGy2
implements Runnable  {
    public final /* synthetic */ e30_0 gy;

    public TaskCallbackGy2(e30_0 e30_02) {
        this.gy = e30_02;
    }

    @Override
    public final void run() {
        BR bR = tw0_0.rl;
        String string = "//teleportto " + this.gy.Nw0;
        bR.getClass();
        bR.Cp(zo_0.Pk, string, "", true);
    }
}

