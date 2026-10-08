package cn.pokemmo.ui.window.pokemon;

import f.*;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import java.text.NumberFormat;

/**
 * 移动端宝可梦状态槽位悬浮窗
 *
 * 原混淆类: f.Rs0
 */
public class MobilePokemonStatusWindow extends cx_0 implements tr_1  {
    public final Rs0 asBridge() {
        return (Rs0) (Object) this;
    }

    public int L2 = 2;
    public int Kq0 = 0;
    public final Bp0 Ww;
    public final fy_2 XO;
    public final qj_2[] LU;
    public final qj_2 KZ;
    public final qj_2 OE;
    public final qj_2[] qH0;
    public final t50_0 aG;
    public final CF FR;
    public final ql_0 TU;
    public int bl0;

    public MobilePokemonStatusWindow(int var1) {
        super(tw0_0.kz0(), false);
        Bp0 var2;
        var2 = new Bp0();
        this.Ww = var2;
        ql_0 var10;
        var10 = new ql_0();
        this.TU = var10;
        this.bl0 = 0;
        this.Pb0(this::oB0);
        N1 var11 = new N1(asBridge(), new gn_0((byte)-1, (byte)-1, (byte)-1, (byte)-1));
        this.LPT8(var11);
        if (tw0_0.H30()) {
            this.uf("base-frame");
        } else {
            this.L2 = 3;
            this.uf("monster-frame-mobile");
        }

        t50_0 var12;
        t50_0 var18 = var12 = new t50_0(this.L2);
        this.aG = var12;
        var18.l60(var1);
        this.FR = var18.ya0();
        this.Ko(true);
        this.Hy("");
        fy_2 var5;
        var5 = new fy_2();
        this.XO = var5;
        this.LU = new qj_2[25];

        for (int var6 = 0; var6 < 5; var6++) {
            for (int var13 = 0; var13 < 5; var13++) {
                qj_2[] var19 = this.LU;
                int var15;
                int var10001 = var15 = var6 * 5 + var13;
                cb_2 var4;
                var4 = new cb_2(asBridge(), var6, var13);
                var19[var10001] = var4;
                int row = var6;
                int column = var13;
                this.LU[var15].RR(() -> this.Zx(row, column));
                this.SL(this.LU[var15]);
            }
        }

        qj_2 var7;
        qj_2 var20 = var7 = new qj_2();
        this.KZ = var7;
        var20.RR(this::TE0);
        this.SL(var7);
        qj_2 var8;
        qj_2 var21 = var8 = new qj_2();
        this.OE = var8;
        var21.RR(this::tG);
        this.SL(var8);
        this.qH0 = new qj_2[4];

        for (int var9 = 0; var9 < 2; var9++) {
            for (int var14 = 0; var14 < 2; var14++) {
                qj_2[] var22 = this.qH0;
                int var16;
                int var23 = var16 = var9 * 2 + var14;
                qj_2 var17;
                var17 = new qj_2();
                var22[var23] = var17;
                int column = var14;
                int row = var9;
                this.qH0[var16].RR(() -> this.LPT4(column, row));
                this.SL(this.qH0[var16]);
            }
        }

        this.SL(this.XO);
    }

    public static boolean D80(le0_2 var0) {
        return var0 instanceof x3_0 || var0 instanceof cx_0 && ((cx_0)var0).Ey;
    }

    public final void IW() {
        if (!this.aG.X5()) {
            if (this.FR.J9.KG0()) {
                int var1 = this.bl0;
                if (this.bl0 == 0) {
                    this.aG.cm();
                    this.bl0 = 1;
                } else if (var1 == 1) {
                    this.aG.TP();
                    this.bl0 = 0;
                }
            }
        }
    }

    public final boolean nd0(i70_0 var1) {
        if (!tw0_0.LD0.Rg0) {
            return super.nd0(var1);
        }

        if (E00.ZU(var1.zu) && var1.iT()) {
            int var2 = var1.finally$;
            rp_0 var3 = rp_0.synchronized$;
            if (rp_0.synchronized$ != null && var3.Ov(var2)) {
                if (this.FR.J9.KG0()) {
                    this.IW();
                    return true;
                }

                this.FR.Tv(1, 0);
                return true;
            }

            var3 = rp_0.kC0;
            if (rp_0.kC0 != null && var3.Ov(var2)) {
                if (this.FR.J9.KG0()) {
                    this.IW();
                    return true;
                }

                this.FR.Tv(-1, 0);
                return true;
            }

            var3 = rp_0.I90;
            if (rp_0.I90 != null && var3.Ov(var2)) {
                if (this.FR.J9.KG0()) {
                    this.IW();
                    return true;
                }

                this.FR.Tv(0, -1);
                return true;
            }

            var3 = rp_0.Ni;
            if (rp_0.Ni != null && var3.Ov(var2)) {
                if (this.FR.J9.KG0()) {
                    this.IW();
                    return true;
                }

                this.FR.Tv(0, 1);
                return true;
            }

            var3 = rp_0.nK0;
            if (rp_0.nK0 != null && var3.Ov(var2)) {
                CF var10 = this.FR;
                var2 = this.FR.pd0;
                if (this.FR.pd0 > 0) {
                    var10.pd0 = var2 - 1;
                } else if (!this.aG.X5()) {
                    this.oB0();
                }

                return true;
            }

            var3 = rp_0.sJ0;
            if (rp_0.sJ0 != null && var3.Ov(var2)) {
                if (this.FR.J9.KG0()) {
                    this.IW();
                } else {
                    CF var8 = this.FR;
                    var2 = this.FR.pd0;
                    if (this.FR.pd0 == 2) {
                        if (var8.LR >= 2) {
                            var8.pd0 = 1;
                            return true;
                        }

                        var2 = var8.p80;
                        if (var8.p80 < 5) {
                            int var21 = var8.vf0;
                            if (var8.vf0 < 5) {
                                as_0 var9;
                                as_0 var23 = var9 = var8.J9.IU(var2, var21);
                                int var5 = this.FR.qI;
                                int var6;
                                if (var23.gr0(var6 = this.FR.LR * 2 + var5)) {
                                    var9.ro &= ~(1 << var6);
                                } else {
                                    var9.ro |= 1 << var6;
                                }
                            }
                        }
                    } else {
                        int var22 = var8.p80;
                        if (var8.p80 == 0 && var8.vf0 == 5) {
                            byte var7;
                            if (var2 > 0) {
                                var7 = 0;
                            } else {
                                var7 = 1;
                            }

                            var8.pd0 = var7;
                            var8.zr(0, 0);
                        } else if (var22 == 1 && var8.vf0 == 5) {
                            a7_0.bH(this.OE.ER.Fc0);
                        } else if (var2 == 0) {
                            var8.J9.WY(var22, var8.vf0);
                        } else if (var2 == 1) {
                            var8.LR = 0;
                            var8.qI = 0;
                            var8.pd0 = 2;
                        }
                    }
                }

                return true;
            }

            var3 = rp_0.N9;
            if (rp_0.N9 != null && var3.Ov(var2)) {
                if (this.FR.J9.KG0()) {
                    this.IW();
                } else {
                    CF var4;
                    CF var10000;
                    byte var10001;
                    if ((var4 = this.FR).pd0 > 0) {
                        var10000 = var4;
                        var10001 = 0;
                    } else if (var4.vf0 < 5 && var4.p80 < 5) {
                        var10000 = var4;
                        var10001 = 2;
                    } else {
                        var10000 = var4;
                        var10001 = 1;
                    }

                    var10000.pd0 = var10001;
                }

                return true;
            }
        }

        int var11 = var1.zu;
        if (E00.C10(var1.zu) && (var11 == 1 || var11 == 3)) {
            if (this.FR.J9.KG0() && var1.zu == 3) {
                this.IW();
            }

            return true;
        } else {
            return false;
        }
    }

    public final void C(zk0_1 var1) {
        super.C(var1);
        this.RH0();
        lpt6__0.v90(this);
    }

    public final void N00(zk0_1 var1) {
        super.N00(var1);
        this.aG.dispose();
    }

    public final void HP(zk0_1 var1) {
        label273:
        if (!this.Of()) {
            le0_2 var2;
            le0_2 var10000 = var2 = Qy0.yI0;
            b6_0 var3 = var0 -> var0 instanceof x3_0 || var0 instanceof cx_0 && ((cx_0)var0).Ey;
            if (var10000.Of()) {
                if (var3.evaluate(var2)) {
                    break label273;
                }

                while ((var2 = ((le0_2)var2).bx) != null) {
                    if (var3.evaluate(var2)) {
                        break label273;
                    }
                }
            }

            lpt6__0.v90(this);
        }

        super.HP(var1);
        if (this.Kq0 != this.FR.J9.lPt8 && !this.aG.X5()) {
            this.Kq0 = this.FR.J9.lPt8;
            lpt6__2 var10001 = lpt6__2.Q80;
            iz0_0[] var12;
            iz0_0[] var10002 = var12 = new iz0_0[1];
            int var4 = this.Kq0;
            iz0_0 var30 = new iz0_0((byte)0, (byte)3, var4);
            var10002[0] = var30;
            this.Hy(sm0_0.YG((byte)4, var10001, 39, 0, var12));
        }

        qq_0 var10;
        (var10 = (qq_0)var1.AK).zi.end();
        t50_0 var11 = this.aG;
        ql_0 var13 = this.TU;
        js_1[] var31 = var11.G9;
        int var56 = var11.G9.length;

        for (int var5 = 0; var5 < var56; var5++) {
            var31[var5].wR();
        }

        SB0[] var32 = var11.Ni0;
        var56 = var11.Ni0.length;

        for (int var75 = 0; var75 < var56; var75++) {
            SB0 var6;
            int var7;
            if ((var6 = var32[var75]).rY == 1) {
                var7 = var6.FF.Fo.Kc0;
            } else {
                var7 = var6.FF.Fo.J9.UK();
            }

            int var8 = var6.jz;
            if (var6.jz != var7) {
                var8 = var7 - var8;
                int var9 = var6.bB0;
                if (var6.bB0 != var7) {
                    var6.jz = var9;
                    var6.bB0 = var7;
                    var6.o6 = Math.max(1.0F, (float)Math.log10(Math.abs(var8)));
                }

                if (var8 > 0) {
                    int var124 = var6.jz;
                    int var111;
                    var124 = var111 = Math.max(1, Math.round(var8 * lg_0.S4.uL * var6.o6)) + var124;
                    var6.jz = var111;
                    if (var124 >= var7) {
                        var6.jz = var7;
                        var6.o6 = 0.0F;
                        if (var6.rY == 1) {
                            short var112 = 2347;
                            tw0_0.RE0.d00(true, (byte)4, var112, 0.0F);
                        }
                    }

                    long var113 = hk0_1.KG;
                    if (hk0_1.KG - var6.lM >= 100L) {
                        var6.lM = var113;
                        short var114 = 2346;
                        tw0_0.RE0.d00(true, (byte)4, var114, 0.0F);
                    }
                } else {
                    int var126 = var6.jz;
                    if ((var6.jz = Math.min(-1, Math.round(var8 * lg_0.S4.uL * var6.o6)) + var126) < 0) {
                        var6.jz = 0;
                        var6.o6 = 0.0F;
                    }
                }

                if (var7 == var6.jz && var6.rY == 1) {
                    BR var88 = tw0_0.rl;
                    if (tw0_0.rl != null) {
                        short var100;
                        short var128 = var100 = var11.v50;
                        short var89;
                        short var140 = var89 = var88.yh0.ma((byte)4, (short)1495);
                        var11.v50 = var89;
                        if (var128 != var140) {
                            if ((var89 & 1) != (var100 & 1)) {
                                tw0_0.rl.qK(sm0_0.wa0(16777266, NumberFormat.getInstance().format(500L)));
                            }

                            if ((var11.v50 & 2) != (var100 & 2)) {
                                tw0_0.rl.qK(sm0_0.wa0(16777266, NumberFormat.getInstance().format(5000L)));
                            }

                            if ((var11.v50 & 4) != (var100 & 4)) {
                                mc0_1 var90 = gu0.l2.lPT6((short)4675);
                                tw0_0.rl.qK(sm0_0.wa0(16777267, sm0_0.c0(var90.Nl)));
                            }
                        }
                    }
                }
            }
        }

        PC0 var33;
        PC0 var141 = var33 = new PC0();
        var33.LH = 1.0F / var11.gB;
        float var58 = var13.IA;
        var141.Ka0(var58, var13.Eu0, true);
        var141.R1(true);
        var11.XA.Po(var33.iJ);
        var11.XA.W30();
        jn_0 var34 = tw0_0.LD0;
        int var129 = (int)(var13.j80 / tw0_0.LD0.Ew);
        float var35 = var34.Hv0() - var13.Wm0;
        float var149 = var35 - var13.Eu0;
        float var36 = tw0_0.LD0.Ew;
        var56 = (int)(var149 / tw0_0.LD0.Ew);
        int var14 = (int)(var13.IA / var36);
        int var37 = (int)(var13.Eu0 / var36);
        CI0.r40(var129, var56, var14, var37);
        var11.XA.CH0(var11.ca, 0.0F, 0.0F);
        var11.XA.CH0(var11.Con, 0.0F, 200.0F);

        for (int var15 = 0; var15 < 5; var15++) {
            yb0_2 var38 = var11.Fo.J9;
            var56 = 0;

            for (int var76 = 0; var76 < 5; var76++) {
                var56 += var38.IU(var15, var76).Rl0;
            }

            var38.getClass();
            LPT6_ var39 = var11.VZ[var56 / 10];
            int var77 = var15 * 32;
            float var40 = var77 + 8;
            var11.XA.Lz(var39, 176.0F, var40);
            var11.XA.Lz(var11.VZ[var56 % 10], 184.0F, var40);
            hl0_1 var41 = var11.XA;
            LPT6_[] var61 = var11.VZ;
            yb0_2 var91 = var11.Fo.J9;
            byte var101 = 0;

            for (int var115 = 0; var115 < 5; var115++) {
                byte var120;
                if (var91.IU(var15, var115).Rl0 == 0) {
                    var120 = 1;
                } else {
                    var120 = 0;
                }

                var101 += var120;
            }

            var91.getClass();
            LPT6_ var42 = var61[var101];
            float var62 = var77 + 21;
            var41.Lz(var42, 184.0F, var62);
        }

        for (int var16 = 0; var16 < 5; var16++) {
            yb0_2 var43 = var11.Fo.J9;
            var56 = 0;

            for (int var78 = 0; var78 < 5; var78++) {
                var56 += var43.IU(var78, var16).Rl0;
            }

            var43.getClass();
            LPT6_ var44 = var11.VZ[var56 / 10];
            int var79 = var16 * 32;
            var11.XA.Lz(var44, var79 + 16, 168.0F);
            LPT6_ var45 = var11.VZ[var56 % 10];
            float var64 = var79 + 24;
            var11.XA.Lz(var45, var64, 168.0F);
            hl0_1 var46 = var11.XA;
            LPT6_[] var80 = var11.VZ;
            yb0_2 var92 = var11.Fo.J9;
            byte var102 = 0;

            for (int var116 = 0; var116 < 5; var116++) {
                byte var121;
                if (var92.IU(var116, var16).Rl0 == 0) {
                    var121 = 1;
                } else {
                    var121 = 0;
                }

                var102 += var121;
            }

            var92.getClass();
            var46.Lz(var80[var102], var64, 181.0F);
        }

        var11.Qw0(0);
        var11.Qw0(1);
        js_1[] var17 = var11.G9;
        int var47 = var11.G9.length;

        for (int var65 = 0; var65 < var47; var65++) {
            js_1 var81;
            as_0 var93 = (var81 = var17[var65]).uy0.Fo.J9.IU(var81.W20, var81.WA);
            int var103 = var81.ty0;
            if (var81.ty0 > 0) {
                t50_0 var117 = var81.uy0;
                var81.uy0.XA.Lz(var117.lPt2[var93.Rl0][var103], var81.WA * 32 + 8, var81.W20 * 32 + 8);
            } else {
                if (var93.gr0(0)) {
                    t50_0 var104 = var81.uy0;
                    var81.uy0.XA.Lz(var104.Xu[0], var81.WA * 32 + 8, var81.W20 * 32 + 8);
                }

                if (var93.gr0(1)) {
                    t50_0 var105 = var81.uy0;
                    var81.uy0.XA.Lz(var105.Xu[1], var81.WA * 32 + 24, var81.W20 * 32 + 8);
                }

                if (var93.gr0(2)) {
                    t50_0 var106 = var81.uy0;
                    var81.uy0.XA.Lz(var106.Xu[2], var81.WA * 32 + 8, var81.W20 * 32 + 23);
                }

                if (var93.gr0(3)) {
                    t50_0 var94 = var81.uy0;
                    var81.uy0.XA.Lz(var94.Xu[3], var81.WA * 32 + 24, var81.W20 * 32 + 23);
                }
            }

            int var95 = var81.W20;
            t50_0 var107 = var81.uy0;
            CF var118 = var81.uy0.Fo;
            int var82;
            if (var81.W20 == var81.uy0.Fo.p80 && (var82 = var81.WA) == var118.vf0) {
                byte var119 = 11;
                int var122;
                if ((var122 = var118.pd0) == 1) {
                    var119 = 38;
                } else if (var122 == 2) {
                    var119 = 39;
                }

                Texture var83 = var107.F3[var119];
                float var96 = var82 * 32;
                float var108 = var95 * 32;
                var107.XA.CH0(var83, var96, var108);
            }
        }

        var11.XA.CH0(var11.F3[12], 192.0F, 8.0F);
        CF var18 = var11.Fo;
        if (var11.Fo.p80 == 0 && var18.vf0 == 5) {
            var11.XA.CH0(var11.F3[14], 194.0F, 8.0F);
            var11.XA.TJ0(0.95686275F, 0.24705882F, 0.18431373F, 1.0F);
        } else {
            var11.XA.TJ0(0.24705882F, 0.24705882F, 0.24705882F, 1.0F);
        }

        var11.XA.S50(fn_0.qz0().dw0, 208.0F, 30.0F, 32.0F, 32.0F);
        hl0_1 var19;
        hl0_1 var133 = var19 = var11.XA;
        float var48;
        float var145 = var48 = Color.WHITE_FLOAT_BITS;
        Color.abgr8888ToColor(var19.oH, var48);
        var133.og = var145;
        if (var11.Fo.pd0 > 0) {
            var11.XA.CH0(var11.F3[33], 192.0F, 70.0F);
        } else {
            var11.XA.CH0(var11.F3[6], 190.0F, 162.0F);
            CF var20 = var11.Fo;
            if (var11.Fo.p80 == 1 && var20.vf0 == 5) {
                var11.XA.CH0(var11.F3[8], 190.0F, 162.0F);
            }

            hl0_1 var21 = var11.XA;
            Color var66;
            if ((var11.v50 & 1) != 0) {
                var66 = Color.GOLD;
            } else {
                var66 = Color.WHITE;
            }

            var21.oH.set(var66);
            var21.og = var66.toFloatBits();
            var11.XA.S50(fn_0.qz0().uK0, 204.0F, 168.0F, 12.0F, 15.5F);
            hl0_1 var22 = var11.XA;
            Color var67;
            if ((var11.v50 & 2) != 0) {
                var67 = Color.GOLD;
            } else {
                var67 = Color.WHITE;
            }

            var22.oH.set(var67);
            var22.og = var67.toFloatBits();
            var11.XA.S50(fn_0.qz0().uK0, 216, 168.0F, 12.0F, 15.5F);
            hl0_1 var23 = var11.XA;
            Color var68;
            if ((var11.v50 & 4) != 0) {
                var68 = Color.GOLD;
            } else {
                var68 = Color.WHITE;
            }

            var23.oH.set(var68);
            var23.og = var68.toFloatBits();
            var11.XA.S50(fn_0.qz0().uK0, 228, 168.0F, 12.0F, 15.5F);
            hl0_1 var134 = var11.XA;
            Color.abgr8888ToColor(var11.XA.oH, var48);
            var134.og = var48;
        }

        CF var24 = var11.Fo;
        if (var11.Fo.pd0 > 0) {
            int var49 = var24.p80;
            if (var24.p80 < 5) {
                var56 = var24.vf0;
                if (var24.vf0 < 5) {
                    as_0 var25;
                    as_0 var135 = var25 = var24.J9.IU(var49, var56);
                    hl0_1 var50 = var11.XA;
                    Texture[] var70 = var11.F3;
                    byte var84;
                    if (var135.gr0(0)) {
                        var84 = 15;
                    } else {
                        var84 = 19;
                    }

                    var50.CH0(var70[var84], 200.0F, 78.0F);
                    hl0_1 var51 = var11.XA;
                    Texture[] var71 = var11.F3;
                    if (var25.gr0(1)) {
                        var84 = 18;
                    } else {
                        var84 = 22;
                    }

                    var51.CH0(var71[var84], 224.0F, 78.0F);
                    hl0_1 var52 = var11.XA;
                    Texture[] var72 = var11.F3;
                    if (var25.gr0(2)) {
                        var84 = 17;
                    } else {
                        var84 = 21;
                    }

                    var52.CH0(var72[var84], 200.0F, 102.0F);
                    hl0_1 var26 = var11.XA;
                    Texture[] var53 = var11.F3;
                    byte var73;
                    if (var25.gr0(3)) {
                        var73 = 16;
                    } else {
                        var73 = 20;
                    }

                    var26.CH0(var53[var73], 224.0F, 102.0F);
                }
            }

            if (var11.Fo.pd0 == 2) {
                var11.XA.CH0(var11.F3[9], 224.0F, 126.0F);
                Texture var146 = var11.F3[11];
                short var27 = 192;
                float var28 = var11.Fo.qI * 24 + var27;
                byte var54 = 70;
                var11.XA.CH0(var146, var28, var11.Fo.LR * 24 + var54);
            }
        }

        js_1[] var29 = var11.G9;
        int var55 = var11.G9.length;

        for (int var74 = 0; var74 < var55; var74++) {
            js_1 var87;
            int var97;
            if ((var97 = (var87 = var29[var74]).Rb) > 0) {
                t50_0 var109 = var87.uy0;
                hl0_1 var137 = var87.uy0.XA;
                Texture var98;
                Texture var147 = var98 = var109.F3[var97];
                float var99 = var87.WA * 32 + 8 - (var98.getWidth() - 24) / 2;
                var137.CH0(var147, var99, var87.W20 * 32 + 8 - (var87.uy0.F3[var87.Rb].getHeight() - 24) / 2);
            }
        }

        var11.XA.end();
        var10.va.kF(false);
        var10.zi.W30();
    }

    public final void RH0() {
        int var10000 = tw0_0.LD0.ew0();
        int var1 = tw0_0.LD0.Hv0();
        if ((this.L2 = Math.min(var10000 / 256, var1 / 284)) < 1) {
            this.L2 = 1;
        }

        this.aG.gB = this.L2;
        if (tw0_0.kz0() ^ true) {
            int var2 = this.L2;
            this.oY(256 * var2, 284 * var2 + 35);
            this.vf(pa0_0.Ol);
        } else {
            this.oY(tw0_0.LD0.ew0(), tw0_0.LD0.Hv0());
        }
    }

    public final void K8() {
        this.RH0();
        this.XO.lt0();
        super.K8();
        float var1;
        Bp0 var10000;
        Bp0 var10001;
        float var10002;
        if (tw0_0.kz0()) {
            var10000 = this.Ww;
            var10001 = this.Ww;
            var10002 = this.a3() / 2.0F - 256 * this.L2 / 2.0F;
            var1 = this.k5() / 2.0F - 284 * this.L2 / 2.0F;
        } else {
            var10000 = this.Ww;
            var10001 = this.Ww;
            var10002 = super.A20 + super.e80;
            var1 = super.SB0 + super.y9 + 35;
        }

        var10001.x = var10002;
        var10000.y = var1;
        ql_0 var35 = this.TU;
        ql_0 var41 = this.TU;
        ql_0 var43 = this.TU;
        var1 = this.Ww.x;
        float var2 = this.Ww.y;
        int var9 = this.L2;
        float var3 = 256 * var9;
        float var10 = 284 * var9;
        this.TU.j80 = var1;
        var43.Wm0 = var2;
        var41.IA = var3;
        var35.Eu0 = var10;

        for (int var11 = 0; var11 < 5; var11++) {
            for (int var18 = 0; var18 < 5; var18++) {
                int var24;
                qj_2 var36 = this.LU[var24 = var11 * 5 + var18];
                Bp0 var4 = this.Ww;
                int var5 = (int)this.Ww.x;
                int var44 = var18 * 32 + 8;
                int var6 = this.L2;
                var5 = var44 * this.L2 + var5;
                int var28 = (int)var4.y;
                var36.E40(var5, (var11 * 32 + 8) * var6 + var28);
                qj_2 var37 = this.LU[var24];
                int var25 = this.L2 * 24;
                var37.oY(var25, this.L2 * 24);
            }
        }

        for (int var12 = 0; var12 < 2; var12++) {
            for (int var19 = 0; var19 < 2; var19++) {
                int var26;
                qj_2 var38 = this.qH0[var26 = var12 * 2 + var19];
                Bp0 var29 = this.Ww;
                int var32 = (int)this.Ww.x;
                int var45 = var19 * 24 + 200;
                int var34 = this.L2;
                var32 = var45 * this.L2 + var32;
                int var30 = (int)var29.y;
                var38.E40(var32, (var12 * 24 + 78) * var34 + var30);
                qj_2 var39 = this.qH0[var26];
                int var27 = this.L2 * 24;
                var39.oY(var27, this.L2 * 24);
            }
        }

        Bp0 var13 = this.Ww;
        int var20 = (int)this.Ww.x;
        int var14 = this.L2 * 197 + var20;
        int var21 = (int)var13.y;
        this.KZ.E40(var14, this.L2 * 10 + var21);
        int var15 = this.L2 * 54;
        this.KZ.oY(var15, this.L2 * 62);
        Bp0 var16 = this.Ww;
        int var22 = (int)this.Ww.x;
        int var17 = this.L2 * 192 + var22;
        int var23 = (int)var16.y;
        this.OE.E40(var17, this.L2 * 166 + var23);
        int var7 = this.L2 * 59;
        this.OE.oY(var7, this.L2 * 24);
    }

    public final void oB0() {
        Qy0 var10000 = Qy0.yI0;
        String var1 = sm0_0.c0(5963);
        lpt3__4 var10001 = new lpt3__4(var1, this::Vi0, asBridge());
        var10001.D80 = true;
        var10000.sr0(var10001);
    }

    public final void Vi0() {
        tw0_0.rl.Kv0(GI0.Xd0, (byte)-1);
        this.xe0();
    }

    public final void LPT4(int var1, int var2) {
        if (this.FR.J9.KG0()) {
            this.IW();
        } else {
            CF var5;
            if ((var5 = this.FR).pd0 == 1) {
                int var3 = var5.p80;
                if (var5.p80 < 5) {
                    int var4 = var5.vf0;
                    if (var5.vf0 < 5) {
                        as_0 var6;
                        if ((var6 = var5.J9.IU(var3, var4)).gr0(var1 = var2 * 2 + var1)) {
                            var6.ro &= ~(1 << var1);
                        } else {
                            var6.ro |= 1 << var1;
                        }
                    }
                }
            }
        }
    }

    public final void tG() {
        Qy0 var10000 = Qy0.yI0;
        Qy0 var10001 = Qy0.yI0;
        x3_0 var1;
        var1 = new x3_0(asBridge());
        var10000.F9(var10001.fU(), var1);
    }

    public final void TE0() {
        if (this.FR.J9.KG0()) {
            this.IW();
        } else {
            CF var1;
            CF var10000;
            byte var10001;
            if ((var1 = this.FR).pd0 > 0) {
                var10000 = var1;
                var10001 = 0;
            } else {
                var10000 = var1;
                var10001 = 1;
            }

            var10000.pd0 = var10001;
        }
    }

    public final void Zx(int var1, int var2) {
        if (this.FR.J9.KG0()) {
            this.IW();
        } else {
            this.FR.zr(var1, var2);
            CF var3;
            if ((var3 = this.FR).pd0 == 0) {
                var3.J9.WY(var1, var2);
            }
        }
    }
}

