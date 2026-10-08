package cn.pokemmo.battle;

import f.*;
import java.text.NumberFormat;

/**
 * 现代化重构类 - 原始混淆类: f.JF0
 */
public class Modern_Battle_Jf0
implements uw_0 {

    public final /* synthetic */ String ZX;
    public final /* synthetic */ K90 Cq0;

    public Modern_Battle_Jf0(String string, K90 k90) {
        this.ZX = string;
        this.Cq0 = k90;
    }

    public static void F6(K90 k90, int n) {
        tw0_0.rl.fk0.uQ(new vc_1(k90.RR, (short)n));
    }

    public final void Q(int n) {
        if (n > 1) {
            String string = sm0_0.Bx(8039, new String[]{Integer.toString(n), this.ZX, "$" + NumberFormat.getInstance().format((long)this.Cq0.mx0 * (long)n)});
            Qy0.yI0.sr0(new lpt3__4(string, () -> JF0.F6(this.Cq0, n), null));
        } else {
            JF0.F6(this.Cq0, n);
        }
    }

    public final void run() {
    }
}

