package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class AvatarCustomizerComponent extends BaseComponent {
    public final f00_0[] Pg;
    public final xe_1 VI0;
    public xe_1 bT;
    public final xe_1 Pf0;
    public final R90 JT;
    public final fy_2 MG0;
    public int C4 = 0;

    public AvatarCustomizerComponent(Qy0 var1, Ge0 var2) {
        this.uf("characterselectgui");
        R90 var3 = new R90();
        this.JT = var3;
        var3.Hy(sm0_0.c0(1049));
        var3.uf("login-panel");
        var3.ff0(1);
        fy_2 var4 = new fy_2();
        this.MG0 = var4;
        var4.uf("container");
        this.Pg = new f00_0[var2.XG0().size()];
        ArrayList var5 = new ArrayList();
        Iterator var6 = var2.XG0().iterator();
        while (var6.hasNext()) {
            var5.add((ch0_2)var6.next());
        }
        Collections.sort(var5, new ta_0());

        int var7 = 0;
        for (Object value : var5) {
            ch0_2 var8 = (ch0_2)value;
            f00_0 var9 = new f00_0(var8);
            this.Pg[var7] = var9;
            var9.RR(new ue_0((f.RT)(Object)this, var8, var1, var2));
            var7++;
        }

        xe_1 var10 = new xe_1(sm0_0.c0(1050));
        this.VI0 = var10;
        var10.RR(new K4(var1));
        xe_1 var11 = new xe_1(sm0_0.c0(1065));
        this.bT = var11;
        var11.RR(() -> this.xP(var2));
        xe_1 var12 = new xe_1(sm0_0.c0(1159).toUpperCase());
        this.Pf0 = var12;
        var12.RR(new xv0_0((f.RT)(Object)this, var1));
        I7 var13 = this.MG0.H10();
        Hm0 var14 = this.MG0.lo0();
        this.MG0.x40(var13);
        this.MG0.WQ(var14);
        Hm0 var15 = this.MG0.lo0();
        I7 var16 = this.MG0.H10();
        for (f00_0 var17 : this.Pg) {
            ((ya_1)var16).Kn0(var17);
            ((ya_1)var15).Kn0(var17);
        }

        this.MG0.kl0().X20(var16);
        this.MG0.nt0().X20(var15);
        if (var5.isEmpty() || !h50_0.rb0) {
            this.bT = null;
        }

        this.MG0.kl0().X20(this.MG0.hb(new le0_2[]{this.VI0, this.bT, this.Pf0}));
        this.MG0.nt0().X20(this.MG0.C7(new le0_2[]{this.VI0, this.bT, this.Pf0}));
        this.JT.SL(this.MG0);
        this.SL(this.JT);
    }

    public static void YD(String var0, ch0_2 var1, String var2) {
        if (var0.equalsIgnoreCase(var2)) {
            BR var3;
            BR var10000 = var3 = tw0_0.rl;
            CH0 var4 = var1.Pc0.WN;
            if (((Ge0)var10000).n2() == 3) {
                var3.fk0.uQ(new BQ(var4));
            }

        }
    }

    public final void Ly0(ch0_2 var1) {
        AvatarCustomizerComponent var10000 = this;
        AvatarCustomizerComponent var10001 = this;
        String var4 = sm0_0.c0(1068);
        String var2 = sm0_0.Bx(1067, new String[]{var1.Pc0.Nw0, var4});
        oz_2 var3;
        var3 = new oz_2(var2, var4, value -> AvatarCustomizerComponent.YD(var4, var1, value));
        ((le0_2)var10000).F9(((le0_2)var10001).fU(), var3);
    }

    public final void C(zk0_1 var1) {
        if (HO.iQ) {
            lg_0.k.lPT5(new fb_1((f.RT)(Object)this));
        }

    }

    public final xe_1 o20() {
        if (this.C4 < 0) {
            this.C4 = 0;
        }

        int var1;
        f00_0[] var2;
        if ((var1 = this.C4) < (var2 = this.Pg).length) {
            return var2[var1];
        } else if (var1 == var2.length) {
            return this.VI0;
        } else {
            xe_1 var3;
            if ((var3 = this.bT) != null) {
                if (var1 == var2.length + 1) {
                    return var3;
                } else if (var1 > var2.length + 1) {
                    this.C4 = var2.length + 2;
                    return this.Pf0;
                } else {
                    return this.Pf0;
                }
            } else {
                if (var1 > var2.length + 1) {
                    this.C4 = var2.length + 1;
                }

                return this.Pf0;
            }
        }
    }

    public final boolean nd0(i70_0 var1) {
        boolean var2;
        if (var2 = super.nd0(var1)) {
            return true;
        } else {
            if (E00.ZU(var1.zu) && var1.iT()) {
                int var4 = var1.finally$;
                rp_0 var3;
                rp_0 var10000 = var3 = rp_0.I90;
                int var10001 = dw_2.ff;
                if (var10000 != null && var3.Ov(var4)) {
                    --this.C4;
                    lpt6__0.v90(this.o20());
                    return true;
                }

                if ((var3 = rp_0.Ni) != null && var3.Ov(var4)) {
                    ++this.C4;
                    lpt6__0.v90(this.o20());
                    return true;
                }

                if ((var3 = rp_0.synchronized$) != null && var3.Ov(var4)) {
                    f00_0[] var7;
                    if ((var4 = this.C4) < (var7 = this.Pg).length) {
                        this.C4 = var7.length;
                    } else {
                        this.C4 = var4 + 1;
                    }

                    lpt6__0.v90(this.o20());
                    return true;
                }

                if ((var3 = rp_0.kC0) != null && var3.Ov(var4)) {
                    if ((var4 = this.C4) <= this.Pg.length) {
                        this.C4 = 0;
                    } else {
                        this.C4 = var4 - 1;
                    }

                    lpt6__0.v90(this.o20());
                    return true;
                }

                if ((var3 = rp_0.sJ0) != null && var3.Ov(var4)) {
                    a7_0.bH(this.o20().ER.Fc0);
                    return true;
                }
            }

            return var2;
        }
    }

    public final void K8() {
        this.JT.lt0();
        R90 var10000 = this.JT;
        le0_2 var1;
        le0_2 var10002 = var1 = super.K20;
        int var3 = var10002.A20 + var1.e80;
        var3 = kq_0.lpT2(var10002.a3(), this.JT.Mx, 2, var3);
        le0_2 var2 = super.K20;
        int var10001 = var3;
        var3 = var2.SB0 + var2.y9;
        ((le0_2)var10000).E40(var10001, kq_0.lpT2(var2.k5(), this.JT.OB, 2, var3));
    }

    public final void aUX(zk0_1 var1) {
        if (dw_2.lp0 && tw0_0.kz0()) {
            lg_0.S4.getClass();
            lg_0.S4.getClass();
        }

        wl0_2 var6;
        if ((var6 = super.Jj0) != null) {
            wl0_2 var10000 = var6;
            AvatarCustomizerComponent var10001 = this;
            AvatarCustomizerComponent var10002 = this;
            AvatarCustomizerComponent var10003 = this;
            AvatarCustomizerComponent var10004 = this;
            KG0 var5 = super.M;
            int var7 = var10004.A20;
            int var2 = var10003.SB0;
            int var3 = var10002.Mx;
            int var4 = var10001.OB;
            var10000.uf(var5, var7, var2, var3, var4);
        }

    }

    public final void xP(Ge0 var1) {
        lpt5__1 var2 = value -> this.An0(var1, value);
        ox_1 var3 = new ox_1(sm0_0.c0(1066), 16, var2);
        cg_0 var4 = var3.Pw;
        var4.BP = 16;
        var4.LPt8("[a-zA-Z]");
        var4.NR = true;
        this.F9(this.fU(), var3);
    }

    public final void An0(Ge0 var1, String var2) {
        Iterator var4 = var1.Cl.px0.values().iterator();

        while(var4.hasNext()) {
            ch0_2 var3;
            if ((var3 = (ch0_2)var4.next()).Pc0.Nw0.equalsIgnoreCase(var2)) {
                this.Ly0(var3);
                return;
            }
        }

        tw0_0.rl.jp0(sm0_0.c0(6015));
    }
}

