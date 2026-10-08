/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.QC;

/*
 * Renamed from f.jD0
 */
public class TaskCallbackJd00
implements Runnable  {
    public final /* synthetic */ QC EE0;

    public TaskCallbackJd00(QC qC) {
        this.EE0 = qC;
    }

    @Override
    public final void run() {
        this.EE0.close();
    }
}

