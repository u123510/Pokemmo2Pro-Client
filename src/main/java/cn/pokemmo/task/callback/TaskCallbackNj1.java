package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackNj1 implements Runnable  {
    public final Ju0 mH0;
    public final om_1[] ef0;

    public TaskCallbackNj1(Ju0 var1, om_1[] var2) {
        this.mH0 = var1;
        this.ef0 = var2;
    }

    @Override
    public final void run() {
        for (om_1 var4 : this.ef0) {
            P1 var5 = this.mH0.Cs;
            CH0 var6 = var4.tZ;
            String var7 = var4.i60;
            int var8 = var4.yK;
            String var9 = var4.JG0;
            th_0 var10 = new th_0();
            var10.xF = var6;
            var10.UG = var7;
            var10.Bx = var8;
            var10.ge0 = var9;
            lg_0.k.lPT5(new zr_0(var5, var10));
        }
    }
}
