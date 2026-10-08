/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.sc_2;

/*
 * Renamed from f.ju0
 */
public class TaskCallbackJu00
implements Runnable  {
    public final /* synthetic */ byte n3;
    public final /* synthetic */ sc_2 Fm0;

    public TaskCallbackJu00(sc_2 sc_22, byte by) {
        this.Fm0 = sc_22;
        this.n3 = by;
    }

    @Override
    public final void run() {
        this.Fm0.n7(this.n3);
    }
}

