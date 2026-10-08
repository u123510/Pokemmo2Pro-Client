package cn.pokemmo.graphics.gdx.model;

import f.*;
import cn.pokemmo.graphics.sprite.GdxAddonSpriteManager;


import com.badlogic.gdx.graphics.Color;
import java.util.ArrayList;
import java.util.List;

public class GdxMaterialPart extends O8 {
    public jk_0[] SB0;
    public mk0_0 Xc0;
    public ii0_2 GW;
    public final String xN;
    public final ec0_1 bj;
    public final gt0_0 le0;
    public final short nG;
    public final byte A3;
    public ArrayList AB;

    public GdxMaterialPart(byte b, String str, ec0_1 ec0_1Var, gt0_0 gt0_0Var, short s, byte b2, byte b3, byte b4) {
        super(b, b3);
        this.SB0 = null;
        this.AB = null;
        this.xN = str;
        this.bj = ec0_1Var;
        this.le0 = gt0_0Var;
        this.nG = s;
        this.A3 = b2;
        fC(b4);
    }

    @Override
    public final con__6 Td0() {
        return con__6.Qs;
    }

    @Override
    public final String BO() {
        if (this.A3 > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(sm0_0.fg0((byte) 2, lpt6__2.Q80, 15, 8, new String[]{this.xN}));
            sb.append("\n\n");
            String str;
            if (this.A3 >= 100) {
                str = fp0_0.uD(new StringBuilder(), this.A3, "+");
            } else {
                str = Integer.toString((int) this.A3);
            }
            sb.append(sm0_0.Bx(5790, new String[]{this.xN, str}));
            return sb.toString();
        }
        return sm0_0.fg0((byte) 2, lpt6__2.Q80, 15, 8, new String[]{this.xN});
    }

    @Override
    public final void Vs0(int i, int i2) {
        jk_0[] Rc0 = ((GdxAddonSpriteManager) tw0_0.pv).Rc0(this.bj);
        this.SB0 = Rc0;
        jk_0 jk_0Var = Rc0[0];
        this.GW = new ii0_2(jk_0Var);
        jk_0Var.yJ = i + 45;
        jk_0Var.tX = 159;
    }

    @Override
    public final void Dt(float f, float f2) {
        this.AB = new ArrayList();
        GdxAddonSpriteManager spriteManager = tw0_0.pv;
        ec0_1 ec0_1Var = this.bj;
        spriteManager.getClass();
        ArrayList arrayList = new ArrayList();
        boolean Wo = q10_0.Ci.Wo(ec0_1Var.Nul(q10_0.Ci));
        for (int i = 0; i < 2; i++) {
            boolean z = i == 0;
            if (i == 1) {
                LPT6_ fr = spriteManager.fr(ew0_0.a, ec0_1Var.rh.Fw, ec0_1Var.mh0);
                if (fr != null) {
                    arrayList.add(new com3__3(fr.bz, fr.xZ, fr, true));
                }
            }
            q10_0 q10_0Var = q10_0.bb;
            if (q10_0Var.cOm4(ec0_1Var.Nul(q10_0Var))) {
                GdxAddonSpriteManager.HL0(q10_0.pv, ec0_1Var, arrayList, z);
            }
            if (q10_0Var.QI(ec0_1Var.Nul(q10_0Var))) {
                GdxAddonSpriteManager.HL0(q10_0.l3, ec0_1Var, arrayList, z);
            }
            q10_0 q10_0Var2 = q10_0.Xl;
            boolean z2 = ec0_1Var.Nul(q10_0Var2) != 1;
            if (!z2) {
                GdxAddonSpriteManager.HL0(q10_0Var2, ec0_1Var, arrayList, z);
            }
            GdxAddonSpriteManager.HL0(q10_0Var, ec0_1Var, arrayList, z);
            if (!Wo) {
                GdxAddonSpriteManager.HL0(q10_0.Ci, ec0_1Var, arrayList, z);
            }
            GdxAddonSpriteManager.HL0(q10_0.rg0, ec0_1Var, arrayList, z);
            GdxAddonSpriteManager.HL0(q10_0.uz, ec0_1Var, arrayList, z);
            byte b = ec0_1Var.mh0;
            q10_0 q10_0Var3 = q10_0.VI;
            if (q10_0Var3.Pd0(ec0_1Var.Nul(q10_0Var3)) && ec0_1Var.Nul(q10_0.Bj0) != -1) {
                short Nul = ec0_1Var.Nul(q10_0Var3);
                short Nul2 = ec0_1Var.Nul(q10_0.Bj0);
                for (byte b2 = 0; b2 < 2; b2 = (byte) (b2 + 1)) {
                    q10_0 q10_0Var4 = b2 == 0 ? q10_0.VI : q10_0.Bj0;
                    for (byte b3 = 0; b3 < 3; b3 = (byte) (b3 + 1)) {
                        if (b3 != 1) {
                            byte b4 = (byte) (qx_1.AE0[z ? 0 : 1] + b3);
                            LPT6_[] MQ = spriteManager.MQ(ew0_0.a, Nul, Nul2, b, b4, true, null);
                            if (MQ != null) {
                                LPT6_ lpt6_ = MQ[b2];
                                if (lpt6_ != null) {
                                    com3__3 com3__3Var = new com3__3(lpt6_.bz, lpt6_.xZ, lpt6_, true);
                                    if (b3 == 0) {
                                        yb_1 Ry0 = ec0_1Var.Ry0(q10_0Var4);
                                        if (Ry0 != null && q10_0Var4.Yy(q10_0Var4 == q10_0.VI ? Nul : Nul2)) {
                                            com3__3Var.CQ.v50.set(Ry0.tg0);
                                        } else {
                                            com3__3Var.CQ.v50.set(Color.WHITE);
                                        }
                                    } else {
                                        com3__3Var.CQ.v50.set(Color.WHITE);
                                    }
                                    arrayList.add(com3__3Var);
                                }
                            }
                        }
                    }
                }
            } else {
                short Nul3 = ec0_1Var.Nul(q10_0Var3);
                if (Nul3 != -1) {
                    X90 x90 = (X90) q10_0Var3.Fk.f5(Nul3);
                    if (x90 != null) {
                        z3_0 Yv = x90.Yv(ew0_0.a);
                        if (Yv != null) {
                            Yv.Pu(true);
                            for (byte b5 = 0; b5 < 3; b5 = (byte) (b5 + 1)) {
                                byte b6 = z ? (byte) (b5 + 3) : b5;
                                LPT6_ bO = Yv.bO(b6, b);
                                if (bO != null) {
                                    com3__3 com3__3Var2 = new com3__3(bO.bz, bO.xZ, bO, true);
                                    if (b5 == 0) {
                                        yb_1 Ry02 = ec0_1Var.Ry0(q10_0.VI);
                                        if (Ry02 != null && x90.yt()) {
                                            com3__3Var2.CQ.v50.set(Ry02.tg0);
                                        } else {
                                            com3__3Var2.CQ.v50.set(Color.WHITE);
                                        }
                                    } else {
                                        com3__3Var2.CQ.v50.set(Color.WHITE);
                                    }
                                    arrayList.add(com3__3Var2);
                                }
                            }
                        }
                    }
                }
            }
            if (z2) {
                GdxAddonSpriteManager.HL0(q10_0.Xl, ec0_1Var, arrayList, z);
            }
            if (Wo) {
                GdxAddonSpriteManager.HL0(q10_0.Ci, ec0_1Var, arrayList, z);
            }
        }
        for (Object obj : arrayList) {
            com3__3 com3__3Var3 = (com3__3) obj;
            com3__3Var3.qr0(vr_1.Lt0);
            com3__3Var3.j.na(f2 + 0.25f, -0.025f, 0.0f);
            this.AB.add(com3__3Var3);
        }
    }

    @Override
    public final List v10() {
        return this.AB;
    }

    @Override
    public final void Wa0(hl0_1 hl0_1Var) {
        if (this.GW != null) {
            this.SB0[0].gy(hl0_1Var);
        }
        mk0_0 mk0_0Var = this.Xc0;
        if (mk0_0Var != null) {
            mk0_0Var.nr(hl0_1Var);
        }
    }

    @Override
    public final void Cq0(int i, boolean z) {
        if (z) {
            this.Xc0 = (mk0_0) new mk0_0(this.SB0, i).Ti0();
        }
        this.GW = null;
    }

    @Override
    public final void jG() {
        jk_0 jk_0Var = this.SB0[0];
        jk_0Var.yJ = 45;
        jk_0Var.tX = 0;
    }

    @Override
    public final ii0_2 b90() {
        return this.GW;
    }

    @Override
    public final boolean Sw() {
        a10_0 a10_0Var = this.lpT2;
        if (a10_0Var == null) {
            return false;
        }
        return a10_0Var.Pl0 >= a10_0Var.WY;
    }

    @Override
    public final String Zc() {
        return sm0_0.wa0(5038, Integer.toString((int) this.lpT2.WY));
    }

    @Override
    public final String M2() {
        return this.xN;
    }

    @Override
    public final String bM(O8 o8) {
        a10_0 a10_0Var = this.lpT2;
        if (a10_0Var != null && !a10_0Var.a40 && a10_0Var.Ez0() == this.ZG0 && this.lpT2.mn(this.ZG0) == this) {
            return "";
        }
        return this.xN;
    }

    @Override
    public final boolean pq(ML0 mL0, boolean z, String str, SZ[] sZArr, int i) {
        boolean pq = super.pq(mL0, z, str, sZArr, i);
        if (!pq && !str.isEmpty()) {
            mL0.wJ(sm0_0.Bx(5017, new String[]{str, this.xN}), "", null);
            return true;
        }
        return pq;
    }

    public final gt0_0 Fa() {
        return this.le0;
    }

    public final short l20() {
        return this.nG;
    }
}
