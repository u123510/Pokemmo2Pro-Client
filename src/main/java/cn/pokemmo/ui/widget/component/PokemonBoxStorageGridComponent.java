package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

public abstract class PokemonBoxStorageGridComponent extends BaseComponent implements com5__5, kq_2 {
    public static final MD0 ml0;
    public static final MD0 P0;
    public static final MD0 Fm;
    public static final MD0 Tt;
    public static final MD0 sp;
    public static final MD0 jC0;
    public static final MD0 az0;
    public static final MD0 de;
    public static final MD0 r2;
    public static final MD0 uK;
    public static final boolean fB0;
    public final Ox0 fE0;
    public final ch0_1 IT;
    public final R1 jS;
    public final Gy0 b2;
    public final ge0_0 zY;
    public final fa_1 RK0;
    public final yy_0 ey;
    public ha_0 bL;
    public rd_0 ap0;
    public boolean aS;
    public W20[] G70;
    public final Fx0[] Vw;
    public jf0_0 G00;
    public dp_2[] Uj0;
    public wl0_2 fU;
    public wl0_2 Yt;
    public wl0_2 n90;
    public Jn0 uH0;
    public int mq;
    public int ip0;
    public dc0_0 cI;
    public dc0_0 Uv0;
    public dc0_0 V80;
    public boolean FK;
    public int Dx0;
    public int gc0;
    public int Ux;
    public int XK;
    public boolean Sd;
    public boolean ik;
    public boolean ZE0;
    public int bs0;
    public int eL;
    public int wU;
    public int uE;
    public int Tl;
    public int px0;
    public boolean Kc;
    public boolean rS;
    public int RW;
    public int j0;
    public int c00;
    public int CC;
    public int Un0;
    public int kX;
    public int aa0;
    public int KQ;
    public int Cr;

    static {
        fB0 = !PokemonBoxStorageGridComponent.class.desiredAssertionStatus();
        ml0 = MD0.cB("firstColumnHeader");
        P0 = MD0.cB("lastColumnHeader");
        Fm = MD0.cB("rowSelected");
        Tt = MD0.cB("rowHover");
        sp = MD0.cB("rowDropTarget");
        jC0 = MD0.cB("rowOdd");
        az0 = MD0.cB("leadRow");
        de = MD0.cB("selected");
        r2 = MD0.cB("sortAscending");
        uK = MD0.cB("sortDescending");
    }

    public PokemonBoxStorageGridComponent() {
        super();
        this.Ux = 32;
        this.XK = 256;
        this.RW = -1;
        this.j0 = Integer.MIN_VALUE;
        this.c00 = -1;
        this.CC = -1;
        this.zY = new ge0_0();
        this.fE0 = new Ox0();
        this.RK0 = new fa_1();
        this.IT = new ch0_1((f.Nj)(Object)this);
        this.jS = new R1((f.Nj)(Object)this);
        this.ey = new yy_0((f.Nj)(Object)this);
        this.Vw = new Fx0[8];
        this.b2 = new Gy0();
        this.F9(0, this.b2);
        this.Oq0(true);
    }

    public final void Q2(wl0_2 v1, int i2) {
        KG0 v3 = this.M;
        int i4 = this.E60();
        int i5 = this.ey.iE();
        int i6 = this.SB0 + this.y9 - this.eL + this.mq;
        int i7 = this.DH(this.wU);
        int i8 = this.wU;
        while (i8 <= this.Tl) {
            int i9 = this.Ut(i8);
            int i10 = i9 - i7;
            int rowY = i6 + i7;
            boolean i12;
            MD0 v11 = Fm;
            jf0_0 v12 = this.G00;
            if (v12 != null) {
                i12 = v12.Vg0.iK0(i8);
            } else {
                i12 = false;
            }
            v3.j70(v11, i12);
            v11 = Tt;
            if (this.Un0 == 0 && this.j0 >= rowY && this.j0 < rowY + i10) {
                i12 = true;
            } else {
                i12 = false;
            }
            v3.j70(v11, i12);
            v11 = az0;
            if (i2 == i8) {
                i12 = true;
            } else {
                i12 = false;
            }
            v3.j70(v11, i12);
            v11 = sp;
            if (this.RW == i8) {
                i12 = true;
            } else {
                i12 = false;
            }
            v3.j70(v11, i12);
            v11 = jC0;
            if ((i8 & 1) == 1) {
                i12 = true;
            } else {
                i12 = false;
            }
            v3.j70(v11, i12);
            v1.uf(v3, i4, rowY, i5, i10);
            i8++;
            i7 = i9;
        }
    }

    public final void dt(int i1) {
        if (this.i9()) {
            if (!fB0 && this.kX + 1 >= this.gc0) {
                throw new AssertionError();
            }
            i1 = Math.min(i1, this.Cr - this.ip0 * 2);
            W20[] v2 = this.G70;
            v2[this.kX].Uf = i1;
            v2[this.kX + 1].Uf = this.Cr - i1;
            this.ZE0 = true;
            this.COm3();
        } else {
            this.bM0(this.kX, i1);
        }
    }

    public final void Dp0() {
        jf0_0 v1 = new jf0_0(new fi0_1());
        jf0_0 v3 = this.G00;
        if (v3 != v1) {
            if (v3 != null && v3.w9 != null) {
                v3.w9 = null;
                v3.Vg0.cd();
                v3.Vg0.rk = -1;
                v3.Vg0.aW = -1;
            }
            this.G00 = v1;
            PokemonBoxStorageGridComponent owner = v1.w9;
            if (owner != this) {
                if (owner == null) {
                    v1.w9 = (f.Nj)(Object)this;
                    v1.Vg0.cd();
                    v1.Vg0.rk = -1;
                    v1.Vg0.aW = -1;
                } else {
                    throw new IllegalStateException("selection manager still in use");
                }
            }
        }
    }

    public final void Qm0(dp_2 v1) {
        this.Uj0 = (dp_2[]) a7_0.gE(this.Uj0, v1, dp_2.class);
    }

    public final void p5(boolean i1) {
        if (i1 && this.ap0 == null) {
            rd_0 v1 = new rd_0((f.Nj)(Object)this, this.Dx0);
            this.ap0 = v1;
            this.Sd = true;
            this.COm3();
        } else if (!i1) {
            this.ap0 = null;
        }
    }

    public final int Tl0(int i1) {
        if (i1 < 0) {
            return -1;
        }
        rd_0 v2 = this.ap0;
        if (v2 != null) {
            return v2.gC(i1);
        }
        return Math.min(this.Dx0 - 1, i1 / this.Ux);
    }

    public final int DH(int i1) {
        if (i1 < 0 || i1 >= this.Dx0) {
            throw new IndexOutOfBoundsException("row");
        }
        rd_0 v2 = this.ap0;
        if (v2 != null) {
            return v2.eC0(i1);
        }
        return i1 * this.Ux;
    }

    public final int Ut(int i1) {
        if (i1 < 0 || i1 >= this.Dx0) {
            throw new IndexOutOfBoundsException("row");
        }
        rd_0 v2 = this.ap0;
        if (v2 != null) {
            return v2.eC0(i1 + 1);
        }
        return (i1 + 1) * this.Ux;
    }

    public final int Us0(int i1) {
        this.P9(i1);
        return this.ey.eC0(i1 + 1);
    }

    public final void bM0(int i1, int i2) {
        this.P9(i1);
        this.G70[i1].Uf = i2;
        yy_0 v2 = this.ey;
        PokemonBoxStorageGridComponent dk = this;
        int i3;
        if (dk.i9()) {
            v2.VS();
            i3 = dk.Rs(dk.G70[i1].Th0);
        } else {
            i3 = dk.Rs(dk.G70[i1].m0());
            if (dk.FK) {
                i3 = Math.max(i3, dk.G70[i1].R1());
            }
        }
        if (v2.IF(i1, i3)) {
            this.COm3();
        }
    }

    public final int Se() {
        return Math.max(super.Se(), this.mq);
    }

    public final int pi0() {
        if (super.a3() == 0) {
            yy_0 ey = this.ey;
            PokemonBoxStorageGridComponent dk = this;
            int rowCount = dk.gc0;
            int result;
            if (!dk.i9()) {
                result = 0;
                for (int row = 0; row < rowCount; row++) {
                    result += dk.Rs(dk.G70[row].m0());
                }
            } else if (dk.G70 == null) {
                result = 0;
            } else {
                fy_2 panel = new fy_2();
                java.util.ArrayList<Object> items = new java.util.ArrayList<>();
                W20[] rows = dk.G70;
                for (int row = 0; row < rows.length; row++) {
                    items.add(rows[row].Gs0);
                    panel.GG0 = true;
                    panel.rc();
                }
                result = 0;
                int offset = 0;
                int index = 0;
                int size = items.size();
                while (index < size) {
                    is0_0 item = (is0_0) items.get(index);
                    if (panel.gI || item.D4()) {
                        offset += item.Kn(result);
                    }
                    index++;
                }
                result = offset;
            }
            return result;
        }
        if (this.ZE0 && super.a3() > 0) {
            yy_0 ey = this.ey;
            int count = this.gc0;
            if (ey.p2.length < count) {
                ey.p2 = new int[count];
            }
            ey.VQ = count;
            ey.DE(0, count);
            ey.iB0(0, count);
            this.ZE0 = false;
        }
        int rowCount = this.gc0;
        if (rowCount > 0) {
            return this.Us0(rowCount - 1);
        }
        return 0;
    }

    public final int zs0() {
        if (this.Sd) {
            rd_0 v1 = this.ap0;
            if (v1 != null) {
                int count = this.Dx0;
                if (v1.p2.length < count) {
                    v1.p2 = new int[count];
                }
                v1.VQ = count;
                v1.DE(0, count);
                v1.iB0(0, count);
            }
            this.Sd = false;
        }
        int base = this.mq + 1;
        int rowCount = this.Dx0;
        int lastHeight = rowCount > 0 ? this.Ut(rowCount - 1) : 0;
        return base + lastHeight;
    }

    public final void Vo0(Class<?> v1, Fx0 v2) {
        ge0_0 v3 = this.zY;
        hy_0[] v4 = v3.cb0;
        for (int i6 = 0; i6 < v4.length; i6++) {
            hy_0 v7 = v4[i6];
            while (v7 != null) {
                hy_0 v8 = (hy_0) v7.Qk;
                if (v8 != null && v8.tu0) {
                    a9_0.Fz(v3.cb0, v7);
                    v3.Ah0--;
                }
                v7 = v8;
            }
        }
        hy_0 v4a = (hy_0) a9_0.i40(v3.cb0, v1);
        if (v4a != null) {
            a9_0.Fz(v3.cb0, v4a);
            v3.Ah0--;
        }
        hy_0 v4b = new hy_0(v1, v2, false);
        hy_0[] v1a = (hy_0[]) a9_0.bj(v3.cb0, v3.Ah0);
        int index = (v4b.Yj0 & (v1a.length - 1));
        v4b.Qk = v1a[index];
        v1a[index] = v4b;
        v3.cb0 = v1a;
        v3.Ah0++;
        if (v2 instanceof NA) {
            this.aS = true;
        }
        if (this.uH0 != null) {
            this.bE(v2);
        }
    }

    public final void zG0(int i1) {
        if (i1 < 0 || i1 >= this.Dx0) {
            throw new IndexOutOfBoundsException("row");
        }
        lo0_0 v2 = lo0_0.public$(this);
        int i3 = this.Tl;
        int i4 = this.wU;
        int i5 = i3 - i4;
        boolean i6 = this.rS;
        if (!i6) {
            i5++;
        }
        if (i5 < 1 || v2 == null) {
            return;
        }
        if (i1 < i4 || (i1 == i4 && this.Kc)) {
            v2.Xr0(this.DH(i1));
            return;
        }
        if (i1 > i3 || (i1 == i3 && i6)) {
            int i0 = Math.max(0, this.k5() - this.mq);
            v2.Xr0(Math.max(0, this.Ut(i1) - i0));
        }
    }

    public final boolean i9() {
        lo0_0 v0 = lo0_0.public$(this);
        return v0 == null || v0.m10 == 2;
    }

    public final void P9(int i1) {
        if (i1 < 0 || i1 >= this.gc0) {
            throw new IndexOutOfBoundsException("column");
        }
    }

    public void Ib(Jn0 v1) {
        super.Ib(v1);
        this.uH0 = v1;
        LC0 config = (LC0) v1;
        this.fU = config.uT("columnDivider");
        this.Yt = config.uT("row.background");
        this.n90 = config.uT("row.overlay");
        config.uT("row.dropmarker");
        this.Ux = config.H10(32, "rowHeight");
        this.XK = config.H10(256, "columnHeaderWidth");
        this.mq = config.H10(10, "columnHeaderHeight");
        this.ip0 = config.H10(3, "columnDividerDragableDistance");
        this.FK = config.SD("ensureColumnHeaderMinWidth", false);
        this.zY.getClass();
        java.util.HashSet<Object> values = new java.util.HashSet<>();
        hy_0[] buckets = this.zY.cb0;
        for (int i4 = 0; i4 < buckets.length; i4++) {
            hy_0 node = buckets[i4];
            while (node != null) {
                if (!node.tu0) {
                    values.add(node.gO);
                }
                node = (hy_0) node.Qk;
            }
        }
        java.util.Iterator<Object> iterator = values.iterator();
        while (iterator.hasNext()) {
            this.bE((Fx0) iterator.next());
        }
        this.bE(this.fE0);
        this.ZE0 = true;
        this.uq();
    }

    public final void ZP(Jn0 v1) {
        this.cI = ((LC0) v1).oX("columnResizeCursor");
        LC0 config = (LC0) v1;
        this.Uv0 = config.oX("mouseCursor");
        this.V80 = config.oX("dragNotPossibleCursor");
    }

    public final void bE(Fx0 v1) {
        String v2 = v1.vV();
        if (!fB0 && v2.length() > 1 && v2.charAt(0) == '/') {
            throw new AssertionError();
        }
        Jn0 next = ((xd0_2) this.uH0).vn(v2, true);
        if (next != null) {
            v1.Ib(next);
        }
    }

    public final void em() {
        throw new UnsupportedOperationException();
    }

    public final int E60() {
        return this.A20 + this.e80 - this.bs0;
    }

    public final void N70() {
    }

    public final void Ej0() {
        this.bA0();
        if (this.i9()) {
            this.ZE0 = true;
        }
    }

    public final Object rd(int i1, int i2) {
        int i3 = this.c00;
        if (i3 >= 0 && i3 < this.Dx0) {
            int i4 = this.CC;
            if (i4 >= 0 && i4 < this.gc0) {
                Object value = this.EO(i3, i4);
                if (value != null) {
                    return value;
                }
            }
        }
        return super.rd(i1, i2);
    }

    public void K8() {
        int i1 = super.a3();
        int i2 = Math.max(0, super.k5() - this.mq);
        this.b2.E40(this.A20 + this.e80, this.SB0 + this.y9 + this.mq);
        this.b2.oY(i1, i2);
        if (this.ZE0 && super.a3() > 0) {
            yy_0 v3 = this.ey;
            int i4 = this.gc0;
            if (v3.p2.length < i4) {
                v3.p2 = new int[i4];
            }
            v3.VQ = i4;
            v3.DE(0, i4);
            v3.iB0(0, i4);
            this.ZE0 = false;
        }
        if (this.Sd) {
            rd_0 v3 = this.ap0;
            if (v3 != null) {
                int i4 = this.Dx0;
                if (v3.p2.length < i4) {
                    v3.p2 = new int[i4];
                }
                v3.VQ = i4;
                v3.DE(0, i4);
                v3.iB0(0, i4);
            }
            this.Sd = false;
        }
        if (this.ik && (this.RK0.gV.l1 != 0 || this.aS)) {
            for (int column = 0; column < this.Dx0; column++) {
                for (int row = 0; row < this.gc0; row++) {
                    this.ji(column, row);
                }
            }
            this.ik = false;
        }

        i1 += this.bs0;
        int i3 = this.eL;
        i2 += i3;
        i3 = Math.min(this.Dx0 - 1, Math.max(0, this.Tl0(i3)));
        int i4 = this.gc0 - 1;
        int i5 = 0;
        int i6 = this.bs0;
        if (i6 >= 0) {
            i6 = this.ey.gC(i6);
        } else {
            i6 = -1;
        }
        i4 = Math.min(i4, Math.max(i5, i6));
        i5 = Math.min(this.Dx0 - 1, Math.max(i3, this.Tl0(i2)));
        i6 = this.gc0 - 1;
        int selectedStart = i1;
        if (i6 >= 0) {
            selectedStart = this.ey.gC(selectedStart);
        } else {
            selectedStart = -1;
        }
        i1 = Math.min(i6, Math.max(i4, selectedStart));

        if (this.Dx0 > 0) {
            this.Kc = this.DH(i3) < this.eL;
            this.rS = this.Ut(i5) > i2;
        } else {
            this.Kc = false;
            this.rS = false;
        }

        fa_1 v2 = this.RK0;
        if (v2.gV.l1 != 0) {
            if (i3 > this.wU) {
                int count = this.gc0;
                v2.gu(this.wU, i3 - 1, count, this.IT);
            }
            if (i5 < this.Tl) {
                int end = this.Tl;
                v2.gu(i5 + 1, end, this.gc0, this.IT);
            }
            v2.gu(i3, i5, this.gc0, this.jS);
        }
        this.wU = i3;
        this.uE = i4;
        this.Tl = i5;
        this.px0 = i1;

        if (this.gc0 > 0) {
            int totalHeight = this.E60();
            int offset = 0;
            this.P9(0);
            offset = this.ey.eC0(offset);
            for (int row = 0; row < this.gc0; row++) {
                int rowBottom = this.Us0(row);
                W20 cell = this.G70[row];
                if (cell != null) {
                    if (!fB0 && cell.K20 != this) {
                        throw new AssertionError();
                    }
                    cell.E40(totalHeight + offset + this.ip0, this.SB0 + this.y9);
                    cell.oY(Math.max(0, rowBottom - offset - this.ip0 * 2), this.mq);
                    boolean odd = this.mq > 0;
                    cell.Ll(odd);
                    KG0 state = cell.M;
                    state.j70(ml0, row == 0);
                    state.j70(P0, row == this.gc0 - 1);
                }
                offset = rowBottom;
            }
        }
    }

    public final void FW(zk0_1 v1) {
        int visibleColumn = this.wU;
        if (visibleColumn < 0 || visibleColumn >= this.Dx0) {
            return;
        }
        qq_0 v8 = (qq_0) v1.AK;
        int x = this.A20 + this.e80;
        int y = this.SB0 + this.y9 + this.mq;
        int viewportHeight = super.a3();
        int viewportTop = super.k5() - this.mq;
        int contentHeight = this.E60();
        int contentBottom = this.SB0 + this.y9 - this.eL + this.mq;
        v8.al(x, y, viewportHeight, viewportTop);
        try {
            KG0 state = this.M;
            jf0_0 selection = this.G00;
            int selectedRow = selection == null ? -1 : selection.Vg0.aW;
            wl0_2 background = this.Yt;
            if (background != null) {
                this.Q2(background, selectedRow);
            }
            if (this.fU != null) {
                state.j70(Fm, false);
                int column = this.uE;
                while (column <= this.px0) {
                    int columnOffset = contentHeight + this.Us0(column);
                    this.fU.uf(state, columnOffset, contentBottom, 1, viewportTop);
                    column++;
                }
            }

            int rowTop = this.DH(this.wU);
            int row = this.wU;
            while (row <= this.Tl) {
                int rowBottom = this.Ut(row);
                int rowHeight = rowBottom - rowTop;
                int rowY = contentBottom + rowTop;
                Zh rowStyle = this.Xt(row);
                jf0_0 currentSelection = this.G00;
                boolean selected = currentSelection != null && currentSelection.Vg0.iK0(row);
                int columnIndex = this.uE;
                this.P9(columnIndex);
                columnIndex = this.ey.eC0(columnIndex);
                int lastColumn = this.uE;
                while (lastColumn <= this.px0) {
                    int lastColumnBottom = this.Us0(lastColumn);
                    Fx0 cell = this.Dd0(row, lastColumn, rowStyle);
                    int cellX = contentHeight + columnIndex;
                    int span = 1;
                    if (cell != null) {
                        span = cell.y8();
                        if (span > 1) {
                            lastColumnBottom = this.Us0(
                                    Math.max(this.gc0 - 1, lastColumn + span - 1));
                        }
                        int cellWidth = lastColumnBottom - columnIndex;
                        le0_2 child = cell.m90(cellX, rowY, cellWidth, rowHeight, selected);
                        if (child != null) {
                            if (child.K20 != this) {
                                int childX = child.A20;
                                int childY = child.SB0;
                                child.Ll(false);
                                this.F9(this.fU(), child);
                                child.sy(childX, childY);
                            }
                            if (child.K20 == this) {
                                child.HP(v1);
                            } else {
                                throw new IllegalArgumentException("can only render direct children");
                            }
                        }
                    }
                    columnIndex = lastColumnBottom;
                    lastColumn += Math.max(1, span);
                }
                row++;
                rowTop = rowBottom;
            }
            wl0_2 overlay = this.n90;
            if (overlay != null) {
                this.Q2(overlay, selectedRow);
            }
        } catch (Throwable throwable) {
            v8.Lpt9();
            throw throwable;
        }
        v8.Lpt9();
    }

    public abstract Zh Xt(int i1);

    public abstract Object Yp(int i1, int i2, Zh v3);

    public abstract Object EO(int i1, int i2);

    public Fx0 Dd0(int i1, int i2, Zh v3) {
        Object value = this.Yp(i1, i2, v3);
        if (value == null) {
            return null;
        }
        Fx0 cell = this.vL0(i2, value);
        cell.In(value);
        return cell;
    }

    public final int Rs(int i1) {
        return Math.max(this.ip0 * 2 + 1, i1);
    }

    public final void ji(int i1, int i2) {
        fa_1 manager = this.RK0;
        A50 layer = manager.gV;
        cw0_0 current = null;
        if (layer.l1 > 0) {
            int depth = manager.lr;
            int index = layer.zd(i1, i2, layer.l1);
            while (index != layer.l1) {
                current = layer.Sp0[index];
                depth--;
                if (depth > 0) {
                    layer = (A50) current;
                    index = layer.zd(i1, i2, layer.l1);
                    if (index == layer.l1) {
                        current = null;
                        break;
                    }
                    continue;
                }
                if (fa_1.class.desiredAssertionStatus() && current == null) {
                    throw new AssertionError();
                }
                if (current != null) {
                    depth = current.pt0 - i1;
                    if (depth == 0) {
                        depth = current.Sr0 - i2;
                    }
                    if (depth != 0) {
                        current = null;
                    }
                }
                break;
            }
        }

        NH0 selection = (NH0) current;
        le0_2 oldChild = selection == null ? null : selection.wH;
        NA selectionValue = null;
        Fx0 cell = this.Dd0(i1, i2, this.Xt(i1));
        if (cell instanceof NA) {
            selectionValue = (NA) cell;
            if (selection != null && selection.DV != selectionValue) {
                int index = this.b2.Dp(oldChild);
                if (index >= 0) {
                    this.b2.fC0(index);
                }
                oldChild = null;
            }
        }
        le0_2 result = selectionValue == null ? null : selectionValue.zS(oldChild);
        le0_2 currentChild = null;
        if (result != null) {
            if (selection == null) {
                selection = new NH0();
                fa_1 state = this.RK0;
                selection.pt0 = i1;
                selection.Sr0 = i2;
                A50 currentLayer = state.gV;
                if (currentLayer.l1 == 0) {
                    currentLayer.Ug0(0, selection);
                    currentLayer.Di();
                } else if (!currentLayer.aF0(state.lr, selection)) {
                    A50 oldLayer = currentLayer.F7();
                    A50 newLayer = new A50(currentLayer.Sp0.length);
                    newLayer.Sp0[0] = currentLayer;
                    newLayer.Sp0[1] = oldLayer;
                    newLayer.l1 = 2;
                    state.gV = newLayer;
                    int depth = ++state.lr;
                    newLayer.aF0(depth, selection);
                }
            }
            selection.wH = result;
            selection.DV = selectionValue;
            currentChild = result;
        }
        if (currentChild == null && selection != null) {
            fa_1 state = this.RK0;
            A50 currentLayer = state.gV;
            if (currentLayer.l1 != 0) {
                if (currentLayer.J20(i1, i2, state.lr) != null) {
                    state.n0();
                }
            }
        }
        if (oldChild != null && currentChild != oldChild) {
            int index = this.b2.Dp(oldChild);
            if (index >= 0) {
                this.b2.fC0(index);
            }
        }
    }

    public final Uu Dq0(int i1) {
        Jn0 root = this.uH0;
        if (root == null) {
            return null;
        }
        QS widths = ((LC0) root).C60("columnWidths");
        Object value = ((LC0) widths).wa0.B20(Integer.toString(i1));
        if (value instanceof Uu) {
            return (Uu) value;
        }
        if (value instanceof Integer) {
            return new Uu(((Integer) value).intValue());
        }
        return null;
    }

    public final boolean Ot0(int i1) {
        i1 -= this.SB0 + this.y9;
        return i1 >= 0 && i1 < this.mq;
    }

    public final boolean nd0(i70_0 v1) {
        if (this.Un0 != 0) {
            if (E00.C10(v1.zu)) {
                return this.xK0(v1);
            }
            if (v1.iT() && v1.finally$ == 111) {
                int mode = this.Un0;
                if (mode == 1) {
                    this.dt(this.KQ);
                    this.Un0 = 3;
                } else if (mode == 2) {
                    if (mode == 2) {
                        this.Un0 = 3;
                    }
                }
            }
            return true;
        }
        E00.ZU(v1.zu);
        if (super.nd0(v1)) {
            return true;
        }
        int zu = v1.zu;
        if (E00.C10(zu)) {
            return this.xK0(v1);
        }
        E00.ZU(zu);
        return false;
    }

    public final le0_2 r1(i70_0 v1) {
        if (v1.zu == 7) {
            this.j0 = Integer.MIN_VALUE;
            this.c00 = -1;
            this.CC = -1;
        } else {
            this.j0 = v1.AN;
        }
        if (this.Un0 == 0) {
            if (this.Ot0(v1.AN)) {
                if (this.c00 != -1 || this.CC != -1) {
                    this.c00 = -1;
                    this.CC = -1;
                    super.ur0();
                }
            } else {
                int column = this.Tl0(v1.AN - (this.SB0 + this.y9 - this.eL + this.mq));
                int row = this.ey.gC(v1.f8 - this.E60());
                if (this.c00 != column || this.CC != row) {
                    this.c00 = column;
                    this.CC = row;
                    super.ur0();
                }
            }
        }
        return super.r1(v1);
    }

    public final boolean xK0(i70_0 v1) {
        int eventType = v1.zu;
        int mode = this.Un0;
        if (mode != 0) {
            if (mode == 1) {
                int height = super.a3();
                if (this.kX >= 0 && height > 0) {
                    this.dt(this.Rs(v1.f8 - this.aa0));
                }
            } else if (mode == 2) {
                throw null;
            } else if (mode != 3) {
                throw new AssertionError();
            }
            if (v1.LI0()) {
                this.Un0 = 0;
            }
            return true;
        }

        if (this.Ot0(v1.AN)) {
            int anchor = v1.f8 - this.E60() + this.ip0;
            int column = this.ey.gC(anchor);
            if (anchor - this.ey.eC0(column) < this.ip0 * 2) {
                column--;
            } else {
                column = -1;
            }
            boolean special = this.i9();
            if (column < 0 || (column >= this.gc0 - 1 && special)) {
                return eventType != 8;
            }
            if (eventType == 3) {
                this.P9(column);
                int nextColumn = column + 1;
                int width = this.ey.eC0(nextColumn) - this.ey.eC0(column);
                this.KQ = width;
                this.kX = column;
                int delta = v1.f8 - width;
                this.aa0 = delta;
                if (special) {
                    for (int index = 0; index < this.gc0; index++) {
                        W20 cell = this.G70[index];
                        this.P9(index);
                        cell.Uf = this.ey.eC0(index + 1) - this.ey.eC0(index);
                    }
                    this.P9(nextColumn);
                    this.Cr = width + this.ey.eC0(column + 2) - this.ey.eC0(nextColumn);
                }
            }
            if (v1.VP) {
                this.Un0 = 1;
            }
            return true;
        }

        int column = this.c00;
        if (v1.VP) {
            this.Un0 = 3;
            return true;
        }
        jf0_0 selection = this.G00;
        if (selection != null) {
            int flags = v1.J30;
            boolean first = (flags & 9) != 0;
            boolean second = (flags & 36) != 0;
            if (eventType == 3 && v1.nA0 == 0 && column >= 0 && column < selection.HL0()) {
                selection.w9.zG0(column);
                ws_1 cursor = selection.Vg0;
                int cursorIndex = cursor.rk;
                boolean cursorSelected;
                if (cursorIndex == -1) {
                    cursorIndex = 0;
                    cursorSelected = false;
                } else {
                    cursorSelected = cursor.iK0(cursorIndex);
                }
                if (first) {
                    if (second) {
                        if (cursorSelected) {
                            cursor.fc0(cursorIndex, column);
                        } else {
                            cursor.MM(cursorIndex, column);
                        }
                    } else if (cursor.iK0(column)) {
                        cursor.MM(column, column);
                    } else {
                        cursor.fc0(column, column);
                    }
                } else if (second) {
                    cursor.J2(cursorIndex, column);
                } else {
                    cursor.J2(column, column);
                }
                if (!second) {
                    selection.Vg0.cd();
                }
            }
        }
        if (eventType == 5 && v1.kA == 2) {
            dp_2[] callbacks = this.Uj0;
            if (callbacks != null) {
                for (dp_2 callback : callbacks) {
                    callback.H90();
                }
            }
        }
        if (eventType == 4 && v1.nA0 == 1) {
            dp_2[] callbacks = this.Uj0;
            if (callbacks != null) {
                for (dp_2 callback : callbacks) {
                    callback.oj0(column, v1);
                }
            }
        }
        return eventType != 8;
    }

    public final dc0_0 KK0(i70_0 v1) {
        int mode = this.Un0;
        if (mode == 1) {
            return this.cI;
        }
        if (mode == 2) {
            return null;
        }
        if (mode == 3) {
            return this.V80;
        }
        if (!this.Ot0(v1.AN)) {
            return this.Uv0;
        }
        int anchor = v1.f8 - this.E60() + this.ip0;
        int column = this.ey.gC(anchor);
        if (anchor - this.ey.eC0(column) < this.ip0 * 2) {
            column--;
        } else {
            column = -1;
        }
        boolean special = this.i9();
        if (column < 0 || (column >= this.gc0 - 1 && special)) {
            return this.Uv0;
        }
        return this.cI;
    }

    public void kz(int i1) {
        dp_2[] callbacks = this.Uj0;
        if (callbacks != null) {
            for (int index = 0; index < callbacks.length; index++) {
                callbacks[index].CH();
            }
        }
    }

    public final void uq() {
        fa_1 manager = this.RK0;
        if (manager.gV.l1 != 0) {
            this.b2.em();
            java.util.Arrays.fill(manager.gV.Sp0, null);
            manager.gV.l1 = 0;
            manager.lr = 1;
        }
        if (this.ap0 != null) {
            this.Sd = true;
        }
        this.ik = true;
        this.ZE0 = true;
        this.COm3();
    }

    public final void wr() {
        W20[] oldColumns = this.G70;
        if (oldColumns != null) {
            for (W20 column : oldColumns) {
                int index = this.Dp(column);
                if (index >= 0) {
                    this.fC0(index);
                }
            }
        }
        this.RW = -1;
        this.G70 = new W20[this.gc0];
        for (int index = 0; index < this.gc0; index++) {
            W20 column = new W20((f.Nj)(Object)this);
            column.uf("columnHeader");
            column.lv = false;
            this.F9(column.fU(), column);
            this.G70[index] = column;
            column.SU(this.bL.LPT7(index));
            this.bL.getClass();
        }
        for (int index = 0; index < this.G70.length; index++) {
            this.G70[index].rm0 = index;
        }
        jf0_0 selection = this.G00;
        if (selection != null) {
            selection.Vg0.cd();
            selection.Vg0.rk = -1;
            selection.Vg0.aW = -1;
        }
        this.uq();
    }

    public final void CoM7(int i1, int i2) {
        if (i1 < 0 || i2 < 0 || i2 > this.Dx0 || i1 > this.Dx0 - i2) {
            throw new IllegalArgumentException("row");
        }
        boolean changed = false;
        for (int columnOffset = 0; columnOffset < i2; columnOffset++) {
            if (this.ap0 != null) {
                int column = i1 + columnOffset;
                Zh style = this.Xt(column);
                int maxHeight = 0;
                int row = 0;
                while (row < this.gc0) {
                    Fx0 cell = this.Dd0(column, row, style);
                    if (cell != null) {
                        maxHeight = Math.max(maxHeight, cell.rm0());
                        row += Math.max(0, cell.y8() - 1);
                    }
                    row++;
                }
                changed |= this.ap0.IF(column, maxHeight);
            }
            for (int row = 0; row < this.gc0; row++) {
                this.ji(i1 + columnOffset, row);
            }
        }
        this.bA0();
        if (changed) {
            this.COm3();
        }
    }

    public final void dK0(int i1, int i2) {
        if (i1 < 0 || i2 < 0 || i2 > this.Dx0 || i1 > this.Dx0 - i2) {
            throw new IllegalArgumentException("row");
        }
        rd_0 rows = this.ap0;
        if (rows != null) {
            int oldCount = rows.VQ;
            int newCount = oldCount + i2;
            int[] values = rows.p2;
            if (values.length < newCount) {
                values = new int[newCount];
                rows.li(0, oldCount, values);
                rows.p2 = values;
            } else {
                rows.li(0, oldCount, values);
            }
            int sourceIndex = i1 + i2;
            int copyLength = rows.VQ - i1;
            System.arraycopy(values, sourceIndex, values, i1, copyLength);
            rows.VQ = newCount;
            rows.DE(i1, i2);
            rows.iB0(0, newCount);
        }
        int oldSelected = this.RW;
        if (oldSelected > i1) {
            this.RW = oldSelected + i2;
        }
        fa_1 manager = this.RK0;
        if (manager.gV.l1 != 0 || this.aS) {
            this.b2.em();
            if (i2 > 0) {
                manager.gV.iM(i1, i2, manager.lr);
            } else {
                manager.getClass();
            }
            for (int row = 0; row < i2; row++) {
                for (int column = 0; column < this.gc0; column++) {
                    this.ji(i1 + row, column);
                }
            }
        }
        this.COm3();
        if (i1 < this.Tl0(this.eL)) {
            lo0_0 scroll = lo0_0.public$(this);
            if (scroll != null) {
                int start = this.DH(i1);
                int end = this.Ut(i1 + i2 - 1);
                scroll.Xr0(this.eL + end - start);
            }
        }
        jf0_0 selection = this.G00;
        if (selection != null) {
            selection.Vg0.ro(i1, i2);
        }
    }

    public final void c7(int i1, int i2) {
        int end = i1 + i2;
        if (end <= this.Tl0(this.eL)) {
            lo0_0 scroll = lo0_0.public$(this);
            if (scroll != null) {
                int startY = this.DH(i1);
                int endY = this.Ut(end - 1);
                scroll.Xr0(this.eL - endY + startY);
            }
        }
        rd_0 rows = this.ap0;
        if (rows != null) {
            int oldCount = rows.VQ;
            int[] values = rows.p2;
            rows.li(0, oldCount, values);
            int newCount = rows.VQ - i2;
            values = rows.p2;
            int copyLength = newCount - i1;
            System.arraycopy(values, end, values, i1, copyLength);
            rows.VQ = newCount;
            rows.iB0(0, newCount);
        }
        int selected = this.RW;
        if (selected >= i1) {
            if (selected < end) {
                this.RW = -1;
            } else {
                this.RW = selected - i2;
            }
        }
        fa_1 manager = this.RK0;
        if (manager.gV.l1 != 0) {
            manager.gu(i1, end - 1, this.gc0, this.IT);
            if (i2 > 0) {
                manager.gV.Com5(i1, i2, manager.lr);
                manager.n0();
            } else {
                manager.getClass();
            }
        }
        jf0_0 selection = this.G00;
        if (selection != null) {
            selection.Vg0.nE0(i1, i2);
        }
        this.COm3();
    }

    public final Fx0 vL0(int i1, Object v2) {
        Class<?> type = v2.getClass();
        ge0_0 cache = this.zY;
        hy_0 entry = (hy_0) a9_0.i40(cache.cb0, type);
        if (entry != null) {
            v2 = entry.gO;
        } else {
            entry = null;
            Class<?> current = type;
            while (true) {
                Class<?>[] interfaces = current.getInterfaces();
                int interfaceCount = interfaces.length;
                int interfaceIndex = 0;
                while (interfaceIndex < interfaceCount) {
                    Class<?> iface = interfaces[interfaceIndex];
                    entry = (hy_0) a9_0.i40(cache.cb0, iface);
                    if (entry != null) {
                        break;
                    }
                    interfaceIndex++;
                }
                if (entry != null) {
                    break;
                }
                current = current.getSuperclass();
                if (current == null) {
                    break;
                }
                entry = (hy_0) a9_0.i40(cache.cb0, current);
                if (entry != null) {
                    break;
                }
            }
            Object inherited = entry == null ? null : entry.gO;
            hy_0 created = new hy_0(type, inherited, true);
            hy_0[] table = (hy_0[]) a9_0.bj(cache.cb0, cache.Ah0);
            int slot = created.Yj0 & (table.length - 1);
            created.Qk = table[slot];
            table[slot] = created;
            cache.Ah0++;
            v2 = inherited;
        }
        Fx0 result = (Fx0) v2;
        if (result != null) {
            return result;
        }
        Fx0 fallback;
        if (i1 < this.Vw.length) {
            fallback = this.Vw[i1];
        } else {
            fallback = null;
        }
        if (fallback == null) {
            fallback = this.fE0;
        }
        return fallback;
    }

    public final boolean OE(i70_0 v1, String v2) {
        if (!super.OE(v1, v2)) {
            jf0_0 selection = this.G00;
            if (selection == null || !selection.Wq0.jf0(v1, v2)) {
                return false;
            }
        }
        this.nA0(null);
        return true;
    }

    public final void XK0() {
        return;
    }

    public final void zf() {
        return;
    }

    public final void LPT6(int i1, int i2) {
        for (int index = 0; index < this.gc0; index++) {
            KG0 columnModel = this.G70[index].M;
            boolean ascending = index == i1 && i2 == 1;
            columnModel.j70(r2, ascending);
            boolean descending = index == i1 && i2 == 2;
            columnModel.j70(uK, descending);
        }
    }
}
