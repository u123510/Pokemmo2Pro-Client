package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackYx implements Runnable  {
    public final /* synthetic */ K7 hL0;

    public TaskCallbackYx(K7 v1) {
        this.hL0 = v1;
    }

    public final void run() {
        vo_2 sc = tw0_0.LD0.Sc;
        byte ff = this.hL0.FF;
        C8 c8 = new C8((float) this.hL0.XI0, 0.0f, (float) this.hL0.Kh).Fg0(0.25f);
        short zo = this.hL0.ZO;
        boolean mx = this.hL0.Mx0 == 1;
        sc.o7(ff, c8, zo, mx, false, false);
    }
}
