package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackHe02 implements Runnable  {
    public final zv_2 Su0;
    public final byte sz;
    public final bi0_1 Ok0;
    public final j5_0 UX;

    public TaskCallbackHe02(j5_0 source, zv_2 value, byte mode, bi0_1 target) {
        this.UX = source;
        this.Su0 = value;
        this.sz = mode;
        this.Ok0 = target;
    }

    @Override
    public final void run() {
        BR battle = tw0_0.rl;
        battle.fk0.uQ(new bw0_0(this.Su0, false, false));
        if (this.UX.ZN == 0 && this.sz == 1 && battle.yh0.Ny((byte) 2, (short) 1526)) {
            this.Ok0.ba0.PX(false, (short) 15, (short) 7, (byte) 0, this.sz);
            this.Ok0.rd.ba0.PX(false, (short) 15, (short) 8, (byte) 0, this.sz);
        } else {
            short x = gf_1.Ww[this.UX.ZN][this.sz][0];
            short y = gf_1.Ww[this.UX.ZN][this.sz][1];
            this.Ok0.ba0.PX(false, x, y, (byte) 0, this.sz);
            this.Ok0.rd.ba0.PX(false, x, y, (byte) 0, this.sz);
        }
        this.Ok0.rd.il0.p6(this.Ok0.ba0);
        this.Ok0.il0.f60(null, false, C8.Zero);
        this.Ok0.il0.LE(nk_0.cC);
    }
}
