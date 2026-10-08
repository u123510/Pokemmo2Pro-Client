/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.nq_1;

/*
 * Renamed from f.kp
 */
public class TaskCallbackKp2
implements Runnable  {
    public final /* synthetic */ nq_1 sk;

    public TaskCallbackKp2(nq_1 nq_12) {
        this.sk = nq_12;
    }

    @Override
    public final void run() {
        this.sk.Yi0(false, true);
    }
}

