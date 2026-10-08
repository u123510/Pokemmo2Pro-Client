/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.C8;
import f.cr0_0;

public class TaskCallbackGoto
implements Runnable  {
    public final /* synthetic */ byte bx;
    public final /* synthetic */ C8 TC0;
    public final /* synthetic */ int Xt0;
    public final /* synthetic */ boolean Hw0;
    public final /* synthetic */ boolean zF;
    public final /* synthetic */ boolean dg;
    public final /* synthetic */ cr0_0 mL0;

    public TaskCallbackGoto(cr0_0 cr0_02, byte by, C8 c8, int n, boolean bl, boolean bl2, boolean bl3) {
        this.mL0 = cr0_02;
        this.bx = by;
        this.TC0 = c8;
        this.Xt0 = n;
        this.Hw0 = bl;
        this.zF = bl2;
        this.dg = bl3;
    }

    @Override
    public final void run() {
        TaskCallbackGoto goto_ = this;
        byte by = goto_.bx;
        C8 c8 = goto_.TC0;
        int n = goto_.Xt0;
        boolean bl = goto_.Hw0;
        boolean bl2 = goto_.zF;
        boolean bl3 = goto_.dg;
        this.mL0.o7(by, c8, n, bl, bl2, bl3);
    }
}

