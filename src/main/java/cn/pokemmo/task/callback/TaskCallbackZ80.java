package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackZ80 extends ee_1 implements Runnable  {
    public final TJ0 WM;
    public final int Vg;
    public final EP jj0;

    public TaskCallbackZ80(EP ep, TJ0 tj0, int i) {
        super(ep);
        this.jj0 = ep;
        this.WM = tj0;
        this.Vg = i;
        RR(this);
    }

    @Override
    public final String Ck() {
        return "submenubtn";
    }

    @Override
    public final void run() {
        this.WM.M10(this.Vg, this.jj0, this, true);
    }
}
