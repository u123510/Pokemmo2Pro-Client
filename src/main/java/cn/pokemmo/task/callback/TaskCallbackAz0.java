/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  f.KJ
 *  f.Qy0
 *  f.e70_0
 *  f.le0_2
 *  f.lpt3__4
 *  f.sm0_0
 *  f.vl_0
 */
package cn.pokemmo.task.callback;

import f.*;

import f.KJ;
import f.Qy0;
import f.e70_0;
import f.le0_2;
import f.lpt3__4;
import f.sm0_0;
import f.vl_0;

public class TaskCallbackAz0
implements Runnable  {
    public final /* synthetic */ e70_0 new$;
    public final /* synthetic */ vl_0 pI0;

    public TaskCallbackAz0(vl_0 vl_02, e70_0 e70_02) {
        this.pI0 = vl_02;
        this.new$ = e70_02;
    }

    @Override
    public final void run() {
        vl_0 vl_02 = this.pI0;
        e70_0 e70_02 = this.new$;
        vl_02.getClass();
        Qy0.yI0.sr0(new lpt3__4(sm0_0.wa0((int)1664, (String)e70_02.zJ0), (Runnable)new KJ(e70_02), (le0_2)vl_02));
    }
}
