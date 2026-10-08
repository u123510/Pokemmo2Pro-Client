package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

import java.util.ArrayList;

public class MailAttachmentSlotComponent extends BaseComponent {
    public static final MD0 rq;
    public static final MD0 GA;
    public final ArrayList<com2__3> g6;
    public final ia0_1 ms0;
    public final le0_2 e4;
    public final uk0_2 On;
    public final uk0_2 Qf;
    public fy_2 Nx0;
    public xe_1 m50;
    public xe_1 BP;
    public boolean pr;
    public int DK0;
    public jg0_1 OA0;
    public com2__3 bC;

    public MailAttachmentSlotComponent() {
        super();
        this.g6 = new ArrayList<>();
        this.ms0 = new ia0_1();
        this.e4 = new le0_2();
        this.On = new uk0_2();
        this.Qf = new uk0_2();
        this.OA0 = jg0_1.wk;
        this.ms0.uf("tabbox");
        this.e4.uf("");
        this.Qf.uf("");
        this.Qf.m00();
        this.e4.SL(this.ms0);
        this.On.SL(this.Qf);
        super.F9(0, this.On);
        super.F9(1, this.e4);
        this.e4.Na("nextTab", this::qq0);
        this.e4.Na("prevTab", this::pt0);
        this.e4.Oq0(false);
    }

    static {
        rq = MD0.cB("firstTab");
        GA = MD0.cB("lastTab");
    }

    public final String Ck() {
        return "tabbedpane";
    }

    public final void Ib(Jn0 source) {
        super.Ib(source);
        this.qo(source);
    }

    public void qo(Jn0 source) {
        jg0_1 position = (jg0_1) ((LC0) source).N30("tabPosition", false, jg0_1.class, jg0_1.wk);
        if (position == null) {
            throw new NullPointerException("tabPosition");
        }
        if (this.OA0 == position) {
            return;
        }
        this.OA0 = position;
        int direction = position.Tk ? 1 : 2;
        if (direction == 0) {
            throw new NullPointerException("direction");
        }
        if (this.ms0.Ox != direction) {
            this.ms0.Ox = direction;
            this.ms0.COm3();
        }
        this.COm3();
    }

    public final void I6(boolean enabled) {
        if (this.pr == enabled) {
            return;
        }
        this.pr = enabled;
        if (this.Nx0 == null && enabled) {
            this.Nx0 = new fy_2();
            this.Nx0.uf("scrollControls");
            this.m50 = new xe_1(null, false, null);
            this.m50.uf("scrollLeft");
            this.m50.RR(new yf0_1((f.P8)(Object)this, -1));
            this.BP = new xe_1(null, false, null);
            this.BP.uf("scrollRight");
            this.BP.RR(new yf0_1((f.P8)(Object)this, 1));
            ya_1 scrollButtons = XN.sA(this.Nx0, this.Nx0).Kn0(this.m50);
            // p4 is synthetic in the dependency class and is the Nx0 root passed to XN.sA.
            scrollButtons.Vv(new al_1(this.Nx0, "scrollButtons"));
            scrollButtons = scrollButtons.Kn0(this.BP);
            ya_1 scrollLayout = D5.fE0(this.Nx0, this.Nx0)
                    .Kn0(this.m50)
                    .Kn0(this.BP);
            this.Nx0.WQ(scrollButtons);
            this.Nx0.x40(scrollLayout);
            super.F9(2, this.Nx0);
        }
        this.e4.IM = enabled;
        if (this.Nx0 != null) {
            this.Nx0.Ll(enabled);
        }
        this.COm3();
    }

    public final void V00(int index) {
        if (index < 0 || index >= this.g6.size()) {
            return;
        }
        this.Zd(this.g6.get(index));
    }

    public final void Zd(com2__3 tab) {
        if (tab != null && tab.s90.K20 != this.ms0) {
            throw new IllegalArgumentException("Invalid tab");
        }
        if (this.bC == tab) {
            return;
        }
        com2__3 previous = this.bC;
        this.bC = tab;
        if (previous != null) {
            previous.hI();
        }
        if (tab != null) {
            if (tab.HA != null) {
                tab.HA.run();
            }
            tab.hI();
        }
        if (this.pr) {
            this.Iu();
            int start;
            int end;
            int viewport;
            if (this.OA0.Tk) {
                start = tab.s90.A20 - this.ms0.A20;
                end = tab.s90.Mx + start;
                viewport = this.e4.Mx;
            } else {
                start = tab.s90.SB0 - this.ms0.SB0;
                end = tab.s90.OB + start;
                viewport = this.e4.OB;
            }
            int margin = (viewport + 19) / 20;
            int delta = start - margin;
            int target = end + margin;
            int current = this.DK0;
            if (delta < current) {
                this.ad0(delta);
            } else if (target > current + viewport) {
                this.ad0(target - viewport);
            }
        }
        if (tab != null && tab.to0 != null) {
            tab.to0.BL();
        }
    }

    public final int Bb() {
        if (this.g6.isEmpty()) {
            return -1;
        }
        return this.g6.indexOf(this.bC);
    }

    public final void Lb(int offset) {
        if (!this.g6.isEmpty()) {
            int index = this.g6.indexOf(this.bC);
            if (index < 0) {
                offset = 0;
            } else {
                offset = (index + offset) % this.g6.size();
                offset = (this.g6.size() + offset) % this.g6.size();
            }
            this.Zd(this.g6.get(offset));
        }
    }

    public final int R1() {
        int value;
        if (this.OA0.Tk) {
            if (this.pr) {
                value = this.ms0.e80 + this.ms0.NV;
                value += ia0_1.Bb0(this.ms0);
                value += this.Nx0.m0();
            } else {
                value = this.ms0.R1();
            }
            value = Math.max(this.On.R1(), value);
        } else {
            value = this.On.R1() + this.ms0.R1();
        }
        return Math.max(super.R1(), this.e80 + this.NV + value);
    }

    public final int Se() {
        int value;
        if (this.OA0.Tk) {
            value = this.On.Se() + this.ms0.Se();
        } else if (this.pr) {
            value = this.ms0.y9 + this.ms0.Cz;
            value += ia0_1.Pj(this.ms0);
            value += this.Nx0.rm0();
            value = Math.max(this.On.Se(), value);
        } else {
            value = this.ms0.Se();
            value = Math.max(this.On.Se(), value);
        }
        return Math.max(super.Se(), this.y9 + this.Cz + value);
    }

    public final int pi0() {
        if (this.OA0.Tk) {
            int value;
            if (this.pr) {
                value = this.ms0.e80 + this.ms0.NV;
                value += ia0_1.rg0(this.ms0);
                value += this.Nx0.m0();
            } else {
                value = this.ms0.m0();
            }
            return Math.max(this.On.m0(), value);
        }
        return this.On.m0() + this.ms0.m0();
    }

    public final int zs0() {
        if (this.OA0.Tk) {
            return this.On.rm0() + this.ms0.rm0();
        }
        int value;
        if (this.pr) {
            value = this.ms0.y9 + this.ms0.Cz;
            value += ia0_1.Lw0(this.ms0);
            value += this.Nx0.rm0();
        } else {
            value = this.ms0.rm0();
        }
        return Math.max(this.On.rm0(), value);
    }

    public final void K8() {
        int left = 0;
        int top = 0;
        int contentWidth = this.ms0.m0();
        int contentHeight = this.ms0.rm0();
        if (this.pr) {
            left = this.Nx0.m0();
            top = this.Nx0.rm0();
        }
        if (this.OA0.Tk) {
            contentHeight = Math.max(top, contentHeight);
        } else {
            contentWidth = Math.max(left, contentWidth);
        }
        this.ms0.oY(contentWidth, contentHeight);
        switch (this.OA0.ordinal()) {
            case 4:
                this.e4.oY(contentWidth, contentHeight);
                this.On.oY(this.a3(), this.k5());
                this.On.E40(0, 0);
                break;
            case 3:
                this.e4.E40(this.A20 + this.e80, this.SB0 + this.y9 - contentHeight + this.e4.OB);
                this.e4.oY(Math.max(0, this.a3() - left), contentHeight);
                this.On.oY(this.a3(), Math.max(0, this.k5() - contentHeight));
                this.On.E40(this.A20 + this.e80, this.SB0 + this.y9);
                break;
            case 2:
                this.e4.E40(this.A20 + this.e80 - contentWidth + this.e4.Mx, this.SB0 + this.y9);
                this.e4.oY(contentWidth, Math.max(0, this.k5() - top));
                this.On.oY(Math.max(0, this.a3() - contentWidth), this.k5());
                this.On.E40(this.A20 + this.e80, this.SB0 + this.y9);
                break;
            case 1:
                this.e4.E40(this.A20 + this.e80, this.SB0 + this.y9);
                this.e4.oY(contentWidth, Math.max(0, this.k5() - top));
                this.On.oY(Math.max(0, this.a3() - contentWidth), this.k5());
                this.On.E40(this.e4.A20 + this.e4.Mx, this.SB0 + this.y9);
                break;
            case 0:
                this.e4.E40(this.A20 + this.e80, this.SB0 + this.y9);
                this.e4.oY(Math.max(0, this.a3() - left), contentHeight);
                this.On.oY(this.a3(), Math.max(0, this.k5() - contentHeight));
                this.On.E40(this.A20 + this.e80, this.e4.SB0 + this.e4.OB);
                break;
            default:
                break;
        }
        if (this.Nx0 != null) {
            if (this.OA0.Tk) {
                this.Nx0.E40(this.e4.A20 + this.e4.Mx, this.e4.SB0);
                this.Nx0.oY(left, contentHeight);
            } else {
                this.Nx0.E40(this.e4.A20, this.e4.SB0 + this.e4.OB);
                this.Nx0.oY(contentWidth, top);
            }
        }
        this.ad0(this.DK0);
    }

    public final void em() {
        throw new UnsupportedOperationException("use addTab/removeTab");
    }

    public final le0_2 fC0(int index) {
        throw new UnsupportedOperationException("use addTab/removeTab");
    }

    public final void g30() {
        for (int i = 0; i < this.g6.size(); i++) {
            KG0 style = this.g6.get(i).s90.M;
            style.j70(rq, i == 0);
            style.j70(GA, i == this.g6.size() - 1);
        }
    }

    public final void ad0(int value) {
        int max;
        if (this.OA0.Tk) {
            max = this.ms0.Mx - this.e4.Mx;
        } else {
            max = this.ms0.OB - this.e4.OB;
        }
        value = Math.max(0, Math.min(value, max));
        this.DK0 = value;
        if (this.OA0.Tk) {
            this.ms0.E40(this.e4.A20 - value, this.e4.SB0);
        } else {
            this.ms0.E40(this.e4.A20, this.e4.SB0 - value);
        }
        if (this.Nx0 != null) {
            this.m50.pw0(value > 0);
            this.BP.pw0(value < max);
        }
    }

    public final void pt0() {
        this.Lb(-1);
    }

    public final void qq0() {
        this.Lb(1);
    }

    public final com2__3 Wq(le0_2 content, String title) {
        com2__3 tab = new com2__3((f.P8)(Object)this);
        tab.s90.SU(title);
        tab.gn(content);
        this.ms0.F9(this.ms0.fU(), tab.s90);
        this.g6.add(tab);
        if (this.g6.size() == 1) {
            this.Zd(tab);
        }
        this.g30();
        return tab;
    }

    public final void F9(int index, le0_2 content) {
        throw new UnsupportedOperationException("use addTab/removeTab");
    }

    public final com2__3 DD() {
        return this.g6.get(3);
    }
}
