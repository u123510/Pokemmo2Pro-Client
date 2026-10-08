package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackWj0 implements Runnable  {
    public final /* synthetic */ lpt2__5 kG;
    public final /* synthetic */ byte fQ;
    public final /* synthetic */ HX Cu0;

    public TaskCallbackWj0(HX owner, lpt2__5 entry, byte index) {
        this.Cu0 = owner;
        this.kG = entry;
        this.fQ = index;
    }

    @Override
    public final void run() {
        HX owner = this.Cu0;
        lpt2__5 entry = this.kG;
        owner.d2 = entry;
        owner.QE = this.fQ;

        if (entry.lq0 != null) {
            owner.Pt0.Sk(entry.lq0.Ay(false));
        } else if (entry.h5 != null) {
            owner.Pt0.Sk(entry.h5.FL0());
        } else {
            mc0_1 item = entry.XH0;
            owner.Pt0.Sk(item == null ? "" : sm0_0.c0(item.Nl));
        }

        owner.Cb0.Sk(entry.i60());
        String quantity = new StringBuilder()
                .append(entry.oF0())
                .append("")
                .toString();
        owner.K10.Sk(sm0_0.wa0(1940, quantity));
        owner.Pv.Sk(sm0_0.wa0(1940, quantity));

        mc0_1 item = entry.XH0;
        if (entry.lq0 == null && entry.h5 == null && item != null && item.Iq != null) {
            owner.B9.SU(sm0_0.c0(3006));
        } else {
            owner.B9.SU(sm0_0.c0(56));
        }

        if (owner.d2 != null) {
            owner.B9.pw0(true);
        } else {
            owner.B9.pw0(false);
        }
    }
}
