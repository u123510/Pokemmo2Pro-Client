/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.LPt2_;
import f.Qy0;

public class TaskCallbackSm
implements Runnable  {
    @Override
    public final void run() {
        Object object = Qy0.yI0;
        if (object == null) {
            return;
        }
        object = ((Qy0)object).G30;
        if (object != null) {
            ((LPt2_)object).M3();
        }
    }
}

