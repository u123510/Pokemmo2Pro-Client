package cn.pokemmo.world.camera;

import f.*;

import java.util.HashMap;
import java.util.function.Function;

public class CameraOrthographicProjectionSettings extends bs0_0 {
    public final Function b90;
    public final ae0_1 CN;
    public final cn_0 J0;
    public final qj_2 P00;
    public final tk0_0 nB;
    public final in_2 d6;

    public CameraOrthographicProjectionSettings(Function function) {
        this.d6 = new in_2(100);
        this.b90 = function;
        uf("event-tracker");
        this.nB = new tk0_0();
        this.CN = new ae0_1();
        this.J0 = new cn_0("0/0");
        this.J0.Oq0(false);
        this.J0.fn0();
        this.nB.gg0.vx0(this.CN).Yt();
        this.nB.gg0.Rg();
        this.nB.gg0.vx0(this.J0).ru();
        this.P00 = new qj_2();
        NuL(this.P00.sl());
        this.P00.uf("button");
        this.P00.RR(this::P);
        this.gg0.vx0(this.P00).Ha().Xs(5.0f);
        this.gg0.vx0(this.nB).Pt(100.0f).Xs(5.0f);
        this.CN.uf("event-progressbar-cny-raids");
        this.CN.aE(0.0f);
    }

    @Override
    public final void X30(int i1) {
        if (!this.d6.ty0()) {
            return;
        }
        int i2 = 0;
        short[] sArr = jt_0.Qy0;
        int length = 13;
        for (int i5 = 0; i5 < length; i5++) {
            short s = sArr[i5];
            cq0_0 cq0 = tw0_0.rl.oY;
            cq0.getClass();
            cq0_0.w0(s);
            if (cq0.lY.kp(s)) {
                i2++;
            }
        }
        int i3 = i2 > 12 ? i2 : 12;
        this.CN.aE((float) i2 / (float) i3);
        this.J0.Sk(sm0_0.Bx(16805122, new String[]{String.valueOf(i2), String.valueOf(i3)}));
        this.nB.gg0.pz(this.J0).sn0 = new vl0_0((float) i1);
        this.nB.COm3();
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        int i2 = v1.zu;
        if (E00.C10(i2)) {
            if (i2 == 5) {
                P();
            }
            return true;
        }
        return super.nd0(v1);
    }

    public final void NuL(Br0 v1) {
        LPT6_ lpt = fn_0.qz0().Ku(22, false);
        v1.r8(new LPT6_[]{lpt});
        v1.gY = lpt.bz / 16;
        v1.a4 = lpt.xZ / 16;
    }

    public final void P() {
        BU bu = BU.T50;
        tk0_0 root = new tk0_0(new A40());
        A40 table = root.gg0;
        S70 icon = new S70(36, 36, 0);
        NuL(icon.og);
        tk0_0 header = new tk0_0(new A40());
        header.gg0.FU.Wa0();
        cn_0 title = new cn_0(null, 0);
        title.Sk(this.J0.j50.toString());
        title.uf("label-lalign");
        header.gg0.vx0(icon);
        header.gg0.vx0(title).goto$();
        j1_0 headerCell = table.vx0(header);
        headerCell.sn0 = new vl0_0(400.0f);
        headerCell.Wa0();
        headerCell.d80 = 6;
        headerCell.ck0 = new vl0_0(8.0f);
        headerCell.goto$();
        table.Rg();
        for (int i6 = 0; i6 < 13; i6++) {
            short s = jt_0.Qy0[i6];
            cn_0 label = new cn_0(null, 0);
            label.uf("label");
            dg0_0 iconWidget = new dg0_0();
            iconWidget.lv = false;
            int i10 = 0;
            if (S.J9(s, h50_0.bG)) {
                i10 = ((Short) this.b90.apply(Short.valueOf(s))).shortValue();
            }
            int i11 = 0;
            if (i10 == 492) {
                i11 = 1;
                cq0_0 cq0 = tw0_0.rl.oY;
                short[] sArr = jt_0.FJ0;
                for (int i15 = 0; i15 < 12; i15++) {
                    cq0_0.w0(sArr[i15]);
                }
                if (!cq0.lY.qq(sArr)) {
                    i10 = 0;
                }
            }
            iconWidget.E1(yh_0.Xm0.qC0(yh_0.Ed((byte) i11, (short) i10), (byte) 0, false)[0]);
            label.Sk(((cq_0) mp_1.vf0().k2.get(Short.valueOf((short) i10))).Ay(false));
            cq0_0 cq0 = tw0_0.rl.oY;
            cq0_0.w0(s);
            if (!cq0.lY.kp(s)) {
                iconWidget.tp0.wx0(gn_0.BLACK);
                iconWidget.z70 = new N1(new t5_0(iconWidget), new gn_0((byte) -1, (byte) -1, (byte) -1, (byte) 127));
                label.z70 = new N1(new t5_0(label), new gn_0((byte) -1, (byte) -1, (byte) -1, (byte) 127));
            } else {
                label.z70 = new N1(new t5_0(label), new gn_0(-13382605));
            }
            boolean isLast = (i6 == 12);
            tk0_0 itemTable = new tk0_0(new A40());
            itemTable.gg0.FU.ck0 = new vl0_0(4.0f);
            itemTable.gg0.vx0(iconWidget);
            j1_0 itemLabelCell = itemTable.gg0.vx0(label);
            itemLabelCell.mA = 1;
            itemLabelCell.goto$();
            if (isLast) {
                j1_0 cell1 = table.vx0(new le0_2(null, false));
                cell1.d80 = 2;
                cell1.goto$();
                j1_0 cell2 = table.vx0(itemTable);
                cell2.d80 = 2;
                cell2.goto$();
                j1_0 cell3 = table.vx0(new le0_2(null, false));
                cell3.d80 = 2;
                cell3.goto$();
            } else {
                j1_0 cell = table.vx0(itemTable);
                cell.d80 = 2;
                cell.goto$();
                if (i6 % 3 == 2) {
                    if (tw0_0.kz0()) {
                        cell.J90 = new vl0_0(20.0f);
                    }
                    table.Rg();
                }
            }
        }
        bu.SL(new lpt3__4(root, this::wk0, null, xX.jZ));
    }

    public final void wk0() {
        this.P00.ER.Ge0(false);
    }
}
