/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.yz_1;

/*
 * Renamed from f.hj
 */
public class TaskCallbackHj1
implements Runnable  {
    public final /* synthetic */ yz_1 IG;

    public TaskCallbackHj1(yz_1 yz_12) {
        this.IG = yz_12;
    }

    @Override
    public final void run() {
        this.IG.Ll(true);
    }
}

