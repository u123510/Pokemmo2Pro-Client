package cn.pokemmo.ui.widget.text.tag;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.text.tag.BaseTaggedLabelWidget;

import java.util.function.Consumer;
import java.util.stream.Stream;

public abstract class ServerRegionTagLabel extends qj_2 {
    public static final MD0 Rf0 = MD0.cB("dragActive");
    public static final MD0 Y8 = MD0.cB("dropOk");
    public static final MD0 kH = MD0.cB("dropBlocked");
    public static final MD0 AL = MD0.cB("filtered");
    public static final MD0 Nv0 = MD0.cB("obey");
    public static final MD0 cv0 = MD0.cB("multiselect");
    public static final MD0 throws$ = MD0.cB("multiselectActive");
    public static final MD0 i8 = MD0.cB("battlebox");
    public By Sg;
    public boolean XW;
    public final sg_0 Ix0;
    public final P10 J90;
    public final P10 Q50;
    public final P10 Hh;
    public final P10 sB0;
    public final P10 W10;
    public final P10 C5;
    public final P10 Xt;
    public final Wt0 Lu0;
    public final Yy BK;
    public boolean JA;
    public Runnable Nj;
    public int dV;
    public int rA0;
    public sg_2 pt0;
    public boolean R4;
    public b6_0 t8;
    public boolean Bu0;
    public VY uh;
    public boolean X1;

    public ServerRegionTagLabel() {
        JA = true;
        Bu0 = true;
        uh = VY.Iy0;
        sl().Gy0(4, -4);
        uf("monster-slot");
        Ix0 = new sg_0(this);
        Lu0 = new Wt0(this);
        Lu0.aE(1.0F);
        Lu0.uf("slot-health-progressbar");
        BK = new Yy();
        J90 = new P10(this, 16, 16);
        W10 = new P10(this, 16, 16);
        C5 = new P10(this, 16, 16);
        Xt = new P10(this, 16, 16);
        Hh = new P10(this, 16, 16);
        sB0 = new P10(this, 32, 32);
        Q50 = new P10(this, 16, 16);
        sB0.JH().Gy0(0, -4);
        sB0.JH().nq0(24, 24);
        if (tw0_0.kz0()) {
            Hh.VA(17, 14);
            Hh.JH().nq0(17, 14);
            Q50.JH().nq0(15, 15);
            W10.JH().dA(1.5F);
            C5.JH().dA(1.5F);
            Xt.JH().dA(1.5F);
            J90.JH().dA(1.5F);
            sB0.JH().dA(2.0F);
        } else {
            Hh.JH().nq0(13, 10);
        }
        SL(J90);
        SL(Hh);
        SL(Q50);
        SL(W10);
        SL(Xt);
        SL(C5);
        Ix0.uf("label-dark");
        SL(Ix0);
        Bb(200);
        tx0 = true;
        nI();
    }

    public static void x2(dz_2 widget) {
        widget.Ll(false);
    }

    public final void uw() {
        if (Dp(Lu0) < 0) {
            F9(fU(), Lu0);
            yI();
        }
    }

    public final jb0_0 y0() {
        if (this instanceof jb0_0) return (jb0_0) this;
        throw new IllegalArgumentException();
    }

    public final void IE0(Consumer consumer) {
        if (this instanceof jb0_0) consumer.accept((jb0_0) this);
    }

    public final void LPT8(boolean selected) {
        if (ol0() != null) ER.lK0(selected);
    }

    public final void E1(AG0 sprite) {
        tp0.o60(new AG0[]{sprite});
    }

    public final void G9(sg_2 source) {
        if (!JA) return;
        b6_0 predicate = t8;
        if (predicate != null && !predicate.evaluate(source.ol0())) return;
        av0(source);
    }

    public abstract void av0(sg_2 source);

    public abstract VU ol0();

    public final void update() {
        nI();
        zl();
        COm3();
    }

    public abstract void zl();

    public final void nI() {
        Ix0.Sk("");
        J90.og.lo0();
        Hh.og.lo0();
        sB0.og.lo0();
        Q50.og.lo0();
        W10.og.lo0();
        C5.og.lo0();
        Xt.og.lo0();
        Lu0.aE(0.0F);
        BK.qT = 0.0001F;
        BK.T30();
        BK.for$.set(0);
        tp0.oo0 = null;
        tp0.lo0();
        yj0 = null;
        yB0();
        Stream.of(new dz_2[]{Ix0, J90, Q50, Hh, sB0, W10, C5, Xt, Lu0}).forEach(ServerRegionTagLabel::x2);
        VU monster = ol0();
        if (monster == null) return;
        tp0.o60(new AG0[]{yh_0.Xm0.qC0(monster.I8.Kr(), monster.Dg0(), monster.I8.aR())[0]});
        if (monster.I8.vn()) return;
        switch (pb_0.hO[uh.vs]) {
            case 1:
                yj0 = ol0().na0();
                yB0();
                break;
            case 2:
                yj0 = lb0_2.Ky(ol0(), true, false, false);
                yB0();
                break;
            case 3:
                yj0 = lb0_2.Ky(ol0(), false, true, true);
                yB0();
                A80 = "tooltip-markup";
                break;
            default:
                break;
        }
        Ix0.Sk(String.valueOf(monster.I8.wj));
        if (monster.Dg0() >= 0) J90.og.r8(new LPT6_[]{fn_0.qz0().vo0[monster.Dg0()]});
        if (monster.I8.COM6()) Hh.og.o60(new AG0[]{ob0_0.Ui0().es0});
        if (monster.I8.COM6()) sB0.og.Nk(new Wr[]{gh_1.aH0.Jg(monster.I8.rh0(), false)});
        if (monster.I8.H1 != 0) {
            Q50.og.r8(new LPT6_[]{fn_0.qz0().Q90[fn_0.Xa(CE.kq(monster.I8.H1))]});
        }
        if (monster.I8.I()) {
            Br0 renderer = W10.og;
            fn_0 icons = fn_0.qz0();
            LPT6_ icon = monster.I8.u3() ? icons.EB : icons.tj0;
            renderer.r8(new LPT6_[]{icon});
        }
        if (monster.I8.bG0.length > 0) C5.og.r8(new LPT6_[]{fn_0.qz0().eb0});
        if (monster.I8.ca()) Xt.og.r8(new LPT6_[]{fn_0.qz0().yp0});
        float health = (float) monster.I8.VD / (float) monster.Ps.BL0(gc_2.RC);
        if ((double) health > 0.5D || monster.I8.vn()) {
            BK.for$.set(785150431);
        } else if ((double) health > 0.2D) {
            BK.for$.set(-207875361);
        } else if (health > 0.0F) {
            BK.for$.set(-414434081);
        } else if (health == 0.0F) {
            BK.for$.set(-1688619297);
            health = 0.00001F;
            tp0.oo0 = new gn_0(-1325400065);
        }
        BK.qT = health;
        BK.T30();
        if (monster.I8.VD > 0 && health < 0.13F) health = 0.13F;
        Lu0.aE(health);
    }

    public final void QJ() {
        Q50.og.lo0();
        VU monster = ol0();
        if (monster != null && monster.I8.H1 != 0) {
            Q50.og.r8(new LPT6_[]{fn_0.qz0().Q90[fn_0.Xa(CE.kq(monster.I8.H1))]});
        }
    }

    public final void Ib(Jn0 theme) {
        if (((xd0_2) theme).W70.B20("slot-health-progressbar") != null && Dp(Lu0) < 0) {
            lg_0.k.lPT5(this::uw);
        }
        super.Ib(theme);
        if (R4) {
            wl0_2 region = ((LC0) theme).uT("radial-progress");
            if (region != null) {
                LPT6_ image = region.LT();
                if (image != null) {
                    BK.zf0 = image;
                    float u = image.yQ;
                    BK.nm = u;
                    float v = image.Y60;
                    BK.Of = v;
                    float u2 = image.Yo;
                    float v2 = image.Ll0;
                    BK.Ct0 = u2 - u;
                    BK.gh = v2 - v;
                }
            }
        }
    }

    public final void ad(boolean active, boolean accepted) {
        KG0 state = M;
        state.j70(Y8, active && accepted);
        state.j70(kH, active && !accepted);
    }

    public boolean nd0(i70_0 event) {
        if (event.Li()) {
            if (X1) {
                if (event.LI0()) {
                    By handler = Sg;
                    if (handler != null) handler.Et0((sg_2) this, event);
                    X1 = false;
                } else {
                    By handler = Sg;
                    if (handler != null) handler.X70((sg_2) this, event);
                }
                return true;
            }
            if (event.VP) {
                X1 = true;
                By handler = Sg;
                if (handler != null) handler.py0((sg_2) this, event);
                return true;
            }
            if (event.zu == 4) TG0(event);
            return true;
        }
        int type = event.zu;
        if (E00.C10(type) && event.hh0 != 0) return super.nd0(event);
        if (E00.ZU(type) && BT(event)) return true;
        return super.nd0(event);
    }

    public abstract void TG0(i70_0 event);

    public abstract boolean BT(i70_0 event);

    public final void tD0(Runnable action) {
        Nj = action;
    }

    public final void KO() {
        if (!tw0_0.kz0()) {
            Ix0.lt0();
            Ix0.E40(A20 + (Mx - Ix0.Mx) - 6, VM() - Ix0.k5() - 1);
            J90.E40(A20 + 2, VM() - J90.og.yH0() - 1);
            int offset = 1;
            if (W10.hi0()) {
                W10.E40(A20 + 1, SB0 + 1);
                offset = W10.og.yH0() - 2;
            }
            if (C5.hi0()) C5.E40(A20 + 1, SB0 + offset);
            offset = 5;
            if (Xt.hi0()) {
                Xt.E40(cz() - Xt.og.De0() - 3, SB0 + 3);
                offset = Xt.og.yH0() + 3;
            }
            Hh.E40(cz() - Hh.og.De0() - 4, SB0 + offset);
        } else {
            Ix0.lt0();
            Ix0.E40(A20 + (Mx - Ix0.Mx) - 6, VM() - Ix0.k5() - 2);
            J90.E40(A20 + 2, VM() - J90.og.yH0());
            int offset = 1;
            W10.E40(A20 + 1, SB0 + 1);
            if (W10.hi0()) offset = W10.og.yH0() - 2;
            C5.E40(A20 + 1, SB0 + offset);
            offset = 7;
            Xt.E40(cz() - Xt.og.De0() - 1, SB0);
            if (Xt.hi0()) offset = Xt.og.yH0() + 3;
            Hh.E40(cz() - Hh.og.De0() - 3, SB0 + offset);
            Q50.E40(Hh.A20 + 17, Hh.SB0 - 1);
        }
    }

    public final void nA() {
        if (!tw0_0.kz0()) {
            Ix0.E40(A20 + 4, SB0 + 36);
            Lu0.oY(40, 8);
            Lu0.E40(A20 + 2, SB0 + 30);
            J90.E40(A20 + 2, SB0 + OB - J90.og.yH0() - 1);
            int offset = 1;
            if (W10.hi0()) {
                W10.E40(A20 + 1, SB0 + 1);
                offset = 15;
            }
            if (C5.hi0()) {
                C5.E40(A20 + offset + 1, SB0 + 1);
                offset += 14;
            }
            Xt.E40(A20 + offset + 1, SB0 + 1);
            Hh.E40(A20 + 30, SB0 + 18);
            Q50.E40(Hh.A20, Hh.SB0 - 15);
        } else if (tw0_0.kz0()) {
            Ix0.lt0();
            Ix0.E40(A20 + (Mx - Ix0.Mx) - 6, VM() - Ix0.k5() - 2);
            Lu0.oY(tp0.EJ0 > 1.0F ? 72 : 40, 8);
            Lu0.E40(A20 + 4, SB0 + 65);
            J90.E40(A20 + 2, VM() - J90.og.yH0());
            int offset = 1;
            W10.E40(A20 + 1, SB0 + 1);
            if (W10.hi0()) offset = W10.og.De0() - 2;
            C5.E40(A20 + offset + 3, SB0 + 1);
            Xt.E40(cz() - Xt.og.De0() - 1, SB0 + 1);
            Hh.E40(A20 + 33, SB0 + 20);
            Q50.E40(Hh.A20 + 17, Hh.SB0 - 1);
        }
    }

    public abstract void Ol0();

    public final void K8() {
        super.K8();
        Ol0();
    }

    public final void aUX(zk0_1 context) {
        if (R4) {
            Yy radial = BK;
            int x = A20;
            int y = SB0;
            if (radial.PY != x || radial.eD != y || radial.o60 != 100 || radial.ey != 100) {
                radial.PY = x;
                radial.eD = y;
                radial.o60 = 100;
                radial.ey = 100;
                radial.T30();
            }
            radial = BK;
            ui_1 batch = tw0_0.LD0.j20;
            LPT6_ image = radial.zf0;
            if (image != null) batch.Il0(image.OB, radial.cP, radial.uW);
        }
        Rv0 = tf0();
        super.aUX(context);
    }

    public boolean tf0() {
        return !XW;
    }

    public final void Kp0(zk0_1 context, int x, int y, int value) {
        if (XW && Bu0) tp0.mt0(x, y);
    }

    public final void Mj0(boolean enabled) {
        JA = enabled;
    }

    public abstract boolean HP();

    public void Zq0() {
    }

    public final void uA(boolean active) {
        XW = active;
        M.j70(Rf0, active);
    }

    public final void o60(b6_0 predicate) {
        t8 = predicate;
    }

    public final void tL0(boolean enabled) {
        Bu0 = enabled;
    }

    public final void j10(boolean radial) {
        R4 = radial;
    }

    public final void Ag0(zi0_1 handler) {
        Sg = handler;
    }

    public final void Hv0() {
        uh = VY.At;
    }
}
