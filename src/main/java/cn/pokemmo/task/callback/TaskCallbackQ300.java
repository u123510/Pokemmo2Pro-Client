/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.Bw0;
import f.rw0;

/*
 * Renamed from f.q30
 */
public class TaskCallbackQ300
implements Runnable  {
    public final /* synthetic */ rw0 fE0;

    public TaskCallbackQ300(rw0 rw02) {
        this.fE0 = rw02;
    }

    @Override
    public final void run() {
        Bw0.iC.info("Finished showing success message");
        if (this.fE0.tR) {
            System.exit(-1);
        }
    }
}

