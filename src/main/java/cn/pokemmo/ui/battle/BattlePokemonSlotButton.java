package cn.pokemmo.ui.battle;

import f.*;
import java.text.NumberFormat;

/**
 * 对战出战精灵/队伍槽位按钮控件 (Battle Pokemon Slot Button)
 * 渲染对战界面的精灵头像、HP进度条、异常状态图标、等级与携带道具标识。
 *
 * 原混淆类: f.ak0_2
 */
public class BattlePokemonSlotButton extends xe_1 {
    public static final gn_0 Fq0 = new gn_0(0x50FFFFFF);
    public static final gn_0 Wz0 = new gn_0(-1);
    public VU hy;
    public PF F9;
    public final zw0_0 dw;
    public final zw0_0 M50;
    public final zw0_0 Ys0;
    public final fz_0 st0;
    public final jv0_0 XH0;
    public final fz_0 WH0;
    public final fz_0 LR;
    public final int zD0;
    public final int nL0;
    public final Br0 hG0;

    public ak0_2 asBridge() {
        return (ak0_2) (Object) this;
    }

    public BattlePokemonSlotButton(String object, int n, int n2) {
        super("");
        Br0 frame = new Br0(this);
        this.hG0 = frame;
        this.zD0 = n;
        this.nL0 = n2;
        this.dw = new zw0_0(asBridge(), object);
        this.dw.uf("label");
        this.M50 = new zw0_0(asBridge());
        this.M50.uf("label");
        this.Ys0 = new zw0_0(asBridge());
        this.Ys0.uf("label");
        this.st0 = new fz_0(asBridge(), 0, 0);
        this.st0.Ll(false);
        Br0 statusFrame = this.st0.JH();
        statusFrame.nq0(tw0_0.kz0() ? 16 : 12, tw0_0.kz0() ? 16 : 10);
        statusFrame.o60(ob0_0.Ui0().K5());
        this.XH0 = new jv0_0(asBridge());
        this.XH0.uf("progressbar");
        this.WH0 = new fz_0(asBridge(), 16, 16);
        this.LR = new fz_0(asBridge(), 16, 16);
        this.LR.JH().dA(tw0_0.kz0() ? 1.5f : 1.0f);
        this.SL(this.dw);
        this.SL(this.M50);
        this.SL(this.Ys0);
        this.SL(this.st0);
        this.SL(this.XH0);
        this.SL(this.WH0);
        this.SL(this.LR);
        this.XH0.uf("monsterframe-hp-progressbar");
    }

    public final void ih(VU vU) {
        this.hy = vU;
        this.F9 = null;
        if (vU == null) {
            this.dw.Sk("");
            this.Ys0.Sk("");
            this.st0.Ll(false);
            this.Ik0(0, 0);
            this.pw0(false);
            this.qE((byte)0);
            this.hG0.lo0();
        } else {
            VU vU2 = vU;
            this.dw.Sk(vU2.na0());
            if (vU2.I8.vn()) {
                this.Ys0.Sk("");
                this.st0.Ll(false);
                this.Ik0(0, 0);
                this.qE((byte)0);
                this.pw0(false);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                this.Ys0.Sk(ig_0.u9(59, stringBuilder, " ").append(vU.I8.wj).toString());
                this.st0.Ll(vU.I8.COM6());
                short s = vU.I8.VD;
                short s2 = vU.Ps.BL0(gc_2.RC);
                this.Ik0(s, s2);
                CE cE = vU.I8;
                if (cE == null) {
                    this.WH0.og.lo0();
                    this.WH0.yj0 = null;
                    this.WH0.yB0();
                } else {
                    this.qE(cE.H1);
                }
            }
            VU vU4 = vU;
            short s = vU4.I8.Kr();
            this.hG0.o60(yh_0.Xm0.qC0(s, vU4.Dg0(), vU.I8.aR()));
            Br0 br0 = this.hG0;
            int n = 36;
            int n2 = 36;
            br0.OA0 = true;
            br0.IF = n;
            br0.gx0 = n2;
            n = 3;
            br0.gY = 6;
            br0.a4 = n;
        }
    }

    public final void W(PF object) {
        block7: {
            AG0[] aG0Array;
            block9: {
                float f;
                block12: {
                    String string;
                    jv0_0 jv0_02;
                    block11: {
                        block13: {
                            block10: {
                                block8: {
                                    StringBuilder stringBuilder;
                                    this.hy = null;
                                    this.F9 = object;
                                    if (object == null || ((PF)object).Zo0().Uz0()) break block7;
                                    Object object2 = object;
                                    this.dw.Sk(((PF)object2).nz0(true));
                                    stringBuilder = new StringBuilder();
                                    this.Ys0.Sk(ig_0.u9(59, stringBuilder, " ").append(((PF)object).Ya0()).toString());
                                    boolean bl = ((PF)object2).zi0.T0 > 0;
                                    this.st0.Ll(bl);
                                    se_0 se_02 = ((PF)object).zi0;
                                    f = (float)tx_1.uF(se_02.Bn.VD, se_02.Sj);
                                    this.XH0.Ll(true);
                                    if (!(f <= 0.0f)) break block8;
                                    this.M50.Sk(sm0_0.wa0(5230, "0"));
                                    this.XH0.aE(0.0f);
                                    this.hG0.oo0 = new gn_0(0x50FFFFFF);
                                    break block9;
                                }
                                this.hG0.oo0 = null;
                                if (!(f >= 50.0f)) break block10;
                                jv0_02 = this.XH0;
                                string = "monsterframe-hp-progressbar";
                                if (!"monsterframe-hp-progressbar".equals(jv0_02.gW)) break block11;
                                break block12;
                            }
                            if (!(f >= 25.0f)) break block13;
                            jv0_02 = this.XH0;
                            string = "monsterframe-hp-progressbar-orange";
                            if (!"monsterframe-hp-progressbar-orange".equals(jv0_02.gW)) break block11;
                            break block12;
                        }
                        jv0_02 = this.XH0;
                        string = "monsterframe-hp-progressbar-red";
                        if ("monsterframe-hp-progressbar-red".equals(jv0_02.gW)) break block12;
                    }
                    jv0_0 jv0_03 = jv0_02;
                    jv0_03.uf(string);
                    jv0_03.yI();
                }
                this.XH0.aE(f / 100.0f);
                this.M50.Sk(sm0_0.wa0(5230, NumberFormat.getInstance().format(f)));
            }
            Object object3 = ((PF)object).zi0.Bn;
            if (object3 == null) {
                this.WH0.og.lo0();
                this.WH0.yj0 = null;
                this.WH0.yB0();
            } else {
                this.qE(((CE)object3).H1);
            }
            object3 = this.hG0;
            if (((PF)object).rm0 != 0) {
                Object object4 = object;
                short s = ((PF)object4).p10();
                s = yh_0.Ed(((PF)object4).coM9(), s);
                byte by = ((PF)object4).Wm();
                boolean bl = ((PF)object4).yT();
                aG0Array = yh_0.Xm0.qC0(s, by, bl);
            } else {
                se_0 state = ((PF)object).zi0;
                state.getClass();
                short s = state.Bn.Yb0;
                s = yh_0.Ed(state.nF0, s);
                aG0Array = yh_0.Xm0.qC0(s, state.D4, false);
            }
            ((Br0)object3).o60(aG0Array);
            Br0 br0 = this.hG0;
            int n = 36;
            int n2 = 36;
            br0.OA0 = true;
            br0.IF = n;
            br0.gx0 = n2;
            n = 8;
            n2 = 3;
            br0.gY = n;
            br0.a4 = n2;
            return;
        }
        this.dw.Sk("");
        this.Ys0.Sk("");
        this.st0.Ll(false);
        this.Ik0(0, 0);
        this.pw0(false);
        this.qE((byte)0);
        this.hG0.lo0();
    }

    public final void Ik0(int n, int n2) {
        double d;
        block6: {
            String string;
            jv0_0 jv0_02;
            block5: {
                block7: {
                    block4: {
                        if (n2 == 0) {
                            this.M50.Sk("");
                            this.XH0.aE(0.0f);
                            this.XH0.Ll(false);
                            return;
                        }
                        this.XH0.Ll(true);
                        d = tx_1.uF(n, n2);
                        if (!(d >= 50.0)) break block4;
                        jv0_02 = this.XH0;
                        string = "monsterframe-hp-progressbar";
                        if (!"monsterframe-hp-progressbar".equals(jv0_02.gW)) break block5;
                        break block6;
                    }
                    if (!(d >= 25.0)) break block7;
                    jv0_02 = this.XH0;
                    string = "monsterframe-hp-progressbar-orange";
                    if (!"monsterframe-hp-progressbar-orange".equals(jv0_02.gW)) break block5;
                    break block6;
                }
                jv0_02 = this.XH0;
                string = "monsterframe-hp-progressbar-red";
                if ("monsterframe-hp-progressbar-red".equals(jv0_02.gW)) break block6;
            }
            jv0_0 jv0_03 = jv0_02;
            jv0_03.uf(string);
            jv0_03.yI();
        }
        this.hG0.oo0 = d <= 0.0 ? Fq0 : null;
        this.XH0.aE((float)(d / 100.0));
        String[] stringArray = new String[3];
        stringArray[0] = n + "";
        stringArray[1] = n2 + "";
        stringArray[2] = NumberFormat.getInstance().format(d);
        this.M50.Sk(sm0_0.Bx(5231, stringArray));
    }

    public final void SF(byte by) {
        if (by >= 0) {
            this.LR.og.r8(fn_0.qz0().vo0[by]);
        } else {
            this.LR.og.lo0();
        }
    }

    public final void zI0() {
        this.Ys0.Sk("");
    }

    public final void mI(String string) {
        this.M50.Sk(string);
    }

    @Override
    public final int R1() {
        return this.zD0;
    }

    @Override
    public final int Se() {
        return this.nL0;
    }

    @Override
    public boolean nd0(i70_0 i70_02) {
        if (E00.ZU(i70_02.zu) && i70_02.finally$ == 66) {
            return false;
        }
        return super.nd0(i70_02);
    }

    @Override
    public void K8() {
        int n;
        int n2;
        fz_0 fz_02;
        int n3 = this.nL0;
        this.RY(this.zD0, n3);
        n3 = this.nL0;
        this.g2(this.zD0, n3);
        n3 = this.nL0;
        this.oY(this.zD0, n3);
        this.dw.lt0();
        this.M50.lt0();
        this.Ys0.lt0();
        this.WH0.lt0();
        this.st0.lt0();
        if (tw0_0.kz0()) {
            Br0 br0 = this.hG0;
            n3 = 72;
            int n4 = 72;
            br0.OA0 = true;
            br0.IF = n3;
            br0.gx0 = n4;
            n3 = -6;
            br0.gY = 0;
            br0.a4 = n3;
            this.dw.E40(this.A20 + 65, this.SB0 - 3);
            this.M50.E40(this.A20 + 65, this.SB0 + 50);
            this.XH0.oY(230, 25);
            this.XH0.E40(this.A20 + 65, this.SB0 + 25);
            this.Ys0.E40(this.A20 + 230, this.SB0 - 3);
            this.st0.E40(this.A20 + 45, this.SB0 + 30);
            fz_0 fz_03 = this.st0;
            n3 = fz_03.A20 + 2;
            this.WH0.E40(n3, fz_03.SB0);
            fz_02 = this.LR;
            zw0_0 zw0_02 = this.dw;
            n2 = zw0_02.A20 + zw0_02.Mx + 2;
            n = this.SB0 + 2;
        } else {
            int n5;
            int n6;
            jv0_0 jv0_02;
            this.Ys0.qF0(pa0_0.up0);
            this.XH0.oY(168, 8);
            if (zb0_2.bigCJKFontSizes()) {
                this.M50.E40(this.A20 + 48, this.SB0 + 22);
                this.dw.E40(this.A20 + 48, this.SB0 - 3);
                this.Ys0.RY(62, 19);
                this.Ys0.E40(this.A20 + 160, this.SB0 - 3);
                jv0_02 = this.XH0;
                n6 = this.A20 + 50;
                n5 = this.SB0 + 23;
            } else {
                this.M50.E40(this.A20 + 48, this.SB0 + 23);
                this.dw.E40(this.A20 + 48, this.SB0 - 1);
                this.Ys0.RY(62, 19);
                this.Ys0.E40(this.A20 + 160, this.SB0 - 1);
                jv0_02 = this.XH0;
                n6 = this.A20 + 50;
                n5 = this.SB0 + 21;
            }
            jv0_02.E40(n6, n5);
            this.st0.E40(this.A20, this.SB0);
            Br0 br0 = this.st0.og;
            n3 = -17;
            br0.gY = -14;
            br0.a4 = n3;
            zw0_0 zw0_03 = this.dw;
            this.LR.E40(zw0_03.A20 + zw0_03.Mx + 2, this.SB0 + 2);
            fz_02 = this.WH0;
            n2 = this.A20 + 200;
            n = this.SB0 + 28;
        }
        fz_02.E40(n2, n);
    }

    @Override
    public void pw0(boolean bl) {
        gn_0 gn_02;
        Br0 br0;
        super.pw0(bl);
        if (tw0_0.kz0() ^ true) {
            return;
        }
        if (!bl) {
            br0 = this.hG0;
            gn_02 = Fq0;
        } else {
            br0 = this.hG0;
            gn_02 = Wz0;
        }
        br0.oo0 = gn_02;
        I2 i2 = this.t30.ZD();
        while (i2.hasNext()) {
            le0_2 child = (le0_2)i2.next();
            child.z70 = bl
                    ? new N1(new t5_0(this), Wz0)
                    : new N1(new t5_0(this), Fq0);
        }
    }

    @Override
    public void Dw0(zk0_1 zk0_12) {
        this.hG0.t00();
        this.st0.E40(this.A20 + 45, this.SB0 + 45);
        if (this.st0.eE) {
            ((S70)this.st0).Dw0(zk0_12);
        }
    }

    public final void qE(byte by) {
        if ((by = CE.kq(by)) != -128) {
            if (by != 16) {
                if (by != 32) {
                    if (by != 64) {
                        if (by != 7) {
                            if (by != 8) {
                                BattlePokemonSlotButton ak0_22 = this;
                                ak0_22.WH0.og.lo0();
                                ak0_22.WH0.yj0 = null;
                                ak0_22.WH0.yB0();
                            } else {
                                BattlePokemonSlotButton ak0_23 = this;
                                ak0_23.WH0.yj0 = sm0_0.c0(5221);
                                ak0_23.WH0.yB0();
                                LPT6_[] lPT6_Array = new LPT6_[1];
                                by = (byte)8;
                                lPT6_Array[0] = fn_0.qz0().Q90[fn_0.Xa(by)];
                                ak0_23.WH0.og.r8(lPT6_Array);
                            }
                        } else {
                            BattlePokemonSlotButton ak0_24 = this;
                            ak0_24.WH0.yj0 = sm0_0.c0(5220);
                            ak0_24.WH0.yB0();
                            LPT6_[] lPT6_Array = new LPT6_[1];
                            by = (byte)7;
                            lPT6_Array[0] = fn_0.qz0().Q90[fn_0.Xa(by)];
                            ak0_24.WH0.og.r8(lPT6_Array);
                        }
                    } else {
                        BattlePokemonSlotButton ak0_25 = this;
                        ak0_25.WH0.yj0 = sm0_0.c0(5224);
                        ak0_25.WH0.yB0();
                        LPT6_[] lPT6_Array = new LPT6_[1];
                        by = (byte)64;
                        lPT6_Array[0] = fn_0.qz0().Q90[fn_0.Xa(by)];
                        ak0_25.WH0.og.r8(lPT6_Array);
                    }
                } else {
                    BattlePokemonSlotButton ak0_26 = this;
                    ak0_26.WH0.yj0 = sm0_0.c0(5223);
                    ak0_26.WH0.yB0();
                    LPT6_[] lPT6_Array = new LPT6_[1];
                    by = (byte)32;
                    lPT6_Array[0] = fn_0.qz0().Q90[fn_0.Xa(by)];
                    ak0_26.WH0.og.r8(lPT6_Array);
                }
            } else {
                BattlePokemonSlotButton ak0_27 = this;
                ak0_27.WH0.yj0 = sm0_0.c0(5222);
                ak0_27.WH0.yB0();
                LPT6_[] lPT6_Array = new LPT6_[1];
                by = (byte)16;
                lPT6_Array[0] = fn_0.qz0().Q90[fn_0.Xa(by)];
                ak0_27.WH0.og.r8(lPT6_Array);
            }
        } else {
            BattlePokemonSlotButton ak0_28 = this;
            ak0_28.WH0.yj0 = sm0_0.c0(5225);
            ak0_28.WH0.yB0();
            LPT6_[] lPT6_Array = new LPT6_[1];
            by = (byte)-128;
            lPT6_Array[0] = fn_0.qz0().Q90[fn_0.Xa(by)];
            ak0_28.WH0.og.r8(lPT6_Array);
        }
        this.COm3();
    }
}
