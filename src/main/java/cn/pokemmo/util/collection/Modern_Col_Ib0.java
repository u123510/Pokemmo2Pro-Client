package cn.pokemmo.util.collection;

import f.*;
import java.util.HashMap;

/**
 * 现代化重构类 - 原始混淆类: f.ib_0
 */
public class Modern_Col_Ib0 {

    public final gl_2 Gj0;
    public final HashMap oS;

    public Modern_Col_Ib0(gl_2 gl_22, ys_0 ... ys_0Array) {
        this.oS = new HashMap();
        this.Gj0 = gl_22;
        int n = ys_0Array.length;
        for (int j = 0; j < n; ++j) {
            this.sI(ys_0Array[j]);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void sI(ys_0 ys_02) {
        MV mV2 = new MV(ys_02);
        HashMap hashMap = this.oS;
        synchronized (hashMap) {
            this.oS.put(ys_02.ug0, mV2);
            return;
        }
    }
}

