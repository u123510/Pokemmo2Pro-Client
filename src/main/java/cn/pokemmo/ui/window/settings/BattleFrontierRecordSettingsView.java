package cn.pokemmo.ui.window.settings;

import f.*;

public class BattleFrontierRecordSettingsView extends NUL_ {
    public BattleFrontierRecordSettingsView() {
    }

    public static void nU(String str, tk0_0 tk0_0Var) {
        cn_0 cn_0Var = new cn_0();
        cn_0Var.Sk(str);
        BU.T50.SL(new lpt3__4(cn_0Var, BattleFrontierRecordSettingsView::n7, tk0_0Var, xX.jZ));
    }

    public static void n7() {
    }

    @Override
    public final tk0_0 ff() {
        tk0_0 ff = super.ff();
        cq0_0 cq0_0Var = tw0_0.rl.oY;
        cq0_0Var.getClass();
        cq0_0.w0((short) 1043);
        short jA0 = cq0_0Var.lY.jA0((short) 1043);
        if (jA0 > 0) {
            int i = 0;
            int[] iArr = we_1.Um0;
            int i2 = 0;
            while (true) {
                if (i2 >= 29) {
                    break;
                }
                if (jA0 <= iArr[i2]) {
                    i = i2 + 16804225;
                    break;
                }
                i2++;
            }
            String wa0 = sm0_0.wa0(16804210, sm0_0.c0(i));
            js_2 js_2Var = new js_2(sm0_0.c0(150120));
            js_2Var.RR(() -> nU(wa0, ff));
            ff.gg0.Rg();
            tk0_0 tk0_0Var = new tk0_0(new A40());
            tk0_0Var.gg0.vx0(new le0_2(null, false)).Rr0.vx0(js_2Var).sn0 = new vl0_0(100.0f);
            tk0_0Var.gg0.vx0(new le0_2(null, false));
            j1_0 vx0 = ff.gg0.vx0(tk0_0Var);
            vx0.Yg = new vl0_0(10.0f);
            vx0.d80 = 2;
            vx0.mA = 1;
            ff.gg0.Rg();
            ff.gg0.qf(8.0f);
        }
        return ff;
    }

    @Override
    public final short DF0() {
        return 1044;
    }

    @Override
    public final short Y1() {
        return 10;
    }

    @Override
    public final int og0() {
        return 16804205;
    }

    @Override
    public final String xz0() {
        return "event-progressbar-xmas-hunt";
    }

    @Override
    public final String dL0(byte b, short s) {
        int i = 0;
        int[] iArr = we_1.Um0;
        int i2 = 0;
        while (true) {
            if (i2 >= 29) {
                break;
            }
            if (s <= iArr[i2]) {
                i = i2 + 16804225;
                break;
            }
            i2++;
        }
        return sm0_0.wa0(16804202, sm0_0.c0(i));
    }

    @Override
    public final short c40() {
        return 1045;
    }

    @Override
    public final short It0() {
        return 1502;
    }

    @Override
    public final int[][] YO() {
        return we_1.ns;
    }

    @Override
    public final int sa0() {
        return 50;
    }

    @Override
    public final void Xg0(Br0 br0) {
        short gu = (short) (rg0_0.gu((short) 121, false, true, 0) + 4095);
        Wr gs0 = tw0_0.Ll0.Qz0.AF(gu).gs0((byte) 0, 0);
        br0.Nk(new Wr[]{gs0});
        br0.gY = 2;
        br0.a4 = 0;
    }
}
