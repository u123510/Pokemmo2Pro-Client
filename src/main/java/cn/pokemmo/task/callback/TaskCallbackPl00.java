/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.TH;

/*
 * Renamed from f.pL0
 */
public class TaskCallbackPl00
implements Runnable  {
    public final /* synthetic */ TH b60;
    public final /* synthetic */ byte sy;

    public TaskCallbackPl00(TH tH, byte by) {
        this.b60 = tH;
        this.sy = by;
    }

    @Override
    public final void run() {
        this.b60.Ox0(this.sy);
    }
}

