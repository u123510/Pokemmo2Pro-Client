/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.Au0;
import f.COm8_;
import f.Mz0;
import f.X90;
import f.ic0_1;
import f.jb0_1;
import f.ly_1;

/*
 * Renamed from f.rj
 */
public class TaskCallbackRj2
implements Runnable  {
    public final /* synthetic */ COm8_ fI;
    public final /* synthetic */ ly_1 kr;
    public final /* synthetic */ ic0_1 hn;

    public TaskCallbackRj2(ic0_1 ic0_12, COm8_ cOm8_, ly_1 ly_12) {
        this.hn = ic0_12;
        this.fI = cOm8_;
        this.kr = ly_12;
    }

    @Override
    public final void run() {
        COm8_ cOm8_ = this.fI;
        X90 x90 = this.hn.T90;
        if (cOm8_.COM1.s60((Object)x90.SG)) {
            cOm8_.COM1.remove((Object)x90.SG);
        }
        COm8_ cOm8_2 = cOm8_;
        jb0_1 jb0_12 = cOm8_2.COM1;
        jb0_12.Dc0(jb0_12.e5((Object)x90.SG), x90);
        X90 x902 = x90;
        short s = x902.ax;
        byte by = 0;
        cOm8_2.ip.qd(by, x902.SG, s);
        Au0 au0 = cOm8_2.uv0;
        jb0_1 jb0_13 = cOm8_.COM1;
        jb0_13.getClass();
        au0.cr = new Mz0(jb0_13);
        au0.lA();
        this.kr.Md0();
    }
}

