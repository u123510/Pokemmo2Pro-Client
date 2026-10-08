package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackOj00 implements Runnable  {
    public final Uo v50;

    public TaskCallbackOj00(Uo uo) {
        this.v50 = uo;
    }

    @Override
    public final void run() {
        Uo uo = this.v50;
        if (uo.M5 == null) {
            return;
        }
        short count = (short) uo.ze.eB0;
        if (uo.Px0.Bb() == 0) {
            Uo uo2 = this.v50;
            lpt2__5 item = uo2.M5;
            mc0_1 mc = item.XH0;
            if (mc != null && mc.Iq != null) {
                ez_1 ez = new ez_1(this.v50.M5);
                if (uo2.iW == null) {
                    uo2.iW = ez;
                    uo2.F9(uo2.fU(), ez);
                }
                return;
            }
            cr_0 sp = item.sp;
            if (sp == cr_0.Xz0) {
                for (Object obj : item.Na0) {
                    E5 e5 = (E5) obj;
                    int total = e5.Io * count;
                    short sTotal = (short) total;
                    if ((long) total != (long) sTotal) {
                        tw0_0.rl.qK(sm0_0.c0(this.v50.M5.sp.nn));
                        return;
                    }
                    if (!tw0_0.rl.Bb(tw0_0.rl.u40).Dj0((byte) -1, e5.OW, sTotal)) {
                        tw0_0.rl.qK(sm0_0.c0(this.v50.M5.sp.nn));
                        return;
                    }
                }
            } else if (Uo.QG0(sp) < item.oF0() * count) {
                tw0_0.rl.qK(sm0_0.c0(this.v50.M5.sp.nn));
                return;
            }
            if (count <= 99
                    && pro.pokemmo2.shop.service.ShopClient.onNativeBuy(this.v50, count)) {
                return;
            }
            if (count > 99) {
                String msg = sm0_0.Bx(1938, new String[]{String.valueOf((int) count), this.v50.M5.JJ0()});
                Qy0.yI0.sr0(new lpt3__4(msg, () -> Fr(count), this.v50.Sv));
            } else {
                short itemFe = this.v50.M5.FE();
                tw0_0.rl.fk0.uQ(new px0_0((byte) 0, itemFe, count));
            }
            this.v50.ze.case$(1);
        } else {
            if (pro.pokemmo2.shop.service.ShopClient.onNativeSell(uo, count)) {
                return;
            }
            CH0 uq = this.v50.M5.uq();
            tw0_0.rl.fk0.uQ(new wk_0(uq, count));
            this.v50.Sv.f00();
            this.v50.pC0((lpt2__5) null);
        }
    }

    public final void Fr(short count) {
        if (pro.pokemmo2.shop.service.ShopClient.onNativeBuy(this.v50, count)) {
            return;
        }
        short itemFe = this.v50.M5.FE();
        tw0_0.rl.fk0.uQ(new px0_0((byte) 0, itemFe, count));
    }
}
