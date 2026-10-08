package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackKw1 implements Runnable  {
    public final /* synthetic */ HV Ew0;
    public final /* synthetic */ X90 cK;
    public final /* synthetic */ l80_0 S0;

    public TaskCallbackKw1(l80_0 owner, HV value, X90 type) {
        this.S0 = owner;
        this.Ew0 = value;
        this.cK = type;
    }

    @Override
    public final void run() {
        if (tw0_0.rl.Cl.coN < this.Ew0.yx0) {
            String title = sm0_0.c0(3011);
            String message = sm0_0.c0(3012);
            String cancel = sm0_0.c0(nf0_0.Bq0);
            Qy0.yI0.sr0(new lpt3__4(title, message, cancel, new an0(), null));
            return;
        }
        String[] args = new String[2];
        StringBuilder name = new StringBuilder(this.Ew0.wG0());
        String suffix;
        if (this.cK.yt()) {
            suffix = new StringBuilder(" (")
                .append(sm0_0.c0(this.S0.Lpt3.QA0[this.Ew0.Hc0().SG.iL]))
                .append(')')
                .toString();
        } else {
            suffix = "";
        }
        args[0] = name.append(suffix).toString();
        args[1] = fp0_0.uD(new StringBuilder(), this.Ew0.yx0, "");
        String prompt = sm0_0.Bx(3009, args);
        Qy0.yI0.sr0(new lpt3__4(prompt, new ml0_1((kw_1) this), null));
    }
}
