/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.COm8_;

/*
 * Renamed from f.np
 */
public class TaskCallbackNp2
implements Runnable  {
    public final /* synthetic */ COm8_ AT;

    public TaskCallbackNp2(COm8_ cOm8_) {
        this.AT = cOm8_;
    }

    @Override
    public final void run() {
        TaskCallbackNp2 np_22 = this;
        np_22.AT.Ib.Ll(true);
        np_22.AT.Dy.Ll(false);
    }
}

