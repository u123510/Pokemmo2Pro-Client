/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.BR;
import f.Kw0;
import f.P30;
import f.av_1;
import f.lpt2__0;
import f.tw0_0;

public class TaskCallbackOk0
implements Runnable  {
    public final /* synthetic */ av_1 wx;
    public final /* synthetic */ P30 cF0;

    public TaskCallbackOk0(P30 p30, av_1 av_12) {
        this.cF0 = p30;
        this.wx = av_12;
    }

    @Override
    public final void run() {
        int n;
        if (this.wx.com2 && (this.cF0.jg0.ER.U20() || this.cF0.Ce0.ER.U20())) {
            this.cF0.kr0.Ll(true);
            n = 0;
            while (true) {
                Kw0[] kw0Array = this.cF0.UZ;
                if (n < this.cF0.UZ.length) {
                    kw0Array[n].Ll(true);
                    n = (byte)(n + 1);
                    continue;
                }
                break;
            }
        } else {
            this.cF0.kr0.Ll(false);
            n = 0;
            while (true) {
                Kw0[] kw0Array = this.cF0.UZ;
                if (n >= this.cF0.UZ.length) break;
                kw0Array[n].Ll(false);
                n = (byte)(n + 1);
            }
        }
        BR bR = tw0_0.rl;
        TaskCallbackOk0 oK0 = this;
        byte by = oK0.wx.NR;
        n = oK0.cF0.Ce0.ER.U20() ? 1 : 0;
        bR.Mr.Y6(by, n);
        lpt2__0.pW(bR.Mr);
    }
}

