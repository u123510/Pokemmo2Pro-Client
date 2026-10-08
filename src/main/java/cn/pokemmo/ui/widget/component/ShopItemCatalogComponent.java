package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

public class ShopItemCatalogComponent extends BaseComponent {
    public static final bo0_0[] mj0;
    public static final Bp0 xr;
    public static final /* synthetic */ boolean Sp;
    public final UW jF0;
    public final KB Gn0;
    public bo0_0[] Dn0;
    public M30 KB;
    public int Me0;
    public int b7;
    public boolean B10;
    public boolean qJ0;
    public boolean u10;
    public int PL0;
    public int n7;
    public int xK0;
    public int Mw0;
    public int zJ;
    public boolean Se;
    public zs_1[] Fa0;
    public C90 ga;
    public final ql_0 pz;
    public float lPT1;

    static {
        Sp = !ShopItemCatalogComponent.class.desiredAssertionStatus();
        mj0 = new bo0_0[0];
        xr = new Bp0();
    }

    public ShopItemCatalogComponent() {
        super();
        this.Me0 = 20;
        this.b7 = -1;
        this.B10 = true;
        this.PL0 = 1;
        this.n7 = 1;
        this.Mw0 = -1;
        this.pz = new ql_0();
        this.lPT1 = 0.0f;
        UW uw = new UW((f.ni0_2)(Object)this, 0);
        this.jF0 = uw;
        KB kb = new KB();
        this.Gn0 = kb;
        kb.c9(uw);
        this.Dn0 = mj0;
        super.F9(0, kb);
        oY(200, 300);
        Oq0(true);
        q20();
    }

    public ShopItemCatalogComponent(vu_0 v1) {
        this();
        P8(v1);
    }

    @Override
    public String Ck() {
        return "listbox";
    }

    public final void mJ0(zs_1 v1) {
        this.Fa0 = (zs_1[]) a7_0.gE(this.Fa0, v1, zs_1.class);
    }

    public final void wu(int i1) {
        i1 = Math.max(0, Math.min(i1, this.zJ - 1));
        if (this.xK0 != i1) {
            this.xK0 = i1;
            this.Gn0.jd0(i1 / this.n7, false);
            this.Se = true;
        }
    }

    public final void RK0(int i1, boolean z, jr_0 v3) {
        if (i1 < -1 || i1 >= this.zJ) {
            throw new IllegalArgumentException();
        }
        if (z) {
            Iu();
            if (i1 == -1) {
                wu(0);
            } else {
                int i2 = this.xK0;
                int i4 = i2 - i1;
                if (i4 > 0) {
                    int n7 = this.n7;
                    wu(i2 - ((i4 + n7 - 1) / n7) * n7);
                } else {
                    int i4_2 = i1 - (i2 + this.Dn0.length - 1);
                    if (i4_2 > 0) {
                        int n7 = this.n7;
                        wu(i2 + ((i4_2 + n7 - 1) / n7) * n7);
                    }
                }
            }
        }
        if (this.Mw0 != i1) {
            this.Mw0 = i1;
            this.Se = true;
            a7_0.COM8(this.Fa0, v3);
        } else if (v3.mZ || v3 == jr_0.r9) {
            a7_0.COM8(this.Fa0, v3);
        }
    }

    @Override
    public final le0_2 BQ(int i1, int i2) {
        return this;
    }

    @Override
    public final void em() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final le0_2 fC0(int i1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void Ib(Jn0 v1) {
        super.Ib(v1);
        LC0 lc = (LC0) v1;
        int ch = lc.H10(20, "cellHeight");
        if (ch < 1) {
            throw new IllegalArgumentException("cellHeight < 1");
        }
        this.Me0 = ch;
        int cw = lc.H10(-1, "cellWidth");
        if (cw < 1 && cw != -1) {
            throw new IllegalArgumentException("cellWidth < 1");
        }
        this.b7 = cw;
        this.B10 = lc.SD("rowMajor", true);
        this.qJ0 = lc.SD("fixedCellWidth", false);
        this.u10 = lc.SD("fixedCellHeight", false);
        this.PL0 = lc.H10(1, "minDisplayedRows");
    }

    public final void hs() {
        int idx = this.Mw0 - this.xK0;
        if (idx >= 0 && idx < this.Dn0.length) {
            ((qe0_1) this.Dn0[idx]).M.j70(le0_2.gz, true);
        }
    }

    public final void Bt() {
        int idx = this.Mw0 - this.xK0;
        if (idx >= 0 && idx < this.Dn0.length) {
            ((qe0_1) this.Dn0[idx]).M.j70(le0_2.gz, false);
        }
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        int qj = J90.Qj(v1.zu);
        switch (qj) {
            case 7:
                this.Gn0.Xz0(-v1.hh0);
                return true;
            case 8:
                int code = dp0.r9(v1.finally$);
                if (code == 3) {
                    if (this.zJ > 0) {
                        RK0(0, true, jr_0.K40);
                    }
                    return true;
                } else if (code == 66) {
                    RK0(this.Mw0, false, jr_0.Bv0);
                    return true;
                } else if (code == 123) {
                    RK0(this.zJ - 1, true, jr_0.K40);
                    return true;
                } else if (code == 92) {
                    if (this.zJ > 0) {
                        RK0(Math.max(0, this.Mw0 - this.Dn0.length), true, jr_0.K40);
                    }
                    return true;
                } else if (code == 93) {
                    RK0(Math.min(this.zJ - 1, this.Mw0 + this.Dn0.length), true, jr_0.K40);
                    return true;
                } else {
                    switch (code) {
                        case 19:
                            int i1 = this.Mw0 - this.n7;
                            if (i1 >= 0 && i1 < this.zJ) {
                                RK0(i1, true, jr_0.K40);
                            }
                            return true;
                        case 20:
                            int i2 = this.Mw0 + this.n7;
                            if (i2 >= 0 && i2 < this.zJ) {
                                RK0(i2, true, jr_0.K40);
                            }
                            return true;
                        case 21:
                            int i3 = this.Mw0 - 1;
                            if (i3 >= 0 && i3 < this.zJ) {
                                RK0(i3, true, jr_0.K40);
                            }
                            return true;
                        case 22:
                            int i4 = this.Mw0 + 1;
                            if (i4 >= 0 && i4 < this.zJ) {
                                RK0(i4, true, jr_0.K40);
                            }
                            return true;
                        default:
                            if (v1.L8()) {
                                char ch = v1.TD;
                                if (ch != 0 && Character.isLetterOrDigit(ch)) {
                                    String str = Character.toString(ch);
                                    int next = -1;
                                    vu_0 model = (vu_0) this.KB;
                                    for (int i = this.Mw0 + 1; i < this.zJ; i++) {
                                        Object item = model.YS(i);
                                        if (item != null && item.toString().regionMatches(true, 0, str, 0, str.length())) {
                                            next = i;
                                            break;
                                        }
                                    }
                                    if (next == -1) {
                                        for (int i = 0; i < this.Mw0; i++) {
                                            Object item = model.YS(i);
                                            if (item != null && item.toString().regionMatches(true, 0, str, 0, str.length())) {
                                                next = i;
                                                break;
                                            }
                                        }
                                    }
                                    if (next != -1) {
                                        RK0(next, true, jr_0.K40);
                                    }
                                    return true;
                                }
                            }
                            return false;
                    }
                }
            case 9:
                int codeG = dp0.r9(v1.finally$);
                if (codeG == 3 || codeG == 66 || codeG == 123 || codeG == 92 || codeG == 93 || (codeG >= 19 && codeG <= 22)) {
                    return true;
                }
                return false;
            default:
                if (super.nd0(v1)) {
                    return true;
                }
                return E00.C10(v1.zu);
        }
    }

    @Override
    public final int R1() {
        return Math.max(super.R1(), this.Gn0.R1());
    }

    @Override
    public final int Se() {
        int h = Math.max(super.Se(), this.Gn0.Se());
        if (this.PL0 > 0) {
            h = Math.max(h, Math.min(this.zJ, this.PL0) * this.Me0 + this.y9 + this.Cz);
        }
        return h;
    }

    @Override
    public final int pi0() {
        return Math.max(super.pi0(), this.Gn0.R1());
    }

    @Override
    public final int zs0() {
        return Math.max(((this.zJ + this.n7 - 1) / this.n7) * this.Me0, this.Gn0.Se());
    }

    @Override
    public final void HP(zk0_1 v1) {
        if (this.Se) {
            this.Se = false;
            int zJ = this.zJ;
            if (this.Mw0 >= zJ) {
                this.Mw0 = -1;
            }
            int n7 = this.n7;
            int maxScroll = ((Math.max(0, zJ - this.Dn0.length) + n7 - 1) / n7) * n7;
            if (this.xK0 > maxScroll) {
                this.xK0 = Math.max(0, maxScroll);
            }
            boolean of = Of();
            for (int i = 0; i < this.Dn0.length; i++) {
                bo0_0 cell = this.Dn0[i];
                int itemIdx = this.xK0 + i;
                qe0_1 qe = (qe0_1) cell;
                if (itemIdx < this.zJ) {
                    Object item = this.KB.YS(itemIdx);
                    String text;
                    if (item == null) {
                        text = "";
                    } else {
                        qe.getClass();
                        text = item.toString();
                    }
                    qe.B(text);
                    qe.M.j70(qe0_1.il, false);
                    this.KB.getClass();
                    qe.yj0 = null;
                    qe.yB0();
                } else {
                    qe.B("");
                    qe.M.j70(qe0_1.il, true);
                    qe.yj0 = null;
                }
                boolean isSelected = (itemIdx == this.Mw0);
                if (qe.F10 != isSelected) {
                    qe.F10 = isSelected;
                    qe.M.j70(qe0_1.vN, isSelected);
                }
                qe.M.j70(le0_2.gz, itemIdx == this.Mw0 && of);
            }
        }
        int max = Math.max(0, this.zJ - this.Dn0.length);
        int n7 = this.n7;
        this.Gn0.Kx0((max + n7 - 1) / n7);
        this.Gn0.jd0(this.xK0 / this.n7, false);
        super.HP(v1);
    }

    @Override
    public final void K8() {
        this.Gn0.oY(this.Gn0.R1(), k5());
        this.Gn0.E40(cz() - this.Gn0.Mx, this.SB0 + this.y9);
        int rows = Math.max(1, k5() / this.Me0);
        if (this.b7 != -1) {
            this.n7 = Math.max(1, (this.Gn0.A20 - (this.A20 + this.e80)) / this.b7);
        } else {
            this.n7 = 1;
        }
        int numCells = rows * this.n7;
        if (!Sp && numCells < 1) {
            throw new AssertionError();
        }
        if (numCells < 1) {
            throw new IllegalArgumentException("pageSize < 1");
        }
        this.Gn0.YJ0 = numCells;
        if (this.Gn0.tE0) {
            this.Gn0.Qu();
        }
        int oldLen = this.Dn0.length;
        int removeIdx = oldLen;
        while (removeIdx - 1 >= numCells) {
            super.fC0(removeIdx);
            removeIdx--;
        }
        bo0_0[] newArr = new bo0_0[numCells];
        System.arraycopy(this.Dn0, 0, newArr, 0, Math.min(numCells, this.Dn0.length));
        this.Dn0 = newArr;
        for (int i = oldLen; i < numCells; i++) {
            bo0_0 cell = GK();
            Vq0 listener = new Vq0((f.ni0_2)(Object)this, i);
            qe0_1 qe = (qe0_1) cell;
            qe.Sv0 = (zs_1[]) a7_0.gE(qe.Sv0, listener, zs_1.class);
            super.F9(i + 1, (le0_2) qe);
            this.Dn0[i] = cell;
        }
        int availW = this.Gn0.A20 - (this.A20 + this.e80);
        int availH = k5();
        for (int i = 0; i < numCells; i++) {
            int row;
            int col;
            if (this.B10) {
                row = i / this.n7;
                col = i % this.n7;
            } else {
                row = i % rows;
                col = i / rows;
            }
            int cellH;
            int cellY;
            if (this.u10) {
                cellY = row * this.Me0;
                cellH = this.Me0;
            } else {
                cellY = (row * availH) / rows;
                cellH = ((row + 1) * availH) / rows - cellY;
            }
            int cellW;
            int cellX;
            if (this.qJ0 && this.b7 != -1) {
                cellX = col * this.b7;
                cellW = this.b7;
            } else {
                cellX = (col * availW) / this.n7;
                cellW = ((col + 1) * availW) / this.n7 - cellX;
            }
            le0_2 w = (le0_2) this.Dn0[i];
            w.oY(Math.max(0, cellW), Math.max(0, cellH));
            w.sy(this.A20 + this.e80 + cellX, this.SB0 + this.y9 + cellY);
        }
        this.Se = true;
    }

    public bo0_0 GK() {
        return new qe0_1();
    }

    @Override
    public final void C(zk0_1 v1) {
        this.ga = new C90(new OE((f.ni0_2)(Object)this));
        v1.cL.HV.P6(0, this.ga);
    }

    @Override
    public final void N00(zk0_1 v1) {
        v1.cL.HV.sj0(this.ga, true);
    }

    public final void P8(M30 v1) {
        M30 old = this.KB;
        if (old != v1) {
            if (old != null) {
                old.Nw = (ne_2[]) a7_0.tp0(this.jF0, old.Nw);
            }
            this.KB = v1;
            if (v1 != null) {
                v1.Nw = (ne_2[]) a7_0.gE(v1.Nw, this.jF0, ne_2.class);
            }
            this.jF0.wn0();
        }
    }

    @Override
    public final void F9(int i1, le0_2 v2) {
        throw new UnsupportedOperationException();
    }
}
