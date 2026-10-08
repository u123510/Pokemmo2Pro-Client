package cn.pokemmo.ui.widget.layout;

import f.*;
import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Objects;

public class ItemListContainerLayout extends BaseLayoutBox {
    public static final gn_0 kk0 = new gn_0(855638015);
    public final jc_2 je;
    public final l5_0 vl;
    public final Ri0 c7;
    public dn0_0 W1;
    public lpt4__1 D50;
    public final SQ Nd0;
    public final SQ Gn0;
    public final ArrayList rX;
    public HashMap KG;
    public final lo0_0 bC0;
    public final ArrayList oq;
    public final ArrayList AS;
    public final ArrayList RM;
    public K5[] U80;
    public final HD0 Ci;
    public final fy_2 km0;

    public ItemListContainerLayout(jc_2 je, HD0 ci, l5_0 vl, K5[] items) {
        super();
        this.Nd0 = new SQ();
        this.Gn0 = new SQ();
        this.rX = new ArrayList();
        this.KG = new HashMap();
        this.oq = new ArrayList();
        this.AS = new ArrayList();
        this.RM = new ArrayList();
        this.uf("dialoglayout");
        this.je = je;
        this.vl = vl;
        this.U80 = items;
        this.Ci = ci;
        this.km0 = new fy_2();
        new cn_0("");
        cn_0 empty = new cn_0("");
        this.c7 = new Ri0((f.Ms0)(Object)this);
        lo0_0 unused = new lo0_0();
        unused.Qs0(2);
        unused.AH0(empty);
        this.bC0 = new lo0_0();
        this.bC0.Qs0(2);
        this.Ik();
        this.WQ(this.lo0().Xq(this.H10().LPt3(this.bC0)));
        this.x40(this.H10().Xq(this.lo0().LPt3(this.bC0)));
    }

    public static le0_2 N2(K5 item) {
        cn_0 text = new cn_0();
        text.Sk(lb0_2.Sp0(item.cL, true, false));
        return text;
    }

    public static le0_2 Tu(K5 item) {
        return new gi_1(item.cL, item.nn.N50, item.nn.pe);
    }

    public static int C6(K5 left, K5 right) {
        vk0_1 leftEntry = (vk0_1)ec0_2.Sx().f4.f5(left.cL.wb0);
        vk0_1 rightEntry = (vk0_1)ec0_2.Sx().f4.f5(right.cL.wb0);
        if (leftEntry == null || rightEntry == null) {
            return 0;
        }
        Comparator comparator = i40_0.xG;
        return comparator.compare(leftEntry.oG(null, null), rightEntry.oG(null, null));
    }

    public static void K60(ItemListContainerLayout owner, dn0_0 item, i70_0 event) {
        owner.getClass();
        IA colors = BU.T50.z6;
        if (item.Ft0() != null && item.Ft0().cL.dB0(false) == JU.O4) {
            colors.Mj0(kk0);
        } else {
            qr_0[] channels = colors.Mx0;
            for (int i = 0; i < channels.length; i++) {
                channels[i].M.j70(le0_2.gz, true);
            }
        }
        owner.W1 = item;
        owner.hU(event);
    }

    public static void Bs0(ItemListContainerLayout owner, dn0_0 item, i70_0 event) {
        owner.getClass();
        IA colors = BU.T50.z6;
        colors.Mj0(gn_0.WHITE);
        qr_0[] channels = colors.Mx0;
        for (int i = 0; i < channels.length; i++) {
            channels[i].M.j70(le0_2.gz, false);
        }
        if (owner.W1 == null) {
            return;
        }
        owner.hU(event);
        if (owner.D50 != null) {
            owner.D50.UR(item.Ft0());
        } else {
            le0_2 target = Qy0.yI0;
            le0_2 child = target.dh0(event.f8, event.AN);
            if (child != null) {
                target = child.BQ(event.f8, event.AN);
            }
            XH hud = BU.T50 == null ? null : BU.T50.BK;
            if (hud != null && hud.b5 == (Object)target.K20) {
                hud.HA0(item.Ft0());
            } else {
                nq_1 label = S1(target);
                K5 value = item.Ft0();
                if (label != null && value != null) {
                    label.hx0.Gv(((wn0_0)label.hx0.dI0).YA.toString() + "{I:" + value.nn.Br + "}");
                    lpt6__0.v90(label.hx0);
                }
            }
        }
        if (owner.D50 != null) {
            owner.D50.RI(false, false);
            owner.D50 = null;
        }
        owner.W1 = null;
    }

    public static nq_1 S1(le0_2 value) {
        if (value instanceof nq_1) {
            return (nq_1)value;
        }
        return value.K20 == null ? null : S1(value.K20);
    }

    public final le0_2 Ik() {
        this.RM.clear();
        String filter = tx_1.J10(this.je.nB.dI0.toString(), true);
        if (filter.isEmpty()) {
            this.bC0.AH0(this.Hq(new ArrayList(Arrays.asList(this.U80))));
        } else {
            for (K5 item : this.U80) {
                if (tx_1.qp0(tx_1.J10(item.Ua(), false), filter)) {
                    this.RM.add(item);
                }
            }
            Collections.sort(this.RM);
            this.bC0.AH0(this.Hq(this.RM));
        }
        return this.rX.isEmpty() ? null : (le0_2)this.rX.get(0);
    }

    @Override
    public final void K8() {
        if (!tw0_0.kz0()) {
            this.RY(448, 180);
            this.vi(10, 10, 10, 10);
        }
        super.K8();
    }

    public final void KX(ArrayList widgets, ArrayList values, fy_2 layout, I7 row, Hm0 column) {
        if (widgets.isEmpty()) {
            return;
        }
        xe_1[] widgetArray = (xe_1[])widgets.toArray(new xe_1[0]);
        this.Nd0.j10(this.Nd0.yw0(this.Nd0.Rv), widgetArray);
        K5[] valueArray = (K5[])values.toArray(new K5[0]);
        this.Gn0.j10(this.Gn0.yw0(this.Gn0.Rv), valueArray);
        row.X20(layout.hb(widgetArray));
        column.X20(layout.C7(widgetArray));
        widgets.clear();
        values.clear();
    }

    public final void hU(i70_0 event) {
        if (this.W1 == null || BU.T50 == null) {
            return;
        }
        le0_2 target = BU.T50;
        le0_2 child = target.dh0(event.f8, event.AN);
        if (child != null) {
            target = child.BQ(event.f8, event.AN);
        }
        if (target instanceof lpt4__1) {
            lpt4__1 panel = (lpt4__1)target;
            if (panel.Q30 && panel != this.D50) {
                if (this.D50 != null) {
                    this.D50.RI(false, false);
                }
                this.D50 = panel;
                panel.RI(true, true);
            }
        }
    }

    public final fy_2 Hq(ArrayList items) {
        BR battle = tw0_0.rl;
        if (battle == null) {
            return null;
        }
        this.oq.clear();
        this.AS.clear();
        this.Gn0.clear();
        this.rX.clear();
        this.Nd0.clear();
        this.km0.em();
        I7 row = XN.sA(this.km0, this.km0);
        Hm0 column = D5.fE0(this.km0, this.km0);
        Dm0 table = battle.bh;
        int groupCount = 0;
        int previousType = 0;
        i40_0 previousCategory = i40_0.Gc;
        boolean insertedSpecial = false;
        l5_0 normalMode = l5_0.YW;
        int columns = this.vl == normalMode ? 2 : 11;
        if (tw0_0.kz0()) {
            columns = 1;
        }
        HashMap grouped = new HashMap();
        if (this.vl == normalMode) {
            Collections.sort(items, ItemListContainerLayout::C6);
            ArrayList special = new ArrayList();
            for (Object object : items) {
                K5 item = (K5)object;
                if (item.cL.nI()) {
                    special.add(item);
                }
            }
            if (!special.isEmpty()) {
                items.removeAll(special);
                items.addAll(0, special);
            }
        } else {
            Collections.sort(items);
        }
        for (Object object : items) {
            K5 item = (K5)object;
            hl0_0 info = item.nn;
            short count = info.PA0;
            if (table != null) {
                short adjustment = 0;
                CH0 type = info.Br;
                VF0[] entries = table.Ti0[table.c80];
                for (VF0 entry : entries) {
                    if (entry != null && entry.O8.equals(type)) {
                        adjustment = entry.FY;
                        break;
                    }
                }
                count = (short)(count - adjustment);
            }
            if (count < 1) {
                continue;
            }
            if (this.vl == normalMode) {
                if (item.cL.nI()) {
                    if (!insertedSpecial) {
                        this.KX(this.oq, this.AS, this.km0, row, column);
                        groupCount = 0;
                        cn_0 heading = new cn_0(null, 0);
                        heading.Sk(sm0_0.c0(10798));
                        row.X20(this.km0.hb(new le0_2[]{heading}));
                        column.X20(this.km0.C7(new le0_2[]{heading}));
                        insertedSpecial = true;
                    }
                } else {
                    vk0_1 entry = (vk0_1)Objects.requireNonNull(
                        ec0_2.Sx().f4.f5(item.cL.wb0), Integer.toString(item.nn.wQ));
                    i40_0 category = entry.oG(null, null);
                    if (previousCategory != category) {
                        this.KX(this.oq, this.AS, this.km0, row, column);
                        groupCount = 0;
                        cn_0 heading = new cn_0(null, 0);
                        heading.Sk(sm0_0.wa0(10799, category.BT()));
                        row.X20(this.km0.hb(new le0_2[]{heading}));
                        column.X20(this.km0.C7(new le0_2[]{heading}));
                        previousCategory = category;
                    }
                }
            } else if (previousType != item.cL.pe()) {
                this.KX(this.oq, this.AS, this.km0, row, column);
                groupCount = 0;
                previousType = item.cL.pe();
                int textId = previousType + 10000;
                if (sm0_0.cU.l90(textId) && previousType < 800) {
                    cn_0 heading = new cn_0(null, 0);
                    heading.Sk(sm0_0.c0(textId));
                    row.X20(this.km0.hb(new le0_2[]{heading}));
                    column.X20(this.km0.C7(new le0_2[]{heading}));
                }
            }
            xe_1 widget = (xe_1)this.KG.get(info.Br);
            if (widget == null) {
                if (this.vl == normalMode) {
                    E80 button = new E80(this.Ci, item, this.je);
                    if (item.cL.wb0 > 0) {
                        button.SU(count + "x " + sm0_0.c0(item.cL.Nl));
                    }
                    button.Vu = new gi_0((f.Ms0)(Object)this);
                    widget = button;
                } else {
                    p70_0 button = new p70_0(this.je, this.Ci, item, count);
                    if (!tw0_0.kz0()) {
                        button.Nd = this.c7;
                    }
                    widget = button;
                }
                if (!tw0_0.kz0()) {
                    widget.GH0 = 40;
                    if (item.cL.Iq != null) {
                        widget.yj0 = (java.util.function.Supplier<le0_2>)() -> Tu(item);
                    } else {
                        widget.yj0 = (java.util.function.Supplier<le0_2>)() -> N2(item);
                    }
                    widget.yB0();
                }
            } else {
                if (!tw0_0.kz0() && !(widget instanceof E80)) {
                    widget.SU("x" + count);
                } else {
                    widget.SU(count + "x " + sm0_0.c0(item.cL.Nl));
                }
                if (widget instanceof dn0_0) {
                    dn0_0 drag = (dn0_0)widget;
                    if (drag.Ft0().nn.wQ != item.nn.wQ) {
                        drag.UR(item);
                    }
                }
                if (!tw0_0.kz0() && item.cL.Iq != null) {
                    widget.yj0 = new gi_1(item.cL, item.nn.N50, item.nn.pe);
                    widget.yB0();
                }
            }
            grouped.put(info.Br, widget);
            this.oq.add(widget);
            this.AS.add(item);
            this.rX.add((dn0_0)widget);
            if (++groupCount % columns == 0) {
                groupCount = 0;
                this.KX(this.oq, this.AS, this.km0, row, column);
            }
        }
        this.KG = grouped;
        this.KX(this.oq, this.AS, this.km0, row, column);
        this.km0.x40(row);
        this.km0.WQ(column);
        return this.km0;
    }
}
