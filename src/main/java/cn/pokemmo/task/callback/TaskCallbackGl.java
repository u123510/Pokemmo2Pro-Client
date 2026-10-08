package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackGl implements Runnable  {
    public final eg0_0 FJ0;

    public TaskCallbackGl(eg0_0 value) {
        this.FJ0 = value;
    }

    @Override
    public final void run() {
        eg0_0 value = this.FJ0;
        value.og0.Ue0(value.SA.EK0);
        value.og0.sj0(value.SA.Jj0, true);
        value.YM = new Ou0[3];
        for (int i = 0; i < 3; i++) {
            value.YM[i] = value.SA.lK[i].Ma0();
        }
        value.YM[0].ho.el0(-0.6875f, -0.0557476431f, 0.5f);
        value.YM[1].ho.el0(0.0f, -0.0540595576f, 0.96875f);
        value.YM[2].ho.el0(0.59375f, -0.0612190962f, 0.40625f);
        for (Ou0 item : value.YM) {
            value.og0.Ue0(item);
        }
        LPT6_ texture = new LPT6_(value.SA.Fl);
        value.Wr0 = new com3__3(texture.bz, texture.xZ, texture, false);
        value.Wr0.OF0(0.0132499998f);
        value.Wr0.j.y = 0.6050000191f;
        ao_1 first = ao_1.DX(value.Wr0, 2, 0.400000006f);
        first.h5[0] = value.Wr0.j.y + 0.0500000007f;
        pw_1.xC().TD0().y80(first);
        ao_1 second = ao_1.DX(value.Wr0, 2, 0.400000006f);
        second.h5[0] = value.Wr0.j.y;
        value.VE = (pw_1) pw_1.xC().TD0().y80(second).mz0()
                .Yu0(9999999, 0.0f).Ms(tw0_0.LD0.Ov);
        value.VK0 = 1;
        value.J7(1);
    }
}
