package cn.pokemmo.ui.widget.layout;

import f.*;
import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class SlotGridContainerLayout extends BaseLayoutBox {
    public static final gn_0 Nk = new gn_0(1610612735);
    public final _volatile dz0;
    public ye_0[] Pm;
    public final QT Br;
    public final int Uq0;
    public int yM;
    public Consumer eB;
    public boolean po;
    public int Be;
    public int FA;
    public boolean xm0;

    public SlotGridContainerLayout(QT source, _volatile mode, int index) {
        super();
        this.yM = 0;
        this.uf("dialoglayout");
        this.Br = source;
        this.dz0 = mode;
        this.Uq0 = index;
        this.CW();
    }

    public static void g90(jb0_0 item) {
        item.LPT8(false);
    }

    static {
    }

    public final void DF(int x, int y) {
        if (!this.xm0) {
            return;
        }
        ye_0[] items = this.Pm;
        for (ye_0 item : items) {
            int left = item.A20;
            int minX = Math.min(this.Be, x) - item.Mx;
            if (left < minX || left > Math.max(this.Be, x)) {
                item.ER.lK0(false);
                continue;
            }
            int top = item.SB0;
            int minY = Math.min(this.FA, y) - item.OB;
            if (top < minY || top > Math.max(this.FA, y)) {
                item.ER.lK0(false);
                continue;
            }
            item.ER.lK0(true);
        }
    }

    public final void wn0(int x, int y) {
        if (!this.xm0) {
            return;
        }
        ye_0[] items = this.Pm;
        for (ye_0 item : items) {
            int left = item.A20;
            int minX = Math.min(this.Be, x) - item.Mx;
            if (left < minX || left > Math.max(this.Be, x)) {
                item.ER.lK0(false);
                continue;
            }
            int top = item.SB0;
            int minY = Math.min(this.FA, y) - item.OB;
            if (top < minY || top > Math.max(this.FA, y)) {
                item.ER.lK0(false);
                continue;
            }
            if (item.ol0() == null) {
                item.ER.lK0(false);
            } else {
                item.LPT8(true);
            }
        }
        this.xm0 = false;
    }

    public final void m90(short index) {
        this.EP(index);
    }

    public void EP(int index) {
        this.yM = index;
        Consumer callback = this.eB;
        if (callback != null) {
            callback.accept(this.Pm[index].ol0());
        }
        if (this.po) {
            ye_0 item = this.Pm[index];
            this.DF(item.A20, item.SB0);
        }
        this.Pm[index].BL();
    }

    public void a80(Jn0 value) {
    }

    public final void C(zk0_1 value) {
        this.PH(null);
    }

    public final ye_0[] uO() {
        ArrayList<ye_0> result = new ArrayList<>();
        for (ye_0 item : this.Pm) {
            if (item.ER.U20() && item.ol0() != null) {
                result.add(item);
            }
        }
        return result.toArray(new ye_0[0]);
    }

    public void PH(String[] filters) {
        BR popup = tw0_0.rl;
        if (popup == null || popup.r1(_volatile.BV) == null) {
            return;
        }
        if (filters != null && filters.length == 1 && filters[0].isEmpty()) {
            filters = null;
        }
        int matches = 0;
        for (ye_0 item : this.Pm) {
            item.iV(item.Vt0);
            VU value = item.ol0();
            if (value != null) {
                boolean visible = true;
                tw0_0.Dc0();
                item.yj0 = lb0_2.Ky(value, false, false, true);
                item.yB0();
                item.A80 = "tooltip-markup";
                item.GH0 = 300;
                QT source = this.Br;
                I2 iterator = source.xw.ZD();
                while (iterator.hasNext()) {
                    Mg group = (Mg) iterator.next();
                    if (!group.Ev0(value.I8, value.SC)) {
                        visible = false;
                        break;
                    }
                }
                if (visible && !iterator.hasNext()) {
                    if (filters == null && source.xw.KB == 0) {
                        visible = false;
                    } else {
                        visible = value.ln0(filters);
                    }
                }
                if (visible) {
                    matches++;
                }
                item.M.j70(sg_2.AL, visible);
                item.ER.lK0(false);
            } else {
                item.z70 = null;
                item.E1(null);
                item.yj0 = null;
                item.yB0();
                item.ER.lK0(false);
            }
        }
        Op0 target;
        if (this.dz0 == _volatile.Kb) {
            target = this.Br.BW;
        } else {
            QT source = this.Br;
            target = (Op0) source.rG0[source.p6.g60(this.Uq0)].kh0;
        }
        QT source = this.Br;
        if (source.xw.KB != 0) {
            return;
        }
        cg_0 input = source.v70;
        if (input == null || ((wn0_0) input.dI0).YA.toString().isEmpty()) {
            return;
        }
        if (target == null) {
            return;
        }
        if (matches == 0) {
            target.z70 = new N1(new t5_0(target), Nk);
        } else if (target.z70 != null) {
            target.z70 = null;
        }
    }

    public final void Sn0(jb0_0 source, int x, int y) {
        if (!source.tp0.AU() && (!this.Br.wf0() || source.ER.U20())) {
            this.Br.vu0(source, Arrays.asList(this.uO()));
            if (this.xm0) {
                this.DF(x, y);
            } else {
                this.Br.fx0(x, y);
            }
            return;
        }
        this.xm0 = true;
        this.Be = x;
        this.FA = y;
        this.DF(x, y);
    }

    public boolean nd0(i70_0 event) {
        if (E00.ZU(event.zu) && event.iT()) {
            int id = event.finally$;
            if (rp_0.nK0 != null && rp_0.nK0.Ov(id) && this.Br.W70 == null) {
                ye_0[] items = this.uO();
                if (items.length > 0) {
                    Arrays.stream(items).forEach(SlotGridContainerLayout::g90);
                    return true;
                }
                lpt6__0.v90((le0_2) this.Br.rG0[this.Br.Z9].kh0);
                return true;
            }
            id = event.finally$;
            if (rp_0.sJ0 != null && rp_0.sJ0.Ov(id)) {
                if (this.po) {
                    if (this.Br.W70 != null) {
                        return true;
                    }
                    this.FL(false);
                    ye_0 item = this.YG()[this.yM];
                    ye_0[] selected = this.uO();
                    Qy0.yI0.YD0((f.NK)(Object)this, selected, item, item.A20, item.SB0, false);
                    return true;
                }
                if (this.Br.wf0()) {
                    if (this.Br.W70 != null) {
                        return true;
                    }
                    this.FL(!this.po);
                    return true;
                }
            }
            id = event.finally$;
            if (rp_0.I90 != null && rp_0.I90.Ov(id)) {
                this.yM--;
                if (this.yM < 0) {
                    this.yM = 0;
                }
                this.EP(this.yM);
                return true;
            }
            id = event.finally$;
            if (rp_0.Ni != null && rp_0.Ni.Ov(id)) {
                this.yM++;
                if (this.yM >= this.Pm.length) {
                    this.yM = this.Pm.length - 1;
                }
                if (this.yM % this.sD0() == 0) {
                    if (lpt6__0.v90(this.Br.Ly)) {
                        this.Br.Ly.wm = true;
                        this.Br.Ly.kn0(true);
                    }
                    this.yM--;
                } else {
                    this.EP(this.yM);
                }
                return true;
            }
            int page = this.sD0();
            id = event.finally$;
            if (rp_0.kC0 != null && rp_0.kC0.Ov(id)) {
                int next = this.yM - page;
                this.yM = next;
                if (next < 0) {
                    this.yM = 0;
                    ((le0_2) this.Br.rG0[this.Br.Z9].kh0).BL();
                    return true;
                }
                this.EP(next);
                return true;
            }
            id = event.finally$;
            if (rp_0.synchronized$ != null && rp_0.synchronized$.Ov(id)) {
                int next = this.yM + page;
                this.yM = next;
                if (next >= this.Pm.length) {
                    next -= page;
                    this.yM = next;
                    this.Br.iq.Uz(1, false);
                    return true;
                }
                this.EP(next);
                return true;
            }
        }
        if (event.Li()) {
            if (event.LI0() && this.xm0) {
                this.wn0(event.f8, event.AN);
            } else if (event.VP) {
                if (this.xm0) {
                    this.DF(event.f8, event.AN);
                } else if (!(this instanceof tz0_0)) {
                    this.xm0 = true;
                    this.Be = event.f8;
                    this.FA = event.AN;
                    this.DF(event.f8, event.AN);
                }
            }
            return true;
        }
        return super.nd0(event);
    }

    public ye_0[] YG() {
        return this.Pm;
    }

    public final void FL(boolean value) {
        ye_0 item = this.YG()[this.yM];
        if (!this.po && value) {
            int x = item.A20;
            int y = item.SB0;
            this.xm0 = true;
            this.Be = x;
            this.FA = y;
            this.DF(x, y);
        }
        if (this.po && !value) {
            this.wn0(item.A20, item.SB0);
        }
        this.po = value;
        if (item.Of()) {
            item.M.j70(sg_2.throws$, value);
        }
    }

    public int sD0() {
        return 10;
    }

    public final _volatile bC0() {
        return this.dz0;
    }

    public void CW() {
        this.Pm = new ye_0[60];
        EI0 listener = new EI0((f.NK)(Object)this);
        I7 group = new I7(this);
        Hm0 layout = new Hm0(this);
        Mj slotModel = tw0_0.rl.r1(this.dz0);
        if (slotModel == null && this.dz0 == _volatile.Kb) {
            slotModel = new fW();
        }
        jb0_0[] row = new jb0_0[10];
        int rowIndex = 0;
        int index = 0;
        while (index < this.Pm.length) {
            ye_0 item = new ye_0(this.Br, (f.NK)(Object)this, slotModel,
                (short) (this.Uq0 * 60 + index));
            this.Pm[index] = item;
            item.Sg = listener;
            final short itemIndex = (short) index;
            item.Nj = () -> this.m90(itemIndex);
            int count = rowIndex + 1;
            row[rowIndex] = item;
            if (count % 10 != 0) {
                rowIndex = count;
            } else {
                layout.X20(new I7(this).LPt3((le0_2[]) (Object) row));
                group.X20(new Hm0(this).LPt3((le0_2[]) (Object) row));
                rowIndex = 0;
            }
            index++;
        }
        this.WQ(new I7(this).Xq(layout));
        this.x40(new Hm0(this).Xq(group));
    }

    public void Of0(int index) {
        this.EP(index);
    }
}
