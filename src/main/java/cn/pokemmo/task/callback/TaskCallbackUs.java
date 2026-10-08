/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.ga0_1;
import f.mi_0;
import f.qu_2;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class TaskCallbackUs
implements Runnable  {
    public final /* synthetic */ qu_2 public$;

    public TaskCallbackUs(qu_2 qu_22) {
        this.public$ = qu_22;
    }

    @Override
    public final void run() {
        qu_2 qu_22 = this.public$;
        qu_22.T10.Gv("");
        qu_22.SH0.Gv("");
        qu_22.v10.Gv("");
        qu_22.qq0.case$(0);
        ga0_1[] ga0_1Array = qu_22.gT;
        int n = qu_22.gT.length;
        for (int j = 0; j < n; ++j) {
            ga0_1Array[j].UR(null);
        }
        mi_0[] mi_0Array2 = qu_22.au;
        int n2 = qu_22.au.length;
        for (n = 0; n < n2; ++n) {
            mi_0Array2[n].Db(null);
        }
    }
}
