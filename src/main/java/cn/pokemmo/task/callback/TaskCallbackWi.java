/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.Bw0;
import f.rw0;

public class TaskCallbackWi
implements Runnable  {
    public final /* synthetic */ rw0 DC;

    public TaskCallbackWi(rw0 rw02) {
        this.DC = rw02;
    }

    @Override
    public final void run() {
        Bw0.iC.info("Finished showing failure message");
        if (this.DC.tR) {
            System.exit(-1);
        }
    }
}

