package cn.pokemmo.rom.nds.model;

import f.*;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.utils.BufferUtils;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.util.Iterator;

public class NitroModelRenderer extends jk0_1 {
    public Ou0 YB;
    public wd_0 ka;
    public u4_0 bp0;

    public NitroModelRenderer(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    public NitroModelRenderer(MappedByteBuffer mappedByteBuffer, Ou0 ou0) {
        super(mappedByteBuffer);
        Iq(ou0);
    }

    public final Ou0 Yz(u4_0 u4_0Var) {
        if (this.ka == null) {
            this.ka = LL(u4_0Var);
            this.bp0 = u4_0Var;
        }
        if (this.YB == null) {
            wd_0 wd_0Var = this.ka;
            Ou0 ou0 = new Ou0(wd_0Var, wd_0Var.Ku0, wd_0Var.Xj, this.bp0);
            this.YB = ou0;
            ou0.xg0(this.ka.HE0, this.ka.lG);
        }
        return this.YB;
    }

    public final wd_0 LL(u4_0 u4_0Var) {
        if (this.ka != null) {
            return this.ka;
        }
        wd_0 wd_0Var = new wd_0();
        this.bw0.get();
        wd_0Var.Ku0 = TM();
        wd_0Var.Xj = this.bw0.getFloat();
        wd_0Var.HE0 = bH();
        wd_0Var.lG = bH();
        short s = this.bw0.getShort();
        for (int i = 0; i < s; i++) {
            byte b = this.bw0.get();
            kz_0[] kz_0Arr = new kz_0[b];
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < b; i4++) {
                int i5 = this.bw0.getInt();
                if ((i5 & 1) != 0) {
                    kz_0Arr[i4] = new kz_0(1, 3, "a_position");
                }
                if ((i5 & 2) != 0) {
                    kz_0Arr[i4] = new kz_0(2, 4, 5126, false, "a_color");
                }
                if ((i5 & 16) != 0) {
                    int i6 = i2 + 1;
                    kz_0Arr[i4] = new kz_0(16, 2, yr_1.pG("a_texCoord", i2), i2);
                    i2 = i6;
                }
                if ((i5 & 8) != 0) {
                    kz_0Arr[i4] = new kz_0(8, 3, "a_normal");
                }
                if ((i5 & 64) != 0) {
                    int i7 = i3 + 1;
                    kz_0Arr[i4] = new kz_0(64, 2, yr_1.pG("a_boneWeight", i3), i3);
                    i3 = i7;
                }
            }
            int i8 = this.bw0.getInt();
            int position = this.bw0.position();
            int i9 = i8 * 4;
            this.bw0.position(position + i9);
            int i10 = this.bw0.getShort() & 65535;
            int position2 = this.bw0.position();
            int i11 = i10 * 2;
            this.bw0.position(position2 + i11);
            int position3 = this.bw0.position();
            sa_0 sa_0Var = new sa_0(kz_0Arr);
            ap0_0 ap0_0Var = new ap0_0(true, i8 / (sa_0Var.u5 / 4), i10, sa_0Var);
            this.bw0.position(position);
            BufferUtils.KJ(this.bw0, ap0_0Var.COM6.st0(true), i9);
            this.bw0.position(position2);
            BufferUtils.KJ(this.bw0, ap0_0Var.Sw0.st0(true), i11);
            this.bw0.position(position3);
            wd_0Var.iM.Ue0(ap0_0Var);
            wd_0Var.By.Ue0(ap0_0Var);
        }
        short s2 = this.bw0.getShort();
        for (int i12 = 0; i12 < s2; i12++) {
            U30 u30 = new U30();
            u30.Xj = TM();
            u30.m8 = (ap0_0) wd_0Var.By.get(this.bw0.getInt());
            MI(u30.T4);
            MI(u30.Y7);
            u30.ep0 = this.bw0.getFloat();
            u30.d30 = this.bw0.getInt();
            u30.I8 = this.bw0.getInt();
            u30.bJ0 = 4;
            wd_0Var.a50.Ue0(u30);
        }
        nb_2 nb_2Var = new nb_2();
        byte b2 = this.bw0.get();
        for (int i13 = 0; i13 < b2; i13++) {
            BM bm = new BM();
            bm.mi = TM();
            int i14 = this.bw0.getInt();
            if ((i14 & 1) != 0) {
                bm.LPT8(new pr_1(pr_1.av, this.bw0.getInt()));
            }
            if ((i14 & 2) != 0) {
                bm.LPT8(new ma_1(this.bw0.getInt(), true));
            }
            if ((i14 & 4) != 0) {
                bm.LPT8(new PRN_(PRN_.xE, this.bw0.getFloat(), this.bw0.getFloat(), this.bw0.getFloat(), this.bw0.getFloat()));
            }
            if ((i14 & 8) != 0) {
                bm.LPT8(new xd_2(xd_2.DK0, this.bw0.getInt()));
            }
            if ((i14 & 16) != 0) {
                bm.LPT8(new sh_0(this.bw0.getFloat()));
                bm.LPT8(new mb0_2(mb0_2.k6, 0.01F));
            }
            if ((i14 & 32) != 0) {
                bm.LPT8(new ha_1(this.bw0.getShort()));
                u4_0Var.getClass();
                wd_0Var.iM.Ue0(null);
                throw null;
            }
            Texture texture;
            if (nb_2Var.fl(bm.mi)) {
                texture = (Texture) nb_2Var.Wk0(bm.mi);
            } else {
                texture = u4_0Var.De0(bm.mi);
                nb_2Var.WK0(bm.mi, texture);
                wd_0Var.iM.Ue0(texture);
            }
            B90 b90 = new B90(texture, texture.getMinFilter(), texture.getMagFilter(), texture.getUWrap(), texture.getVWrap());
            bm.LPT8(new mz_2(mz_2.g7, b90, 0.0F, 0.0F, 1.0F, 1.0F));
            wd_0Var.Cs.Ue0(bm);
        }
        byte b3 = this.bw0.get();
        for (int i15 = 0; i15 < b3; i15++) {
            wd_0Var.Wc0.Ue0(fE(wd_0Var));
        }
        byte b4 = this.bw0.get();
        for (int i16 = 0; i16 < b4; i16++) {
            ji0_2 ji0_2Var = new ji0_2();
            ji0_2Var.Ys0 = TM();
            ji0_2Var.Oj = this.bw0.getFloat();
            int i17 = this.bw0.getInt();
            for (int i18 = 0; i18 < i17; i18++) {
                yg0_0 yg0_0Var = new yg0_0();
                yg0_0Var.Cr = Xz0.ry0(wd_0Var.Wc0, TM(), true);
                int i19 = this.bw0.getInt();
                if (i19 > 0) {
                    yg0_0Var.TK = new es_1(i19);
                    for (int i20 = 0; i20 < i19; i20++) {
                        yg0_0Var.TK.Ue0(new li0_2(this.bw0.getFloat(), bH()));
                    }
                }
                int i21 = this.bw0.getInt();
                if (i21 > 0) {
                    yg0_0Var.l = new es_1(i21);
                    for (int i22 = 0; i22 < i21; i22++) {
                        float f = this.bw0.getFloat();
                        me0_2 me0_2Var = null;
                        if (this.bw0.get() == 4) {
                            me0_2Var = new me0_2(this.bw0.getFloat(), this.bw0.getFloat(), this.bw0.getFloat(), this.bw0.getFloat());
                        }
                        yg0_0Var.l.Ue0(new li0_2(f, me0_2Var));
                    }
                }
                int i23 = this.bw0.getInt();
                if (i23 > 0) {
                    yg0_0Var.HG = new es_1(i23);
                    for (int i24 = 0; i24 < i23; i24++) {
                        yg0_0Var.HG.Ue0(new li0_2(this.bw0.getFloat(), bH()));
                    }
                }
                ji0_2Var.jl.Ue0(yg0_0Var);
            }
            wd_0Var.AF.Ue0(ji0_2Var);
        }
        return wd_0Var;
    }

    public final void Iq(Ou0 ou0) {
        ut_0 ut_0Var = ou0.hW;
        this.bw0.put((byte) 1);
        q30(ou0.yI0);
        this.bw0.putFloat(ou0.oU);
        COM3(ou0.Mp0.jG0);
        COM3(ou0.Mp0.Xa0);
        this.bw0.putShort((short) ut_0Var.By.KB);
        I2 ZD = ut_0Var.By.ZD();
        while (ZD.hasNext()) {
            ap0_0 ap0_0Var = (ap0_0) ZD.next();
            this.bw0.put((byte) ap0_0Var.COM6.JP().Os.length);
            Iterator it = ap0_0Var.COM6.JP().iterator();
            while (((Es0) it).hasNext()) {
                this.bw0.putInt(((kz_0) ((Es0) it).next()).tM);
            }
            int Ew0 = ap0_0Var.COM6.Ew0() * (ap0_0Var.COM6.JP().u5 / 4);
            float[] gK = ap0_0Var.gK(Ew0, new float[Ew0]);
            this.bw0.putInt(Ew0);
            for (int i = 0; i < Ew0; i++) {
                this.bw0.putFloat(gK[i]);
            }
            int Kd = ap0_0Var.Sw0.Kd();
            short[] sArr = new short[Kd];
            ap0_0Var.DH(Kd, sArr);
            this.bw0.putShort((short) Kd);
            for (int i2 = 0; i2 < Kd; i2++) {
                this.bw0.putShort(sArr[i2]);
            }
        }
        this.bw0.putShort((short) ut_0Var.a50.KB);
        I2 ZD2 = ut_0Var.a50.ZD();
        while (ZD2.hasNext()) {
            U30 u30 = (U30) ZD2.next();
            q30(u30.Xj);
            this.bw0.putInt(ut_0Var.By.E8(u30.m8, true));
            COM3(u30.T4);
            COM3(u30.Y7);
            this.bw0.putFloat(u30.ep0);
            this.bw0.putInt(u30.d30);
            this.bw0.putInt(u30.I8);
        }
        this.bw0.put((byte) ut_0Var.Cs.KB);
        I2 ZD3 = ut_0Var.Cs.ZD();
        while (ZD3.hasNext()) {
            BM bm = (BM) ZD3.next();
            q30(bm.mi);
            long j = pr_1.av;
            boolean tM = bm.tM(j);
            long j2 = ma_1.ZL;
            boolean tM2 = bm.tM(j2);
            long j3 = PRN_.xE;
            boolean tM3 = bm.tM(j3);
            long j4 = xd_2.DK0;
            boolean tM4 = bm.tM(j4);
            long j5 = sh_0.vF0;
            boolean tM5 = bm.tM(j5);
            long j6 = ha_1.vh0;
            boolean tM6 = bm.tM(j6);
            int i3 = tM ? 1 : 0;
            if (tM2) {
                i3 |= 2;
            }
            if (tM3) {
                i3 |= 4;
            }
            if (tM4) {
                i3 |= 8;
            }
            if (tM5) {
                i3 |= 16;
            }
            if (tM6) {
                i3 |= 32;
            }
            this.bw0.putInt(i3);
            if (tM) {
                this.bw0.putInt(((pr_1) bm.sg(j)).ps);
            }
            if (tM2) {
                this.bw0.putInt(((ma_1) bm.sg(j2)).BA0);
            }
            if (tM3) {
                Color color = ((PRN_) bm.sg(j3)).v50;
                this.bw0.putFloat(color.r);
                this.bw0.putFloat(color.g);
                this.bw0.putFloat(color.b);
                this.bw0.putFloat(color.a);
            }
            if (tM4) {
                this.bw0.putInt(((xd_2) bm.sg(j4)).Ch0);
            }
            if (tM5) {
                this.bw0.putFloat(((sh_0) bm.sg(j5)).yt);
            }
            if (tM6) {
                this.bw0.putShort(((ha_1) bm.sg(j6)).PK);
            }
        }
        this.bw0.put((byte) ut_0Var.Wc0.KB);
        I2 ZD4 = ut_0Var.Wc0.ZD();
        while (ZD4.hasNext()) {
            RG(ut_0Var, (Xz0) ZD4.next());
        }
        this.bw0.put((byte) ut_0Var.AF.KB);
        I2 ZD5 = ut_0Var.AF.ZD();
        while (ZD5.hasNext()) {
            ji0_2 ji0_2Var = (ji0_2) ZD5.next();
            q30(ji0_2Var.Ys0);
            this.bw0.putFloat(ji0_2Var.Oj);
            this.bw0.putInt(ji0_2Var.jl.KB);
            I2 ZD6 = ji0_2Var.jl.ZD();
            while (ZD6.hasNext()) {
                yg0_0 yg0_0Var = (yg0_0) ZD6.next();
                q30(yg0_0Var.Cr.mw);
                es_1 es_1Var = yg0_0Var.TK;
                if (es_1Var != null) {
                    this.bw0.putInt(es_1Var.KB);
                    I2 ZD7 = yg0_0Var.TK.ZD();
                    while (ZD7.hasNext()) {
                        li0_2 li0_2Var = (li0_2) ZD7.next();
                        this.bw0.putFloat(li0_2Var.Ls0);
                        COM3((C8) li0_2Var.Yo);
                    }
                } else {
                    this.bw0.putInt(0);
                }
                es_1 es_1Var2 = yg0_0Var.l;
                if (es_1Var2 != null) {
                    this.bw0.putInt(es_1Var2.KB);
                    I2 ZD8 = yg0_0Var.l.ZD();
                    while (ZD8.hasNext()) {
                        li0_2 li0_2Var2 = (li0_2) ZD8.next();
                        this.bw0.putFloat(li0_2Var2.Ls0);
                        me0_2 me0_2Var = (me0_2) li0_2Var2.Yo;
                        if (me0_2Var == null) {
                            this.bw0.put((byte) 0);
                        } else {
                            this.bw0.put((byte) 4);
                            this.bw0.putFloat(me0_2Var.m1);
                            this.bw0.putFloat(me0_2Var.ao0);
                            this.bw0.putFloat(me0_2Var.th);
                            this.bw0.putFloat(me0_2Var.Au0);
                        }
                    }
                } else {
                    this.bw0.putInt(0);
                }
                es_1 es_1Var3 = yg0_0Var.HG;
                if (es_1Var3 != null) {
                    this.bw0.putInt(es_1Var3.KB);
                    I2 ZD9 = yg0_0Var.HG.ZD();
                    while (ZD9.hasNext()) {
                        li0_2 li0_2Var3 = (li0_2) ZD9.next();
                        this.bw0.putFloat(li0_2Var3.Ls0);
                        COM3((C8) li0_2Var3.Yo);
                    }
                } else {
                    this.bw0.putInt(0);
                }
            }
        }
    }

    public final Xz0 fE(wd_0 wd_0Var) {
        Xz0 xz0 = new Xz0();
        xz0.mw = TM();
        MI(xz0.BI0);
        me0_2 me0_2Var = xz0.RG;
        if (this.bw0.get() == 4) {
            me0_2Var.m1 = this.bw0.getFloat();
            me0_2Var.ao0 = this.bw0.getFloat();
            me0_2Var.th = this.bw0.getFloat();
            me0_2Var.Au0 = this.bw0.getFloat();
        }
        MI(xz0.Fc0);
        byte b = this.bw0.get();
        for (int i = 0; i < b; i++) {
            xz0.lPt7(fE(wd_0Var));
        }
        byte b2 = this.bw0.get();
        for (int i2 = 0; i2 < b2; i2++) {
            I20 i20 = new I20();
            i20.d40 = (U30) wd_0Var.a50.get(this.bw0.getInt());
            i20.jK0 = (BM) wd_0Var.Cs.get(this.bw0.getInt());
            byte b3 = this.bw0.get();
            if (b3 > 0) {
                i20.RQ = new cf_2(b3);
            }
            for (int i3 = 0; i3 < b3; i3++) {
                Xz0 xz02 = new Xz0();
                xz02.mw = TM();
                i20.RQ.n3(xz02, new Matrix4(v()));
            }
            xz0.sJ0.Ue0(i20);
        }
        return xz0;
    }

    public final void RG(ut_0 ut_0Var, Xz0 xz0) {
        q30(xz0.mw);
        COM3(xz0.BI0);
        me0_2 me0_2Var = xz0.RG;
        if (me0_2Var == null) {
            this.bw0.put((byte) 0);
        } else {
            this.bw0.put((byte) 4);
            this.bw0.putFloat(me0_2Var.m1);
            this.bw0.putFloat(me0_2Var.ao0);
            this.bw0.putFloat(me0_2Var.th);
            this.bw0.putFloat(me0_2Var.Au0);
        }
        COM3(xz0.Fc0);
        this.bw0.put((byte) xz0.yn.KB);
        I2 ZD = xz0.yn.ZD();
        while (ZD.hasNext()) {
            RG(ut_0Var, (Xz0) ZD.next());
        }
        this.bw0.put((byte) xz0.sJ0.KB);
        I2 ZD2 = xz0.sJ0.ZD();
        while (ZD2.hasNext()) {
            I20 i20 = (I20) ZD2.next();
            this.bw0.putInt(ut_0Var.a50.E8(i20.d40, true));
            this.bw0.putInt(ut_0Var.Cs.E8(i20.jK0, true));
            cf_2 cf_2Var = i20.RQ;
            if (cf_2Var != null) {
                this.bw0.put((byte) cf_2Var.tb0);
                sf0_1 ED = i20.RQ.ED();
                while (ED.hasNext()) {
                    xn_1 xn_1Var = (xn_1) ED.next();
                    q30(((Xz0) xn_1Var.I20).mw);
                    float[] fArr = ((Matrix4) xn_1Var.kM).EW;
                    this.bw0.putInt(fArr.length);
                    for (float f : fArr) {
                        this.bw0.putFloat(f);
                    }
                }
            } else {
                this.bw0.put((byte) 0);
            }
        }
    }
}
