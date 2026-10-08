/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.Kq0;
import f.Tv;
import f.bb0_2;
import f.dp0;
import f.gt_0;
import f.wn0_0;

/*
 * Renamed from f.lK
 */
public class TaskCallbackLk0
implements Runnable,
bb0_2,
gt_0  {
    public boolean qc;
    public final /* synthetic */ Kq0 yw0;

    public TaskCallbackLk0(Kq0 kq0) {
        this.yw0 = kq0;
    }

    @Override
    public final void run() {
        this.yw0.T7();
    }

    @Override
    public final void oj() {
        this.qc = true;
        this.yw0.br();
    }

    @Override
    public final void Rw(int n, int n2) {
        if (this.qc) {
            this.yw0.qL0(n);
        }
    }

    @Override
    public final void zR() {
        this.qc = false;
        this.yw0.getClass();
    }

    @Override
    public final void ks0(int n) {
        Kq0 kq0 = this.yw0;
        kq0.getClass();
        n = dp0.r9(n);
        if (n != 66) {
            if (n != 111) {
                Tv tv = kq0.Ly0;
                tv.bj(kq0.XF0(((wn0_0)tv.dI0).YA.toString()));
            } else {
                kq0.sS();
            }
        } else {
            Kq0 kq02 = kq0;
            kq02.AZ(((wn0_0)kq02.Ly0.dI0).YA.toString());
            kq02.lA.Ll(true);
            kq02.Ly0.Ll(false);
        }
    }
}

