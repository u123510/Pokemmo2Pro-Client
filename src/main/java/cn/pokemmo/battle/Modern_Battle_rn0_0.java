package cn.pokemmo.battle;

import f.*;
import java.util.Locale;

/**
 * 现代化重构类 - 原始混淆类: f.rn0_0
 */
public class Modern_Battle_rn0_0 extends uk0_2 {

    public final long YA;
    public final jd_0 l60;
    public final in_2 iG;

    public Modern_Battle_rn0_0(og0_2 og0_2Var, short s) {
        this.iG = new in_2(500);
        uf("notification");
        tk0_0 tk0_0Var = new tk0_0();
        A40 a40 = tk0_0Var.gg0;
        this.YA = System.currentTimeMillis();
        jd_0 jd_0Var = new jd_0((rn0_0)this);
        this.l60 = jd_0Var;
        a40.vx0(jd_0Var).o(5.0f).ae0(Integer.valueOf(2)).ru().im0();
        S70 s70 = new S70(32, 32);
        a40.vx0(s70);
        String str = "";
        if (og0_2Var.TK0()) {
            str = sm0_0.wa0(6734, sm0_0.c0(s + 150000));
        } else {
            int i = lq_0.ao[og0_2Var.fS()];
            if (i == 1) {
                str = sm0_0.wa0(6731, sm0_0.c0(16777286));
            } else if (i == 2) {
                str = sm0_0.wa0(6731, tu_0.os.toString());
            } else if (i == 3) {
                str = sm0_0.wa0(6731, tu_0.I9.toString());
            }
        }
        a40.vx0(new Do0((rn0_0)this, str));
        s70.JH().Nk(new Wr[]{gh_1.Jh0().Kd0((short) 5016)});
        s70.JH().df();
        s70.JH().u8(true);
        tk0_0Var.Oq0(true);
        SL(tk0_0Var);
    }

    public static void eS() {
        tw0_0.rl.fk0.uQ(new Vb());
    }

    public static void jd() {
        Qy0.yI0.sr0(new lpt3__4(sm0_0.c0(6730), rn0_0::eS, (le0_2) null));
    }

    @Override
    public final void FW(zk0_1 zk0_1Var) {
        if (this.iG.ty0()) {
            int i = (int) ((System.currentTimeMillis() - this.YA) / 1000L);
            int i2 = i % 60;
            int i3 = i / 60;
            this.l60.Sk(String.format(Locale.ENGLISH, "%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    @Override
    public final boolean nd0(i70_0 i70_0Var) {
        if (E00.C10(i70_0Var.zu) && i70_0Var.nA0 == 0) {
            jd();
            return true;
        }
        return super.nd0(i70_0Var);
    }
}

