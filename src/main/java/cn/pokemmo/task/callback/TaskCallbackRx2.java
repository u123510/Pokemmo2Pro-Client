/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.Cq;
import f.ML0;
import f.Oz0;
import f.XA0;
import f.a10_0;
import f.b30_0;
import f.jn_0;
import f.oj_2;
import f.tw0_0;
import f.xe_1;
import java.util.AbstractCollection;

/*
 * Renamed from f.rx
 */
public class TaskCallbackRx2
implements Runnable  {
    public final /* synthetic */ a10_0 H9;
    public final /* synthetic */ ML0 VQ;

    public TaskCallbackRx2(ML0 mL0, a10_0 a10_02) {
        this.VQ = mL0;
        this.H9 = a10_02;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void run() {
        Object object = this.VQ;
        if (((ML0)object).f6) {
            return;
        }
        if (((ML0)object).BF0) {
            if (!((AbstractCollection)((ML0)object).yK).isEmpty()) {
                this.VQ.yK.pop();
                this.VQ.EE();
            }
            return;
        }
        object = tw0_0.LD0;
        if (object != null && (object = ((jn_0)object).he0) != null) {
            ((Oz0)object).ph();
        }
        object = this.VQ;
        if (((ML0)object).WU.eE && (object = ((ML0)object).xT) != null && ((b30_0)object).B6 > 0 && this.H9.gc0() >= 0) {
            object = this.H9;
            int n = ((a10_0)object).gc0();
            if (n >= 0) {
                oj_2[] oj_2Array = ((a10_0)object).zr;
                if (n < ((a10_0)object).zr.length) {
                    synchronized (oj_2Array) {
                        ((a10_0)object).zr[n] = null;
                    }
                }
            }
            this.VQ.xT = null;
            this.VQ.l60(this.H9.D0());
            object = this.H9;
            if (((a10_0)object).nf == Cq.Hs0) {
                if (((a10_0)object).Sv == XA0.af0) {
                    this.VQ.V6.Ll(true);
                } else {
                    ML0 mL0 = this.VQ;
                    object = mL0.V6;
                    b30_0 b30_02 = mL0.Ru;
                    boolean bl = b30_02 != null && b30_02.B6 != 1;
                    ((xe_1)object).Ll(bl);
                }
            }
            this.VQ.IE();
            return;
        }
        if (this.H9.nf == Cq.yH) {
            this.VQ.v80.Ll(false);
            this.VQ.Ru = b30_0.U5(this.H9.Ez0(), (byte)1);
        }
        this.VQ.zG();
        this.VQ.Be.Ll(false);
        this.VQ.TH0.Ll(false);
        this.VQ.Wq0.Ll(false);
        this.VQ.kX.Ll(false);
        this.VQ.ri0.Ll(false);
        this.VQ.ke();
        this.VQ.B7();
        this.VQ.H20.clear();
        object = this.VQ;
        xe_1[] xe_1Array = ((ML0)object).L1;
        int n = tw0_0.kz0() ? this.VQ.L1.length : this.VQ.L1.length / 2;
        ((ML0)object).Bl0(xe_1Array, n, false, true);
        this.VQ.IE();
    }
}

