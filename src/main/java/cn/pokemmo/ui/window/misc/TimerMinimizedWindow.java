package cn.pokemmo.ui.window.misc;

import f.*;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

/**
 * 倒计时最小化悬浮窗
 *
 * 原混淆类: f.ju_2
 */
public class TimerMinimizedWindow extends nx_2 {
    public final ju_2 asBridge() {
        return (ju_2) (Object) this;
    }

    public TimerMinimizedWindow() {
        super("shared-minimized");
        ff0(1);
        Hy("");
        this.Ia = new fy_2();
        if (tw0_0.kz0()) {
            qj_2 qj_22 = new qj_2("", 280, 60);
            this.w20 = qj_22;
            qj_22.sl().Gy0(4, 5);
            this.w20.sl().nq0(48, 48);
        } else {
            qj_2 qj_23 = new qj_2("", 200, 30);
            this.w20 = qj_23;
            qj_23.sl().Gy0(4, 3);
            this.w20.sl().nq0(24, 24);
        }
        this.w20.sl().C80(25);
        this.w20.RR(ju_2::jH);
        this.w20.sl().Nk(new Wr[]{zr_2.am0((short) 5499)});
        this.w20.sl().u8(true);
        this.Hn0.SL(this.w20);
        SL(this.Hn0);
        this.Hn0.Ll(true);
    }

    public static void jH() {
        k80_0 k80_02 = k80_0.At;
        xy0_0 xy0_02 = BU.T50.Nr;
        if (xy0_02 != null && xy0_02.gb == k80_02) {
            BU.T50.gZ();
            return;
        }
        tw0_0.rl.fk0.uQ(new q7_0(k80_02));
    }

    @Override
    public final void HP(zk0_1 zk0_12) {
        vh0_0 vh0_02 = tw0_0.rl.Eo0;
        if (vh0_02 == null) {
            return;
        }
        if (Instant.now().isBefore(vh0_02.Dr)) {
            int n = (int) Instant.now().until(vh0_02.Dr, ChronoUnit.SECONDS);
            int n2 = n / 60;
            int n3 = n % 60;
            this.w20.SU(sm0_0.wa0(7962, String.format("%d:%02d", n2, n3)));
        } else if (Instant.now().isBefore(vh0_02.pT)) {
            int n4 = (int) Instant.now().until(vh0_02.pT, ChronoUnit.SECONDS);
            int n5 = n4 / 60;
            int n6 = n4 % 60;
            this.w20.SU(sm0_0.wa0(7963, String.format("%d:%02d", n5, n6)));
        }
        super.HP(zk0_12);
    }

    @Override
    public final void K8() {
        lt0();
        this.Hn0.lt0();
        super.K8();
    }
}
