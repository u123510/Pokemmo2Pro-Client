// 
// Decompiled by Procyon v0.6.0
// 

package cn.pokemmo.util.time;

import f.*;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateTimeFormatUtils
{
    public final qu_2 fL0;
    public final boolean Zo0;
    public final lo0_0 qk;
    public final fy_2 Ey;
    public final cn_0 GA;
    public final dj_1 FK0;
    public short GM;
    public St0[] re0;
    
    public DateTimeFormatUtils(final qu_2 fl0, final boolean zo0) {
        this.GM = 0;
        this.fL0 = fl0;
        this.Zo0 = zo0;
        this.Ey = new fy_2();
        final lo0_0 lo0_0 = new lo0_0();
        final lo0_0 qk;
        final lo0_0 lo0_2 = qk = lo0_0;
        new lo0_0();
        this.qk = qk;
        lo0_0.uf("mail-inner");
        if (tw0_0.kz0()) {
            lo0_2.Qs0(3);
        }
        this.GA = new cn_0();
        this.FK0 = new dj_1(this);
    }
    
    public final void F5(final fy_2 fy_2) {
        this.Ey.em();
        this.Ey.COm3();
        final fy_2 ey = this.Ey;
        final I7 sa = XN.sA(ey, ey);
        final ya_1[] array = { null };
        final int n = 0;
        final fy_2 ey2 = this.Ey;
        final int n2 = n;
        final Hm0 fe0 = D5.fE0(ey2, ey2);
        final ya_1[] array2 = new ya_1[3];
        final ya_1[] array3;
        (array3 = array2)[0] = this.Ey.C7(this.GA);
        array3[1] = this.Ey.C7(this.qk, fy_2);
        final int n3 = 2;
        final fy_2 ey3 = this.Ey;
        final int n4 = n3;
        ey3.getClass();
        array2[n4] = new I7(ey3).Ze0().Kn0(this.FK0).Ze0();
        array[n2] = fe0.Xq(array2);
        ey.WQ(sa.Xq(array).Ze0());
        final fy_2 ey4 = this.Ey;
        final I7 sa2 = XN.sA(ey4, ey4);
        final ya_1[] array4 = new ya_1[3];
        final ya_1[] array5;
        (array5 = array4)[0] = this.Ey.hb(this.GA);
        array5[1] = this.Ey.hb(this.qk, fy_2);
        array4[2] = this.Ey.hb(this.FK0);
        ey4.x40(sa2.Xq(array4));
    }
    
    public final void um() {
        final le0_2 fe;
        if ((fe = this.qk.Fe) != null) {
            fe.em();
        }
        String s;
        if (this.Zo0) {
            s = sm0_0.c0(5828);
        }
        else {
            s = sm0_0.c0(5836);
        }
        final cn_0 cn_2 = new cn_0(null, 0);
        final cn_0 cn_0 = cn_2;
        final String s2 = s;
        cn_0.Sk(s2);
        cn_0.uf("button");
        final cn_0 cn_3;
        (cn_3 = new cn_0(null, 0)).Sk(sm0_0.c0(5829));
        final cn_0 cn_4;
        (cn_4 = new cn_0(null, 0)).Sk(sm0_0.c0(5837));
        final cn_0 cn_5 = new cn_0();
        cn_0 cn_6 = cn_5;
        final cn_0 cn_7 = cn_4;
        final cn_0 cn_8 = cn_3;
        final cn_0 cn_9 = cn_2;
        final cn_0 cn_10 = cn_6;
        final String c0 = sm0_0.c0(5838);
        new cn_0(null, 0);
        cn_10.Sk(c0);
        cn_9.uf("label-title-small2");
        cn_8.uf("label-title-medium");
        cn_7.uf("label-title-small2");
        cn_5.uf("label-title-smallest");
        final fy_2 fy_2 = new fy_2();
        fy_2.WQ(new Hm0(fy_2));
        fy_2.x40(new I7(fy_2));
        final ya_1 pj0 = fy_2.pJ0;
        final le0_2[] array2;
        final le0_2[] array = array2 = new le0_2[4];
        array[0] = cn_2;
        array[1] = cn_3;
        array[2] = cn_4;
        final int n = 3;
        le0_2 le0_2;
        if (this.Zo0) {
            le0_2 = null;
        }
        else {
            le0_2 = cn_6;
        }
        final ya_1 ya_1 = pj0;
        array2[n] = le0_2;
        ya_1.X20(fy_2.C7(array2));
        final ya_1 l4 = fy_2.L4;
        final le0_2[] array4;
        final le0_2[] array3 = array4 = new le0_2[4];
        array3[0] = cn_2;
        array3[1] = cn_3;
        array3[2] = cn_4;
        final int n2 = 3;
        if (this.Zo0) {
            cn_6 = null;
        }
        final ya_1 ya_2 = l4;
        array4[n2] = cn_6;
        ya_2.X20(fy_2.hb(array4));
        final cn_0 ga = this.GA;
        String bx;
        if (this.Zo0) {
            bx = " ";
        }
        else {
            bx = sm0_0.Bx(5839, fp0_0.uD(new StringBuilder(), tw0_0.rl.cn, ""), "250");
        }
        ga.Sk(bx);
        final St0[] re0;
        if ((re0 = this.re0) != null) {
            for (int length = re0.length, i = 0; i < length; ++i) {
                final St0 st0 = re0[i];
                final Runnable runnable = () -> this.MA0(st0);
                xe_1 xe_1 = null;
                Label_0510: {
                    xe_1 xe_3;
                    int gh0;
                    if (this.Zo0) {
                        String cr0;
                        if ((cr0 = st0.cr0).isEmpty()) {
                            cr0 = "???";
                        }
                        final String s3 = cr0;
                        xe_1 = new xe_1(cr0);
                        if (s3.length() <= 7) {
                            break Label_0510;
                        }
                        final xe_1 xe_2 = xe_3 = xe_1;
                        final String yj0 = cr0;
                        xe_1.SU(cr0.substring(0, 6) + "...");
                        xe_2.yj0 = yj0;
                        xe_2.yB0();
                        gh0 = 150;
                    }
                    else {
                        String s4;
                        if (st0.switch$.uI0()) {
                            s4 = st0.lk0;
                        }
                        else {
                            s4 = sm0_0.dd(st0.lk0);
                        }
                        xe_1 = new xe_1(s4);
                        String s5;
                        if (st0.switch$.uI0()) {
                            s5 = st0.lk0;
                        }
                        else {
                            s5 = sm0_0.dd(st0.lk0);
                        }
                        if (s5.length() <= 7) {
                            break Label_0510;
                        }
                        final StringBuilder sb = new StringBuilder();
                        String s6;
                        if (st0.switch$.uI0()) {
                            s6 = st0.lk0;
                        }
                        else {
                            s6 = sm0_0.dd(st0.lk0);
                        }
                        xe_1.SU(sb.append(s6.substring(0, 6)).append("...").toString());
                        String yj2;
                        if (st0.switch$.uI0()) {
                            yj2 = st0.lk0;
                        }
                        else {
                            yj2 = sm0_0.dd(st0.lk0);
                        }
                        final xe_1 xe_4 = xe_3 = xe_1;
                        xe_4.yj0 = yj2;
                        xe_4.yB0();
                        gh0 = 150;
                    }
                    xe_3.GH0 = gh0;
                }
                xe_1.RR(runnable);
                String s7;
                if (st0.switch$.uI0()) {
                    s7 = st0.DN;
                }
                else {
                    s7 = sm0_0.dd(st0.DN);
                }
                final xe_1 xe_6 = new xe_1(s7);
                final xe_1 xe_5 = xe_6;
                final Runnable runnable2 = runnable;
                xe_5.RR(runnable2);
                String s8;
                if (st0.switch$.uI0()) {
                    s8 = st0.DN;
                }
                else {
                    s8 = sm0_0.dd(st0.DN);
                }
                if (s8.length() > 12) {
                    final StringBuilder sb2 = new StringBuilder();
                    String s9;
                    if (st0.switch$.uI0()) {
                        s9 = st0.DN;
                    }
                    else {
                        s9 = sm0_0.dd(st0.DN);
                    }
                    xe_6.SU(sb2.append(s9.substring(0, 11)).append("...").toString());
                    String yj3;
                    if (st0.switch$.uI0()) {
                        yj3 = st0.DN;
                    }
                    else {
                        yj3 = sm0_0.dd(st0.DN);
                    }
                    final xe_1 xe_7 = xe_6;
                    xe_7.yj0 = yj3;
                    xe_7.yB0();
                    xe_7.GH0 = 150;
                }
                final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                final Date date;
                (date = new Date()).setTime(st0.F6 * 1000L);
                final xe_1 xe_8 = new xe_1(simpleDateFormat.format(date));
                final xe_1 xe_9 = xe_8;
                final Runnable runnable3 = runnable;
                xe_8.RR(runnable3);
                xe_1 xe_10;
                final qj_2 qj_2 = (qj_2)(xe_10 = new qj_2("", 0, 0));
                qj_2.tp0.r8(fn_0.qz0().S7);
                final Br0 tp0 = qj_2.tp0;
                int gy;
                if (tw0_0.kz0()) {
                    gy = 30;
                }
                else {
                    gy = 21;
                }
                int n3;
                if (tw0_0.kz0()) {
                    n3 = 10;
                }
                else {
                    n3 = 6;
                }
                final xe_1 xe_11 = xe_10;
                final xe_1 xe_12 = xe_10;
                final Br0 br0 = tp0;
                final int a4 = n3;
                tp0.gY = gy;
                br0.a4 = a4;
                xe_11.RR(() -> this.CF(qj_2, st0));
                if (st0.Vf == 1 && !this.Zo0) {
                    final xe_1 xe_13 = xe_10;
                    final xe_1 xe_14 = xe_9;
                    final xe_1 xe_15 = xe_6;
                    xe_1.uf("label-title-small2");
                    xe_15.uf("label-title-medium");
                    xe_14.uf("label-title-small2");
                    xe_13.uf("label-title-smallest");
                }
                else {
                    final xe_1 xe_16 = xe_10;
                    final xe_1 xe_17 = xe_9;
                    final xe_1 xe_18 = xe_6;
                    xe_1.uf("label-value-small2");
                    xe_18.uf("label-value-medium");
                    xe_17.uf("label-value-small2");
                    xe_16.uf("label-value-smallest");
                }
                final ya_1 pj2 = fy_2.pJ0;
                final le0_2[] array6;
                final le0_2[] array5 = array6 = new le0_2[4];
                array5[0] = xe_1;
                array5[1] = xe_6;
                array5[2] = xe_9;
                final int n4 = 3;
                le0_2 le0_3;
                if (this.Zo0) {
                    le0_3 = null;
                }
                else {
                    le0_3 = xe_10;
                }
                final ya_1 ya_3 = pj2;
                array6[n4] = le0_3;
                ya_3.X20(fy_2.C7(array6));
                final ya_1 l5 = fy_2.L4;
                final le0_2[] array8;
                final le0_2[] array7 = array8 = new le0_2[4];
                array7[0] = xe_1;
                array7[1] = xe_6;
                array7[2] = xe_9;
                final int n5 = 3;
                if (this.Zo0) {
                    xe_10 = null;
                }
                final ya_1 ya_4 = l5;
                array8[n5] = xe_10;
                ya_4.X20(fy_2.hb(array8));
            }
            if (this.re0.length == 0) {
                final xe_1 xe_19;
                (xe_19 = new xe_1(sm0_0.c0(1655))).uf("label-value-small");
                fy_2.pJ0.X20(fy_2.C7(xe_19));
                fy_2.L4.X20(fy_2.hb(xe_19));
            }
        }
        else {
            final xe_1 xe_20;
            (xe_20 = new xe_1(sm0_0.c0(nf0_0.EC0))).uf("label-value-small");
            fy_2.pJ0.X20(fy_2.C7(xe_20));
            fy_2.L4.X20(fy_2.hb(xe_20));
        }
        this.qk.AH0(fy_2);
    }
    
    public final void RE0(final short gm) {
        this.GM = gm;
        tw0_0.rl.fk0.uQ(new cs_2(gm, this.Zo0));
        final dj_1 fk0 = this.FK0;
        short n;
        if (this.Zo0) {
            n = tw0_0.rl.CON;
        }
        else {
            n = tw0_0.rl.cn;
        }
        fk0.JK0(gm, n);
        this.re0 = null;
        this.um();
    }
    
    public final void CF(final qj_2 qj_2, final St0 st0) {
        qj_2.pw0(false);
        tw0_0.rl.fk0.uQ(new mr_1(st0.Tp, this.GM));
    }
    
    public final void MA0(final St0 st0) {
        this.fL0.getClass();
        tw0_0.rl.fk0.uQ(new dj0_1(st0.Tp));
    }
}

