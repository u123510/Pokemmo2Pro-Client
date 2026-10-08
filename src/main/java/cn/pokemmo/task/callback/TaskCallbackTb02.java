/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.GH;
import f.P40;
import f.ns_1;
import f.td_2;
import f.tw0_0;

/*
 * Renamed from f.tb0
 */
public class TaskCallbackTb02
implements Runnable  {
    public final /* synthetic */ ns_1 Nj;

    public TaskCallbackTb02(ns_1 ns_12) {
        this.Nj = ns_12;
    }

    @Override
    public final void run() {
        int n;
        ns_1 runnable = this.Nj;
        runnable.getClass();
        P40[] p40Array = tw0_0.lM.ly(runnable.Ve);
        int n2 = p40Array.length;
        int n3 = 0;
        do {
            n = n2 > 250 ? 250 : n2;
            td_2 td_23 = new td_2(p40Array, n3, n);
            ((GH)runnable).je(td_23);
            n3 += n;
        } while ((n2 -= n) > 0);
    }
}
