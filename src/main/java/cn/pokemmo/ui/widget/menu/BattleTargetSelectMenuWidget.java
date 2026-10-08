package cn.pokemmo.ui.widget.menu;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.menu.BasePopupMenuWidget;

public class BattleTargetSelectMenuWidget extends BasePopupMenuWidget {
    public static final int[][] TK = {
            { 0, 288, 3, 22 },
            { 0, 289, 3, 26 },
            { 0, 290, 3, 28 },
            { 0, 291, 3, 30 },
            { 0, 292, 3, 32 },
            { 0, 293, 3, 34 },
            { 0, 294, 3, 37 },
            { 0, 295, 3, 38 },
            { 0, 296, 3, 39 },
            { 0, 297, 3, 42 },
            { 0, 298, 3, 43 },
            { 0, 299, 1, 0 },
            { 0, 300, 3, 46 },
            { 0, 301, 1, 101 },
            { 0, 302, 3, 47 },
            { 0, 303, 3, 49 },
            { 0, 304, 1, 109 },
            { 0, 305, 3, 57 },
            { 0, 306, 3, 61 },
            { 0, 307, 3, 58 },
            { 0, 308, 3, 65 },
            { 4, 407, 30, -1 },
            { 4, 408, 31, -1 },
            { 4, 409, 34, -1 },
            { 4, 410, 35, -1 },
            { 4, 411, 36, -1 },
            { 4, 412, 38, -1 },
            { 4, 413, 39, -1 },
            { 4, 414, 42, -1 },
            { 4, 415, 95, -1 },
            { 4, 416, 151, -1 },
            { 4, 417, 152, -1 },
            { 4, 418, 44, -1 },
            { 4, 419, 46, -1 },
            { 4, 420, 47, -1 },
            { 4, 421, 48, -1 },
            { 4, 422, 113, -1 },
            { 4, 423, 117, -1 },
            { 4, 424, 280, -1 },
            { 4, 425, 96, -1 },
            { 4, 426, 88, -1 },
            { 4, 427, 272, -1 },
            { 1, 315, 50, 19 },
            { 1, 316, 50, 20 },
            { 1, 317, 50, 22 },
            { 1, 318, 50, 24 },
            { 1, 319, 50, 25 },
            { 1, 320, 50, 26 },
            { 1, 321, 50, 29 },
            { 1, 322, 50, 30 },
            { 1, 323, 50, 31 },
            { 1, 324, 50, 32 },
            { 1, 325, 50, 34 },
            { 1, 326, 50, 35 },
            { 1, 327, 50, 38 },
            { 1, 328, 50, 39 },
            { 1, 329, 50, 41 },
            { 1, 330, 50, 42 },
            { 1, 331, 50, 49 },
            { 1, 332, 74, 11 },
            { 1, 333, 74, 12 },
            { 1, 334, 74, 13 },
            { 1, 335, 74, 22 },
            { 1, 336, 74, 78 },
            { 3, 342, 353, -1 },
            { 3, 343, 354, -1 },
            { 3, 344, 356, -1 },
            { 3, 345, 363, -1 },
            { 3, 346, 371, -1 },
            { 3, 347, 383, -1 },
            { 3, 348, 388, -1 },
            { 3, 349, 392, -1 },
            { 3, 350, 468, -1 },
            { 3, 351, 399, -1 },
            { 3, 352, 400, -1 },
            { 3, 353, 469, -1 },
            { 3, 354, 471, -1 },
            { 3, 355, 312, -1 },
            { 3, 356, 256, -1 },
            { 3, 357, 203, -1 },
            { 3, 358, 315, -1 },
            { 3, 359, 288, -1 },
            { 3, 360, 318, -1 },
            { 3, 361, 220, -1 },
            { 3, 362, 267, -1 },
            { 3, 363, 262, -1 },
            { 2, 369, 321, -1 },
            { 2, 370, 326, -1 },
            { 2, 371, 329, -1 },
            { 2, 372, 331, -1 },
            { 2, 373, 348, -1 },
            { 2, 374, 362, -1 },
            { 2, 375, 365, -1 },
            { 2, 376, 370, -1 },
            { 2, 377, 374, -1 },
            { 2, 378, 378, -1 },
            { 2, 379, 387, -1 },
            { 2, 380, 152, -1 },
            { 2, 381, 155, -1 },
            { 2, 382, 158, -1 },
            { 2, 383, 385, -1 },
            { 2, 384, 342, -1 },
            { 2, 385, 238, -1 },
            { 2, 386, 199, -1 },
            { 2, 387, 346, -1 },
            { 2, 388, 206, -1 },
            { 2, 389, 376, -1 },
            { 2, 390, 232, -1 }
    };

    public final ae0_1 rT;
    public final cn_0 SX;
    public final qj_2 Bf;
    public final in_2 hf;

    public BattleTargetSelectMenuWidget() {
        super();
        this.hf = new in_2(100);
        uf("event-tracker");
        tk0_0 v1 = new tk0_0();
        ae0_1 v2 = new ae0_1();
        this.rT = v2;
        cn_0 v3 = new cn_0(sm0_0.wa0(16800212, "20"));
        this.SX = v3;
        v3.Oq0(false);
        v3.fn0();
        v1.gg0.vx0(v2).Yt();
        v1.gg0.Rg();
        v1.gg0.vx0(v3).ru();

        qj_2 qj = new qj_2();
        this.Bf = qj;
        qj.sl().Nk(QI.KH0().kN((byte) 10, 294, false).z4());
        qj.sl().dA(2.0f);
        qj.sl().Gy0(-12, -17);
        qj.uf("button");
        qj.RR(this::G);

        this.gg0.vx0(qj).Ha().Xs(5.0f);
        this.gg0.vx0(v1).Xs(5.0f);

        this.rT.uf("event-progressbar-halloween");
        this.rT.aE(0.0f);
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        int i2 = v1.zu;
        if (E00.C10(i2)) {
            if (i2 == 5) {
                G();
            }
            return true;
        }
        return super.nd0(v1);
    }

    public final void AK0(byte b) {
        if (!this.hf.ty0()) {
            return;
        }
        cq0_0 v2 = tw0_0.rl.oY;
        int i3;
        switch (b) {
            case 0:
                i3 = 288;
                break;
            case 1:
                i3 = 315;
                break;
            case 2:
                i3 = 369;
                break;
            case 3:
                i3 = 342;
                break;
            case 4:
                i3 = 407;
                break;
            default:
                i3 = 0;
                break;
        }
        int i4;
        switch (b) {
            case 0:
            case 4:
                i4 = 21;
                break;
            case 1:
            case 2:
            case 3:
                i4 = 22;
                break;
            default:
                i4 = 0;
                break;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            short s = (short) (i3 + i6);
            v2.getClass();
            cq0_0.w0(s);
            if (v2.lY.kp(s)) {
                i5++;
            }
        }
        int i1;
        switch (b) {
            case 0:
            case 4:
                i1 = 21;
                break;
            case 1:
            case 2:
            case 3:
                i1 = 22;
                break;
            default:
                i1 = 0;
                break;
        }
        this.rT.aE((float) i5 / (float) i1);
        this.SX.Sk(sm0_0.wa0(16800212, "" + (i1 - i5)));
        Ll(i5 > 0);
    }

    public final void G() {
        BU bu = BU.T50;
        byte b = tw0_0.e60.Com4;
        cq0_0 v4 = tw0_0.rl.oY;
        tk0_0 v5 = new tk0_0(new A40());
        v5.gg0.FU.Wa0();
        v5.gg0.FU.sn0 = new vl0_0(100.0f);
        v5.gg0.FU.goto$();

        A40 v6 = v5.gg0;
        S70 v7 = new S70(36, 36, 0);
        v7.og.Nk(new Wr[]{QI.Py.kN((byte) 10, 294, false).z4()[0]});
        v7.og.EJ0 = 2.0f;
        v7.og.gY = -16;
        v7.og.a4 = -12;

        tk0_0 tk2 = new tk0_0(new A40());
        tk2.gg0.FU.Wa0();
        String str = this.SX.j50.toString();
        cn_0 v9 = new cn_0(null, 0);
        v9.Sk(str.substring(1, str.length() - 1));
        v9.uf("label-lalign");
        tk2.gg0.vx0(v7).Rr0.vx0(v9).goto$();

        j1_0 cell = v6.vx0(tk2);
        cell.sn0 = new vl0_0(260.0f);
        cell.Wa0();
        cell.d80 = 2;
        cell.ck0 = new vl0_0(8.0f);
        v6.Rg();

        int i7 = 0;
        int[][] tk = TK;
        for (int i10 = 0; i10 < 108; i10++) {
            int[] entry = tk[i10];
            if (entry[0] == b) {
                String name = "";
                switch (b) {
                    case 0:
                    case 1:
                        ZT zt = Z0.rb.wz((byte) entry[3], (short) entry[2]);
                        if (zt != null) {
                            name = zt.Nw0();
                        }
                        break;
                    case 2:
                    case 3:
                    case 4:
                        short s = (short) entry[2];
                        Z0 z0 = Z0.rb;
                        Z50 z50 = null;
                        if (s >= 0 && b < z0.h4.length && z0.h4[b] != null) {
                            z50 = z0.h4[b].Sx0[s];
                        }
                        if (z50 != null) {
                            name = z50.getName();
                        }
                        break;
                }
                short s11 = (short) entry[1];
                v4.getClass();
                cq0_0.w0(s11);
                boolean found = v4.lY.kp(s11);
                if (!found) {
                    name = "?????";
                }
                cn_0 label = new cn_0(null, 0);
                label.Sk("- " + name);
                j1_0 cell2 = v6.vx0(label);
                cell2.mA = 1;
                label.uf("label-lalign");
                i7++;
                if (i7 % 2 == 0) {
                    v6.Rg();
                }
            }
        }
        v6.qf(8.0f);
        lpt3__4 dialog = new lpt3__4(v5, this::ct0, null, xX.jZ);
        bu.SL(dialog);
    }

    public final void ct0() {
        this.Bf.ER.Ge0(false);
    }
}
