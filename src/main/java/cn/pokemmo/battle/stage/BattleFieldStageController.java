package cn.pokemmo.battle.stage;

import aurelienribon.tweenengine.equations.Quint;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g3d.particles.ParticleController;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffect;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffectExt;
import com.badlogic.gdx.math.Matrix4;
import f.*;
import f.Ai0;
import f.BB;
import f.BJ0;
import f.BM;
import f.Bp0;
import f.C8;
import f.CH0;
import f.CO;
import f.CP;
import f.Cq0;
import f.D2;
import f.DB0;
import f.E90;
import f.ER;
import f.F90;
import f.FG;
import f.GG0;
import f.Ge0;
import f.I2;
import f.J4;
import f.JA;
import f.L8;
import f.LPT6_;
import f.LT;
import f.LW;
import f.MO;
import f.O30;
import f.Ou0;
import f.P6;
import f.PRN_;
import f.R30;
import f.RL0;
import f.SX;
import f.St;
import f.T3;
import f.Tv0;
import f.U5;
import f.UT;
import f.VC;
import f.XF0;
import f.Xz0;
import f._else;
import f._finally;
import f._native;
import f.ao_1;
import f.bi0_1;
import f.bn0_0;
import f.c8_0;
import f.cn0_0;
import f.dl_1;
import f.dw_2;
import f.es_1;
import f.ff_0;
import f.fi_0;
import f.fy0_0;
import f.gj_0;
import f.gr_2;
import f.hb0_1;
import f.hf_1;
import f.hk0_1;
import f.in_2;
import f.iq0_0;
import f.ji_1;
import f.l50_0;
import f.ld_0;
import f.lf0_1;
import f.lg_0;
import f.lpt3__1;
import f.lpt8__2;
import f.lt_1;
import f.ly0_0;
import f.mb_2;
import f.mh_1;
import f.mk_1;
import f.n10_0;
import f.nk_0;
import f.nn_0;
import f.nv0_0;
import f.pr_1;
import f.pw_1;
import f.qv_0;
import f.rg0_2;
import f.rj0_2;
import f.s4_0;
import f.sh_0;
import f.t70_0;
import f.tt0_0;
import f.tw0_0;
import f.uh_1;
import f.ut_0;
import f.uu_0;
import f.vo_0;
import f.vo_2;
import f.w20_0;
import f.wh_0;
import f.yt_1;
import f.zv_2;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;

/**
 * 现代化重构类 - 原始类: f.L00
 */
public abstract class BattleFieldStageController extends vo_2
implements fy0_0 {

    public static final dl_1 bk0 = Cq0.E1(BattleFieldStageController.class);
    public final C8 Hq;
    public final C8 VJ0;
    public final ly0_0 VN;
    public final C8 sC;
    public final BJ0 uZ;
    public final BJ0 RX;
    public boolean kp0;
    public boolean ZG;
    public ER ns0;
    public ff_0 YG0;
    public qv_0 aD0;
    public U5 Y;
    public cn0_0 a30;
    public rj0_2 k1;
    public rj0_2 DP;
    public PRN_ w00;
    public PRN_ Hg0;
    public Color qh;
    public C8 qi;
    public float sJ;
    public final es_1 DI0;
    public final es_1 CoM7;
    public F90 je;
    public final P6 qu;
    public ut_0 d80;
    public ut_0 ab0;
    public ut_0 t10;
    public ut_0 En0;
    public ut_0 hf;
    public ut_0 db0;
    public St a1;
    public gr_2 il0;
    public XF0 K60;
    public int e0;
    public int hq;
    public pw_1 COM4;
    public pw_1 YX;
    public s4_0 XF;
    public ParticleEffectExt Bu0;
    public ParticleEffectExt Fg;
    public final in_2 h7;
    public boolean KR;
    public C8 Ej;
    public final l50_0 sN;
    public final lf0_1 YB;
    public ji_1 Ra;
    public final es_1 Av0;

    public BattleFieldStageController(l50_0 l50_02) {
        this.Hq = new C8();
        this.VJ0 = new C8();
        this.VN = new ly0_0();
        this.sC = new C8();
        this.uZ = new BJ0();
        this.RX = new BJ0();
        this.kp0 = false;
        this.ZG = false;
        this.DI0 = new es_1();
        this.CoM7 = new es_1();
        this.qu = new P6();
        this.il0 = null;
        this.K60 = null;
        this.e0 = 0;
        this.hq = 0;
        this.h7 = new in_2(30000);
        this.KR = false;
        this.Ej = null;
        this.YB = new lf0_1((L00) this);
        this.Av0 = new es_1();
        this.sN = l50_02;
        this.MJ0();
    }

    public final void y50() {
        ut_0 ut_02 = ((L00)this).d80;
        if (ut_02 != null) {
            ut_02.dispose();
        }
        if ((ut_02 = ((L00)this).ab0) != null) {
            ut_02.dispose();
        }
        if ((ut_02 = ((L00)this).t10) != null) {
            ut_02.dispose();
        }
        if ((ut_02 = ((L00)this).En0) != null) {
            ut_02.dispose();
        }
        if ((ut_02 = ((L00)this).hf) != null) {
            ut_02.dispose();
        }
        if ((ut_02 = this.db0) != null) {
            ut_02.dispose();
        }
    }

    public final void us(float f) {
        BJ0 bJ02 = new BJ0();
        this.fX = false;
        this.Be(tw0_0.e60.jB0, bJ02, false);
        this.fX = true;
        ao_1 ao_12 = ao_1.DX(this.uZ, 7, f);
        float f3 = bJ02.Rg0;
        ao_1 ao_13 = ao_12;
        ao_13.h5[0] = f3;
        ao_12 = ao_1.DX(this.uZ, 6, f);
        f3 = bJ02.Q30;
        ao_1 ao_14 = ao_12;
        ao_14.h5[0] = f3;
        ao_1 ao_15 = ao_1.DX(this.uZ, 5, f);
        ao_15.h5[0] = bJ02.d00 % 360.0f;
        C8 c8 = bJ02.rj;
        float f2 = c8.x;
        f3 = c8.y;
        float f4 = c8.z;
        pw_1 pw_12 = pw_1.xC().Xf0().y80(ao_13).y80(ao_14).y80(ao_15).y80(ao_1.DX(this.uZ, 9, f).kt(f2, f3, f4));
        ao_1 ao_16 = ao_1.DX(this.uZ, 4, f);
        C8 c82 = bJ02.x90;
        f = c82.x;
        float f5 = c82.y;
        f2 = c82.z;
        pw_12.y80(ao_16.kt(f, f5, f2)).mz0().xF0 = this.YB;
        this.COM4 = (pw_1)pw_12.y80(ao_16.kt(f, f5, f2)).mz0().Ms(tw0_0.LD0.Ov);
    }

    public final void fO(bi0_1 var1_1) {
        if (yt_1.l00.uI0()) {
            boolean bl = var1_1.pu.equals(yt_1.l00);
            yt_1 yt_12 = tw0_0.e60;
            if (!(yt_12 != null && yt_12.dj0.equals(var1_1.pu) || bl)) {
                return;
            }
        }
        mg_0 mg_02 = var1_1.uR();
        ER eR = this.ns0;
        U5 u5 = this.Y;
        BJ0 bJ0 = this.cV();
        mg_02.qv0 = bJ0;
        EA0 eA0 = mg_02.Ii0.il0;
        mg_02.oh = hk0_1.KG - eA0.gd;
        mg_02.dm0 = eA0.BQ;
        mg_02.mG = eA0.EL;
        mg_02.Cs = null;
        nk_0 nk_02 = eA0.mV;
        if (nk_02 == null) {
            mg_02.Co = null;
        } else switch (L00$renderClass(nk_02)) {
            default: {
                if (mg_02.Co == null) break;
                mg_02.Co = null;
                break;
            }
            case 7: {
                mg_02.Co = fi_0.xL().cR(3);
                break;
            }
            case 6: {
                mg_02.Co = fi_0.xL().cR(2);
                break;
            }
            case 4: 
            case 5: {
                mg_02.Co = fi_0.xL().cR(1);
                break;
            }
            case 1: 
            case 2: 
            case 3: {
                if (mg_02.Co != null) break;
                mg_02.Co = fi_0.xL().cR(0);
                bi0_1 bi0_12 = mg_02.Ii0;
                if (bi0_12 instanceof E90 && !bi0_12.Ou()) break;
                if (bi0_12.ki0() >= 4095) {
                    tw0_0.RE0.Hq0((byte)2, (short)1646);
                    break;
                }
                tw0_0.RE0.Hq0((byte)2, (short)1656);
            }
        }
        if (mg_02.Ii0.wq0 == RL0.mD) {
            mg_02.Co = fi_0.xL().cR(3);
        }
        bi0_1 bi0_13 = mg_02.Ii0;
        if (bi0_13.wq0 == RL0.aN) {
            bi0_13.PC0(RL0.S60);
        }
        mg_02.Ii0.il0.p3();
        zv_2 zv_22 = mg_02.Ii0.ba0;
        if ((_else)tw0_0.e60.E6.get(J4.iA0(zv_22.uS, zv_22.o0, zv_22.ID0)) != null) {
            bi0_1 bi0_14 = mg_02.Ii0;
            zv_2 zv_23 = bi0_14.ba0;
            if (zv_23.uS == 3 && bi0_14 instanceof E90) {
                if (zv_23.Lpt2) {
                    mg_02.R5 = t70_0.xw0(zv_23.Y30, zv_23.LPt1().XC0());
                    bi0_1 bi0_15 = bi0_14.rd;
                    if (bi0_15 != null) {
                        zv_2 zv_24 = bi0_15.ba0;
                        ((Ai0)bi0_15.hj).R5 = t70_0.xw0(zv_24.Y30, zv_24.LPt1().XC0());
                    }
                } else {
                    bi0_1 bi0_16 = bi0_14.rd;
                    if (bi0_16 != null) {
                        Ai0 ai0 = (Ai0)bi0_16.hj;
                        if (ai0.R5 != -1) {
                            ai0.R5 = (byte)-1;
                        }
                    }
                }
            }
            mg_02.ze0.np(mg_02.Ii0.il0.t60);
            mg_02.ze0.Fg0(0.25f);
            float f = mg_02.ze0.y;
            mg_02.ze0.y = mg_02.ze0.z;
            mg_02.ze0.z = f;
            if (mg_02.Ii0.ba0.uS == 4) {
                if (mg_02.Ii0.ki0() != 251 && mg_02.Ii0.ki0() != 252 && (mg_02.Ii0.QU() != 10 || mg_02.Ii0.ki0() != 201)) {
                    mg_02.ze0.y += 0.03f;
                    mg_02.ze0.z += 0.09f;
                    if (mg_02.Ii0.CI0() && mg_02.Ii0.ki0() == 425) {
                        mg_02.ze0.y += 0.05f;
                        mg_02.ze0.z += 0.05f;
                    }
                } else {
                    mg_02.ze0.z += 0.05f;
                }
            }
            mg_02.ze0.na(0.0f, 0.225f, -0.05f);
            nk_0 nk_03 = mg_02.Ii0.il0.mV;
            if (!(mg_02.ve0(null, eR, bJ0, u5, nk_03) || mg_02.Ii0 instanceof MO && ((MO)mg_02.Ii0).F7.rh0 || mg_02.oW(null) || mg_02.PD(null, eR, u5))) {
                int n = mg_02.ZD();
                if (n == 3) {
                    --n;
                }
                mg_02.Ii0.ki0();
                mg_02.El(eR, u5, n, false);
            }
        }
    }

    private static int L00$renderClass(nk_0 nk_02) {
        if (nk_02 == null) {
            return 0;
        }
        int[] nArray = nn_0.NR;
        if (nArray != null && nk_02.Xy0 >= 0 && nk_02.Xy0 < nArray.length) {
            return nArray[nk_02.Xy0];
        }
        return 0;
    }

    @Override
    public final boolean Jm0(_else object) {
        if (super.Jm0(object) && lpt3__1.RJ) {
            if (lg_0.lW.nI0(46) && lg_0.lW.eC0(129)) {
                if (lg_0.lW.eC0(59)) {
                    dl_1 dl_12 = bk0;
                    dl_12.info("Reloading shaders.");
                    JA jA = new JA((String)bn0_0.DK0(), (String)bn0_0.Rn0(), this.a30);
                    jA.HA = 1;
                    jA.F80 = 1;
                    jA.el = 32;
                    lt_1 lt_12 = null;
                    try {
                        lt_12 = new lt_1((String)bn0_0.DK0(), (String)bn0_0.Rn0());
                        if (lt_12.U00 && lt_12.aX().isEmpty()) {
                            dl_12.info("Shader compiled successfully");
                            ((uu_0)this.ns0.KF).dispose();
                            this.ns0 = new ER(new bn0_0(jA, this.a30), new FG());
                        } else {
                            dl_12.info("Shader failed to compile:");
                            dl_12.info(lt_12.aX());
                        }
                    } catch (Exception exception) {
                        exception.printStackTrace();
                    }
                    if (lt_12 != null && lt_12.U00) {
                        this.vT();
                    }
                } else {
                    this.vT();
                }
            }
            if (lg_0.lW.nI0(58) && this.je != null) {
                ((XF0)object).getClass();
            }
            lg_0.lW.eC0(60);
            tw0_0.lM.getClass();
            if (lg_0.lW.eC0(59) && !lg_0.lW.eC0(129)) {
                if (lg_0.lW.nI0(45)) {
                    if (!this.kp0) {
                        this.RX.x90.np(this.uZ.x90);
                        this.RX.rj.np(this.uZ.rj);
                        this.RX.Q30 = this.uZ.Q30;
                        this.RX.d00 = this.uZ.d00;
                        this.RX.Rg0 = this.uZ.Rg0 + 10.0f;
                        C8 c8 = this.uZ.x90;
                        this.RX.JP(c8.x, c8.y, c8.z);
                        this.RX.ye(false);
                    }
                    this.kp0 = !this.kp0;
                }
                if (this.kp0 && lg_0.lW.nI0(131)) {
                    this.ZG = !this.ZG;
                }
            }
            if (lg_0.lW.eC0(59) && lg_0.lW.eC0(129) && lg_0.lW.nI0(112)) {
                yt_1 yt_12 = tw0_0.e60;
                Enumeration enumeration = yt_12.pn0.keys();
                while (enumeration.hasMoreElements()) {
                    yt_12.xc((CH0)enumeration.nextElement());
                }
            }
            if (lg_0.lW.nI0(136)) {
                this.o7((byte)0, this.Hq.rB0(), 0, false, false, false);
            } else if (lg_0.lW.nI0(137)) {
                this.o7((byte)0, this.Hq.rB0(), 1, false, false, false);
            } else if (lg_0.lW.nI0(138)) {
                this.o7((byte)0, this.Hq.rB0(), 2, false, false, false);
            } else if (lg_0.lW.nI0(139)) {
                this.o7((byte)0, this.Hq.rB0(), 3, false, false, false);
            }
            DB0 dB0 = lg_0.lW;
            if (dB0.tJ0.length > 1 && dB0.tJ0[1]) {
                new C8();
                BJ0 bJ0 = this.cV();
                bJ0.k0(dB0.bk0, dB0.zs, 0.0f, 0.0f, (float)lg_0.S4.Kr0(), (float)lg_0.S4.sD0());
                if (this.DI0.KB > 0) {
                    this.DI0.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        }
        return true;
    }

    public final void Kx() {
        Object object;
        fy0_0 fy0_02;
        Object object2;
        Object object3 = (XF0)tw0_0.e60.N60();
        this.NC();
        if (!tw0_0.Eu(9) || !lg_0.lW.eC0(130)) {
            object2 = this.qf.ZD();
            while (((I2)object2).hasNext()) {
                I2 i2;
                BattleFieldStageController l00 = this;
                fy0_02 = (nv0_0)((I2)object2).next();
                object = l00.ns0;
                BJ0 bJ0 = l00.kp0 && !this.ZG ? this.RX : this.uZ;
                U5 u5 = this.Y;
                if (!((nv0_0)fy0_02).wp0.COm8(bJ0)) continue;
                if (((nv0_0)fy0_02).jQ && !nv0_0.cOm2) {
                    i2 = ((nv0_0)fy0_02).wp0.ZE0.ZD();
                    while (i2.hasNext()) {
                        ((nv0_0)fy0_02).kK((Xz0)i2.next(), bJ0);
                    }
                }
                ((ER)object).Lh0(((nv0_0)fy0_02).wp0, u5);
                i2 = ((nv0_0)fy0_02).yf0.ZD();
                while (i2.hasNext()) {
                    Ou0 ou0 = (Ou0)i2.next();
                    if (((nv0_0)fy0_02).jQ && !ou0.COm8(bJ0)) continue;
                    ((ER)object).Lh0(ou0, u5);
                }
                ((ER)object).A80(((nv0_0)fy0_02).xi, u5);
            }
        }
        if ((object2 = this.il0) != null) {
            BattleFieldStageController l00 = this;
            fy0_02 = l00.ns0;
            object = l00.kp0 && !this.ZG ? this.RX : this.uZ;
            ((gr_2)object2).j80(this.Y, (ER)fy0_02, (BJ0)object);
        }
        BattleFieldStageController l00 = this;
        l00.h9((_else)object3);
        object3 = l00.DI0.ZD();
        if (!((I2)object3).hasNext()) {
            object3 = this.CoM7.ZD();
            while (((I2)object3).hasNext()) {
                object2 = null;
                if (((I2)object3).next() == null) {
                    this.ns0.eo0((uh_1)object2);
                    continue;
                }
                throw new ClassCastException();
            }
            return;
        }
        ((I2)object3).next().getClass();
        throw new ClassCastException();
    }

    public final void h9(_else object) {
        es_1 es_12 = object == null ? null : object.L90();
        if (es_12 != null) {
            I2 i2 = es_12.ZD();
            while (i2.hasNext()) {
                LT lT = (LT)i2.next();
                if (lT.lW()) {
                    I2 i22 = lT.Sg.ZD();
                    while (i22.hasNext()) {
                        mb_2 mb_22 = (mb_2)(gj_0)i22.next();
                        float f = (float)lT.Tz() * 0.25f + 0.125f;
                        float f2 = lT.S80() * 0.25f;
                        float f3 = (float)lT.HR() * 0.25f + 0.125f;
                        mb_22.gd(this.ns0, this.Y, this.cV(), f, f2, f3);
                    }
                    continue;
                }
                i2.remove();
            }
        }
    }

    @Override
    public void ql0() {
        float f;
        float f2;
        super.ql0();
        Object object = this.Ra;
        ((ji_1)object).jB = this.kp0;
        if (((ji_1)object).bu0() && (((ji_1)object).DL0 || ((ji_1)object).Db0 || ((ji_1)object).kK || ((ji_1)object).Bt || ((ji_1)object).Ea || ((ji_1)object).Ho)) {
            float f3;
            float f4;
            float f5 = lg_0.S4.uL;
            if (lg_0.lW.eC0(59)) {
                f5 *= 3.0f;
            }
            if (((ji_1)object).DL0) {
                BJ0 bJ0 = ((ji_1)object).Q0;
                bJ0.Xw(((ji_1)object).Bf0.np(bJ0.jd0).Xv0(((ji_1)object).Q0.St0).KM().Fg0(-f5 * ((ji_1)object).vj0));
                if (((ji_1)object).M20) {
                    C8 c8 = ((ji_1)object).Q0.rj;
                    C8 c82 = ((ji_1)object).Bf0;
                    c8.getClass();
                    float f6 = c82.x;
                    f4 = c82.y;
                    f3 = c82.z;
                    c8.na(f6, f4, f3);
                    C8 c83 = ((ji_1)object).bV;
                    C8 c84 = ((ji_1)object).Bf0;
                    c83.getClass();
                    f2 = c84.x;
                    f4 = c84.y;
                    f3 = c84.z;
                    c83.na(f2, f4, f3);
                }
            }
            if (((ji_1)object).Db0) {
                BJ0 bJ0 = ((ji_1)object).Q0;
                bJ0.Xw(((ji_1)object).Bf0.np(bJ0.jd0).Xv0(((ji_1)object).Q0.St0).KM().Fg0(f5 * ((ji_1)object).vj0));
                if (((ji_1)object).M20) {
                    C8 c8 = ((ji_1)object).Q0.rj;
                    C8 c85 = ((ji_1)object).Bf0;
                    c8.getClass();
                    float f7 = c85.x;
                    f4 = c85.y;
                    f3 = c85.z;
                    c8.na(f7, f4, f3);
                    C8 c86 = ((ji_1)object).bV;
                    C8 c87 = ((ji_1)object).Bf0;
                    c86.getClass();
                    f2 = c87.x;
                    f4 = c87.y;
                    f3 = c87.z;
                    c86.na(f2, f4, f3);
                }
            }
            if (((ji_1)object).kK) {
                ((ji_1)object).Bf0.np(((ji_1)object).Q0.jd0);
                ((ji_1)object).Bf0.y = 0.0f;
                ((ji_1)object).Bf0.Fg0(f5 * ((ji_1)object).vj0);
                ((ji_1)object).Q0.Xw(((ji_1)object).Bf0);
                if (((ji_1)object).B2) {
                    C8 c8 = ((ji_1)object).bV;
                    C8 c88 = ((ji_1)object).Bf0;
                    c8.getClass();
                    f2 = c88.x;
                    f4 = c88.y;
                    f3 = c88.z;
                    c8.na(f2, f4, f3);
                }
            }
            if (((ji_1)object).Bt) {
                ((ji_1)object).Bf0.np(((ji_1)object).Q0.jd0);
                ((ji_1)object).Bf0.y = 0.0f;
                ((ji_1)object).Bf0.Fg0(-f5 * ((ji_1)object).vj0);
                ((ji_1)object).Q0.Xw(((ji_1)object).Bf0);
                if (((ji_1)object).B2) {
                    C8 c8 = ((ji_1)object).bV;
                    C8 c89 = ((ji_1)object).Bf0;
                    c8.getClass();
                    f2 = c89.x;
                    f4 = c89.y;
                    f3 = c89.z;
                    c8.na(f2, f4, f3);
                }
            }
            if (((ji_1)object).Ea) {
                BJ0 bJ0 = ((ji_1)object).Q0;
                bJ0.Xw(((ji_1)object).EW.np(bJ0.St0).Fg0(f5 * ((ji_1)object).vj0));
                if (((ji_1)object).M20) {
                    C8 c8 = ((ji_1)object).bV;
                    C8 c810 = ((ji_1)object).EW;
                    c8.getClass();
                    f2 = c810.x;
                    f4 = c810.y;
                    f3 = c810.z;
                    c8.na(f2, f4, f3);
                }
            }
            if (((ji_1)object).Ho) {
                BJ0 bJ0 = ((ji_1)object).Q0;
                bJ0.Xw(((ji_1)object).EW.np(bJ0.St0).Fg0(-f5 * ((ji_1)object).vj0));
                if (((ji_1)object).M20) {
                    C8 c8 = ((ji_1)object).bV;
                    C8 c811 = ((ji_1)object).EW;
                    c8.getClass();
                    f5 = c811.x;
                    f2 = c811.y;
                    f4 = c811.z;
                    c8.na(f5, f2, f4);
                }
            }
            if (((ji_1)object).Jc) {
                ((ji_1)object).Q0.ye(true);
            }
        }
        this.sJ += lg_0.S4.uL;
        if (this.sJ >= Float.MAX_VALUE) {
            this.sJ = 0.0f;
        }
        object = this.qf.ZD();
        while (((I2)object).hasNext()) {
            nv0_0 nv0_02 = (nv0_0)((I2)object).next();
            f2 = this.sJ;
            rj0_2 rj0_22 = this.DP;
            if (rj0_22 == null) {
                rj0_22 = this.k1;
            }
            nv0_02.wp0.P30(f2, rj0_22);
            I2 i2 = nv0_02.yf0.ZD();
            while (i2.hasNext()) {
                ((Ou0)i2.next()).P30(f2, rj0_22);
            }
            I2 i22 = nv0_02.xi.ZD();
            while (i22.hasNext()) {
                ((Ou0)i22.next()).P30(f2, rj0_22);
            }
        }
        object = this.il0;
        if (object != null) {
            ((gr_2)object).lpt1(this.sJ);
        }
        if ((object = this.YX) != null && ((D2)object).BJ0()) {
            this.YX = null;
        }
        object = tw0_0.e60.N60();
        if (object != null && tw0_0.e60.jB0 != null && tw0_0.rl.NA && this.yp(((_else)object).dw)) {
            Object object3 = tw0_0.rl;
            boolean bl = ((Ge0)object3).nI;
            if (bl) {
                ((Ge0)object3).nI = false;
                bl = true;
            }
            this.fX = bl ^ true;
            if (this.k1 == null) {
                this.fX = false;
            }
            this.mH((_else)object);
            if (this.XF == null) {
                this.XF = s4_0.OV;
            }
            if (tw0_0.LD0.he0 != null && (object3 = this.COM4) != null && ((D2)object3).BJ0()) {
                this.VI(true, (short)0, (short)0, 0.0f, 0.0f, 0.0f, 0.0f, (short)60);
            }
            this.coM7((_else)object);
            this.YG0.update();
            object = this.Bu0;
            if (object != null) {
                object = ((ParticleEffect)object).getControllers().ZD();
                while (((I2)object).hasNext()) {
                    Matrix4 matrix4 = ((ParticleController)((I2)object).next()).transform;
                    object3 = this.uZ.rj;
                    object3.getClass();
                    matrix4.Y1(new C8((C8)object3).na(0.0f, 0.0f, 0.0f));
                }
            }
            if (this.Fg != null) {
                object = this.h7;
                object.getClass();
                if (System.currentTimeMillis() >= ((in_2)object).ar) {
                    this.h7.iA = rg0_2.j40(25000, 45000);
                    this.h7.ng0();
                    this.Fg.reset();
                    this.Fg.start();
                }
                object = this.Fg.getControllers().ZD();
                while (((I2)object).hasNext()) {
                    Matrix4 matrix4 = ((ParticleController)((I2)object).next()).transform;
                    object3 = this.uZ.rj;
                    object3.getClass();
                    matrix4.Y1(new C8((C8)object3).na(0.0f, 0.0f, 0.0f));
                }
            }
            return;
        }
        this.fX = false;
    }

    public abstract void mH(_else var1);

    @Override
    public void Dt0(int n, int n2) {
        float f;
        float f2;
        BattleFieldStageController l00 = this;
        BJ0 bJ0 = l00.uZ;
        bJ0.Ui = f2 = (float)n;
        bJ0.yG = f = (float)n2;
        BJ0 bJ02 = l00.RX;
        bJ02.Ui = f2;
        bJ02.yG = f;
    }

    @Override
    public void dispose() {
        BattleFieldStageController l00 = this;
        ((uu_0)l00.ns0.KF).dispose();
        l00.YG0.dispose();
        Object object = (mh_1)lg_0.lW.L50;
        ((mh_1)object).HV.sj0(l00.Ra, true);
        mk_1.NU.Sq0();
        object = fi_0.xL();
        I2 i2 = ((fi_0)object).M70.ZD();
        while (i2.hasNext()) {
            ((fy0_0)i2.next()).dispose();
        }
        Object object2 = object;
        ((fi_0)object2).M70.clear();
        LPT6_[][][] lPT6_ArrayArray = new LPT6_[5][][];
        ((fi_0)object).transient$ = lPT6_ArrayArray;
        lPT6_ArrayArray[3] = new LPT6_[15][];
        lPT6_ArrayArray[2] = new LPT6_[47][];
        lPT6_ArrayArray[4] = new LPT6_[28][];
        ((fi_0)object2).Nt0 = null;
        ((fi_0)object2).Mn0 = null;
        ((fi_0)object2).W8 = null;
        ((fi_0)object2).ff0 = null;
        ((fi_0)object2).kn = null;
        ((fi_0)object2).f40.clear();
        ((fi_0)object2).Py0 = null;
        ((fi_0)object2).R5 = new Ou0[17];
        ((fi_0)object2).oX = new Ou0[6];
        ((fi_0)object2).ij.clear();
        UT.oV().NP.Wd0();
        object = this.qf.ZD();
        while (((I2)object).hasNext()) {
            ((nv0_0)((I2)object).next()).dispose();
        }
        BattleFieldStageController l002 = this;
        l002.qf.clear();
        l002.y50();
        object = l002.CoM7.ZD();
        if (!((I2)object).hasNext()) {
            this.CoM7.clear();
            return;
        }
        ((I2)object).next().getClass();
        throw new ClassCastException();
    }

    @Override
    public final void VI(boolean bl, short s, short s2, float f, float f2, float f3, float f4, short s3) {
        if (s3 < 2) {
            s3 = 0;
        }
        float f5 = (float)s3 * 0.03333f;
        pw_1 pw_12 = this.COM4;
        if (pw_12 != null) {
            pw_1 pw_13 = pw_12;
            pw_13.xF0 = null;
            pw_13.w6 = true;
        }
        if (bl) {
            this.us(f5);
            return;
        }
        float f6 = f * 0.32f;
        float f7 = w20_0.y0(s);
        float f8 = (float)s2 / 65536.0f * 360.0f;
        ao_1 ao_12 = ao_1.DX(this.uZ, 7, f5);
        ao_12.h5[0] = f6;
        ao_1 ao_13 = ao_1.DX(this.uZ, 6, f5);
        ao_13.h5[0] = f7;
        ao_1 ao_14 = ao_1.DX(this.uZ, 5, f5);
        ao_14.h5[0] = f8;
        f6 = f2 * 0.25f;
        f7 = f3 * 0.25f;
        f8 = f4 * 0.25f;
        this.COM4 = (pw_1)pw_1.xC().Xf0().y80(ao_12).y80(ao_13).y80(ao_14).y80(ao_1.DX(this.uZ, 9, f5).kt(f6, f7, f8)).y80(ao_1.DX(this.uZ, 4, f5).kt(f6, f7, f8)).mz0().Ms(tw0_0.LD0.Ov);
    }

    @Override
    public final void Tm0(boolean bl) {
        this.KR = bl;
        if (!bl) {
            this.Ej = null;
        }
    }

    @Override
    public final boolean VK() {
        return this.COM4 != null;
    }

    public final BJ0 cV() {
        if (this.kp0) {
            return this.RX;
        }
        return this.uZ;
    }

    public final void mD0() {
        pw_1 pw_12 = this.YX;
        if (pw_12 != null) {
            pw_12.w6 = true;
            this.YX = null;
        }
        rj0_2 rj0_22 = this.DP;
        if (rj0_22 == null) {
            rj0_22 = this.k1;
        }
        if (rj0_22 == null) {
            return;
        }
        this.w00.v50.set(rj0_22.sm0);
        this.Hg0.v50.set(rj0_22.r30);
        this.qh.set(rj0_22.Ak0);
        this.qi.np(rj0_22.Ze);
        I2 i2 = this.qf.ZD();
        while (i2.hasNext()) {
            ((nv0_0)i2.next()).Hb0(rj0_22);
        }
    }

    @Override
    public final boolean wp(LT object, boolean bl, boolean bl2) {
        this.Hq.rB0();
        if (object != null) {
            if (object.gr0()) {
                this.Hq.np(object.Ki());
            } else {
                C8 c8 = this.Hq;
                float f = object.Tz();
                float f2 = object.S80();
                float f3 = object.HR();
                c8.x = f;
                c8.y = f2;
                c8.z = f3;
            }
            this.Hq.Fg0(0.25f);
        }
        if (!bl && bl2) {
            BattleFieldStageController l00 = this;
            if (l00.o7((byte)0, l00.Hq, 0, true, bl2, false)) {
                C8 c8 = this.Hq;
                C8 c82 = T3.hf(c8, c8);
                _finally.HG().dH0(new lpt8__2((L00) this, c82, bl2), 0.25f);
                return true;
            }
            return false;
        }
        return this.o7((byte)0, this.Hq, bl ? 0 : 1, true, bl2, bl);
    }

    @Override
    public final void yd(short[] sArray) {
        boolean bl = !this.fX;
        yt_1 yt_12 = tw0_0.e60;
        XF0 xF0 = yt_12 == null ? null : (XF0)yt_12.N60();
        if (xF0 != null && (this.il0 == null ? 0 : this.il0.gq0()) == xF0.Ro0.O60 && !bl) {
            super.yd(sArray);
            gr_2 gr_22 = this.il0;
            if (gr_22 != null) {
                gr_22.sn0(sArray);
            }
            return;
        }
        lg_0.k.lPT5(() -> this.L00$dispatchLq0(sArray));
    }

    private void L00$dispatchLq0(short[] sArray) {
        try {
            java.lang.reflect.Method method = vo_2.class.getDeclaredMethod("Lq0", short[].class);
            method.setAccessible(true);
            method.invoke(this, (Object)sArray);
        } catch (ReflectiveOperationException reflectiveOperationException) {
            throw new IllegalStateException("Missing inherited Lq0(short[]) bridge", reflectiveOperationException);
        }
    }

    @Override
    public final void vT() {
        vo_2.G3.info("Reloading map.");
        this.K60 = null;
        gr_2 gr_22 = this.il0;
        if (gr_22 != null) {
            gr_22.dispose();
        }
        this.il0 = null;
        bk0.info("Reloading map.");
    }

    @Override
    public void bw() {
        pw_1 pw_12 = this.COM4;
        if (pw_12 != null) {
            pw_12.w6 = true;
            this.COM4 = null;
        }
    }

    @Override
    public final void qq0(PRN_ pRN_) {
        if (this.k1 == null) {
            return;
        }
        pRN_.v50.set(this.Hg0.v50).add(0.15f, 0.15f, 0.15f, 0.0f);
    }

    public final void NC() {
        yt_1 world = tw0_0.e60;
        if (world == null) {
            return;
        }
        bi0_1 player = world.jB0;
        if (player == null) {
            return;
        }
        int entityLimit = dw_2.eM0();
        if (entityLimit < 1) {
            for (Object value : tw0_0.e60.pn0.values()) {
                bi0_1 entity = (bi0_1)value;
                entity.getClass();
                if (entity instanceof E90) {
                    E90 character = (E90)entity;
                    this.fO(character);
                    if (_native.j7) {
                        character.L8.Oq(false, false);
                    }
                }
                if (entity.Jf0()) {
                    this.fO(entity.rd);
                }
            }
            if (_native.j7) {
                _native.j7 = false;
            }
            for (Object value : tw0_0.e60.pn0.values()) {
                bi0_1 entity = (bi0_1)value;
                entity.getClass();
                if (!(entity instanceof E90)) {
                    this.fO(entity);
                }
            }
        } else {
            _native.j7 = true;
            zv_2 playerPosition = player.ba0;
            this.VJ0.x = playerPosition.Lq0;
            this.VJ0.y = playerPosition.B5;
            this.VJ0.z = playerPosition.Com6();
            for (Object value : tw0_0.e60.pn0.values()) {
                bi0_1 entity = (bi0_1)value;
                entity.getClass();
                if (entity instanceof E90) {
                    E90 character = (E90)entity;
                    zv_2 position = character.ba0;
                    character.DM = this.VJ0.Ir(position.Lq0, position.B5, position.Com6());
                    this.Av0.Ue0(character);
                }
            }
            this.Av0.sort(E90.Ie0);
            ld_0 occupiedPositions = new ld_0();
            HashSet<CH0> visibleCharacters = new HashSet<CH0>();
            int characterCount = this.Av0.KB;
            for (int index = 0; index < characterCount; ++index) {
                E90 character = (E90)this.Av0.get(index);
                if (character.il0.np) {
                    continue;
                }
                zv_2 position = character.ba0;
                int tile = position.Lq0 | position.B5 << 16;
                if (!occupiedPositions.l90(tile)) {
                    occupiedPositions.Vn(tile);
                    visibleCharacters.add(character.pu);
                }
            }
            int hiddenCount = 0;
            for (int index = 0; index < characterCount; ++index) {
                E90 character = (E90)this.Av0.get(characterCount - index - 1);
                boolean hidden = false;
                boolean keepVisible = true;
                if (!character.il0.np && !visibleCharacters.contains(character.pu)) {
                    hidden = true;
                    keepVisible = false;
                } else if (++hiddenCount > entityLimit) {
                    hidden = true;
                }
                this.fO(character);
                character.L8.Oq(hidden, keepVisible);
                if (character.Jf0()) {
                    this.fO(character.rd);
                }
            }
            this.Av0.clear();
            for (Object value : tw0_0.e60.pn0.values()) {
                bi0_1 entity = (bi0_1)value;
                entity.getClass();
                if (!(entity instanceof E90)) {
                    this.fO(entity);
                    if (entity.Jf0()) {
                        this.fO(entity.rd);
                    }
                }
            }
        }
        this.fO(player);
        if (player.Jf0()) {
            this.fO(player.rd);
        }
    }

    @Override
    public final ff_0 Fq0() {
        return this.YG0;
    }

    @Override
    public final void GU(boolean bl) {
        this.vn0 = bl;
        if (!bl) {
            this.cu0(s4_0.rP, true);
        }
    }

    public abstract void cu0(s4_0 var1, boolean var2);

    @Override
    public final Tv0 So() {
        return this.cV();
    }

    public void MJ0() {
        this.Ra = new ji_1(this.RX);
        DB0 input = lg_0.lW;
        GG0 processor = input.L50;
        if (!(processor instanceof mh_1)) {
            input.L50 = new mh_1(new GG0[]{processor});
        }
        mh_1 processorChain = (mh_1)lg_0.lW.L50;
        ji_1 renderProcessor = this.Ra;
        if (renderProcessor != null) {
            processorChain.HV.P6(0, renderProcessor);
            this.Y = new U5();
            this.Hg0 = new PRN_(PRN_.xE, 1.0f, 1.0f, 1.0f, 1.0f);
            this.w00 = new PRN_(PRN_.YI0, 1.0f, 1.0f, 1.0f, 1.0f);
            this.qh = new Color(0.0f, 0.0f, 0.0f, 1.0f);
            this.qi = new C8();
            this.aD0 = new qv_0();
            this.aD0.l0.set(new Color(0.3f, 0.3f, 0.3f, 1.0f));
            U5 renderState = this.Y;
            qv_0 transformState = this.aD0;
            CP cP = (CP)renderState.sg(CP.M0);
            if (cP == null) {
                cP = new CP();
                renderState.LPT8(cP);
            }
            cP.Ds0.Ue0(transformState);
            this.Y.LPT8(this.Hg0);
            this.Y.LPT8(this.w00);
            this.YG0 = new ff_0(this.uZ, 0);
            this.YG0.nI(tw0_0.Ll0.Qz0);
            this.y50();
            float f = 0.115f;
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            float f5 = 0.0f;
            float f6 = 0.0f;
            long l = PRN_.Ly;
            BM blueMaterial = new BM(new hf_1[]{new PRN_(l, Color.BLUE)});
            float f7 = f;
            this.db0 = this.qu.Q3(f, 0.0f, -0.115f, -0.115f, f2, -0.115f, -0.115f, f3, f7, f7, f4, f, f5, f6, blueMaterial, 9L);
            hf_1[] hf_1Array2 = new hf_1[1];
            Color color3 = Color.GREEN;
            hf_1Array2[0] = new PRN_(l, color3);
            this.d80 = this.qu.CR(0.25f, 0.25f, 0.25f, new BM(hf_1Array2));
            this.ab0 = this.qu.CR(0.23f, 0.001f, 0.23f, new BM(new PRN_(l, color3)));
            P6 p6 = this.qu;
            int n2 = 15;
            int n3 = 15;
            Object object3;
            long l2 = 9L;
            float f8 = 0.0f;
            float f9 = 180.0f;
            p6.Pj();
            object3 = p6.aM("sphere", l2, new BM(new PRN_(l, color3)));
            Matrix4 matrix4 = vo_0.te0.F();
            boolean bl = LW.LH0(f8, 0.0f);
            boolean bl2 = LW.LH0(f9, 180.0f);
            f9 = 0.075f;
            float f10 = 0.0f;
            float f11 = n2;
            float f12 = (float)Math.PI * 2 / f11;
            float f13 = (float)Math.PI / f11;
            f11 = 1.0f / f11;
            VC vC = vo_0.CE.kf0(null, null);
            vC.Lpt9 = true;
            vC.Qj = true;
            vC.CT = true;
            n10_0.gw0.T4(matrix4);
            int n4 = 18;
            n10_0.Yj0.Sd0 = 0;
            n10_0.Yj0.Wf(30);
            n10_0.Yj0.Sd0 = n4;
            int n5 = 0;
            int n6 = 256;
            ((L8)object3).qh.bD(((L8)object3).nF0 * n6);
            ((L8)object3).Pm(n2);
            for (n6 = 0; n6 <= n3; ++n6) {
                float f14 = n6;
                float f15 = f13 * f14 + f10;
                f14 = f11 * f14;
                float f16 = LW.Po0(f15);
                float f17 = LW.Fm0(f15) * f9;
                for (int i = 0; i <= n2; ++i) {
                    float f18 = i;
                    float f19 = f12 * f18 + f10;
                    f18 = n6 == 0 && bl || n6 == n3 && bl2 ? 1.0f - (f18 - 0.5f) * f11 : 1.0f - f11 * f18;
                    VC vC2 = vC;
                    C8 c82 = vC2.Bv;
                    float f20 = LW.Fm0(f19) * f9 * f16;
                    f19 = LW.Po0(f19) * f9 * f16;
                    c82.x = f20;
                    c82.y = f17;
                    c82.z = f19;
                    vC2.t3.np(vC.Bv).Lf0(n10_0.gw0).KM();
                    vC2.Bv.cu(matrix4);
                    Bp0 bp0 = vC2.Lb;
                    bp0.x = f18;
                    bp0.y = f14;
                    BB bB = n10_0.Yj0;
                    short s = ((L8)object3).ek0(vC2);
                    if (n5 < bB.Sd0) {
                        bB.mi0[n5] = s;
                        if (n6 > 0 && i > 0) {
                            short s2;
                            short s3;
                            if (n6 == 1 && bl) {
                                s = bB.Ez0(n5);
                                s3 = bB.Ez0((n5 + 17) % n4);
                                s2 = bB.Ez0((n5 + 2) % n4);
                                ((L8)object3).Zh0(s, s3, s2);
                            } else if (n6 == n3 && bl2) {
                                s = bB.Ez0(n5);
                                s3 = bB.Ez0((n5 + 1) % n4);
                                s2 = bB.Ez0((n5 + 2) % n4);
                                ((L8)object3).Zh0(s, s3, s2);
                            } else {
                                s = bB.Ez0(n5);
                                s3 = bB.Ez0((n5 + 17) % n4);
                                s2 = bB.Ez0((n5 + 1) % n4);
                                short s4 = bB.Ez0((n5 + 2) % n4);
                                ((L8)object3).Ix(s, s3, s2, s4);
                            }
                        }
                        n5 = (n5 + 1) % bB.Sd0;
                        continue;
                    }
                    throw new IndexOutOfBoundsException(CO.go("index can't be >= size: ", n5, " >= ").append(bB.Sd0).toString());
                }
            }
            this.t10 = p6.ps();
            P6 p62 = this.qu;
            float f21 = 0.23f;
            float f22 = 0.23f;
            float f23 = 0.23f;
            n3 = 10;
            hf_1[] hf_1Array3 = new hf_1[1];
            Color color4 = Color.GREEN;
            long l3 = PRN_.Ly;
            hf_1Array3[0] = new PRN_(l3, color4);
            BM cylinderMaterial = new BM(hf_1Array3);
            long l4 = 9L;
            p62.Pj();
            SX.gp0(p62.aM("cylinder", l4, cylinderMaterial), f21, f22, f23, n3);
            this.En0 = p62.ps();
            PRN_ pRN_4 = new PRN_(l3, Color.BLACK);
            BM coneMaterial = new BM();
            coneMaterial.LPT8(new pr_1(pr_1.av, 1028));
            coneMaterial.LPT8(pRN_4);
            coneMaterial.LPT8(new sh_0(0.97f));
            this.qu.Pj();
            hb0_1.lF0(this.qu.aM("cone", 1L, coneMaterial), 1.0f, 25.0f, 1.0f, 64, false);
            this.hf = this.qu.ps();
            this.a1 = new St(this.hf);
            return;
        }
        processorChain.getClass();
        throw new NullPointerException("processor cannot be null");
    }

    @Override
    public void Xf0() {
        this.UU = false;
        if (this.XF == null) {
            this.XF = s4_0.OV;
        }
        if (tt0_0.C7()) {
            BattleFieldStageController l00 = this;
            l00.uZ.yG = lg_0.S4.sD0() - tt0_0.j0.Dn0();
            l00.uZ.Ui = lg_0.S4.Kr0() - tt0_0.j0.yJ();
            l00.uZ.ye(true);
            l00.RX.yG = lg_0.S4.sD0() - tt0_0.j0.Dn0();
            l00.RX.Ui = lg_0.S4.Kr0() - tt0_0.j0.yJ();
            l00.RX.ye(true);
        }
    }

    public abstract void Be(E90 var1, BJ0 var2, boolean var3);

    @Override
    public final void KU(boolean bl, CH0 target) {
        float duration = 1.0f;
        pw_1 activeTween = this.COM4;
        if (activeTween != null) {
            activeTween.w6 = true;
            activeTween.xF0 = null;
        }
        if (bl) {
            this.us(duration);
            return;
        }
        bi0_1 targetEntity = tw0_0.e60.ax(target);
        if (targetEntity == null) {
            return;
        }
        C8 targetPosition = targetEntity.uR().ze0;
        pw_1 tween = pw_1.xC().Xf0();
        ao_1 scaleTween = ao_1.DX(this.uZ, 7, duration);
        scaleTween.h5[0] = targetEntity.ba0.uS == 2 ? 3.0f : 7.0f;
        tween.y80(scaleTween);
        tween.y80(ao_1.DX(this.uZ, 9, duration).kt(targetPosition.x, targetPosition.y, targetPosition.z));
        tween.y80(ao_1.DX(this.uZ, 4, duration).kt(targetPosition.x, targetPosition.y, targetPosition.z));
        this.COM4 = (pw_1)tween.mz0().Ms(tw0_0.LD0.Ov);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void Wh0() {
        if (!this.fX) {
            return;
        }
        if (this.DP != null) {
            return;
        }
        if (this.k1 == null) {
            return;
        }
        pw_1 pw_12 = this.YX;
        if ((pw_12 == null || pw_12.BJ0()) && c8_0.JD0.vt0.fy()) {
            boolean bl = this.k1.sm0.equals(this.w00.v50) ^ true;
            boolean bl2 = this.k1.r30.equals(this.Hg0.v50) ^ true;
            boolean bl3 = this.k1.Ak0.equals(this.qh) ^ true;
            boolean bl4 = this.k1.Ze.equals(this.qi) ^ true;
            if (bl || bl2 || bl3 || bl4) {
                pw_1 transition = pw_1.xC().Xf0();
                this.YX = transition;
                if (bl) {
                    Color color = this.k1.sm0;
                    transition.y80(ao_1.DX(this.w00.v50, 0, 30.0f).Om0(new float[]{color.r, color.g, color.b, color.a}));
                }
                if (bl2) {
                    Color color = this.k1.r30;
                    this.YX.y80(ao_1.DX(this.Hg0.v50, 0, 30.0f).Om0(new float[]{color.r, color.g, color.b, color.a}));
                }
                if (bl3) {
                    Color color = this.k1.Ak0;
                    this.YX.y80(ao_1.DX(this.qh, 0, 30.0f).Om0(new float[]{color.r, color.g, color.b, color.a}));
                }
                if (bl4) {
                    C8 c8 = this.k1.Ze;
                    float z = c8.z;
                    ao_1 positionTween = ao_1.DX(this.qi, 4, 30.0f).kt(z, c8.y, z);
                    positionTween.Yn = Quint.INOUT;
                    this.YX.y80(positionTween);
                }
                this.YX.mz0().Ms(tw0_0.LD0.Ov);
            }
        } else {
            pw_12 = this.YX;
            if (pw_12 == null) return;
            if (pw_12.BJ0()) {
                this.YX = null;
                return;
            }
        }
        this.aD0.jf.np(this.qi);
    }

    @Override
    public final void RU(bi0_1 bi0_12, iq0_0 iq0_02, ArrayList arrayList) {
        if (bi0_12 == null) {
            return;
        }
        if (R30.cf(iq0_02, bi0_12.uR().ze0, new C8(0.25f, 0.5f, 0.25f))) {
            arrayList.add(bi0_12);
        }
    }
}


