/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.rom.nds.dppt;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.AN;
import f.Ao0;
import f.B5;
import f.BJ0;
import f.BR;
import f.C8;
import f.CF0;
import f.CI0;
import f.Cq0;
import f.E90;
import f.ER;
import f.FG;
import f.I2;
import f.J4;
import f.JA;
import f.L00;
import f.LT;
import f.LW;
import f.O30;
import f.OH0;
import f.Ou0;
import f.St;
import f.Ts;
import f.XF0;
import f.Z50;
import f.Ze;
import f.a00_0;
import f.af0_0;
import f.ao_1;
import f.bi0_1;
import f.bm_1;
import f.bn0_0;
import f.c8_0;
import f.ca_0;
import f.cb_0;
import f.cl0_1;
import f.cn0_0;
import f.com6__1;
import f.dl_1;
import f.dw_2;
import f._else;
import f.fy0_0;
import f.gr_2;
import f.jn_0;
import f.k70_0;
import f.kq0_0;
import f.le0_2;
import f.lg_0;
import f.ly0_0;
import f.mk_1;
import f.nf_0;
import f.nk_0;
import f.nv0_0;
import f.oi0_2;
import f.ok0_2;
import f.pw_1;
import f.qj0_1;
import f.rj_1;
import f.s4_0;
import f.sd_0;
import f.sh_1;
import f._strictfp;
import f.tt0_0;
import f.tw0_0;
import f.up_2;
import f.vo_2;
import f.wa0_2;
import f.yt_1;
import f.zv_2;
import java.io.Serializable;

/*
 * Renamed from f.oV
 */
public class DpptWorldMapManager
extends L00 {
    public static final dl_1 iz0 = Cq0.E1(DpptWorldMapManager.class);
    public nv0_0[][] sd = null;
    public boolean C3;
    public CF0 at0 = null;

    public DpptWorldMapManager(Ts ts) {
        super(ts);
    }

    public static boolean s2(XF0 xF0) {
        return xF0.Ro0.c40() && xF0.i80.SM != 7 || xF0.i80.SM == 0 || xF0.Ro0.tN == 56;
    }

    @Override
    public final void MJ0() {
        super.MJ0();
        this.XF = s4_0.OV;
        this.a30 = new cn0_0();
        String string = bn0_0.DK0();
        String string2 = bn0_0.Rn0();
        JA jA2 = new JA(string, string2, this.a30);
        jA2.HA = 1;
        jA2.F80 = 5;
        jA2.el = 32;
        this.ns0 = new ER(new bn0_0(jA2, this.a30), new FG());
    }

    @Override
    public final boolean o7(byte by, C8 c8, int n, boolean bl, boolean bl2, boolean bl3) {
        boolean bl4 = this.fX ^ true;
        Object object = tw0_0.e60;
        if (object == null) {
            bl4 = true;
        }
        XF0 xF0 = null;
        if (!bl4) {
            if (!((object = ((yt_1)object).N60()) instanceof XF0)) {
                return true;
            }
            xF0 = (XF0)object;
            object = this.il0;
            if ((object == null ? (short)0 : ((gr_2)object).gq0()) != xF0.Ro0.O60) {
                bl4 = true;
            }
        }
        if (bl4) {
            final byte deferredBy = by;
            final C8 deferredPosition = c8;
            final int deferredN = n;
            final boolean deferredBl = bl;
            final boolean deferredBl2 = bl2;
            final boolean deferredBl3 = bl3;
            lg_0.k.lPT5(() -> this.o7(deferredBy, deferredPosition, deferredN, deferredBl, deferredBl2, deferredBl3));
            return true;
        }
        float f = Float.MAX_VALUE;
        object = null;
        boolean bl5 = by != 4;
        I2 i2 = this.qf.ZD();
        while (i2.hasNext()) {
            I2 i22 = ((nv0_0)i2.next()).yf0.ZD();
            while (i22.hasNext()) {
                Ou0 ou0 = (Ou0)i22.next();
                if (bl && !ou0.yI0.contains("door") && (bl2 || !ou0.yI0.contains("badgegate")) && (bl2 || !ou0.yI0.contains("elevator")) || bl3 && !bl2 && bl && ou0.yI0.contains("badgegate") || J4.p5(xF0.Bm0, xF0.case$) == 143 && (ou0.yI0.contains("warp0") || ou0.yI0.contains("_sta"))) continue;
                ly0_0 serializable = ou0.Mp0;
                c8.y = serializable.jG0.y;
                if (ou0.yI0.equals("ele_door1")) {
                    ly0_0 ly0_03 = new ly0_0(serializable);
                    ly0_03.nF(ly0_03.jG0.Vy(0.0f, 0.0f, 0.125f), ly0_03.Xa0.na(0.0f, 0.0f, 0.125f));
                    serializable = ly0_03;
                }
                ly0_0 ly0_04 = serializable;
                Object object2 = this;
                C8 cameraStart = ((L00)object2).VN.jG0;
                C8 c82 = c8;
                float f3 = c82.x;
                float f4 = c82.y;
                float f5 = c82.z;
                cameraStart.x = f3;
                cameraStart.y = f4;
                cameraStart.z = f5;
                cameraStart.dz0(0.125f);
                C8 c83 = ((L00)object2).VN.Xa0;
                C8 c84 = c8;
                c83.getClass();
                float f6 = c84.x;
                f4 = c84.y;
                f5 = c84.z;
                c83.x = f6;
                c83.y = f4;
                c83.z = f5;
                c83.if$(0.125f);
                ly0_0 ly0_05 = ((L00)object2).VN;
                C8 c85 = ly0_05.jG0;
                ly0_05.nF(c85, ly0_05.Xa0);
                if (!ly0_04.hC0(((L00)object2).VN) && !c8.eG() && bl || bl5 && n >= ou0.Kv.KB) continue;
                C8 c86 = ou0.Mp0.Xm0;
                float f2 = c8.Ir(c86.x, c86.y, c86.z);
                if (!(f2 < f)) continue;
                f = f2;
                object = ou0;
            }
        }
        if (object != null) {
            switch (by) {
                default: {
                    break;
                }
                case 4: {
                    C8 c88 = new C8();
                    ((St)object).ho.V1(c88);
                    if (n == 1) {
                        float f9 = c88.y;
                        if (f9 <= -90000.0f) {
                            c88.y = f9 + 100000.0f;
                        }
                    } else {
                        float f11 = c88.y;
                        if (f11 > -90000.0f) {
                            c88.y = f11 - 100000.0f;
                        }
                    }
                    ((St)object).ho.Y1(c88);
                    break;
                }
                case 3: {
                    ((Ou0)object).EG();
                    break;
                }
                case 2: {
                    ((Ou0)object).PE0 = 1.0E8f;
                    ((Ou0)object).sC0(n, false, null);
                    break;
                }
                case 0: 
                case 1: {
                    short s;
                    ((Ou0)object).PE0 = bl && bl2 && n == 0 ? 1.0E8f : 1.0f;
                    by = by == 1 ? (byte)1 : 0;
                    ((Ou0)object).sC0(n, by != 0, null);
                    if (n == 0 && bl && bl3) {
                        float f12;
                        ao_1 ao_12 = ao_1.DX(this.uZ, 7, 1.5f);
                        ao_12.h5[0] = this.uZ.Rg0 / 2.0f;
                        ao_1 ao_13 = ao_1.DX(this.uZ, 6, 1.5f);
                        ao_13.h5[0] = this.uZ.Q30 + 10.0f;
                        pw_1.xC().Xf0().y80(ao_12).y80(ao_13).mz0().xF0 = this.YB;
                        this.COM4 = (pw_1)pw_1.xC().Xf0().y80(ao_12).y80(ao_13).mz0().Ms(tw0_0.LD0.Ov);
                    }
                    if (!bl) break;
                    byte by2 = 2;
                    boolean bl6 = n == 0;
                    switch (((Ou0)object).AD) {
                        default: {
                            if (bl6) {
                                s = 1669;
                                break;
                            }
                            s = 1670;
                            break;
                        }
                        case 442: {
                            by2 = 3;
                            s = 1544;
                            break;
                        }
                        case 70: 
                        case 75: 
                        case 298: 
                        case 427: 
                        case 456: 
                        case 484: {
                            s = 1671;
                        }
                    }
                    if (bl2 && bl6) {
                        return false;
                    }
                    tw0_0.RE0.d00(true, by2, s, 0.0f);
                }
            }
            return true;
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final void cu0(s4_0 var1_1, boolean var2_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        if (!this.vn0 || (!lpt3__1.oq0 && (lpt3__1.RJ || tw0_0.Eu(8)))) {
            var1_1 = s4_0.rP;
        }
        com.badlogic.gdx.graphics.g3d.particles.ParticleEffectExt effect = this.Bu0;
        if (effect != null && (var2_4 || var1_1 == null || this.XF != var1_1)) {
            if (var2_4) {
                this.YG0.aUX();
                this.Bu0 = null;
            } else if (!effect.isComplete()) {
                I2 controllers = effect.getControllers().ZD();
                while (controllers.hasNext()) {
                    ((com.badlogic.gdx.graphics.g3d.particles.emitters.RegularEmitter)((com.badlogic.gdx.graphics.g3d.particles.ParticleController)controllers.next()).emitter).setEmissionMode(
                            com.badlogic.gdx.graphics.g3d.particles.emitters.RegularEmitter.EmissionMode.EnabledUntilCycleEnd);
                }
            }
        }
        if (lpt3__1.RJ && lg_0.lW.nI0(93) && this.Bu0 != null) {
            this.YG0.aUX();
            this.Bu0 = null;
        }
        this.YG0.I2();
        this.XF = var1_1;
        effect = this.Bu0;
        if (effect != null && effect.isComplete()) {
            this.Bu0 = null;
        }
        if (var2_4 || this.Bu0 != null || var1_1 == null) {
            return;
        }
        String weather;
        switch (var1_1.ordinal()) {
            case 25: weather = "weather/hail"; break;
            case 24: case 43: case 44: weather = "weather/heavy_snow"; break;
            case 22: weather = "weather/heavy_rain"; break;
            case 21: weather = "weather/heavy_rain"; break;
            case 28: weather = "weather/sandstorm"; break;
            case 27: weather = "weather/ash"; break;
            case 20: case 41: weather = "weather/rain"; break;
            case 7: case 17: case 23: case 45: weather = "weather/snow"; break;
            default: return;
        }
        this.Bu0 = this.YG0.UH0(weather);
        this.Bu0.start();
        this.YG0.fY(this.Bu0);
        if (var1_1.ordinal() == 22) {
            this.Fg = this.YG0.UH0("weather/thunder");
            this.YG0.fY(this.Fg);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final void mH(_else var1_1) {
        XF0 map = (XF0)var1_1;
        int clearColor = DpptWorldMapManager.s2(map) ? 39 : 28;
        if (!this.fX) {
            this.k1 = tw0_0.Ll0.Qz0.Oq0.Vo0[clearColor].bB();
            this.mD0();
        }
        if (this.vn0) {
            this.cu0(map.Jo0, !this.fX);
        }
        Z50 header = map.Ro0;
        int mapType = header.tN;
        if ((mapType == 62 || mapType == 50) && this.XF == s4_0.OK0) {
            this.w00.v50.set(Color.WHITE);
            this.Hg0.v50.set(Color.WHITE);
            this.qh.set(Color.WHITE);
        } else if (mapType == 53) {
            this.w00.v50.set(0.03f, 0.05f, 0.3f, 0.0f);
            this.Hg0.v50.set(1.0f, 1.0f, 1.0f, 1.0f);
            this.qh.set(Color.BLACK);
        } else if (mapType == 70 && this.XF == s4_0.B1) {
            this.w00.v50.set(0x1100FF);
        } else {
            int tileset = header.O60;
            if (tileset == 89 || tileset == 90) {
                this.Hg0.v50.set(-1);
                this.w00.v50.set(255);
            } else {
                if (this.XF == s4_0.EB) {
                    this.w00.v50.set(1546913279);
                } else if (this.XF == s4_0.tA0) {
                    this.w00.v50.set(-1717986817);
                    this.qh.set(-1717986817);
                } else if (map.i80.SM == 7 && this.XF == s4_0.VB) {
                    this.w00.v50.set(0x1100FF);
                } else {
                    this.Wh0();
                }
            }
        }
        if (!this.fX) {
            this.mD0();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void Xf0() {
        int n;
        Object object;
        Object object2;
        block52: {
            object2 = tw0_0.e60;
            if (object2 == null) return;
            if (((yt_1)object2).jB0 == null) return;
            if (!tw0_0.rl.NA) return;
            if (!(tw0_0.e60.N60() instanceof cb_0)) {
                return;
            }
            super.Xf0();
            this.KY();
            object2 = (cb_0)tw0_0.e60.N60();
            object = tw0_0.e60.jB0;
            Color color = this.qh;
            float f = color.r;
            float f2 = color.g;
            float f3 = color.b;
            float f4 = color.a;
            lg_0.OH0.glClearColor(f, f2, f3, f4);
            lg_0.OH0.glClear(16640);
            Object object3 = this.at0;
            if (object3 != null) {
                B5 b5;
                float f5;
                int n2;
                Color color2 = ((CF0)object3).pa;
                Color color3 = ((CF0)object3).zF;
                f3 = color2.r * color3.r;
                f4 = color2.g * color3.g;
                float f6 = color2.b * color3.b;
                float f7 = color2.a;
                lg_0.OH0.glClearColor(f3, f4, f6, f7);
                lg_0.OH0.glClear(16640);
                ((CF0)object3).oH0.kF(true);
                ((CF0)object3).op.R1(true);
                ((CF0)object3).u9.Po(((CF0)object3).op.iJ);
                ((CF0)object3).u9.W30();
                up_2 up_22 = ((CF0)object3).oH0;
                int n3 = (int)up_22.qj / 2 - 30;
                int n4 = (int)up_22.eY / 2 - 140;
                a00_0 a00_02 = a00_0.xm0;
                ((CF0)object3).LPt2[10].OB.setWrap(a00_02, a00_02);
                f4 = 3.0f;
                ((CF0)object3).LPt2[10].Zi0 = 3.0f;
                ((CF0)object3).LPt2[10].D60 = f4;
                ((CF0)object3).LPt2[10].o70 = true;
                ((CF0)object3).LPt2[10].ak0(0.0f, 60.0f);
                Color color4 = ((CF0)object3).zF;
                f4 = color4.r;
                f7 = color4.g;
                float f8 = color4.b;
                ((CF0)object3).LPt2[10].lE(f4, f7, f8);
                ((CF0)object3).LPt2[10].jN(((CF0)object3).u9);
                ((CF0)object3).lJ = lg_0.S4.uL * 4.0f + ((CF0)object3).lJ;
                for (n2 = 0; n2 < 4; ++n2) {
                    f7 = -((CF0)object3).lJ * 10.0f % 360.0f;
                    float f9 = (float)n2 * 90.0f + f7;
                    f7 = f9;
                    B5 b52 = ((CF0)object3).LPt2[n2];
                    f7 = 4.0f;
                    b52.Zi0 = 4.0f;
                    b52.D60 = f7;
                    b52.B1 = f7 - 90.0f;
                    b52.o70 = true;
                    float f10 = f9 * ((float)Math.PI / 180);
                    f7 = LW.Fm0(f10) * 550.0f;
                    f8 = LW.Po0(f10) * 550.0f;
                    ((CF0)object3).LPt2[n2].ak0((float)n3 + f7, (float)n4 + f8);
                    Color color5 = ((CF0)object3).zF;
                    f7 = color5.r;
                    f8 = color5.g;
                    f5 = color5.b;
                    ((CF0)object3).LPt2[n2].lE(f7, f8, f5);
                    ((CF0)object3).LPt2[n2].jN(((CF0)object3).u9);
                }
                for (n2 = 4; n2 < 6; ++n2) {
                    f7 = -((CF0)object3).lJ * 5.0f % 360.0f;
                    float f11 = (float)n2 * 180.0f + f7;
                    f7 = f11;
                    B5 b53 = ((CF0)object3).LPt2[n2];
                    f7 = 4.0f;
                    b53.Zi0 = 4.0f;
                    b53.D60 = f7;
                    b53.B1 = f7 - 90.0f;
                    b53.o70 = true;
                    float f12 = f11 * ((float)Math.PI / 180);
                    f7 = LW.Fm0(f12) * 300.0f;
                    f8 = LW.Po0(f12) * 300.0f;
                    ((CF0)object3).LPt2[n2].ak0((float)n3 + f7, (float)n4 + f8);
                    Color color6 = ((CF0)object3).zF;
                    f7 = color6.r;
                    f8 = color6.g;
                    f5 = color6.b;
                    ((CF0)object3).LPt2[n2].lE(f7, f8, f5);
                    ((CF0)object3).LPt2[n2].jN(((CF0)object3).u9);
                }
                for (n2 = 6; n2 < 8; ++n2) {
                    f7 = -((CF0)object3).lJ * 2.5f % 360.0f;
                    float f13 = (float)n2 * 180.0f + f7;
                    f7 = f13;
                    B5 b54 = ((CF0)object3).LPt2[n2];
                    f7 = 4.0f;
                    b54.Zi0 = 4.0f;
                    b54.D60 = f7;
                    b54.B1 = f7 - 90.0f;
                    b54.o70 = true;
                    float f14 = f13 * ((float)Math.PI / 180);
                    f7 = LW.Fm0(f14) * 150.0f;
                    f8 = LW.Po0(f14) * 150.0f;
                    ((CF0)object3).LPt2[n2].ak0((float)n3 + f7, (float)n4 + f8);
                    Color color7 = ((CF0)object3).zF;
                    f7 = color7.r;
                    f8 = color7.g;
                    f5 = color7.b;
                    ((CF0)object3).LPt2[n2].lE(f7, f8, f5);
                    ((CF0)object3).LPt2[n2].jN(((CF0)object3).u9);
                }
                f4 = -((CF0)object3).lJ * 2.5f % 360.0f;
                B5 b55 = b5 = ((CF0)object3).LPt2[8];
                B5 b56 = b5;
                float f15 = 4.0f;
                b56.Zi0 = 4.0f;
                b56.D60 = f15;
                b55.B1 = f4;
                b55.o70 = true;
                f15 = n3;
                b5.ak0(f15, n4);
                Color color8 = ((CF0)object3).zF;
                f15 = color8.r;
                float f16 = color8.g;
                f4 = color8.b;
                ((CF0)object3).LPt2[8].lE(f15, f16, f4);
                ((CF0)object3).LPt2[8].jN(((CF0)object3).u9);
                ((CF0)object3).u9.end();
                int n5 = lg_0.S4.Kr0();
                int n6 = lg_0.S4.sD0();
                CI0.r40(0, 0, n5, n6);
                object3.getClass();
            }
            object = ((bi0_1)object).il0.t60;
            object3 = this.K60;
            if (object3 == null || object3 != object2 || ((XF0)object3).Fm && nf_0.zo0().t8() >= 255) {
                c8_0.JD0.vt0.ar = 0L;
                object3 = this.K60;
                if (object3 != null && ((XF0)object3).Fm) {
                    ((XF0)object3).Fm = false;
                    ((XF0)object3).gA();
                }
                this.K60 = (XF0)object2;
                object3 = ((XF0)object2).i80;
                this.sd = new nv0_0[((wa0_2)object3).It0][((wa0_2)object3).WH];
                mk_1.NU.Sq0();
                object3 = this.qf.ZD();
                while (((I2)object3).hasNext()) {
                    ((nv0_0)((I2)object3).next()).dispose();
                }
                this.qf.clear();
                this.sN.fx.ri0();
                this.e0 = -1;
                this.hq = -1;
                if (tw0_0.PK0 == null && tw0_0.LD0.hO == null) {
                    tw0_0.RE0.Eh(((_else)object2).dw, ((XF0)object2).hh0(), true, false);
                }
                vo_2.z0 = DpptWorldMapManager.s2((XF0)object2);
                ((Ze)this.sN.fx).yA0.b20();
                ok0_2.CoM5();
                tw0_0.lM.BO();
            }
            if (((object3 = this.il0) == null ? (short)0 : ((gr_2)object3).gq0()) != ((XF0)object2).Ro0.O60 || tw0_0.Eu(1) && lg_0.lW.eC0(129) && lg_0.lW.nI0(92)) {
                object3 = this.il0;
                if (object3 != null) {
                    ((gr_2)object3).dispose();
                    this.il0 = null;
                }
                if ((object3 = this.at0) != null) {
                    ((CF0)object3).dispose();
                    this.at0 = null;
                }
                switch (((XF0)object2).Ro0.O60) {
                    default: {
                        object3 = new gr_2((XF0)object2);
                        break;
                    }
                    case 573: 
                    case 574: 
                    case 575: 
                    case 576: 
                    case 577: 
                    case 579: 
                    case 580: 
                    case 581: 
                    case 582: 
                    case 583: {
                        this.il0 = new kq0_0((cb_0)object2);
                        this.at0 = new CF0();
                        break block52;
                    }
                    case 504: 
                    case 505: 
                    case 506: 
                    case 507: 
                    case 508: 
                    case 509: {
                        object3 = new _strictfp((cb_0)object2);
                        break;
                    }
                    case 176: 
                    case 178: 
                    case 180: 
                    case 182: 
                    case 184: 
                    case 185: 
                    case 291: 
                    case 293: 
                    case 294: {
                        object3 = new cl0_1((cb_0)object2);
                        break;
                    }
                    case 167: {
                        object3 = new oi0_2((cb_0)object2);
                        break;
                    }
                    case 156: {
                        object3 = new ca_0((cb_0)object2);
                        break;
                    }
                    case 155: {
                        object3 = new ca_0((cb_0)object2);
                        break;
                    }
                    case 154: {
                        object3 = new ca_0((cb_0)object2);
                        break;
                    }
                    case 133: {
                        object3 = new k70_0((cb_0)object2);
                        break;
                    }
                    case 122: {
                        object3 = new rj_1((cb_0)object2);
                        break;
                    }
                    case 89: 
                    case 90: {
                        object3 = new sd_0((cb_0)object2, this.a30);
                        break;
                    }
                    case 67: {
                        object3 = new OH0((cb_0)object2);
                        break;
                    }
                    case 35: {
                        object3 = new sh_1((cb_0)object2);
                    }
                }
                this.il0 = (gr_2)object3;
            }
        }
        int n7 = 0;
        int n8 = 0;
        int n9 = ((XF0)object2).yd;
        if (n9 > 0 && (n = ((XF0)object2).ie) > 0) {
            Object object4 = object;
            object = ((XF0)object2).i80;
            n7 = (int)((((C8)object4).x - (float)((wa0_2)object).Iz0) / (float)n9);
            n8 = (int)((((C8)object4).y - (float)((wa0_2)object).Ig) / (float)n);
        }
        if (this.e0 != n7 || this.hq != n8) {
            this.e0 = n7;
            this.hq = n8;
        }
        int n10 = 1;
        System.nanoTime();
        n9 = 0;
        boolean bl = false;
        int n11 = Math.max(0, n7 - 1);
        while (true) {
            if (n11 <= n7 + n10) {
            } else {
                if (bl && tt0_0.C7()) {
                    tt0_0 tt0_02 = tt0_0.j0;
                    tt0_02.d6.tA0();
                    if (tt0_02.G2 != null) {
                        le0_2 le0_22 = tt0_02.Mu;
                        if (le0_22 != null) {
                            tt0_02.Ol.sj0(le0_22, true);
                        }
                        tt0_0 tt0_03 = tt0_02;
                        tt0_03.Mu = null;
                        tt0_03.n90();
                        tt0_03.G2.dispose();
                        tt0_03.Ol.sj0(tt0_02.G2, true);
                    }
                }
                if (n9 != 0 && tw0_0.Eu(1)) {
                    System.nanoTime();
                    iz0.getClass();
                }
                this.ns0.jK(this.cV());
                this.Kx();
                jn_0.Ie0("PSYS.draw");
                this.YG0.begin();
                this.YG0.I2();
                this.YG0.me0();
                this.YG0.end();
                jn_0.Qr("PSYS.draw");
                this.ns0.eo0(this.YG0);
                if ((((_else)object2).Jo0 == s4_0.COm8 || ((_else)object2).Z10) && tw0_0.rl.c50 != 7) {
                    this.VJ0.np(this.uZ.rj);
                    this.VJ0.y += 0.25f;
                    if (this.qH < 1.0f) {
                        this.qH = 1.0f;
                    }
                    if (this.qH > 5.0f) {
                        this.qH = 5.0f;
                    }
                    this.a1.ho.F();
                    BJ0 bJ0 = this.uZ;
                    object2 = bJ0.rj;
                    C8 c8 = bJ0.v40;
                    C8 c82 = bJ0.St0;
                    this.a1.ho.co((C8)object2, c8, c82);
                    this.a1.ho.Y1(this.VJ0);
                    this.a1.ho.tO(C8.X, 90.0f);
                    float f = this.qH * 1.25f;
                    this.a1.ho.w2(f, f, f);
                    this.ns0.vL();
                    this.ns0.eo0(this.a1);
                }
                this.ns0.end();
                tw0_0.lM.getClass();
                return;
            }
            for (int j = Math.max(0, n8 - n10); j <= n8 + n10; ++j) {
                bm_1 bm_12;
                if (n11 < 0 || j < 0 || (bm_12 = ((XF0)object2).gg(n11, j)) == null || this.sd[n11][j] != null) continue;
                Cloneable cloneable = ((cb_0)object2).PQ(n11, j);
                nv0_0 nv0_03 = new nv0_0((Ao0)cloneable, (qj0_1)bm_12.wj0());
                nv0_03.Hb0(this.k1);
                float f = 0.0f;
                switch (J4.p5(((_else)object2).Bm0, ((_else)object2).case$)) {
                    default: {
                        break;
                    }
                    case 582: {
                        f = 0.0f;
                        break;
                    }
                    case 581: 
                    case 583: {
                        f = 16.0f;
                        break;
                    }
                    case 580: {
                        f = 28.5f;
                        break;
                    }
                    case 579: {
                        f = 32.0f;
                        break;
                    }
                    case 577: {
                        f = 40.0f;
                        break;
                    }
                    case 576: {
                        f = 48.0f;
                        break;
                    }
                    case 575: {
                        f = 56.0f;
                        break;
                    }
                    case 574: {
                        f = 64.0f;
                        break;
                    }
                    case 573: {
                        f = 72.0f;
                    }
                }
                cloneable = this.sN.V10(((Z50)cloneable).Va0);
                if (cloneable != null) {
                    if (((wa0_2)cloneable).sq0()) {
                        f = ((wa0_2)cloneable).GF0(n11, j);
                    }
                    float f17 = n11 * 8 + 4;
                    f17 = (float)((wa0_2)cloneable).Iz0 * 0.25f + f17;
                    float f18 = j * 8 + 4;
                    nv0_03.hw.na(f17, f, (float)((wa0_2)cloneable).Ig * 0.25f + f18);
                }
                nv0_0 nv0_04 = nv0_03;
                nv0_04.Py0();
                this.sd[n11][j] = nv0_03;
                this.qf.Ue0(nv0_03);
                bl = true;
                Ou0 ou0 = nv0_04.wp0;
                float f19 = 1.0f;
                ou0.jF = 1.0f;
                ou0.QT = f19;
                ou0.kv = f19;
                n9 = 1;
            }
            ++n11;
        }
    }

    @Override
    public final void Be(E90 object, BJ0 bJ0, boolean bl) {
        float f;
        XF0 xF0;
        C8 c8 = ((bi0_1)object).il0.t60;
        if (this.KR) {
            if (this.Ej == null) {
                this.Ej = c8;
            }
            c8 = this.Ej;
        }
        C8 c82 = this.sC;
        C8 c83 = c8;
        float f2 = c83.z * 0.25f + 0.1f;
        float f3 = c83.y * 0.25f + 0.1f;
        this.sC.x = c8.x * 0.25f;
        this.sC.y = f2;
        this.sC.z = f3;
        af0_0 af0_02 = af0_0.SS;
        float f4 = af0_02.Lu0 % 2 == 0 ? af0_02.fq0 : -af0_02.fq0;
        DpptWorldMapManager DpptWorldMapManager2 = this;
        float f5 = f4 * 0.02f;
        c82.Vy(f5, 0.0f, f5);
        com6__1 com6__12 = com6__1.WI0;
        f4 = com6__12.xf();
        float f6 = 0.0f;
        f3 = com6__12.Um0();
        DpptWorldMapManager2.sC.na(f4, f6, f3);
        bJ0.Wu0 = 0.5f;
        f4 = 100.0f;
        switch (DpptWorldMapManager2.XF.ordinal()) {
            default: {
                break;
            }
            case 35: {
                f4 = bJ0.Rg0 + 4.5f;
                break;
            }
            case 28: {
                f4 = bJ0.Rg0 + 3.0f;
                break;
            }
            case 27: 
            case 37: {
                f4 = bJ0.Rg0 + 5.0f;
                break;
            }
            case 25: 
            case 32: {
                f4 = bJ0.Rg0 + 2.5f;
                break;
            }
            case 21: 
            case 24: 
            case 43: 
            case 44: {
                f4 = bJ0.Rg0 + 6.0f;
            }
        }
        if (this.fX && (xF0 = this.K60) != null) {
            if (xF0.Ro0.tN == 53) {
                bJ0.Qy = 19.0f;
            }
        } else {
            bJ0.Qy = f4;
        }
        if ((f = bJ0.Qy) != f4) {
            bJ0.Qy = f > f4 ? Math.max(f - lg_0.S4.uL * 15.0f, f4) : Math.min(lg_0.S4.uL * 15.0f + f, f4);
        }
        E90 e90 = object;
        cb_0 world = (cb_0)tw0_0.e60.N60();
        zv_2 zv_22 = e90.ba0;
        if (!this.C3) {
            if (dw_2.z2 && LW.LH0(bJ0.zo0, 15.0f)) {
                bJ0.zo0 = 10.5f;
            } else if (!dw_2.z2 && !LW.LH0(bJ0.zo0, 15.0f)) {
                bJ0.zo0 = 15.0f;
            }
        }
        if (!this.fX) {
            if (!this.C3) {
                bJ0.zo0 = 15.0f;
            }
            bJ0.Rg0 = 12.5f;
            bJ0.Q30 = -56.0f;
            bJ0.d00 = 0.0f;
            if (world != null && zv_22.Lpt2) {
                LT heading = zv_22.LPt1();
                if (heading == null) {
                    return;
                }
                if (heading.XC0() > 90.0f && heading.XC0() < 270.0f) {
                    bJ0.Q30 = 10.0f;
                    bJ0.d00 = -25.0f;
                } else if (heading.XC0() > 0.0f && heading.XC0() <= 90.0f) {
                    bJ0.d00 = -45.0f;
                    bJ0.Q30 = -15.0f;
                } else if (heading.XC0() >= 270.0f) {
                    bJ0.d00 = 45.0f;
                    bJ0.Q30 = -25.0f;
                }
            }
        }
        DpptWorldMapManager DpptWorldMapManager3 = this;
        C8 c84 = DpptWorldMapManager3.sC;
        float f7 = c84.x;
        float f8 = c84.y;
        f = c84.z;
        bJ0.nz0(f7, f8, f, 0.0f, 0.0f, 0.0f);
        bJ0.ye(true);
        if (DpptWorldMapManager3.kp0) {
            BJ0 bJ02 = this.RX;
            bJ02.Qy = 1000.0f;
            bJ02.Wu0 = 0.1f;
            bJ02.zo0 = bJ0.zo0;
        }
    }

    @Override
    public final void bw() {
        super.bw();
        com6__1.WI0.cI0((short)0, (short)0);
    }

    @Override
    public final void Dt0(int n, int n2) {
        DpptWorldMapManager DpptWorldMapManager2 = this;
        super.Dt0(n, n2);
        CF0 fy0_02 = DpptWorldMapManager2.at0;
        if (fy0_02 != null) {
            ((CF0)fy0_02).oH0.Yw0(n, n2);
        }
    }

    @Override
    public final void dispose() {
        DpptWorldMapManager DpptWorldMapManager2 = this;
        super.dispose();
        DpptWorldMapManager2.sN.fx.ri0();
        ((Ze)DpptWorldMapManager2.sN.fx).yA0.b20();
        ok0_2.CoM5();
        gr_2 gr_22 = DpptWorldMapManager2.il0;
        if (gr_22 != null) {
            gr_22.dispose();
        }
        CF0 fullScreenEffect = DpptWorldMapManager2.at0;
        if (fullScreenEffect != null) {
            fullScreenEffect.dispose();
        }
    }

    @Override
    public final void ph0() {
        super.ph0();
        if (tw0_0.e60 == null) {
            return;
        }
        this.KY();
    }

    @Override
    public final void HF0() {
        this.uZ.zo0 -= 1.0f;
        this.C3 = true;
    }

    @Override
    public final void uD0() {
        this.uZ.zo0 += 1.0f;
        this.C3 = true;
    }

    @Override
    public final void Yt(double d) {
        this.uZ.zo0 = (float)((double)this.uZ.zo0 + d);
        this.C3 = true;
    }

    @Override
    public final void aN(float f) {
        DpptWorldMapManager DpptWorldMapManager2 = this;
        DpptWorldMapManager2.uZ.zo0 = f;
        DpptWorldMapManager2.C3 = true;
    }

    @Override
    public final float Bc() {
        return 67.0f;
    }

    @Override
    public final void M9() {
        DpptWorldMapManager DpptWorldMapManager2 = this;
        DpptWorldMapManager2.uZ.zo0 = 67.0f;
        DpptWorldMapManager2.C3 = false;
    }

    @Override
    public final String g80() {
        String string = "\n\nMapHeader:";
        if (this.K60 != null) {
            string = AN.nK0(AN.nK0(AN.nK0("\n\nMapHeader:\nID: " + this.K60.Ro0.O60, "\nMatrix: ").append(this.K60.i80.SM).toString(), "\nTilesetID: ").append(this.K60.Ro0.T70).toString(), "\nLight ID: ").append(this.K60.Ro0.IJ.aw0).toString();
            if (this.k1 != null) {
                string = AN.nK0(string, "\nClearColor: ").append(this.k1.Ak0).toString();
            }
        }
        if (this.K60 != null) {
            return AN.nK0(string, "\n\nCameras:\nPosition: ").append(this.uZ.x90).append("\nTarget: ").append(this.uZ.rj).append("\nDIST: ").append(this.uZ.Rg0).append("\nYAW: ").append(this.uZ.Q30).append("\nPITCH: ").append(this.uZ.d00).toString();
        }
        return string;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void Lo0(boolean bl) {
        this.Hq.np(tw0_0.e60.jB0.L8.ze0);
        I2 i2 = this.qf.ZD();
        while (i2.hasNext()) {
            I2 i22 = ((nv0_0)i2.next()).yf0.ZD();
            while (i22.hasNext()) {
                Ou0 ou02 = (Ou0)i22.next();
                this.VN.jG0.np(this.Hq).dz0(0.125f);
                this.VN.Xa0.np(this.Hq).if$(0.125f);
                ly0_0 ly0_02 = this.VN;
                C8 c8 = ly0_02.jG0;
                ly0_02.nF(c8, ly0_02.Xa0);
                if (ou02.yI0.equalsIgnoreCase("pc01") && ou02.Mp0.hC0(this.VN)) {
                    ou02.Ey(bl ? "pc_moni_on" : "pc_moni_off", false, null);
                }
            }
        }
    }

    @Override
    public final void IK() {
        CF0 fy0_02 = this.at0;
        if (fy0_02 != null) {
            pw_1.xC().p1(0.5f).y80(ao_1.DX(((CF0)fy0_02).zF, 0, 1.0f).Om0(0.5f, 0.5f, 0.5f, 1.0f)).Ms(tw0_0.LD0.Ov);
        }
    }

    @Override
    public final boolean yp(byte by) {
        return by == 3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void KY() {
        block10: {
            float f;
            float f2;
            C8 c8;
            C8 c82;
            block9: {
                Object object;
                block8: {
                    object = tw0_0.e60.jB0;
                    if (this.COM4 == null) break block8;
                    c82 = vo_2.ez.np(this.uZ.v40);
                    c8 = this.uZ.rj;
                    break block9;
                }
                if (object == null) break block10;
                DpptWorldMapManager DpptWorldMapManager2 = this;
                af0_0.SS.bk();
                com6__1.WI0.Ih();
                DpptWorldMapManager2.Be((E90)object, this.uZ, true);
                object = vo_2.ez;
                C8 c83 = this.uZ.rj;
                f2 = c83.x;
                f = c83.y;
                float f3 = c83.z;
                ((C8)object).np(this.uZ.v40).Vy(f2, f, f3);
                if (DpptWorldMapManager2.kp0) {
                    c82 = ((C8)object).np(this.RX.v40);
                    c8 = this.RX.rj;
                } else {
                    c82 = ((C8)object).np(this.uZ.v40);
                    c8 = this.uZ.rj;
                }
            }
            float f4 = c8.x;
            f2 = c8.y;
            f = c8.z;
            c82.Vy(f4, f2, f);
        }
        if (!this.fX) {
            BR bR = tw0_0.rl;
            if (bR.Sy) {
                bR.Sy = false;
                tw0_0.e60.jB0.L8.Np0 = false;
                tw0_0.e60.jB0.il0.LE(nk_0.Nw);
            } else {
                bR.kg0();
            }
            nf_0.zo0().w30(500, false);
        }
    }
}
