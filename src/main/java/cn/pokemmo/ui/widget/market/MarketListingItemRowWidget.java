package cn.pokemmo.ui.widget.market;

import f.*;

import java.text.NumberFormat;

public class MarketListingItemRowWidget {
    public final o60_0 Uw;
    public final le0_2 Td;
    public final xe_1 Gv;
    public final qu_2 vP;

    public MarketListingItemRowWidget(qu_2 parent, o60_0 item, boolean available) {
        this.vP = parent;
        this.Uw = item;

        le0_2 content;
        switch (item.uZ()) {
            case 4:
                cn_0 text = new cn_0(item.jI() == null ? "" : lb0_2.V80(item.jI()));
                text.uf("label-title-medium");
                content = text;
                break;
            case 3:
                cn_0 localized = new cn_0(item.UB() == null ? "" : lb0_2.FI0(item.UB(), (short) 0, 0));
                localized.uf("label-title-medium");
                content = localized;
                break;
            case 2:
                cg_0 money = new cg_0();
                money.mm("$" + NumberFormat.getInstance().format((long) item.oE()));
                money.RD(true);
                content = money;
                break;
            case 1:
                el_0 creature = new el_0();
                creature.Mj0(false);
                creature.Hv0();
                if (item.Mc0() != null) {
                    creature.Db(new VU(item.Mc0()));
                } else if (available) {
                    creature.av(item.P3(), item.C00(), item.mG());
                }
                creature.tD0(() -> this.UI0(creature, item));
                content = creature;
                break;
            case 0:
                ga0_1 icon = new ga0_1();
                if (item.fs() != null) {
                    icon.Uj0(item.fs().uI(), item.fs().COM8(), item.fs().Tu());
                } else if (available) {
                    icon.Uj0((byte) 0, item.C00(), item.LP());
                }
                icon.of(() -> this.lPt1(item, icon));
                content = icon;
                break;
            default:
                content = new cn_0();
                break;
        }
        this.Td = content;
        boolean disabled = !available;
        this.Td.pw0(disabled);

        this.Gv = new xe_1(sm0_0.c0(item.uZ() == 2 ? 5900 : 5843));
        this.Gv.uf("button-small2");
        this.Gv.pw0(disabled);
        this.Gv.Ll(disabled);
        if (item.uZ() == 3) {
            this.Gv.RR(() -> this.v20(item));
        } else if (item.uZ() == 4) {
            this.Gv.RR(() -> this.Xp0(item));
        } else {
            this.Gv.RR(() -> this.Hb0(item));
        }
    }

    public static void VL0(el_0 widget) {
        BU.T50.FI(widget.AG, null, qo_1.DL, false);
    }

    public final void Hb0(o60_0 item) {
        tw0_0.rl.f2(item.sA, (byte) 0, item.Uv0, this.vP.Dw.GM);
    }

    public final void Xp0(o60_0 item) {
        yi0_1 reward = item.k;
        if (reward == null) {
            return;
        }
        if (reward.N0 > 0) {
            if (jq0_0.hA(BU.T50, ok_1.class)) {
                jq0_0.tK0(BU.T50, ok_1.class).xe0();
            }
            BU.T50.SL(new ok_1(item, this.vP));
        } else {
            this.Hb0(item);
        }
    }

    public final void v20(o60_0 item) {
        jr0_0 reward = item.kC0;
        if (reward == null) {
            return;
        }
        if (!reward.prn() && reward.P50 <= 0) {
            if (reward.nC0 > 0) {
                mc0_1 entry = gu0.l2.lPT6(reward.nC0);
                X90 character = entry.Iq;
                if (character != null && character.yt()) {
                    l3_0 dialog = new l3_0(character.SG, character.ax, item, this.vP);
                    l3_0 old = this.vP.NW;
                    if (old != null) {
                        old.xe0();
                    }
                    this.vP.NW = dialog;
                    this.vP.F9(this.vP.fU(), dialog);
                    return;
                }
            }
            this.Hb0(item);
            return;
        }
        if (jq0_0.hA(BU.T50, bg_1.class)) {
            jq0_0.tK0(BU.T50, bg_1.class).xe0();
        }
        BU.T50.SL(new bg_1(item, this.vP));
    }

    public final void UI0(el_0 widget, o60_0 item) {
        Vt0 dialog = new Vt0("claim");
        dialog.mA0(sm0_0.c0(2300), () -> VL0(widget));
        dialog.mA0(sm0_0.c0(5897), () -> this.Ve(item));
        dialog.mA0(sm0_0.c0(5898), () -> this.XL0(item));
        dialog.mA0(sm0_0.c0(nf0_0.Bq0), null);
        UA.zd(dialog, widget);
    }

    public final void XL0(o60_0 item) {
        tw0_0.rl.f2(item.sA, (byte) 2, item.Uv0, this.vP.Dw.GM);
    }

    public final void Ve(o60_0 item) {
        tw0_0.rl.f2(item.sA, (byte) 1, item.Uv0, this.vP.Dw.GM);
    }

    public final void lPt1(o60_0 item, ga0_1 widget) {
        Vt0 dialog = new Vt0("claim");
        dialog.mA0(sm0_0.c0(5843), () -> this.aD(item));
        dialog.mA0(sm0_0.c0(nf0_0.Bq0), null);
        UA.zd(dialog, widget);
    }

    public final void aD(o60_0 item) {
        tw0_0.rl.f2(item.sA, (byte) 0, item.Uv0, this.vP.Dw.GM);
    }
}
