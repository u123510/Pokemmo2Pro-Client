package cn.pokemmo.ui.widget.menu;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.menu.BasePopupMenuWidget;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ChatFilterMenuWidget extends BasePopupMenuWidget {
    public static final in_2 AD0;
    public final lr_0 Ag0;
    public final qd_0 or;
    public final cg_0 Com5;
    public final X6 dm0;
    public X6 kH0;
    public j1_0 Yj0;
    public final xe_1 aZ;
    public final V1 y80;
    public final xe_1 kn;
    public final xe_1 Lu0;
    public final xe_1 TU;
    public short RV;
    public boolean eA;
    public u8_0 bK;
    public final kS PF0;
    public final es_1 nY;
    public final es_1 Vi0;
    public int az0;
    public int Jh0;

    public ChatFilterMenuWidget(lr_0 context, qd_0 region, boolean enabled) {
        super();
        this.nY = new es_1();
        this.Vi0 = new es_1();
        this.Ag0 = context;
        this.or = region;

        String[] labels = new String[4];
        for (int index = 0; index < 4; ++index) {
            labels[index] = sm0_0.c0(index + 8050);
        }

        pg0_2 model = new pg0_2((Object[]) labels);
        this.dm0 = new X6(model);
        this.dm0.Bd(0);
        this.dm0.Rm0(() -> this.lk0(context, region));

        this.Com5 = new cg_0();
        this.Com5.I7();
        this.Com5.Ii(value -> this.l40(context, region, value));

        this.kn = new xe_1(sm0_0.c0(8010));
        this.Lu0 = uz0_0.nJ(this.kn, () -> this.tj0(region, context), "↻");
        this.Lu0.uf("button-symbol");
        this.Lu0.Xr0(sm0_0.c0(8035));
        this.Lu0.Bb(100);
        this.Lu0.RR(() -> gJ(context, region));

        this.TU = new xe_1(sm0_0.c0(8042));
        if (!enabled) {
            this.TU.pw0(false);
        }
        this.TU.RR(() -> lW(enabled, context));

        this.PF0 = new kS(this);
        if (region == qd_0.Vx0 || region == qd_0.H4) {
            this.aZ = new xe_1("☒");
            this.aZ.uf("button-symbol");
            this.aZ.Xr0(sm0_0.c0(8036));
            this.aZ.Bb(100);
            this.aZ.pw0(true);
            this.aZ.RR(() -> this.UA(context, region));
            this.y80 = new ZL0(this, context, region);
            if (this.yH().KB == 0) {
                this.aZ.pw0(false);
            }
        } else if (region == qd_0.Ws0) {
            this.aZ = null;
            this.y80 = new dk0_1(this, context, region);
        } else {
            this.aZ = null;
            this.y80 = null;
        }

        this.l1(region);
        if (this.or == qd_0.Ws0) {
            this.dm0.Ll(false);
            this.Com5.Ll(false);
        }
    }

    public static vq_2 XA(Mg value) {
        return (vq_2)value;
    }

    public static boolean ba(Mg value) {
        return value instanceof vq_2;
    }

    public static eg_0 Ag0(bx_0 value) {
        return new eg_0(value, value.pF0);
    }

    public static boolean Ja(qd_0 region, bx_0 value) {
        return value.W30 == region;
    }

    public static void lW(boolean enabled, lr_0 context) {
        if (!enabled) {
            tw0_0.rl.qK(sm0_0.c0(8029));
            return;
        }

        ArrayList<CH0> values = new ArrayList<>();
        K90[] entries = context.ej0;
        for (K90 entry : entries) {
            if (entry != null && (entry.q8 == 1 || entry.hf > 0)) {
                values.add(entry.RR);
            }
        }

        if (!values.isEmpty()) {
            CH0[] result = values.toArray(new CH0[0]);
            tw0_0.rl.fk0.uQ(new pz_0(result));
        }
    }

    public static void gJ(lr_0 context, qd_0 region) {
        context.If(region);
    }

    static {
        AD0 = new in_2(100);
    }

    public final void l1(qd_0 region) {
        this.gg0.OO();
        this.PF0.gg0.OO();

        this.gg0.FU.getClass();
        this.gg0.FU.J90 = new vl0_0(2.0F);
        this.PF0.gg0.FU.getClass();
        this.PF0.gg0.FU.J90 = new vl0_0(2.0F);
        if (!tw0_0.kz0()) {
            this.gg0.rx0(3.0F);
        }

        Collection<bx_0> source = (Collection<bx_0>)(Collection<?>)tw0_0.rl.sN.za.To();
        List<eg_0> values = source.stream()
                .filter(value -> Ja(region, value))
                .map(ChatFilterMenuWidget::Ag0)
                .collect(Collectors.toList());
        pg0_2 model = new pg0_2(values);
        model.w7.add(0, new eg_0(null, sm0_0.c0(8084)));
        model.su(0, 0);

        this.kH0 = new X6();
        this.kH0.r30(model);
        this.kH0.Bd(0);
        this.kH0.Rm0(() -> this.nM(region));

        j1_0 row = this.PF0.gg0.vx0(new le0_2(null, false)).goto$();
        if (region == qd_0.Vx0 || region == qd_0.H4) {
            row.Rr0.vx0(this.kH0);
            j1_0 inputCell = row.Rr0.vx0(this.Com5);
            inputCell.J90 = new vl0_0(5.0F);
            inputCell.mA = Integer.valueOf(1);
            row.Rr0.vx0(this.kn);
            row.Rr0.vx0(this.aZ);
            row.Rr0.vx0(this.Lu0);
            j1_0 selectorCell = row.Rr0.vx0(this.dm0);
            selectorCell.LPt7 = Float.valueOf(1.0F);
            selectorCell.J90 = new vl0_0(tw0_0.kz0() ? 60.0F : 0.0F);
            selectorCell.Rr0.Rg();
        } else if (region == qd_0.Ws0) {
            row.Rr0.vx0(this.TU);
            j1_0 actionCell = row.Rr0.vx0(this.Lu0);
            actionCell.J90 = new vl0_0(tw0_0.kz0() ? 60.0F : 0.0F);
            actionCell.Rr0.Rg();
        }

        this.gg0.vx0(this.PF0).goto$().Rr0.Rg();
        j1_0 navigationCell = this.gg0.vx0(new le0_2(null, false));
        this.Yj0 = navigationCell;
        navigationCell.mA = Integer.valueOf(1);
        navigationCell.p20().rs0 = Float.valueOf(1.0F);
        navigationCell.Rr0.Rg();
        if (!tw0_0.kz0()) {
            this.Yj0.getClass();
            this.Yj0.Yg = new vl0_0(10.0F);
        }

        j1_0 viewCell = this.gg0.vx0(this.y80);
        viewCell.mA = Integer.valueOf(1);
        viewCell.d80 = Integer.valueOf(this.gg0.B8);
    }

    public final void uM(qd_0 region) {
        this.nK0();
        this.RV = 0;
        this.Ag0.If(region);
    }

    public final void Fp0(qd_0 region) {
        this.nK0();
        this.bK = null;
        this.yH().clear();
        this.Ag0.If(region);
    }

    public final void nM(qd_0 region) {
        bx_0 selected = (bx_0)((eg_0)this.kH0.Vh0()).q90;
        if (selected == null) {
            this.Com5.Gv("");
            this.Com5.RD(false);
        } else {
            List<Mg> values = (List<Mg>)(List<?>)v40_0.nc(selected.G80, 0);
            values.stream()
                    .filter(ChatFilterMenuWidget::ba)
                    .map(ChatFilterMenuWidget::XA)
                    .map(this::W00)
                    .findFirst()
                    .ifPresent(this::Ue0);
        }

        this.RV = 0;
        this.Ag0.If(region);
    }

    public final void Ue0(String value) {
        this.Com5.Gv(value);
        this.Com5.RD(true);
    }

    public final String W00(vq_2 value) {
        if (this.or == qd_0.Vx0) {
            return mp_1.vf0().W50((short)value.Ae0).Ay(true);
        }
        return sm0_0.c0(gu0.l2.lPT6((short)value.Ae0).Nl);
    }

    public final void UA(lr_0 context, qd_0 region) {
        this.aZ.pw0(false);
        this.eA = false;
        this.bK = null;
        this.yH().clear();
        context.If(region);
    }

    public final void tj0(qd_0 region, lr_0 context) {
        if (!this.eA) {
            this.yr(region);
        } else {
            this.eA = false;
            context.If(region);
        }
    }

    public final void l40(lr_0 context, qd_0 region, int value) {
        this.RV = 0;
        long duration = 250L;
        m0_0 animation = context.vw;
        if (animation != null) {
            boolean active;
            synchronized (animation) {
                active = animation.bM0 > 0L;
            }
            if (active) {
                duration = context.vw.LW() - System.nanoTime() / 1000000L;
                context.vw.ky0();
                context.vw = null;
            }
        }

        context.vB0(region);
        context.vw = _finally.HG().dH0(new MZ(context, region), (float)duration / 1000.0F);
        this.Com5.dI0.toString();
    }

    public final void lk0(lr_0 context, qd_0 region) {
        if (!AD0.ty0()) {
            return;
        }
        this.RV = 0;
        context.If(region);
    }

    public final void sd0(int row, int column) {
        ArrayList cells = ((tk0_0)this.Yj0.kh0).gg0.yK0;
        int width = 0;
        Iterator iterator = cells.iterator();
        while (iterator.hasNext()) {
            j1_0 cell = (j1_0)iterator.next();
            width += cell.d80.intValue();
            if (cell.Hs) {
                break;
            }
        }

        if (width == 0) {
            return;
        }

        int maximumRow = cells.size() / width - 1;
        O00 sideEffect = LW.Yu;
        if (row < 0) {
            row = 0;
        } else if (row > maximumRow) {
            row = maximumRow;
        }
        this.az0 = row;

        int maximumColumn = width - 1;
        if (column < 0) {
            column = 0;
        } else if (column > maximumColumn) {
            column = maximumColumn;
        }
        this.Jh0 = column;
        this.rT();
    }

    public final void rT() {
        ArrayList cells = ((tk0_0)this.Yj0.kh0).gg0.yK0;
        int row = -1;
        int column = 0;
        Iterator iterator = cells.iterator();
        while (iterator.hasNext()) {
            j1_0 cell = (j1_0)iterator.next();
            if (row == this.az0) {
                if (column == this.Jh0) {
                    lpt6__0.v90((le0_2)cell.kh0);
                    return;
                }
                ++column;
            }
            if (cell.Hs) {
                ++row;
            }
        }
        this.sd0(0, 0);
    }

    public final byte fq() {
        return (byte)this.dm0.mu0.Mw0;
    }

    public final es_1 yH() {
        return this.or == qd_0.H4 ? this.nY : this.Vi0;
    }

    public final void nK0() {
        this.eA = false;
        xe_1 action = this.aZ;
        if (action != null) {
            action.pw0(this.yH().KB > 0);
        }
        this.l1(this.or);
    }

    public final void yr(qd_0 region) {
        this.eA = true;
        if (this.bK == null) {
            vi_0 data = tw0_0.rl.sN;
            es_1 values = this.yH();
            Runnable complete = () -> this.Fp0(region);
            Runnable cancel = () -> this.uM(region);
            this.bK = new u8_0(region, data, values, true, complete, cancel);
        }

        this.gg0.OO();
        j1_0 cell = this.gg0.vx0(this.bK);
        cell.Hb0 = Integer.valueOf(1);
        cell.i8 = Integer.valueOf(1);
        cell.NA();
        if (tw0_0.kz0()) {
            cell.J90 = new vl0_0(160.0F);
            cell.Yg = new vl0_0(0.0F);
        }
    }

    @Override
    public final void K8() {
        super.K8();
        if (tw0_0.kz0()) {
            this.kh0();
            float width = (float)this.Ag0.hq.e4.Mx;
            this.Yj0.getClass();
            this.Yj0.J90 = new vl0_0(width);
        }
    }
}
