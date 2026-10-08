package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

import f.E00;
import f.J90;
import f.Jn0;
import f.LC0;
import f.MD0;
import f.QS;
import f.dc0_0;
import f.dz_2;
import f.gn_0;
import f.i70_0;
import f.le0_2;
import f.u3_0;
import f.vb0_0;
import f.xe0_0;
import f.xe_1;

public class VideoSettingsPanelComponent extends BaseComponent {
    public static final MD0 gC = MD0.cB("fade");
    public String h3;
    public final dc0_0[] AL0;
    public boolean Yc0;
    public boolean dz0;
    public int mY;
    public int qM;
    public int Y7;
    public int abstract$;
    public int mn0;
    public int HZ;
    public gn_0 PK0;
    public int g;
    public int F1;
    public int ua0;
    public int Nn0;
    public dz_2 QH0;
    public int gR;
    public int uR;
    public int bv;
    public int sJ0;
    public boolean pa0;
    public xe_1 Lr0;
    public int Xb0;
    public int pf0;
    public boolean HB;
    public le0_2 Nw;
    public int n0;
    public int j;
    public int NT;
    public int XF0;
    public int nE0;

    public VideoSettingsPanelComponent() {
        VideoSettingsPanelComponent r90 = this;
        r90.NT = 4;
        r90.Yc0 = true;
        r90.dz0 = false;
        r90.XF0 = 1;
        r90.PK0 = gn_0.WHITE;
        r90.h3 = "";
        this.AL0 = new dc0_0[u3_0._values().length];
        r90.Oq0(true);
    }

    public final int class$(int n) {
        return (n < 0 ? this.A20 + this.Mx : this.A20) + n;
    }

    public final int Ti(int n) {
        return (n < 0 ? this.SB0 + this.OB : this.SB0) + n;
    }

    @Override
    public final String Ck() {
        return "resizableframe";
    }

    public final void Hy(String string) {
        this.h3 = string;
        if (this.QH0 != null) {
            this.QH0.B(string);
        }
    }

    public final void bD(boolean bl) {
        this.Yc0 = bl;
    }

    public final void Ko(boolean bl) {
        this.dz0 = bl;
    }

    public final void Pb0(Runnable runnable) {
        if (this.Lr0 == null) {
            VideoSettingsPanelComponent r90 = this;
            this.Lr0 = new xe_1(null, false, null);
            this.Lr0.uf("closeButton");
            xe_1 xe_12 = r90.Lr0;
            r90.Lr0.lv = false;
            r90.F9(r90.fU(), xe_12);
            xe_12 = r90.Lr0;
            if (xe_12 != null) {
                VideoSettingsPanelComponent r902 = this;
                xe_12.lt0();
                VideoSettingsPanelComponent r903 = this;
                int n = r903.class$(r903.Xb0);
                r902.Lr0.E40(n, r903.Ti(r903.pf0));
                xe_1 xe_13 = r902.Lr0;
                boolean bl = xe_13.ER.Fc0 != null && this.pa0;
                xe_13.Ll(bl);
            }
        }
        VideoSettingsPanelComponent r90 = this;
        r90.Lr0.Ll(this.pa0);
        r90.Lr0.RR(runnable);
    }

    @Override
    public void Ll(boolean n) {
        if (n) {
            Object object = this.z70;
            if (object != null && ((N1)object).LpT8 || !this.eE) {
                object = this.Of() ? gn_0.WHITE : this.PK0;
                VideoSettingsPanelComponent r90 = this;
                r90.L40((gn_0)object, r90.ua0);
            }
        } else if (this.eE) {
            int duration = this.Nn0;
            if (duration <= 0) {
                this.AD(false);
            } else {
                N1 n1 = this.z70;
                if (n1 == null) {
                    n1 = new N1(new xe0_0(this.M, gC), gn_0.WHITE);
                    this.z70 = n1;
                    if (!this.eE) {
                        n1.iG0(0);
                    }
                }
                n1.iG0(duration);
            }
        }
    }

    public void AD(boolean bl) {
        super.Ll(bl);
    }

    public void Mq0(Jn0 qS) {
        for (int n : J90.uY(10)) {
            int n2 = J90.Qj(n);
            String string = u3_0.nc0(n);
            this.AL0[n2] = ((LC0)qS).oX(string);
        }
        LC0 config = (LC0) qS;
        this.gR = config.H10(0, "titleAreaTop");
        this.uR = config.H10(0, "titleAreaLeft");
        this.bv = config.H10(0, "titleAreaRight");
        this.sJ0 = config.H10(0, "titleAreaBottom");
        this.Xb0 = config.H10(0, "closeButtonX");
        this.pf0 = config.H10(0, "closeButtonY");
        this.pa0 = config.SD("hasCloseButton", false);
        this.HB = config.SD("hasResizeHandle", false);
        this.n0 = config.H10(0, "resizeHandleX");
        this.j = config.H10(0, "resizeHandleY");
        gn_0 fallback = gn_0.WHITE;
        gn_0 inactive = (gn_0) config.N30("fadeColorInactive", true, gn_0.class, null);
        if (inactive == null) {
            inactive = fallback;
        }
        this.PK0 = inactive;
        this.g = config.H10(0, "fadeDurationActivate");
        this.F1 = config.H10(0, "fadeDurationDeactivate");
        this.ua0 = config.H10(0, "fadeDurationShow");
        this.Nn0 = config.H10(0, "fadeDurationHide");
        this.COm3();
        if (!(!this.eE || this.Of() || this.z70 == null && fallback.equals(this.PK0))) {
            this.L40(this.PK0, 0);
        }
    }

    @Override
    public void Ib(Jn0 jn0) {
        VideoSettingsPanelComponent r90 = this;
        super.Ib(jn0);
        r90.Mq0(jn0);
    }

    @Override
    public final void xh() {
        N1 n1 = this.z70;
        n1.dn0();
        if (!n1.pb0 && n1.gh0[3] <= 0.001f) {
            this.AD(false);
        }
    }

    public final void L40(gn_0 gn_02, int n) {
        N1 n1 = this.z70;
        if (n1 == null) {
            n1 = new N1(new xe0_0(this.M, gC), gn_0.WHITE);
            this.z70 = n1;
            if (!this.eE) {
                n1.iG0(0);
            }
        }
        n1.bT(gn_02, n);
        if (!this.eE && (gn_02.FY & 0xFF) != 0) {
            this.AD(true);
        }
    }

    public final boolean qo(le0_2 le0_22) {
        return le0_22 == this.QH0 || le0_22 == this.Lr0 || le0_22 == this.Nw;
    }

    @Override
    public void K8() {
        int n = this.R1();
        int n2 = this.Se();
        int n3 = this.Mx;
        if (n3 < n || this.OB < n2) {
            n = Math.max(n3, n);
            n2 = Math.max(this.OB, n2);
            le0_2 le0_22 = this.K20;
            if (le0_22 != null) {
                int n4 = Math.min(this.SB0, this.K20.VM() - n2);
                this.E40(Math.min(this.A20, le0_22.cz() - n), n4);
            }
            this.oY(n, n2);
        }
        n2 = this.fU();
        for (n = 0; n < n2; ++n) {
            le0_2 le0_23 = this.qA(n);
            if (this.qo(le0_23)) continue;
            this.uM(le0_23);
        }
        this.VB();
        xe_1 xe_12 = this.Lr0;
        if (xe_12 != null) {
            xe_12.lt0();
            this.Lr0.E40(this.class$(this.Xb0), this.Ti(this.pf0));
            xe_12 = this.Lr0;
            n2 = xe_12.ER.Fc0 != null && this.pa0 ? 1 : 0;
            xe_12.Ll(n2 != 0);
        }
        this.ux0();
    }

    public final void VB() {
        int n = this.class$(this.uR);
        int n2 = this.Ti(this.gR);
        int n3 = Math.max(0, this.class$(this.bv) - n);
        int n4 = Math.max(0, this.Ti(this.sJ0) - n2);
        if (this.uR != this.bv && this.gR != this.sJ0) {
            dz_2 dz_22;
            if (this.QH0 == null) {
                dz_22 = new dz_2(this.M, false);
                this.QH0 = dz_22;
                dz_22.uf("title");
                this.QH0.Zt = this.AL0[9];
                this.QH0.B(this.h3);
                this.QH0.IM = true;
            }
            dz_22 = this.QH0;
            if (dz_22.K20 == null) {
                this.F9(0, dz_22);
            }
            this.QH0.E40(n, n2);
            this.QH0.oY(n3, n4);
        } else {
            dz_2 dz_24 = this.QH0;
            if (dz_24 != null && dz_24.K20 == this) {
                dz_24.xe0();
            }
        }
    }

    public final void ux0() {
        le0_2 le0_22;
        if (this.HB && this.Nw == null) {
            le0_22 = new le0_2(this.M, true);
            this.Nw = le0_22;
            le0_22.uf("resizeHandle");
            le0_22 = this.Nw;
            this.F9(0, le0_22);
        }
        if ((le0_22 = this.Nw) != null) {
            this.nE0 = this.n0 > 0 ? (this.j > 0 ? 6 : 7) : (this.j > 0 ? 9 : 8);
            le0_22.lt0();
            this.Nw.E40(this.class$(this.n0), this.Ti(this.j));
            le0_22 = this.Nw;
            boolean bl = this.HB && this.NT == 4;
            le0_22.Ll(bl);
        } else {
            this.nE0 = 1;
        }
    }

    @Override
    public void hs() {
        this.L40(gn_0.WHITE, this.g);
    }

    @Override
    public void Bt() {
        if (!this.sO && this.eE) {
            this.L40(this.PK0, this.F1);
        }
    }

    @Override
    public int R1() {
        VideoSettingsPanelComponent r90 = this;
        int n = super.R1();
        int n2 = r90.fU();
        for (int j = 0; j < n2; ++j) {
            VideoSettingsPanelComponent r902 = this;
            le0_2 le0_22 = r902.qA(j);
            if (r902.qo(le0_22)) continue;
            int n3 = n;
            n = le0_22.R1();
            n = Math.max(n3, this.e80 + this.NV + n);
        }
        dz_2 dz_22 = this.QH0;
        if (dz_22 != null && dz_22.K20 == this && this.bv < 0) {
            n = Math.max(n, dz_22.m0() + this.uR - this.bv);
        }
        return n;
    }

    @Override
    public int Se() {
        VideoSettingsPanelComponent r90 = this;
        int n = super.Se();
        int n2 = r90.fU();
        for (int j = 0; j < n2; ++j) {
            VideoSettingsPanelComponent r902 = this;
            le0_2 le0_22 = r902.qA(j);
            if (r902.qo(le0_22)) continue;
            int n3 = n;
            n = le0_22.Se();
            n = Math.max(n3, this.y9 + this.Cz + n);
        }
        return n;
    }

    @Override
    public final int S2() {
        VideoSettingsPanelComponent r90 = this;
        int n = r90.Ya0;
        int n2 = r90.fU();
        for (int j = 0; j < n2; ++j) {
            int n3;
            VideoSettingsPanelComponent r902 = this;
            le0_2 le0_22 = r902.qA(j);
            if (r902.qo(le0_22) || (n3 = le0_22.S2()) <= 0) continue;
            n3 = this.e80 + this.NV + n3;
            if (n != 0 && n3 >= n) continue;
            n = n3;
        }
        return n;
    }

    @Override
    public final int KC0() {
        VideoSettingsPanelComponent r90 = this;
        int n = r90.G4;
        int n2 = r90.fU();
        for (int j = 0; j < n2; ++j) {
            int n3;
            VideoSettingsPanelComponent r902 = this;
            le0_2 le0_22 = r902.qA(j);
            if (r902.qo(le0_22) || (n3 = le0_22.KC0()) <= 0) continue;
            n3 = this.y9 + this.Cz + n3;
            if (n != 0 && n3 >= n) continue;
            n = n3;
        }
        return n;
    }

    @Override
    public final int pi0() {
        int n = 0;
        int n2 = this.fU();
        for (int j = 0; j < n2; ++j) {
            VideoSettingsPanelComponent r90 = this;
            le0_2 le0_22 = r90.qA(j);
            if (r90.qo(le0_22)) continue;
            n = Math.max(n, le0_22.m0());
        }
        return n;
    }

    @Override
    public final int m0() {
        VideoSettingsPanelComponent r90 = this;
        int n = super.m0();
        dz_2 dz_22 = r90.QH0;
        if (dz_22 != null && dz_22.K20 == this && this.bv < 0) {
            n = Math.max(n, dz_22.m0() + this.uR - this.bv);
        }
        return n;
    }

    @Override
    public final int zs0() {
        int n = 0;
        int n2 = this.fU();
        for (int j = 0; j < n2; ++j) {
            VideoSettingsPanelComponent r90 = this;
            le0_2 le0_22 = r90.qA(j);
            if (r90.qo(le0_22)) continue;
            n = Math.max(n, le0_22.rm0());
        }
        return n;
    }

    @Override
    public void lt0() {
        VideoSettingsPanelComponent r90 = this;
        r90.VB();
        super.lt0();
    }

    @Override
    public boolean nd0(i70_0 i70_02) {
        int n;
        Object object;
        le0_2 le0_22;
        int n2 = i70_02.zu == 7 ? 1 : 0;
        if (n2 != 0 && (le0_22 = this.Nw) != null && le0_22.eE) {
            le0_22.M.j70(dz_2.H7, false);
        }
        int n3 = 1;
        if (this.XF0 != 1) {
            if (i70_02.LI0()) {
                this.XF0 = n3;
            } else if (i70_02.zu == 6) {
                i70_0 i70_03 = i70_02;
                int n4 = i70_03.f8 - this.mY;
                n2 = i70_03.AN - this.qM;
                n3 = this.R1();
                int n5 = this.Se();
                int n6 = this.S2();
                int n7 = this.KC0();
                if (n6 > 0 && n6 < n3) {
                    n6 = n3;
                }
                if (n7 > 0 && n7 < n5) {
                    n7 = n5;
                }
                int n8 = this.Y7;
                int n9 = this.abstract$;
                int n10 = this.mn0;
                int n11 = this.HZ;
                switch (J90.Qj(this.XF0)) {
                    default: {
                        break;
                    }
                    case 9: {
                        le0_2 le0_23 = this.K20;
                        if (le0_23 != null) {
                            le0_2 le0_24 = le0_23;
                            int n12 = le0_24.A20 + le0_23.e80;
                            n6 = le0_24.cz();
                            int n13 = n12;
                            n12 = this.mn0 - this.Y7;
                            n8 = Math.max(n13, Math.min(n6 - n12, n8 + n4));
                            n10 = Math.min(n6, Math.max(n13 + n12, n10 + n4));
                            break;
                        }
                        n8 += n4;
                        n10 += n4;
                        break;
                    }
                    case 3: 
                    case 6: 
                    case 7: {
                        n10 = Math.max(n10 + n4, n8 + n3);
                        if (n6 <= 0) break;
                        n10 = Math.min(n10, Math.max(this.mn0, n8 + n6));
                        break;
                    }
                    case 1: 
                    case 5: 
                    case 8: {
                        n8 = Math.min(n8 + n4, n10 - n3);
                        if (n6 <= 0) break;
                        n8 = Math.max(n8, Math.min(this.Y7, n10 - n6));
                    }
                }
                switch (J90.Qj(this.XF0)) {
                    default: {
                        break;
                    }
                    case 9: {
                        le0_2 le0_25 = this.K20;
                        if (le0_25 != null) {
                            le0_2 le0_26 = le0_25;
                            int n14 = le0_26.SB0 + le0_25.y9;
                            int n15 = le0_26.VM();
                            int n16 = n14;
                            n14 = this.HZ - this.abstract$;
                            n9 = Math.max(n16, Math.min(n15 - n14, n9 + n2));
                            n11 = Math.min(n15, Math.max(n16 + n14, n11 + n2));
                            break;
                        }
                        n9 += n2;
                        n11 += n2;
                        break;
                    }
                    case 4: 
                    case 7: 
                    case 8: {
                        n11 = Math.max(n11 + n2, n9 + n5);
                        if (n7 <= 0) break;
                        n11 = Math.min(n11, Math.max(this.HZ, n9 + n7));
                        break;
                    }
                    case 2: 
                    case 5: 
                    case 6: {
                        n9 = Math.min(n9 + n2, n11 - n5);
                        if (n7 <= 0) break;
                        n9 = Math.max(n9, Math.min(this.abstract$, n11 - n7));
                    }
                }
                le0_2 le0_27 = this.K20;
                if (le0_27 != null) {
                    n9 = Math.max(n9, le0_27.SB0 + le0_27.y9);
                    n8 = Math.max(n8, le0_27.A20 + le0_27.e80);
                    n10 = Math.min(n10, le0_27.cz());
                    n11 = Math.min(n11, le0_27.VM());
                }
                this.E40(n8, n9);
                int n17 = Math.max(this.Se(), n11 - n9);
                this.oY(Math.max(this.R1(), n10 - n8), n17);
            }
            return true;
        }
        if (n2 == 0 && (object = this.Nw) != null && ((le0_2)object).eE) {
            le0_2 le0_28 = (le0_2) object;
            i70_0 i70_04 = i70_02;
            object = dz_2.H7;
            n = i70_04.f8;
            ((le0_2)object).M.j70((MD0)object, le0_28.yv0(n, i70_04.AN));
        }
        if (!i70_02.VP && i70_02.zu == 3 && i70_02.nA0 == 0) {
            int n18;
            int n19;
            i70_0 i70_05 = i70_02;
            int n20 = i70_05.f8;
            n = i70_05.AN;
            this.mY = n20;
            this.qM = n;
            this.Y7 = n19 = this.A20;
                this.abstract$ = n18 = this.SB0;
            this.mn0 = n19 + this.Mx;
            this.HZ = n18 + this.OB;
            this.XF0 = n20 = this.tu0(n20, n);
            if (n20 != n3) {
                return true;
            }
        }
        if (super.nd0(i70_02)) {
            return true;
        }
        return E00.C10(i70_02.zu);
    }

    @Override
    public final dc0_0 KK0(i70_0 i70_02) {
        int n = this.XF0;
        int n2 = 1;
        if (n == 1) {
            i70_0 i70_03 = i70_02;
            int n3 = i70_03.f8;
            n = this.tu0(n3, i70_03.AN);
            if (n == n2) {
                return this.Zt;
            }
        }
        return this.AL0[J90.Qj(n)];
    }

    public final int tu0(int n, int n2) {
        boolean bl = n < this.A20 + this.e80;
        boolean bl2 = n >= this.cz();
        boolean bl3 = n2 < this.SB0 + this.y9;
        boolean bl4 = n2 >= this.VM();
        le0_2 le0_22 = this.QH0;
        if (le0_22 != null && le0_22.K20 == this) {
            if (le0_22.yv0(n, n2)) {
                if (this.Yc0) {
                    return 10;
                }
                return 1;
            }
            bl3 = n2 < this.QH0.SB0;
        }
        if (this.dz0) {
            if (this.yv0(n, n2)) {
                if (this.Yc0) {
                    return 10;
                }
                return 1;
            }
            bl3 = n2 < this.SB0;
        }
        if ((le0_22 = this.Lr0) != null && le0_22.eE && le0_22.yv0(n, n2)) {
            return 1;
        }
        if (this.NT == 1) {
            return 1;
        }
        le0_22 = this.Nw;
        if (le0_22 != null && le0_22.eE && le0_22.yv0(n, n2)) {
            return this.nE0;
        }
        int n3 = this.NT;
        if (!vb0_0.Ak(n3)) {
            bl = false;
            bl2 = false;
        }
        if (!vb0_0.wh(n3)) {
            bl3 = false;
            bl4 = false;
        }
        if (bl) {
            if (bl3) {
                return 6;
            }
            if (bl4) {
                return 9;
            }
            return 2;
        }
        if (bl2) {
            if (bl3) {
                return 7;
            }
            if (bl4) {
                return 8;
            }
            return 4;
        }
        if (bl3) {
            return 3;
        }
        if (bl4) {
            return 5;
        }
        return 1;
    }

    public final void ff0(int n) {
        if (n != 0) {
            this.NT = n;
            if (this.Nw != null) {
                this.ux0();
            }
            return;
        }
        throw new NullPointerException("resizableAxis");
    }
}
