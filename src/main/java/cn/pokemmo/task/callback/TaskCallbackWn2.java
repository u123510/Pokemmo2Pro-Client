package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackWn2 implements Runnable  {
    public final /* synthetic */ ab_1 CE;

    public TaskCallbackWn2(ab_1 ab_12) {
        this.CE = ab_12;
    }

    public static /* synthetic */ void V0(R90 r90, lo0_0 lo0_02) {
        r90.em();
        lo0_02.AH0(null);
        r90.xe0();
    }

    @Override
    public final void run() {
        if (this.CE.Qt0.Nr0(tw0_0.e60.dj0, (short) 4)) {
            R90 r90 = new R90();
            r90.Hy(sm0_0.c0(2718));
            r90.uf("settings-frame");
            fy_2 fy_22 = new fy_2();
            fy_22.uf("changemotd");
            r90.F9(r90.fU(), fy_22);
            ab_1 ab_12 = this.CE;
            cg_0 cg_02 = ab_12.gm0;
            cg_02.gu = true;
            cg_02.BP = 500;
            cg_02.Gv(ab_12.Qt0.mn0.VB);
            lo0_0 lo0_02 = new lo0_0(this.CE.gm0);
            lo0_02.so();
            JK btnConfirm = new JK(54);
            btnConfirm.RR(() -> this.wB0(r90, lo0_02));
            JK btnCancel = new JK(nf0_0.Bq0);
            btnCancel.RR(() -> V0(r90, lo0_02));
            fy_22.x40(new I7(fy_22).Kn0(lo0_02).Ze0().X20(fy_22.hb(new le0_2[]{ btnConfirm, btnCancel })));
            fy_22.WQ(new Hm0(fy_22).Kn0(lo0_02).X20(new I7(fy_22).Ze0().LPt3(new le0_2[]{ btnConfirm, btnCancel }).Ze0()));
            this.CE.F9(this.CE.fU(), r90);
        }
    }

    public final void wB0(R90 r90, lo0_0 lo0_02) {
        r90.xe0();
        lo0_02.AH0(null);
        r90.xe0();
        String text = ((wn0_0) this.CE.gm0.dI0).YA.toString();
        tw0_0.rl.fk0.uQ(new wh0_1(text));
    }
}
