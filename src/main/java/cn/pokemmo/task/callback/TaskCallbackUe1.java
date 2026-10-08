/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.QC;

/*
 * Renamed from f.uE
 */
public class TaskCallbackUe1
implements Runnable  {
    public final /* synthetic */ QC f60;

    public TaskCallbackUe1(QC qC) {
        this.f60 = qC;
    }

    @Override
    public final void run() {
        this.f60.close();
    }
}

