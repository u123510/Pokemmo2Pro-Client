/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

/*
 * Renamed from f.sB0
 */
public class TaskCallbackSb01
implements Runnable  {
    public final /* synthetic */ byte i70;
    public final /* synthetic */ C8 y90;
    public final /* synthetic */ int t3;
    public final /* synthetic */ boolean dl;
    public final /* synthetic */ boolean Xp0;
    public final /* synthetic */ boolean hG0;
    public final /* synthetic */ F30 ll;

    public TaskCallbackSb01(F30 f30, byte by, C8 c8, int n, boolean bl, boolean bl2, boolean bl3) {
        this.ll = f30;
        this.i70 = by;
        this.y90 = c8;
        this.t3 = n;
        this.dl = bl;
        this.Xp0 = bl2;
        this.hG0 = bl3;
    }

    @Override
    public final void run() {
        TaskCallbackSb01 sb0_12 = this;
        byte by = sb0_12.i70;
        C8 c8 = sb0_12.y90;
        int n = sb0_12.t3;
        boolean bl = sb0_12.dl;
        boolean bl2 = sb0_12.Xp0;
        boolean bl3 = sb0_12.hG0;
        this.ll.o7(by, c8, n, bl, bl2, bl3);
    }
}

