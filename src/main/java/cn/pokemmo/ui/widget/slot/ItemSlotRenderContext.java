package cn.pokemmo.ui.widget.slot;

import f.*;

public class ItemSlotRenderContext extends G20 implements dn0_0 {
    public static final MD0 iS;
    public gi_0 Vu;
    public boolean XG;
    public K5 zf;

    public ItemSlotRenderContext(HD0 header, K5 item, jc_2 context) {
        super("", "");
        this.uf("tm-button");
        this.Gx().Nk(new Wr[]{gh_1.Jh0().Xj0(item.LW())});
        if (tw0_0.kz0()) {
            this.Gx().nq0(48, 48);
            this.Gx().Gy0(7, 10);
        } else {
            this.Gx().nq0(24, 24);
            this.Gx().Gy0(7, 5);
        }
        short ignored = item.pm();
        this.zf = item;
        this.RR(() -> this.Aj0(header, item, context));
    }

    static {
        iS = MD0.cB("dragActive");
        MD0.cB("dropOk");
        MD0.cB("dropBlocked");
    }

    @Override
    public final K5 Ft0() {
        return this.zf;
    }

    @Override
    public final void K8() {
        super.K8();
        if (!tw0_0.kz0() && this.Mx > this.Ya0) {
            this.oY(this.OB, this.Ya0);
        }
    }

    @Override
    public final boolean nd0(i70_0 event) {
        if (tw0_0.kz0()) {
            return super.nd0(event);
        }
        if (!event.Li()) {
            return super.nd0(event);
        }

        if (this.XG) {
            if (event.LI0()) {
                gi_0 drag = this.Vu;
                if (drag != null) {
                    Ms0.Bs0(drag.fi, this, event);
                }
                this.XG = false;
                this.M.j70(iS, false);
                return true;
            }
            gi_0 drag = this.Vu;
            if (drag != null) {
                drag.fi.hU(event);
            }
            return true;
        }

        if (event.VP) {
            this.XG = true;
            this.M.j70(iS, true);
            gi_0 drag = this.Vu;
            if (drag != null) {
                Ms0.K60(drag.fi, this, event);
            }
        } else {
            int key = event.zu;
            if (E00.C10(key) && event.nA0 == 0 && key == 4) {
                a7_0.bH(this.ER.Fc0);
                return true;
            }
        }
        return super.nd0(event);
    }

    @Override
    public final void Dw0(zk0_1 window) {
        if (!this.XG) {
            super.Dw0(window);
        }
    }

    @Override
    public final void Kp0(zk0_1 window, int x, int y, int unused) {
        if (!tw0_0.kz0()) {
            this.zW.mt0(x, y);
        }
    }

    @Override
    public final boolean f2() {
        return !tw0_0.kz0();
    }

    @Override
    public final void UR(K5 item) {
        short ignored = item.nn.wQ;
        this.zf = item;
        this.zW.Nk(new Wr[]{gh_1.aH0.F10(item.cL, false)});
    }

    public final void Aj0(HD0 header, K5 item, jc_2 context) {
        if (tw0_0.kz0()) {
            header.rL0(item);
            return;
        }
        Vt0 panel = context.UX(item, this);
        UA.rL(panel, this, this.A20 + 25, this.SB0 + 25);
    }
}
