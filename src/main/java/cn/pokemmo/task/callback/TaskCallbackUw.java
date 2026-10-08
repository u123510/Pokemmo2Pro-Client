/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.M30;
import f.jr_0;
import f.ne_2;
import f.ni0_2;

public class TaskCallbackUw
implements ne_2,
Runnable  {
    public final /* synthetic */ ni0_2 qK0;

    public TaskCallbackUw(ni0_2 ni0_22) {
        this.qK0 = ni0_22;
    }

    public TaskCallbackUw(ni0_2 ni0_22, int n) {
        this(ni0_22);
    }

    @Override
    public final void zi(int n, int n2) {
        ni0_2 ni0_22 = this.qK0;
        int n3 = n2 - n + 1;
        int n4 = ni0_22.zJ;
        ni0_22.zJ = n4 + n3;
        int n5 = ni0_22.xK0;
        if (n5 >= n && n4 >= ni0_22.Dn0.length) {
            ni0_22.wu(n5 += n3);
        }
        if ((n4 = ni0_22.Mw0) >= n) {
            n3 = n4 + n3;
            jr_0 jr_02 = jr_0.sX;
            ni0_22.RK0(n3, false, jr_02);
        }
        if (n <= ni0_22.xK0 + ni0_22.Dn0.length - 1 && n2 >= n5) {
            ni0_22.Se = true;
        }
    }

    @Override
    public final void Oy(int n, int n2) {
        ni0_2 ni0_22 = this.qK0;
        int n3 = n2 - n + 1;
        ni0_22.zJ -= n3;
        int n4 = ni0_22.xK0;
        int n5 = n4 + ni0_22.Dn0.length - 1;
        if (n4 > n2) {
            ni0_22.wu(n4 - n3);
        } else if (n4 <= n2 && n5 >= n) {
            ni0_22.wu(n);
        }
        n4 = ni0_22.Mw0;
        if (n4 > n2) {
            int n6 = n4 - n3;
            jr_0 jr_02 = jr_0.sX;
            ni0_22.RK0(n6, false, jr_02);
        } else if (n4 >= n && n4 <= n2) {
            ni0_22.RK0(-1, false, jr_0.sX);
        }
    }

    @Override
    public final void wn0() {
        ni0_2 ni0_22 = this.qK0;
        M30 m30 = ni0_22.KB;
        int n = m30 != null ? m30.ul0() : 0;
        ni0_22.zJ = n;
        ni0_22.RK0(-1, false, jr_0.sX);
        ni0_22.wu(0);
        ni0_22.Se = true;
    }

    @Override
    public final void run() {
        ni0_2 ni0_22 = this.qK0;
        ni0_22.wu(ni0_22.Gn0.VP * ni0_22.n7);
    }

}

