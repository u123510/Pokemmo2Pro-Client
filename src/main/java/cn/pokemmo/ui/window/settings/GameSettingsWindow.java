// 
// Decompiled by Procyon v0.6.0
// 

package cn.pokemmo.ui.window.settings;

import f.*;

import com.badlogic.gdx.backends.lwjgl3.angle.ANGLELoader;
import java.util.concurrent.ScheduledFuture;
import java.util.function.Consumer;
import java.util.stream.Stream;
import org.lwjgl.glfw.GLFW;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * 游戏系统主设置窗口
 *
 * 原混淆类: f.QC
 */
public class GameSettingsWindow extends cx_0 implements tr_1
 {
    public final QC asBridge() {
        return (QC) (Object) this;
    }

    public static final dl_1 Bq0;
    public final Qy0 dw;
    public final fy_2 ET;
    public final xe_1 N30;
    public final X6 dq;
    public final X6 TH;
    public final oa0_0 coM4;
    public final pg0_2 kb;
    public final X6 iL;
    public final oa0_0 xE;
    public final Aj Sd;
    public final Aj Mn;
    public final oa0_0 OM;
    public final oa0_0 Bw0;
    public final X6 d9;
    public final oa0_0 ym;
    public final Aj iy;
    public final oa0_0 p0;
    public final oa0_0 Rt;
    public final oa0_0 COM9;
    public final oa0_0 PC;
    public final oa0_0 xP;
    public final X6 CW;
    public final oa0_0 da0;
    public boolean Lz0;
    public com7__2 a;
    public byte rt0;
    public final Aj id;
    public final Aj Yx0;
    public final Aj WV;
    public final oa0_0 RC;
    public final oa0_0 Vn;
    public final Aj ey0;
    public final pg0_2 oG0;
    public final X6 lI0;
    public final pg0_2 FF;
    public final CL0 yx0;
    public final Aj i70;
    public final oa0_0 vj0;
    public final oa0_0 Dr;
    public final oa0_0 oi;
    public final pg0_2 Zb0;
    public final AG Rj;
    public final pg0_2 Gc0;
    public final Du0 aS;
    public final pg0_2 pY;
    public final vb_0 Le;
    public final X6 Z3;
    public final oa0_0 sW;
    public final oa0_0 es;
    public final oa0_0 fX;
    public final oa0_0 jv;
    public final oa0_0 na0;
    public final X6 Hh0;
    public final X6 Qv;
    public final oa0_0 Xl;
    public final oa0_0 vN;
    public final oa0_0 vo;
    public final oa0_0 Bc;
    public final oa0_0 Com2;
    public final oa0_0 rz0;
    public final oa0_0 YH;
    public final oa0_0 LPT7;
    public final oa0_0 yF0;
    public final X6 Yh;
    public final oa0_0 ic0;
    public final oa0_0 U80;
    public final oa0_0 oH0;
    public final X6 G80;
    public final Aj eF0;
    public final Aj i50;
    public final X6 class$;
    public final String[] tT;
    public final X6 Hd;
    public final X6 qD0;
    public final X6 jP;
    public final Aj C7;
    public final oa0_0 GX;
    public final up_0[] r7;
    public final is_1 z80;
    public final is_1 aO;
    public final is_1 L00;
    public final is_1 QE0;
    public final is_1 f10;
    public final is_1 Nf;
    public final oa0_0 dg;
    public final oa0_0 zf0;
    public final Cv0 lpt6;
    public final Cv0 dx0;
    public final Cv0 W8;
    public final Cv0 Za;
    public final Cv0 jr0;
    public final Cv0 Nt0;
    public final boolean Zu0;
    public final in_2 fs;
    
    public GameSettingsWindow(final Qy0 dw) {
        super(tw0_0.kz0());
        this.Lz0 = false;
        this.rt0 = dw_2.L90;
        this.fs = new in_2(250);
        this.dw = dw;
        this.Pb0(new ue_1(asBridge()));
        this.ET = new fy_2();
        final BR rl;
        e30_0 ex;
        if ((rl = tw0_0.rl) == null) {
            ex = null;
        }
        else {
            ex = rl.ex();
        }
        this.Zu0 = (ex != null);
        this.uf("settings-panel");
        this.Hy(sm0_0.c0(1200));
        final pg0_2 pg0_2 = new pg0_2((Object[])WN.YG());
        final X6 dq;
        final X6 x6 = dq = new X6(pg0_2);
        this.dq = dq;
        x6.hK(dw_2.IK0());
        x6.Rm0(this::pW);
        if (pg0_2.ul0() < 2) {
            dq.pw0(false);
        }
        final cn_0 cn_0 = new cn_0(sm0_0.c0(1217));
        final cn_0 cn_2 = cn_0;
        final X6 x7 = dq;
        final cn_0 cn_3 = cn_2;
        cn_3.Xr0(sm0_0.c0(1218));
        cn_0.coM8(x7);
        cn_0.uf("label-settings-title");
        final rs_0 rs_0 = new rs_0(new le0_2[] { dq });
        final String[] array = new String[3];
        for (int i = 0; i < 3; ++i) {
            final String[] array2 = array;
            final int n = i;
            array2[n] = sm0_0.c0(n + 1271);
        }
        le0_2 le0_2 = null;
        le0_2 le0_3 = null;
        if (qt_1.yr0() == qt_1.Pl0) {
            final pg0_2 pg0_3 = new pg0_2((Object[])dw_2.ww);
            final X6 cw;
            final X6 x8 = cw = new X6(pg0_3);
            this.CW = cw;
            x8.hK(dw_2.i2);
            if (pg0_3.ul0() < 2) {
                cw.pw0(false);
            }
            final cn_0 cn_4 = new cn_0(sm0_0.c0(1397));
            final cn_0 cn_5 = cn_4;
            final X6 x9 = cw;
            final cn_0 cn_6 = cn_5;
            cn_6.Xr0(sm0_0.c0(1359));
            cn_4.coM8(x9);
            cn_4.uf("label-settings-title");
            final rs_0 rs_2 = new rs_0(new le0_2[] { cw });
            final cn_0 cn_7 = cn_5;
            le0_2 = rs_2;
            le0_3 = cn_7;
        }
        else {
            this.CW = null;
        }
        final X6 th = new X6(new pg0_2((Object[])array));
        this.TH = th;
        if (qt_1.yr0() == qt_1.qV) {
            final X6 x10 = th;
            x10.Bd(0);
            x10.pw0(false);
        }
        else {
            final byte l90;
            if ((l90 = dw_2.L90) >= 0 && l90 < 3) {
                th.Bd(l90);
            }
            th.Rm0(() -> this.Lz0 = (1 != 0));
        }
        final HashSet<com7__2> c = new HashSet<com7__2>();
        GS[] vg = null;
        try {
            vg = lg_0.S4.Vg();
            try {
                if (tw0_0.kz0()) {
                    c.add(new com7__2(1280, 720));
                }
            }
            catch (final Exception ex2) {}
        }
        catch (final Exception ex3) {}
        for (int length = vg.length, j = 0; j < length; ++j) {
            final GS gs;
            if ((gs = vg[j]) != null) {
                final int c2;
                if ((c2 = gs.c50) >= 768 || gs.Vo >= 1024) {
                    c.add(new com7__2(gs.Vo, c2));
                }
            }
        }
        c.add(this.a = new com7__2(dw_2.d70, dw_2.ag));
        final ArrayList list;
        Collections.sort((List<Comparable>)(list = new ArrayList(c)));
        final pg0_2 kb = new pg0_2(list);
        this.kb = kb;
        this.iL = new X6(kb);
        for (int k = 0; k < this.kb.ul0(); ++k) {
            if (dw_2.ag == ((com7__2)this.kb.YS(k)).T20 && dw_2.d70 == ((com7__2)this.kb.YS(k)).Ax) {
                this.iL.Bd(k);
            }
        }
        this.iL.Rm0(this::FL0);
        final cn_0 cn_9;
        final cn_0 cn_8 = cn_9 = new cn_0(sm0_0.c0(1270));
        cn_8.coM8(this.TH);
        cn_8.uf("label-settings-title");
        final cn_0 cn_11;
        final cn_0 cn_10 = cn_11 = new cn_0(sm0_0.c0(1250));
        cn_10.coM8(this.iL);
        cn_10.uf("label-settings-title");
        final rs_0 rs_3 = new rs_0(new le0_2[] { this.TH });
        final rs_0 rs_4 = new rs_0(new le0_2[] { this.iL });
        (this.coM4 = new oa0_0()).uK0(dw_2.mv);
        if (tw0_0.xj0() && tw0_0.Vp0 >= 28) {
            (this.xE = new oa0_0(600)).uK0(dw_2.kD);
        }
        else {
            this.xE = null;
        }
        if (qt_1.yr0() == qt_1.qV && !ea0_1.oR) {
            final oa0_0 da0 = new oa0_0(1223);
            (this.da0 = da0).uK0(dw_2.Nf);
            da0.yO(sm0_0.c0(1224));
        }
        else {
            this.da0 = null;
        }
        (this.fX = new oa0_0(1261)).uK0(dw_2.U8);
        final oa0_0 om = new oa0_0(1252);
        (this.OM = om).uK0(dw_2.Kr);
        om.yO(sm0_0.c0(1267));
        final oa0_0 bw0 = new oa0_0(1257);
        (this.Bw0 = bw0).uK0(dw_2.Ga0);
        bw0.yO(sm0_0.c0(1268));
        final X6 d9;
        final X6 x11 = d9 = new X6(new pg0_2((Object[])new String[] { sm0_0.c0(1287), sm0_0.c0(1289) }));
        this.d9 = d9;
        x11.Bd(dw_2.YO);
        final cn_0 cn_12 = new cn_0(sm0_0.c0(1253));
        final cn_0 cn_13 = cn_12;
        final X6 x12 = d9;
        cn_12.coM8(x12);
        cn_12.uf("label-settings-title");
        final oa0_0 lpt7 = new oa0_0(1255);
        (this.LPT7 = lpt7).uK0(dw_2.Ba);
        lpt7.yO(sm0_0.c0(1269));
        (this.yF0 = new oa0_0(1317)).uK0(dw_2.Is0);
        final X6 yh;
        final X6 x13 = yh = new X6(new pg0_2((Object[])new String[] { sm0_0.c0(6153), sm0_0.c0(6154), sm0_0.c0(6155) }));
        this.Yh = yh;
        x13.Bd(dw_2.aR);
        final cn_0 cn_14 = new cn_0(sm0_0.c0(6156));
        final cn_0 cn_15 = cn_14;
        final X6 x14 = yh;
        cn_14.coM8(x14);
        cn_14.uf("label-settings-title");
        final oa0_0 ic0 = new oa0_0(1248);
        (this.ic0 = ic0).uK0(dw_2.o70);
        ic0.yO(sm0_0.c0(1249));
        (this.na0 = new oa0_0(1258)).uK0(dw_2.b00);
        final cn_0 cn_16 = new cn_0(sm0_0.c0(1319));
        final String[] array3 = new String[3];
        for (int n2 = 0; n2 < 3; ++n2) {
            final String[] array4 = array3;
            final int n3 = n2;
            array4[n3] = sm0_0.c0(n3 + 1320);
        }
        final X6 hh0 = new X6(new pg0_2((Object[])array3));
        this.Hh0 = hh0;
        final int le;
        if ((le = dw_2.le) >= 0 && le < 3) {
            hh0.Bd(le);
        }
        else {
            hh0.Bd(1);
        }
        final cn_0 cn_17 = cn_16;
        final rs_0 rs_5 = new rs_0(new le0_2[] { hh0 });
        cn_17.uf("label-settings-title");
        final cn_0 cn_18 = new cn_0(sm0_0.c0(1318));
        final X6 qv = new X6(new pg0_2((Object[])array3));
        this.Qv = qv;
        final int zc0;
        if ((zc0 = dw_2.zC0) >= 0 && zc0 < 3) {
            qv.Bd(zc0);
        }
        else {
            qv.Bd(1);
        }
        final cn_0 cn_19 = cn_18;
        final rs_0 rs_6 = new rs_0(new le0_2[] { qv });
        cn_19.uf("label-settings-title");
        final cn_0 cn_20;
        (cn_20 = new cn_0(sm0_0.c0(1254))).uf("label-settings-title");
        final Aj sd = new Aj(10, 1000, dw_2.WH0);
        this.Sd = sd;
        final Gh0 gh0;
        (gh0 = new Gh0(sd)).uf("label-settings-vai");
        final cn_0 cn_21;
        (cn_21 = new cn_0(sm0_0.c0(1274))).uf("label-settings-title");
        final P90 p;
        (p = new P90(new Aj(0, 100, dw_2.c10))).uf("label-settings-vai");
        final cn_0 cn_22;
        (cn_22 = new cn_0(sm0_0.c0(1264))).uf("label-settings-title");
        if (sx_1.QJ0 > 16) {
            sx_1.QJ0 = 16;
        }
        final Aj mn = new Aj(0, (int)Math.round(Math.sqrt(sx_1.QJ0)), (int)Math.round(Math.sqrt(dw_2.Zu)));
        this.Mn = mn;
        final zn_0 zn_0;
        (zn_0 = new zn_0(mn)).uf("label-settings-vai");
        if (sx_1.QJ0 < 2) {
            zn_0.pw0(false);
        }
        final cn_0 cn_24;
        final cn_0 cn_23 = cn_24 = new cn_0(sm0_0.c0(1241));
        cn_23.Xr0(sm0_0.c0(1242));
        cn_23.uf("label-settings-title");
        final Aj i2 = new Aj(0, 100, dw_2.eM0());
        this.i70 = i2;
        final uw0_0 uw0_0;
        (uw0_0 = new uw0_0(i2)).uf("label-settings-vai");
        final oa0_0 ym = new oa0_0(1243);
        (this.ym = ym).yO(sm0_0.c0(1244));
        ym.uK0(dw_2.implements$);
        final cn_0 cn_26;
        final cn_0 cn_25 = cn_26 = new cn_0(sm0_0.c0(1221));
        cn_25.Xr0(sm0_0.c0(1222));
        cn_25.uf("label-settings-title");
        int n4;
        if (tw0_0.kz0()) {
            n4 = 2;
        }
        else {
            n4 = 3;
        }
        final int a = n4;
        final Aj iy = new Aj(a, 8, Math.max(a, dw_2.Mv0));
        this.iy = iy;
        final TM tm;
        (tm = new TM(iy)).uf("label-settings-vai");
        final oa0_0 p2 = new oa0_0(1297);
        (this.p0 = p2).yO(sm0_0.c0(1298));
        p2.uK0(dw_2.z2);
        final oa0_0 rt = new oa0_0(1284);
        (this.Rt = rt).yO(sm0_0.c0(1285));
        rt.uK0(dw_2.is0);
        final oa0_0 com9 = new oa0_0(1213);
        (this.COM9 = com9).yO(sm0_0.c0(1214));
        com9.uK0(dw_2.u10);
        final oa0_0 pc = new oa0_0(1234);
        (this.PC = pc).yO(sm0_0.c0(1235));
        pc.uK0(dw_2.sk);
        (this.xP = new oa0_0(1233)).uK0(dw_2.bn);
        final cn_0 cn_27;
        (cn_27 = new cn_0(sm0_0.c0(1237))).uf("label-settings-title");
        final Aj ef0 = new Aj(1, 4, dw_2.Tv0);
        this.eF0 = ef0;
        final XI0 xi0;
        (xi0 = new XI0(ef0)).uf("label-settings-vai");
        final cn_0 cn_28;
        (cn_28 = new cn_0(sm0_0.c0(1238))).uf("label-settings-title");
        final Aj i3 = new Aj(1, 4, dw_2.ba);
        this.i50 = i3;
        final n1_0 n1_0;
        (n1_0 = new n1_0(i3)).uf("label-settings-vai");
        final xe_1 xe_1;
        (xe_1 = new xe_1(sm0_0.c0(nf0_0.Bq0))).RR(new jd0_0(asBridge()));
        (this.N30 = new xe_1(sm0_0.c0(54))).RR(() -> {
            if (!this.qq0()) {
                return;
            }
            else {
                this.hD0();
                this.close();
                return;
            }
        });
        final cn_0 cn_29 = new cn_0(sm0_0.c0(1276));
        final Aj id;
        final Aj aj = id = new Aj(0, 100, dw_2.ku0);
        this.id = id;
        aj.Kj(() -> this.OE0((boolean)(0 != 0)));
        final cn_0 cn_30 = new cn_0(sm0_0.c0(1277));
        final cn_0 cn_31 = new cn_0(sm0_0.c0(1279));
        final Aj yx0;
        final Aj aj2 = yx0 = new Aj(0, 100, dw_2.sR);
        this.Yx0 = yx0;
        aj2.Kj(this::lq0);
        final Aj wv;
        final Aj aj3 = wv = new Aj(0, 100, dw_2.Yn);
        this.WV = wv;
        aj3.Kj(this::Ld0);
        final cn_0 cn_32 = new cn_0(sm0_0.c0(1365));
        final pg0_2 pg0_4;
        final String c3;
        (pg0_4 = new pg0_2((Object[])lg_0.MF.Rr0())).A3(c3 = sm0_0.c0(1366));
        final X6 qd0;
        final X6 x15 = qd0 = new X6(pg0_4);
        this.qD0 = qd0;
        x15.Bd(0);
        if (!dw_2.A9.isEmpty()) {
            qd0.hK(dw_2.A9);
        }
        qd0.Rm0(() -> this.yx0((String)qd0.Vh0()));
        final rs_0 rs_7 = new rs_0(new le0_2[] { qd0 });
        final Gh0 gh2 = new Gh0(id);
        final Gh0 gh3 = new Gh0(yx0);
        final Gh0 gh4 = new Gh0(wv);
        (this.RC = new oa0_0(1282)).uK0(dw_2.Sj);
        final cn_0 cn_33 = new cn_0(sm0_0.c0(1283));
        final Aj ey0 = new Aj(0, 100, Math.round(dw_2.ej * 100.0f));
        this.ey0 = ey0;
        final u50_0 u50_0 = new u50_0(ey0);
        final u50_0 u50_2 = u50_0;
        final Gh0 gh5 = gh4;
        final Gh0 gh6 = gh3;
        final Gh0 gh7 = gh2;
        final cn_0 cn_34 = cn_33;
        final cn_0 cn_35 = cn_31;
        final cn_0 cn_36 = cn_32;
        final cn_0 cn_37 = cn_30;
        final cn_0 cn_38 = cn_29;
        new u50_0(ey0);
        cn_38.uf("label-settings-title");
        cn_37.uf("label-settings-title");
        cn_36.uf("label-settings-title");
        cn_35.uf("label-settings-title");
        cn_34.uf("label-settings-title");
        gh7.uf("label-settings-vai");
        gh6.uf("label-settings-vai");
        gh5.uf("label-settings-vai");
        u50_0.uf("label-settings-vai");
        final oa0_0 gx = new oa0_0(1349);
        this.GX = gx;
        final l6_0 tt;
        if (tw0_0.lM.rs(tt = l6_0.tt)) {
            gx.uK0(dw_2.Md);
        }
        else {
            final oa0_0 oa0_0 = gx;
            oa0_0.uK0(false);
            oa0_0.bh();
            oa0_0.yO(tw0_0.lM.L60(tt));
            dw_2.Md = false;
        }
        final es_1 es_1 = new es_1();
        rp_0[] dv;
        for (int length2 = (dv = rp_0.DV).length, n5 = 0; n5 < length2; ++n5) {
            final rp_0 rp_0;
            if ((rp_0 = dv[n5]).uL0()) {
                es_1.Ue0(new up_0(rp_0));
            }
        }
        final up_0[] r7;
        final up_0[] array5 = r7 = (up_0[])es_1.Mo0(up_0.class);
        this.r7 = r7;
        for (int length3 = array5.length, n6 = 0; n6 < length3; ++n6) {
            r7[n6].bz(this.r7);
        }
        final xe_1 xe_2;
        (xe_2 = new xe_1(sm0_0.c0(1388))).RR(this::VH0);
        final LH0[] array7;
        final LH0[] array6 = array7 = (LH0[])el0_0.Pa().Mo0(LH0.class);
        final cn_0[] array8 = new cn_0[array6.length];
        final OS[][] array9 = new OS[array6.length][26];
        if (dw_2.Md) {
            for (int n7 = 0; n7 < array7.length; ++n7) {
                final gc0_0 kq = el0_0.Kq(array7[n7]);
                final cn_0 cn_39 = new cn_0(kq.up0());
                final cn_0 cn_40 = cn_39;
                final cn_0[] array10 = array8;
                array10[n7] = cn_40;
                cn_39.uf("label-settings-title");
                array9[n7][0] = new OS(1300, kq, rp_0.sJ0);
                array9[n7][1] = new OS(1301, kq, rp_0.nK0);
                array9[n7][2] = new OS(1302, kq, rp_0.kC0);
                array9[n7][3] = new OS(1303, kq, rp_0.synchronized$);
                array9[n7][4] = new OS(1304, kq, rp_0.I90);
                array9[n7][5] = new OS(1305, kq, rp_0.Ni);
                array9[n7][6] = new OS(1363, kq, rp_0.Aq0);
                array9[n7][7] = new OS(1364, kq, rp_0.cB);
                final OS[] array11 = array9[n7];
                final StringBuilder sb = new StringBuilder();
                final OS os = new OS(g7_0.Zx(1306, sb, " 1:"), kq, rp_0.com1);
                array11[8] = os;
                final OS[] array12 = array9[n7];
                final StringBuilder sb2 = new StringBuilder();
                final OS os2 = new OS(g7_0.Zx(1306, sb2, " 2:"), kq, rp_0.ew);
                array12[9] = os2;
                final OS[] array13 = array9[n7];
                final StringBuilder sb3 = new StringBuilder();
                final OS os3 = new OS(g7_0.Zx(1306, sb3, " 3:"), kq, rp_0.eL);
                array13[10] = os3;
                final OS[] array14 = array9[n7];
                final StringBuilder sb4 = new StringBuilder();
                final OS os4 = new OS(g7_0.Zx(1306, sb4, " 4:"), kq, rp_0.aE0);
                array14[11] = os4;
                final OS[] array15 = array9[n7];
                final StringBuilder sb5 = new StringBuilder();
                final OS os5 = new OS(g7_0.Zx(1306, sb5, " 5:"), kq, rp_0.LPT3);
                array15[12] = os5;
                final OS[] array16 = array9[n7];
                final StringBuilder sb6 = new StringBuilder();
                final OS os6 = new OS(g7_0.Zx(1306, sb6, " 6:"), kq, rp_0.VE0);
                array16[13] = os6;
                final OS[] array17 = array9[n7];
                final StringBuilder sb7 = new StringBuilder();
                final OS os7 = new OS(g7_0.Zx(1306, sb7, " 7:"), kq, rp_0.lpT9);
                array17[14] = os7;
                final OS[] array18 = array9[n7];
                final StringBuilder sb8 = new StringBuilder();
                final OS os8 = new OS(g7_0.Zx(1306, sb8, " 8:"), kq, rp_0.gr0);
                array18[15] = os8;
                final OS[] array19 = array9[n7];
                final StringBuilder sb9 = new StringBuilder();
                final OS os9 = new OS(g7_0.Zx(1306, sb9, " 9:"), kq, rp_0.lPT5);
                array19[16] = os9;
                array9[n7][17] = new OS(1308, kq, rp_0.Mi0);
                array9[n7][18] = new OS(1309, kq, rp_0.Mt);
                array9[n7][19] = new OS(1307, kq, rp_0.Kz0);
                array9[n7][20] = new OS(1, kq, rp_0.Ul);
                array9[n7][21] = new OS(1310, kq, rp_0.ip0);
                array9[n7][22] = new OS(1311, kq, rp_0.Oe);
                array9[n7][23] = new OS(1313, kq, rp_0.oq);
                array9[n7][24] = new OS(1314, kq, rp_0.i9);
                array9[n7][25] = new OS(1312, kq, rp_0.Jq);
                final ArrayList<cw_0> list2 = new ArrayList<cw_0>();
                OS[] array20;
                for (int length4 = (array20 = array9[n7]).length, n8 = 0; n8 < length4; ++n8) {
                    list2.add(array20[n8].T());
                }
                final ArrayList<cw_0> list3 = list2;
                final cw_0[] array21 = list3.toArray(new cw_0[0]);
                final Iterator<cw_0> iterator = list3.iterator();
                while (iterator.hasNext()) {
                    iterator.next().vG0(array21);
                }
            }
        }
        final cn_0 cn_41 = new cn_0(sm0_0.c0(1325));
        final Aj c4 = new Aj(1, 6, dw_2.Ec0);
        this.C7 = c4;
        final KJ0 kj0 = new KJ0(c4);
        final cn_0 cn_42 = new cn_0(sm0_0.c0(1315));
        final String[] array23;
        final String[] array22 = array23 = new String[3];
        array22[0] = sm0_0.c0(nf0_0.uT);
        array22[1] = sm0_0.c0(1316);
        array22[2] = sm0_0.c0(nf0_0.Yt);
        final X6 g80 = new X6(new pg0_2((Object[])array23));
        this.G80 = g80;
        final int xn;
        if ((xn = dw_2.XN) > -1) {
            g80.Bd(xn);
        }
        final cn_0 cn_43;
        (cn_43 = new cn_0(sm0_0.c0(1332))).uf("label-settings-title");
        final String[] v4 = wi0_0.pI().V4();
        this.tT = v4;
        final int length5;
        final String[] array24 = new String[length5 = v4.length];
        int n9 = -1;
        for (int n10 = 0; n10 < length5; ++n10) {
            final String ie0 = wi0_0.pI().IE0(this.tT[n10]);
            array24[n10] = ie0;
            if (ie0.contains(" (")) {
                array24[n10] = array24[n10].split(" \\(")[0];
            }
            if (dw_2.con.equalsIgnoreCase(this.tT[n10])) {
                n9 = n10;
            }
        }
        final int n11 = n9;
        final X6 class$ = new X6(new pg0_2((Object[])array24));
        this.class$ = class$;
        if (n11 > -1) {
            class$.Bd(n9);
        }
        final lpt6__2 q80 = lpt6__2.Q80;
        final cn_0 cn_44 = new cn_0(sm0_0.H5(q80, 30, 5));
        cn_44.uf("label-settings-title");
        final String[] array25 = new String[2];
        final pg0_2 pg0_5 = new pg0_2((Object[])array25);
        final lpt6__2 lpt6__2 = q80;
        array25[0] = sm0_0.H5(q80, 30, 19);
        array25[1] = sm0_0.H5(lpt6__2, 30, 20);
        this.Hd = new X6(pg0_5);
        for (int n12 = 0; n12 < pg0_5.ul0(); ++n12) {
            if (dw_2.fH == n12) {
                this.Hd.Bd(n12);
            }
        }
        final cn_0 cn_45 = cn_42;
        final cn_0 cn_46 = cn_15;
        final cn_0 cn_47;
        (cn_47 = new cn_0(sm0_0.c0(1339))).uf("label-settings-title");
        final xe_1 xe_3;
        (xe_3 = new xe_1(sm0_0.c0(1390))).RR(QC::Gw);
        final rs_0 rs_8 = new rs_0(new le0_2[] { xe_3 });
        final cn_0 cn_48;
        (cn_48 = new cn_0(sm0_0.c0(1340))).uf("label-settings-title");
        final xe_1 xe_4;
        (xe_4 = new xe_1(sm0_0.c0(1358))).RR(QC::My0);
        final rs_0 rs_9 = new rs_0(new le0_2[] { xe_4 });
        final xe_1 xe_6;
        final xe_1 xe_5 = xe_6 = new xe_1(sm0_0.c0(1324));
        xe_5.uf("translate-link");
        xe_5.RR(() -> lg_0.lv0.Lf("https://translate.pokemmo.com/engage/client/"));
        final cn_0 cn_49 = new cn_0(sm0_0.c0(1342));
        final cn_0 cn_50 = cn_49;
        final cn_0 cn_51 = cn_41;
        final X6 jp;
        final X6 x16 = jp = new X6(new pg0_2((Object[])new String[] { sm0_0.c0(71), sm0_0.c0(72), sm0_0.c0(73), sm0_0.c0(48) }));
        this.jP = jp;
        x16.Bd(dw_2.dk);
        (this.Xl = new oa0_0(1326)).uK0(dw_2.U5);
        (this.vN = new oa0_0(1345)).uK0(dw_2.s3);
        (this.Vn = new oa0_0(1343)).uK0(dw_2.t00);
        (this.vo = new oa0_0(1330)).uK0(dw_2.Xa0);
        (this.U80 = new oa0_0(6160)).uK0(dw_2.fx);
        (this.oH0 = new oa0_0(1347)).uK0(dw_2.jo);
        (this.Bc = new oa0_0(1335)).uK0(dw_2.t90);
        (this.Com2 = new oa0_0(1336)).uK0(dw_2.YN);
        (this.rz0 = new oa0_0(1338)).uK0(dw_2.QE);
        (this.YH = new oa0_0(1346)).uK0(dw_2.Sp0);
        cn_51.uf("label-settings-title");
        cn_49.uf("label-settings-title");
        cn_46.uf("label-settings-title");
        cn_45.uf("label-settings-title");
        final rs_0 rs_10 = new rs_0(new le0_2[] { this.class$ });
        final rs_0 rs_11 = new rs_0(new le0_2[] { this.Hd });
        final rs_0 rs_12 = new rs_0(new le0_2[] { jp });
        final rs_0 rs_13 = new rs_0(new le0_2[] { this.Yh });
        final rs_0 rs_14 = new rs_0(new le0_2[] { this.G80 });
        final cn_0 cn_52 = new cn_0(sm0_0.c0(1260));
        final pg0_2 og0 = new pg0_2(dw_2.qx0);
        this.oG0 = og0;
        this.lI0 = new X6(og0);
        int n13 = 0;
        int n14 = -1;
        final Iterator iterator2 = dw_2.qx0.iterator();
        while (iterator2.hasNext()) {
            if (dw_2.zs.equalsIgnoreCase(((OX)iterator2.next()).Yw())) {
                n14 = n13;
            }
            ++n13;
        }
        final cn_0 cn_53 = cn_52;
        this.lI0.Bd(n14);
        final rs_0 rs_15 = new rs_0(new le0_2[] { this.lI0 });
        cn_53.uf("label-settings-title");
        final cn_0 cn_54 = new cn_0(sm0_0.c0(1247));
        final pg0_2 ff = new pg0_2(lpt9__2.Kf(lg_0.S4.Kr0(), lg_0.S4.sD0()));
        this.FF = ff;
        (this.yx0 = new CL0(ff)).uf("combobox");
        for (int n15 = 0; n15 < this.FF.ul0(); ++n15) {
            if (n15 == 0 || LW.LH0(dw_2.Tf, 1.0f / (float)this.FF.YS(n15))) {
                this.yx0.Bd(n15);
            }
        }
        (this.oi = new oa0_0(1299)).uK0(dw_2.mE);
        final cn_0 cn_55 = new cn_0(sm0_0.c0(1290));
        final pg0_2 zb0 = new pg0_2((Object[])new Float[] { 0.7f, 0.8f, 0.9f, 1.0f, 1.1f, 1.2f, 1.3f, 1.4f, 1.5f });
        this.Zb0 = zb0;
        (this.Rj = new AG(zb0)).uf("combobox");
        for (int n16 = 0; n16 < this.Zb0.ul0(); ++n16) {
            if (LW.LH0(dw_2.Lu, (float)this.Zb0.YS(n16))) {
                this.Rj.Bd(n16);
            }
        }
        final cn_0 cn_56 = cn_55;
        final rs_0 rs_16 = new rs_0(new le0_2[] { this.Rj });
        cn_56.uf("label-settings-title");
        final cn_0 cn_57 = new cn_0(sm0_0.c0(1291));
        final pg0_2 gc0 = new pg0_2((Object[])new Float[] { 0.7f, 0.8f, 0.9f, 1.0f, 1.1f, 1.2f, 1.3f, 1.4f, 1.5f });
        this.Gc0 = gc0;
        (this.aS = new Du0(gc0)).uf("combobox");
        for (int n17 = 0; n17 < this.Gc0.ul0(); ++n17) {
            if (LW.LH0(dw_2.jq0, (float)this.Gc0.YS(n17))) {
                this.aS.Bd(n17);
            }
        }
        final cn_0 cn_58 = cn_57;
        final rs_0 rs_17 = new rs_0(new le0_2[] { this.aS });
        cn_58.uf("label-settings-title");
        final cn_0 cn_60;
        final cn_0 cn_59 = cn_60 = new cn_0(sm0_0.c0(1293));
        final pg0_2 py = new pg0_2((Object[])new Float[] { 0.1f, 0.2f, 0.3f, 0.4f, 0.5f, 0.6f });
        this.pY = py;
        (this.Le = new vb_0(py)).uf("combobox");
        cn_59.Xr0(sm0_0.c0(1294));
        cn_59.Bb(100);
        for (int n18 = 0; n18 < this.pY.ul0(); ++n18) {
            if (LW.LH0(dw_2.N90, (float)this.pY.YS(n18))) {
                this.Le.Bd(n18);
            }
        }
        final cn_0 cn_61 = cn_60;
        final rs_0 rs_18 = new rs_0(new le0_2[] { this.Le });
        cn_61.uf("label-settings-title");
        final cn_0 cn_62 = new cn_0(sm0_0.c0(1295));
        final String[] array26 = new String[4];
        for (int n19 = 0; n19 < 4; ++n19) {
            final String[] array27 = array26;
            final int n20 = n19;
            array27[n20] = sm0_0.c0(n20 + 1286);
        }
        final X6 z3;
        final X6 x17 = z3 = new X6(new pg0_2((Object[])array26));
        this.Z3 = z3;
        x17.uf("combobox");
        final int hx0;
        if ((hx0 = dw_2.hx0) < 1) {
            z3.Bd(0);
        }
        else if (hx0 <= 3) {
            z3.Bd(1);
        }
        else if (hx0 <= 7) {
            z3.Bd(2);
        }
        else if (hx0 <= 12) {
            z3.Bd(3);
        }
        final KJ0 kj2 = kj0;
        final cn_0 cn_63 = cn_54;
        final cn_0 cn_64 = cn_62;
        cn_64.Xr0(sm0_0.c0(1296));
        cn_64.Bb(100);
        cn_64.uf("label-settings-title");
        final rs_0 rs_19 = new rs_0(new le0_2[] { z3 });
        final oa0_0 sw;
        final oa0_0 oa0_2 = sw = new oa0_0(1292);
        this.sW = sw;
        oa0_2.uK0(dw_2.Yj);
        final oa0_0 es;
        final oa0_0 oa0_3 = es = new oa0_0(1331);
        this.es = es;
        oa0_3.uK0(dw_2.Lm);
        final oa0_0 jv;
        final oa0_0 oa0_4 = jv = new oa0_0(1266);
        this.jv = jv;
        oa0_4.uK0(dw_2.LPt4);
        final oa0_0 vj0;
        final oa0_0 oa0_5 = vj0 = new oa0_0(1245);
        this.vj0 = vj0;
        oa0_5.uK0(dw_2.tC0);
        oa0_5.yO(sm0_0.c0(1246));
        final oa0_0 dr;
        final oa0_0 oa0_6 = dr = new oa0_0(1236);
        this.Dr = dr;
        oa0_6.uK0(dw_2.Ug);
        final rs_0 rs_20 = new rs_0(new le0_2[] { this.yx0 });
        cn_63.uf("label-settings-title");
        kj2.uf("label-settings-vai");
        final cn_0 cn_66;
        final cn_0 cn_65 = cn_66 = new cn_0();
        cn_65.uf("label-settings-title");
        cn_65.Ll(false);
        final cn_0 cn_67;
        (cn_67 = new cn_0(sm0_0.c0(1360))).uf("label-settings-title-small");
        final cn_0 cn_68;
        (cn_68 = new cn_0(sm0_0.c0(1361))).uf("label-settings-title-small");
        final cn_0 cn_69;
        (cn_69 = new cn_0(sm0_0.c0(1362))).uf("label-settings-title-small");
        this.z80 = new is_1((byte)0, ex);
        this.aO = new is_1((byte)1, ex);
        this.L00 = new is_1((byte)2, ex);
        this.QE0 = new is_1((byte)3, ex);
        this.f10 = new is_1((byte)4, ex);
        this.Nf = new is_1((byte)5, ex);
        final xk_2 xk_2 = new xk_2(sm0_0.c0(1376), sm0_0.c0(1377), () -> PE(Qy0.yI0));
        final xk_2 xk_3 = new xk_2(sm0_0.c0(1380), sm0_0.c0(1377), () -> Hg0());
        final xk_2 xk_4 = new xk_2(sm0_0.c0(1382), sm0_0.c0(1377), () -> RZ(Qy0.yI0));
        final xk_2 xk_5 = new xk_2(sm0_0.c0(1374), sm0_0.c0(1377), QC::jg0);
        (this.dg = new oa0_0(1219)).uK0(dw_2.RJ0);
        final Cv0 lpt8 = new Cv0();
        this.lpt6 = lpt8;
        if (!tw0_0.Xy0()) {
            if (qt_1.yr0() != qt_1.qV) {
                final le0_2[] array29;
                final le0_2[] array28 = array29 = new le0_2[2];
                array28[0] = cn_9;
                array28[1] = rs_3;
                lpt8.L50(array29);
            }
            if (qt_1.yr0() == qt_1.Pl0) {
                final le0_2[] array31;
                final le0_2[] array30 = array31 = new le0_2[2];
                array30[0] = le0_3;
                array30[1] = le0_2;
                lpt8.L50(array31);
            }
            final le0_2[] array33;
            final le0_2[] array32 = array33 = new le0_2[2];
            array32[0] = cn_11;
            array32[1] = rs_4;
            lpt8.L50(array33);
            lpt8.L50(this.coM4.LD());
            final oa0_0 da2;
            if ((da2 = this.da0) != null) {
                lpt8.L50(da2.LD());
            }
        }
        else {
            final oa0_0 xe;
            if (tw0_0.xj0() && (xe = this.xE) != null) {
                lpt8.L50(xe.LD());
            }
            lpt8.L50(this.ym.LD());
        }
        if (tw0_0.lM.DE0()) {
            final le0_2[] array35;
            final le0_2[] array34 = array35 = new le0_2[2];
            array34[0] = cn_2;
            array34[1] = rs_0;
            lpt8.L50(array35);
        }
        final le0_2[] array37;
        final le0_2[] array36 = array37 = new le0_2[2];
        array36[0] = cn_20;
        array36[1] = gh0;
        lpt8.L50(array37);
        final le0_2[] array39;
        final le0_2[] array38 = array39 = new le0_2[2];
        array38[0] = cn_26;
        array38[1] = tm;
        lpt8.L50(array39);
        lpt8.L50(this.p0.LD());
        final le0_2[] array41;
        final le0_2[] array40 = array41 = new le0_2[2];
        array40[0] = cn_22;
        array40[1] = zn_0;
        lpt8.L50(array41);
        final le0_2[] array43;
        final le0_2[] array42 = array43 = new le0_2[2];
        array42[0] = cn_24;
        array42[1] = uw0_0;
        lpt8.L50(array43);
        if (!tw0_0.kz0()) {
            lpt8.L50(this.Bw0.LD());
            lpt8.L50(this.LPT7.LD());
        }
        final le0_2[] array45;
        final le0_2[] array44 = array45 = new le0_2[2];
        array44[0] = cn_13;
        array44[1] = new rs_0(new le0_2[] { this.d9 });
        lpt8.L50(array45);
        lpt8.L50(this.OM.LD());
        final le0_2[] array47;
        final le0_2[] array46 = array47 = new le0_2[2];
        array46[0] = cn_27;
        array46[1] = xi0;
        lpt8.L50(array47);
        final le0_2[] array49;
        final le0_2[] array48 = array49 = new le0_2[2];
        array48[0] = cn_28;
        array48[1] = n1_0;
        lpt8.L50(array49);
        lpt8.L50(this.xP.LD());
        final Cv0 w8;
        final Cv0 cv0 = w8 = new Cv0();
        this.W8 = w8;
        cv0.L50(cn_29, gh2);
        cv0.L50(cn_30, gh3);
        cv0.L50(cn_31, gh4);
        if (!tw0_0.kz0()) {
            final Cv0 cv2 = w8;
            final le0_2[] array51;
            final le0_2[] array50 = array51 = new le0_2[2];
            array50[0] = cn_32;
            array50[1] = rs_7;
            cv2.L50(array51);
        }
        final Cv0 cv3 = w8;
        cv3.L50(this.RC.LD());
        cv3.L50(cn_33, u50_2);
        cv3.L50(this.Vn.LD());
        final Cv0 dx0;
        final Cv0 cv4 = dx0 = new Cv0();
        this.dx0 = dx0;
        cv4.L50(cn_52, rs_15);
        if (!tw0_0.Xy0()) {
            final Cv0 cv5 = dx0;
            final oa0_0 oa0_7 = jv;
            final Cv0 cv6 = dx0;
            cv6.L50(cn_54, rs_20);
            cv6.L50(cn_21, p);
            cv5.L50(oa0_7.LD());
        }
        dx0.L50(vj0.LD());
        if (zb0_2.vh0 != null) {
            dx0.L50(dr.LD());
        }
        if (!tw0_0.kz0()) {
            dx0.L50(this.fX.LD());
        }
        final Cv0 cv7 = dx0;
        cv7.L50(this.na0.LD());
        cv7.L50(this.ic0.LD());
        if (tw0_0.kz0()) {
            final Cv0 cv8 = dx0;
            final oa0_0 oa0_8 = es;
            final Cv0 cv9 = dx0;
            final oa0_0 oa0_9 = sw;
            final Cv0 cv10 = dx0;
            cv10.L50(this.oi.LD());
            cv10.L50(cn_55, rs_16);
            cv10.L50(cn_60, rs_18);
            cv10.L50(cn_62, rs_19);
            cv10.L50(cn_57, rs_17);
            cv9.L50(oa0_9.LD());
            cv8.L50(oa0_8.LD());
        }
        final Cv0 cv11 = dx0;
        cv11.L50(cn_16, rs_5);
        cv11.L50(cn_18, rs_6);
        final Cv0 jr0 = new Cv0();
        (this.jr0 = jr0).uf("settings-label-area");
        jr0.L50(cn_41, kj0);
        jr0.L50(this.vN.LD());
        jr0.L50(this.vo.LD());
        jr0.L50(this.U80.LD());
        jr0.L50(this.oH0.LD());
        jr0.L50(this.Rt.LD());
        jr0.L50(this.COM9.LD());
        jr0.L50(this.PC.LD());
        jr0.L50(this.yF0.LD());
        jr0.L50(cn_15, rs_13);
        jr0.L50(cn_42, rs_14);
        final Cv0 za = new Cv0();
        (this.Za = za).L50(this.GX.LD());
        za.L50(xe_2);
        up_0[] r8;
        for (int n21 = 0; n21 < (r8 = this.r7).length; ++n21) {
            this.Za.L50(r8[n21].Rv());
        }
        final Cv0 cv13;
        final Cv0 cv12 = cv13 = new Cv0();
        cv12.L50(this.Xl.LD());
        cv12.L50(cn_50, rs_12);
        cv12.L50(this.Bc.LD());
        cv12.L50(this.Com2.LD());
        cv12.L50(this.rz0.LD());
        cv12.L50(this.YH.LD());
        final Cv0 nt0;
        final Cv0 cv14 = nt0 = new Cv0();
        this.Nt0 = nt0;
        cv14.uf("settings-label-area");
        cv14.L50(cn_43, rs_10);
        final nj0_0 qz0;
        if ((qz0 = tw0_0.Ll0.Qz0) != null && qz0.nA()) {
            final Cv0 cv15 = nt0;
            final le0_2[] array53;
            final le0_2[] array52 = array53 = new le0_2[2];
            array52[0] = cn_44;
            array52[1] = rs_11;
            cv15.L50(array53);
        }
        final Cv0 cv16 = nt0;
        cv16.L50(cn_47, rs_8);
        cv16.L50(cn_48, rs_9);
        cv16.L50(xe_6);
        final Cv0 cv18;
        final Cv0 cv17 = cv18 = new Cv0();
        cv17.L50(cn_66, cn_67, cn_68, cn_69);
        cv17.L50(this.z80.Lv0());
        cv17.L50(this.aO.Lv0());
        cv17.L50(this.L00.Lv0());
        cv17.L50(this.QE0.Lv0());
        cv17.L50(this.f10.Lv0());
        cv17.L50(this.Nf.Lv0());
        final Cv0 cv19 = new Cv0();
        if (!tw0_0.xj0()) {
            final Cv0 cv20 = cv19;
            final xk_2 xk_6 = xk_3;
            final Cv0 cv21 = cv19;
            final xk_2 xk_7 = xk_4;
            cv19.L50(xk_2.Q30());
            cv21.L50(xk_7.Q30());
            cv20.L50(xk_6.Q30());
        }
        final yt_1 e60;
        if ((e60 = tw0_0.e60) != null && e60.at() != null) {
            cv19.L50(xk_5.Q30());
        }
        cv19.L50(this.dg.LD());
        final oa0_0 zf0;
        final oa0_0 oa0_10 = zf0 = new oa0_0(1387);
        this.zf0 = zf0;
        oa0_10.uK0(dw_2.Q30);
        final Cv0 cv22 = new Cv0();
        final Cv0 cv23 = cv22;
        final oa0_0 oa0_11 = zf0;
        new Cv0();
        cv22.L50(oa0_11.LD());
        final P8 p4;
        final P8 p3 = p4 = new P8();
        final lo0_0 lo0_0 = new lo0_0(this.lpt6);
        lo0_0.uf("settings-scrollpane");
        final lo0_0 lo0_2;
        (lo0_2 = new lo0_0(this.W8)).uf("settings-scrollpane");
        final lo0_0 lo0_3;
        (lo0_3 = new lo0_0(this.jr0)).uf("settings-scrollpane");
        final lo0_0 lo0_4;
        (lo0_4 = new lo0_0(this.dx0)).uf("settings-scrollpane");
        final lo0_0 lo0_5;
        (lo0_5 = new lo0_0(this.Za)).uf("settings-scrollpane");
        final lo0_0 lo0_6;
        (lo0_6 = new lo0_0(nt0)).uf("settings-scrollpane");
        final lo0_0 lo0_7;
        (lo0_7 = new lo0_0(cv13)).uf("settings-scrollpane");
        final lo0_0 lo0_8;
        (lo0_8 = new lo0_0(cv18)).uf("settings-scrollpane");
        final lo0_0 lo0_9;
        (lo0_9 = new lo0_0(cv19)).uf("settings-scrollpane");
        final lo0_0 lo0_10;
        (lo0_10 = new lo0_0(cv23)).uf("settings-scrollpane");
        p3.Wq(lo0_0, sm0_0.c0(1201));
        p3.Wq(lo0_2, sm0_0.c0(1202));
        p3.Wq(lo0_4, sm0_0.c0(1210));
        p3.Wq(lo0_3, sm0_0.c0(1204));
        p3.Wq(lo0_5, sm0_0.c0(1203));
        if (dw_2.Md) {
            final fy_2[] array54 = new fy_2[array7.length];
            for (int n22 = 0; n22 < array7.length; ++n22) {
                final LH0[] array55 = array7;
                final int n23 = n22;
                final fy_2[] array56 = array54;
                final int n24 = n22;
                final fy_2[] array57 = array54;
                final int n25 = n22;
                final fy_2 fy_2 = new fy_2();
                final fy_2 fy_3 = fy_2;
                final fy_2[] array58 = array54;
                final int n26 = n22;
                new fy_2();
                array58[n26] = fy_3;
                fy_2.uf("settings-label-area");
                final I7 h10 = array57[n25].H10();
                final Hm0 lo0 = array56[n24].lo0();
                final gc0_0 kq2;
                if ((kq2 = el0_0.Kq(array55[n23])) != null) {
                    final Hm0 hm0 = lo0;
                    final I7 i4 = h10;
                    final Hm0 hm2 = lo0;
                    final fy_2[] array59 = array54;
                    final int n27 = n22;
                    h10.X20(array54[n22].hb(array8[n22]));
                    hm2.X20(array59[n27].C7(array8[n22]));
                    final xe_1 xe_7 = new xe_1();
                    final xe_1 xe_8 = xe_7;
                    final gc0_0 gc0_0 = kq2;
                    new xe_1(sm0_0.c0(1388));
                    xe_7.RR(() -> { });
                    i4.Kn0(xe_7);
                    hm0.Kn0(xe_8);
                    OS[] array60;
                    for (int n28 = 0; n28 < (array60 = array9[n22]).length; ++n28) {
                        final Hm0 hm3 = lo0;
                        final fy_2[] array61 = array54;
                        final int n29 = n22;
                        h10.X20(array54[n22].hb(array60[n28].aP()));
                        hm3.X20(array61[n29].C7(array9[n22][n28].aP()));
                    }
                    final P8 p5 = p4;
                    final gc0_0 gc0_2 = kq2;
                    final fy_2[] array62 = array54;
                    final int n30 = n22;
                    array54[n22].x40(h10);
                    array62[n30].WQ(lo0);
                    final lo0_0 lo0_11;
                    (lo0_11 = new lo0_0(array54[n22])).uf("settings-scrollpane");
                    p5.Wq(lo0_11, gc0_2.je());
                }
            }
        }
        final e30_0 e30_0 = ex;
        final P8 p6 = p4;
        p6.Wq(lo0_6, sm0_0.c0(1206));
        p6.Wq(lo0_7, sm0_0.c0(1208));
        if (e30_0 != null) {
            p4.Wq(lo0_8, sm0_0.c0(1205));
        }
        p4.Wq(lo0_9, sm0_0.c0(1209));
        if (ea0_1.T9) {
            p4.Wq(lo0_10, sm0_0.c0(1211));
        }
        if (!tw0_0.kz0()) {
            final I7 h11 = this.ET.H10();
            final Hm0 lo2;
            final Hm0 hm4 = lo2 = this.ET.lo0();
            final P8 p7 = p4;
            h11.Ze0().Kn0(p4).Ze0();
            hm4.Kn0(p7);
            if (!tw0_0.kz0()) {
                final Hm0 hm5 = lo2;
                h11.X20(this.ET.hb(xe_1, this.N30));
                hm5.X20(this.ET.H10().Ze0().LPt3(xe_1, this.N30));
            }
            this.ET.x40(h11);
            this.ET.WQ(lo2);
        }
        else {
            final ya_1 ze0 = this.ET.H10().Kn0(p4).Ze0();
            final ya_1 ze2 = this.ET.H10().Ze0().Kn0(p4).Ze0();
            this.ET.x40(ze0);
            this.ET.WQ(ze2);
            this.N30.uf("mobile-save-icon");
            this.N30.SU("");
            this.SL(this.N30);
        }
        this.SL(this.ET);
    }
    
    public static GS Dx0(final int n, final int n2, final GS[] array) {
        GS gs = null;
        for (int length = array.length, i = 0; i < length; ++i) {
            final GS gs2;
            final int vo;
            if ((vo = (gs2 = array[i]).Vo) == n) {
                final int c50;
                if ((c50 = gs2.c50) == n2) {
                    if (gs != null) {
                        final int n3 = vo * c50;
                        final int n4;
                        if (n3 < (n4 = gs.Vo * gs.c50)) {
                            continue;
                        }
                        if (n3 <= n4) {
                            final int tg0 = gs2.tg0;
                            final int tg2;
                            if (tg0 < (tg2 = gs.tg0)) {
                                continue;
                            }
                            if (tg0 <= tg2) {
                                if (gs2.ax <= gs.ax) {
                                    continue;
                                }
                            }
                        }
                    }
                    gs = gs2;
                }
            }
        }
        return gs;
    }
    
    public static void Pc0(final Tp0 tp0, final up_0 up_0) {
        tp0.tk = true;
        final Qy0 yi0 = Qy0.yI0;
        final int n = 1367;
        String s;
        if ((s = up_0.vI.j50.toString()).contains(":")) {
            final String s2 = s;
            s = s2.substring(0, s2.lastIndexOf(58));
        }
        yi0.dk(-1, sm0_0.wa0(n, s));
    }
    
    public static void b0(final gc0_0 gc0_0, final OS[][] array, final int n) {
        gc0_0.QI.clear();
        gc0_0.GV();
        OS[] array2;
        for (int i = 0; i < (array2 = array[n]).length; ++i) {
            array2[i].ZG.rD0();
        }
        Qy0.yI0.dk(-1, sm0_0.wa0(1389, gc0_0.LPT8));
    }
    
    public static void RZ(final Qy0 qy0) {
        wi0_0.gm.getClass();
        byte b = 0;
        while (true) {
            while (b < 5) {
                final qa0_1 pm0;
                if ((pm0 = tw0_0.Ll0.Pm0(b)) == null || wi0_0.hS(pm0)) {
                    final l50_0 ab;
                    if ((ab = tw0_0.Ll0.AB(b)) == null || wi0_0.ZL(ab)) {
                        ++b;
                        continue;
                    }
                }
                final Qy0 qy2 = qy0;
                final String s = sm0_0.c0(1379);
                qy2.dk(-1, s);
                return;
            }
            final Qy0 qy2 = qy0;
            final String s = sm0_0.c0(1378);
            continue;
        }
    }
    
    public static void PE(final Qy0 qy0) {
        final wi0_0 gm = wi0_0.gm;
        int n = 0;
        final Iterator iterator = gm.GF0().iterator();
        while (iterator.hasNext()) {
            if (!((ws_0)iterator.next()).hz()) {
                n = 1;
            }
        }
        Qy0 qy2;
        String s;
        if ((n ^ 0x1) != 0x0) {
            qy2 = qy0;
            s = sm0_0.c0(1378);
        }
        else {
            qy2 = qy0;
            s = sm0_0.c0(1379);
        }
        qy2.dk(-1, s);
    }
    
    public static void Gw() {
        Qy0.yI0.tM();
    }

    public static void zh() {
        tw0_0.lM.Pd0();
    }

    public static void QP() {
        lg_0.lv0.Lf("https://translate.pokemmo.com/engage/client/");
    }

    public static void Xv0() {
        // Synthetic no-op callback retained for the original method surface.
    }
    
    static {
        Bq0 = Cq0.E1(QC.class);
    }
    
    public static void jg0() {
        final BR rl;
        if ((rl = tw0_0.rl) != null) {
            rl.Cp(zo_0.Pk, "/unstuck", "", true);
        }
    }
    
    public static void Hg0() {
        final Qy0 yi0 = Qy0.yI0;
        yi0.F9(yi0.fU(), new t6_0());
    }
    
    public static void My0() {
        Qy0.yI0.BE(null);
    }
    
    public static void jo0(byte ax, com7__2 mode) {
        if (mode == null) {
            return;
        }
        if (ax == 1) {
            GS[] modes = new GS[0];
            try {
                modes = DZ.Ji0(lg_0.S4.Wz0());
            } catch (Exception ignored) {
                // Keep the current display mode when GLFW cannot enumerate modes.
            }
            GS selected = Dx0(mode.Ax, mode.T20, modes);
            lg_0.S4.n3(selected != null ? selected : DZ.rr0(lg_0.S4.Wz0()));
            return;
        }
        k3_0 settings = lg_0.S4;
        Su0 window = settings.rt0;
        boolean fullscreen = ax == 2;
        window.IG0.aX = !fullscreen;
        GLFW.glfwSetWindowAttrib(window.hc0, 131077, fullscreen ? 0 : 1);
        if (fullscreen || mode.Ax < settings.Kr0() || mode.T20 < settings.sD0()) {
            tw0_0.lM.xz0(false);
        }
        settings.zE(mode.Ax, mode.T20);
        tw0_0.lM.Qw0(ax);
    }
    
    public final boolean qq0() {
        final Tp0 tp0 = new Tp0();
        for (up_0 item : this.r7) {
            if (item != null && item.KI() && item.Qi0()) {
                Pc0(tp0, item);
            }
        }
        return !tp0.tk;
    }

    public final void o40() {
        this.OE0(false);
    }

    public final void IT() {
        if (this.qq0()) {
            this.hD0();
            this.close();
        }
    }

    public final void zV() {
        this.Lz0 = true;
    }
    
    public final void s80(final ScheduledFuture scheduledFuture) {
        if (scheduledFuture.cancel(false)) {
            if (!tw0_0.Xy0()) {
                dw_2.L90 = (byte)this.TH.mu0.Mw0;
                tw0_0.lM.vl0();
                dw_2.Va = true;
            }
            final int mw0;
            com7__2 a;
            if ((mw0 = this.iL.mu0.Mw0) >= 0) {
                a = (com7__2)this.kb.w7.get(mw0);
            }
            else {
                a = new com7__2(dw_2.d70, dw_2.ag);
            }
            this.a = a;
            this.rt0 = (dw_2.L90 = (byte)this.TH.mu0.Mw0);
        }
    }
    
    public final void vE() {
        this.TH.Bd(dw_2.L90);
        jo0(this.rt0, this.a);
        Qy0.yI0.e80(sm0_0.c0(1399), null);
        if (!tw0_0.Xy0()) {
            dw_2.L90 = (byte)this.TH.mu0.Mw0;
            tw0_0.lM.vl0();
            dw_2.Va = true;
        }
    }
    
    public final void yx0(final String anObject) {
        final String s;
        if ((s = (String)this.qD0.Vh0()).equals(anObject)) {
            lg_0.MF.AF(null);
            dw_2.A9 = "";
            dw_2.Va = true;
            return;
        }
        final String a9 = s;
        lg_0.MF.AF(s);
        dw_2.A9 = a9;
        dw_2.Va = true;
    }
    
    public final void close() {
        this.dw.u3(this);
        ff0_0[] wa;
        for (int length = (wa = ff0_0.wa).length, i = 0; i < length; ++i) {
            wa[i].iY = Float.NaN;
        }
        this.OE0(true);
    }
    
    public final void OE0(final boolean b) {
        if (!b) {
            ff0_0.Pd.iY = this.id.cx0 / 100.0f;
        }
        final bu_0 re0;
        final OE0 e00;
        if ((e00 = (re0 = tw0_0.RE0).e00) != null) {
            if (e00 instanceof Xu0) {
                re0.Eh((byte)0, (short)0, false, true);
            }
            else {
                e00.aw(ff0_0.Pd.wg());
            }
        }
    }
    
    public final void hD0() {
        boolean b = false;
        boolean b2 = false;
        String s = "";
        if (!tw0_0.Xy0()) {
            b = (dw_2.L90 == 2 || this.TH.mu0.Mw0 == 2);
            if (dw_2.U8 != this.fX.aq()) {
                dw_2.U8 = this.fX.aq();
                final BU t50;
                final lc_2 ib0;
                if ((t50 = BU.T50) != null && (ib0 = t50.iB0).K20 != null) {
                    final BU bu = t50;
                    ib0.xe0();
                    bu.SL(bu.iB0 = new lc_2());
                }
            }
            if (dw_2.LPt4 != this.jv.aq()) {
                dw_2.LPt4 = this.jv.aq();
                final Qy0 yi0 = Qy0.yI0;
                String str;
                if (dw_2.LPt4) {
                    str = "-cursor";
                }
                else {
                    str = "";
                }
                yi0.uf("maingui".concat(str));
                Qy0.yI0.yI();
            }
            dw_2.Kr = this.OM.aq();
            final int mw0;
            final com7__2 com7__2;
            if (this.Lz0 && (mw0 = this.iL.mu0.Mw0) > -1 && (com7__2 = (com7__2)this.kb.w7.get(mw0)) != null) {
                jo0((byte)this.TH.mu0.Mw0, com7__2);
            }
            if (this.rt0 != this.TH.mu0.Mw0) {
                Qy0.yI0.e80(sm0_0.c0(1398), () -> { });
            }
            final oa0_0 da0;
            if ((da0 = this.da0) != null) {
                dw_2.Nf = da0.aq();
            }
        }
        if (this.ym.aq() != dw_2.implements$) {
            b = true;
            dw_2.implements$ = this.ym.aq();
        }
        final oa0_0 xe;
        if ((xe = this.xE) != null && xe.aq() != dw_2.kD) {
            b = true;
            dw_2.kD = this.xE.aq();
        }
        final int mv0 = dw_2.Mv0;
        final Aj iy = this.iy;
        int cx0;
        if ((cx0 = iy.cx0) <= iy.wH0) {
            cx0 = -1;
        }
        final boolean b3 = mv0 != (dw_2.Mv0 = cx0);
        final boolean b4 = dw_2.z2 != this.p0.aq();
        dw_2.z2 = this.p0.aq();
        dw_2.is0 = this.Rt.aq();
        dw_2.u10 = this.COM9.aq();
        dw_2.sk = this.PC.aq();
        if (dw_2.bn != this.xP.aq()) {
            dw_2.bn = this.xP.aq();
            b = true;
        }
        dw_2.WH0 = this.Sd.cx0;
        if (dw_2.b00 != this.na0.aq()) {
            dw_2.b00 = this.na0.aq();
            Qy0.yI0.S.Ll(this.na0.aq());
        }
        dw_2.le = this.Hh0.mu0.Mw0;
        dw_2.zC0 = this.Qv.mu0.Mw0;
        dw_2.Is0 = this.yF0.aq();
        dw_2.mE = this.oi.aq();
        final int mw2;
        if ((mw2 = this.Rj.mu0.Mw0) > -1) {
            dw_2.Lu = (float)this.Zb0.w7.get(mw2);
        }
        final int mw3;
        if ((mw3 = this.aS.mu0.Mw0) > -1) {
            dw_2.jq0 = (float)this.Gc0.w7.get(mw3);
        }
        dw_2.Yj = this.sW.aq();
        if (dw_2.Lm != this.es.aq()) {
            dw_2.Lm = this.es.aq();
            final BU t51;
            if ((t51 = BU.T50) != null) {
                t51.V80();
            }
        }
        final int mw4;
        if ((mw4 = this.Le.mu0.Mw0) > -1) {
            if ((float)this.pY.w7.get(mw4) != dw_2.N90) {
                b = true;
            }
            dw_2.N90 = ((Float)this.pY.w7.get(this.Le.mu0.Mw0)).floatValue();
        }
        final int mw5;
        if ((mw5 = this.Z3.mu0.Mw0) > -1) {
            if (mw5 != 1) {
                if (mw5 != 2) {
                    if (mw5 != 3) {
                        dw_2.hx0 = 0;
                    }
                    else {
                        dw_2.hx0 = 12;
                    }
                }
                else {
                    dw_2.hx0 = 7;
                }
            }
            else {
                dw_2.hx0 = 3;
            }
        }
        final int zu = dw_2.Zu;
        final int cx2;
        final int qj0;
        if ((dw_2.Zu = (((cx2 = this.Mn.cx0) < 1) ? 0 : ((int)Math.pow(2.0, cx2)))) > (qj0 = sx_1.QJ0)) {
            dw_2.Zu = qj0;
        }
        final Aj i70;
        final int cx3;
        if ((cx3 = (i70 = this.i70).cx0) >= 1 && cx3 < i70.Cw0) {
            int n;
            if (tw0_0.Xy0()) {
                n = 20;
            }
            else {
                n = 0;
            }
            int cx4;
            if (cx3 == n) {
                cx4 = -1;
            }
            else {
                cx4 = this.i70.cx0;
            }
            dw_2.sA = cx4;
        }
        else {
            dw_2.sA = 0;
        }
        if (dw_2.Zu != zu) {
            b = true;
        }
        final NR lm = tw0_0.lM;
        final int wh0 = dw_2.WH0;
        final int ff = dw_2.ff;
        final int ff2 = dw_2.ff;
        lm.getClass();
        lg_0.S4.rt0.IG0.Xs0 = wh0;
        final WN wn = (WN)this.dq.Vh0();
        if (WN.valueOf(dw_2.Og) != wn) {
            final WN wn2 = wn;
            dw_2.Og = wn2.name();
            if (wn2 == WN.Or0) {
                tw0_0.lM.getClass();
                if (!ANGLELoader.isInstalled()) {
                    s = "angle";
                }
            }
            b = true;
        }
        final X6 cw;
        if ((cw = this.CW) != null && dw_2.i2 != cw.Vh0()) {
            b = true;
        }
        if (dw_2.Md != this.GX.aq()) {
            dw_2.Md = this.GX.aq();
            b = true;
        }
        up_0[] r7;
        for (int length = (r7 = this.r7).length, j = 0; j < length; ++j) {
            final up_0 up_0;
            final rp_0 b5 = (up_0 = r7[j]).B0;
            final int il = up_0.Ag.iL;
            final BO aa0;
            if ((aa0 = b5.aA0) != null) {
                aa0.HO(il);
            }
        }
        dw_2.ku0 = this.id.cx0;
        dw_2.sR = this.Yx0.cx0;
        dw_2.Yn = this.WV.cx0;
        dw_2.Sj = this.RC.aq();
        dw_2.ej = this.ey0.cx0 / 100.0f;
        dw_2.U5 = this.Xl.aq();
        dw_2.Ec0 = this.C7.cx0;
        dw_2.t00 = this.Vn.aq();
        dw_2.s3 = this.vN.aq();
        dw_2.XN = this.G80.mu0.Mw0;
        if (!dw_2.s3) {
            tw0_0.Ht0.y0 = false;
        }
        dw_2.fx = this.U80.aq();
        dw_2.jo = this.oH0.aq();
        dw_2.Ga0 = this.Bw0.aq();
        dw_2.Xa0 = this.vo.aq();
        dw_2.Ba = this.LPT7.aq();
        dw_2.o70 = this.ic0.aq();
        dw_2.aR = this.Yh.mu0.Mw0;
        final int mw6;
        if (dw_2.YO != (mw6 = this.d9.mu0.Mw0)) {
            final int yo = mw6;
            b = true;
            dw_2.YO = yo;
        }
        dw_2.Tv0 = this.eF0.cx0;
        dw_2.ba = this.i50.cx0;
        dw_2.t90 = this.Bc.aq();
        dw_2.YN = this.Com2.aq();
        dw_2.QE = this.rz0.aq();
        dw_2.Sp0 = this.YH.aq();
        dw_2.RJ0 = this.dg.aq();
        final String vh0 = zb0_2.vh0;
        int n2 = 0;
        final int mw7;
        final String s2;
        if ((mw7 = this.class$.mu0.Mw0) > -1 && (s2 = this.tT[mw7]) != null && !dw_2.con.equalsIgnoreCase(s2) && wi0_0.gm.CP(s2)) {
            final String s3 = vh0;
            dw_2.con = s2;
            dw_2.m70 = true;
            b = true;
            if (!((s3 != null) ? vh0.equals(zb0_2.vh0) : (zb0_2.vh0 == null))) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
        }
        final int mw8;
        if ((mw8 = this.Hd.mu0.Mw0) > -1 && dw_2.fH != mw8) {
            xm_0.kt0 = (dw_2.fH = mw8);
            b = true;
        }
        if (this.coM4.aq() != dw_2.mv) {
            final boolean aq;
            final int n3 = (dw_2.mv = (aq = this.coM4.aq())) ? 1 : 0;
            lg_0.S4.rt0.IG0.qH0 = aq;
            GLFW.glfwSwapInterval(n3);
        }
        final int mw9;
        if ((mw9 = this.jP.mu0.Mw0) > -1) {
            dw_2.dk = mw9;
        }
        if (this.Zu0 && tw0_0.rl != null) {
            final int om = this.z80.ff0() | this.aO.ff0() | this.L00.ff0() | this.QE0.ff0() | this.f10.ff0() | this.Nf.ff0();
            final BR rl;
            final e30_0 k0;
            if ((k0 = (rl = tw0_0.rl).k0) != null) {
                if (k0.oM != om) {
                    final BR br = rl;
                    k0.oM = om;
                    br.fk0.uQ(new ii0_0(om));
                }
            }
        }
        final BU zk0;
        final XH bk;
        if ((zk0 = Qy0.yI0.zK0) != null && (bk = zk0.BK) != null) {
            final XH xh = bk;
            xh.Nd0(dw_2.WY);
            xh.lL0();
        }
        final OX tg = dw_2.tG(dw_2.zs);
        final OX ox = (OX)this.oG0.w7.get(this.lI0.mu0.Mw0);
        if (this.lI0.mu0.Mw0 > -1 && tg != ox) {
            final OX ox2 = tg;
            dw_2.TS(ox);
            b2 = true;
            if (ox2.J0 != ox.J0) {
                dw_2.mi = false;
                dw_2.WY = false;
                dw_2.nE0 = 0;
                dw_2.W6 = 0;
                dw_2.BY = 400;
                dw_2.Qy0 = 200;
                dw_2.aN = 250;
                dw_2.yL0 = 0;
            }
        }
        final int mw10;
        if (((mw10 = this.yx0.mu0.Mw0) > -1 && !LW.LH0(dw_2.Tf, 1.0f / (float)this.FF.w7.get(mw10))) || dw_2.tC0 != this.vj0.aq()) {
            dw_2.Tf = 1.0f / ((Float)this.FF.w7.get(this.yx0.mu0.Mw0)).floatValue();
            dw_2.tC0 = this.vj0.aq();
            n2 = 1;
            tw0_0.LD0.Gg(lg_0.S4.Kr0(), lg_0.S4.sD0());
        }
        if (b4 || b3) {
            tw0_0.LD0.Gg(lg_0.S4.Kr0(), lg_0.S4.sD0());
        }
        if (this.Dr.aq() != dw_2.Ug) {
            dw_2.Ug = this.Dr.aq();
            zb0_2.q3 = this.Dr.aq();
            n2 = 1;
        }
        dw_2.Q30 = this.zf0.aq();
        final X6 cw2;
        if ((cw2 = this.CW) != null && dw_2.i2 != cw2.Vh0()) {
            final m4_0 m4_0 = dw_2.i2 = (m4_0)this.CW.Vh0();
            tw0_0.lM.getClass();
            m4_0 m4_2;
            if (NR.dy0 == com5__4.Zv) {
                m4_2 = f.m4_0.Ox;
            }
            else {
                m4_2 = f.m4_0.wk0;
            }
            dw_2.kt = (m4_0 != m4_2);
        }
        else if (!b2) {
            if (n2 != 0) {
                jq0_0.Tq();
            }
            if (b) {
                Qy0.yI0.dk(-1, sm0_0.c0(1375));
            }
            lg_0.k.lPT5(tw0_0.lM::mo0);
            tw0_0.lM.BO();
            final Qy0 yi2;
            if (!dw_2.CY() && (yi2 = Qy0.yI0) != null) {
                yi2.dk(-1, sm0_0.c0(87));
            }
            if (!s.isEmpty()) {
                tw0_0.Ro0.qI0(true, s);
            }
            return;
        }
        dw_2.CY();
        tw0_0.uV.Ef0(sm0_0.c0(1200), sm0_0.c0(1179), UE.h1, () -> tw0_0.lM.Pd0(), false);
    }
    
    @Override
    public final void K8() {
        if (super.K20 == null) {
            return;
        }
        if (tw0_0.kz0()) {
            this.oY(tw0_0.LD0.ew0(), tw0_0.LD0.Hv0());
            super.K8();
            this.N30.lt0();
            this.N30.A20(pa0_0.Mk, -68, 0);
            return;
        }
        this.lt0();
        this.ET.lt0();
        this.lpt6.lt0();
        this.dx0.lt0();
        this.W8.lt0();
        this.Za.lt0();
        this.jr0.lt0();
        this.Nt0.lt0();
        super.K8();
    }
    
    @Override
    public final void x00() {
        lpt6__0.v90(this);
    }
    
    @Override
    public final boolean nd0(final i70_0 i70_0) {
        if (E00.ZU(i70_0.zu) && i70_0.iT()) {
            if (Qy0.af(this)) {
                return super.nd0(i70_0);
            }
            final int finally$ = i70_0.finally$;
            final rp_0 nk0 = rp_0.nK0;
            final int ff = dw_2.ff;
            if (nk0 != null) {
                if (nk0.Ov(finally$)) {
                    this.close();
                    return true;
                }
            }
        }
        return super.nd0(i70_0);
    }
    
    public final void VH0() {
        up_0[] r7;
        for (int length = (r7 = this.r7).length, i = 0; i < length; ++i) {
            final up_0 up_0;
            final ie0_1 ag = (up_0 = r7[i]).Ag;
            final int n = ag.iL = up_0.B0.MM;
            final Yo0 ie = tw0_0.iE;
            final int n2 = n;
            ie.getClass();
            ag.SU(ie.oO(n2, sm0_0.c0(nf0_0.Po)));
        }
    }
    
    public final void Ld0() {
        final ff0_0 h30;
        (h30 = ff0_0.h30).iY = this.WV.cx0 / 100.0f;
        if (this.fs.ty0()) {
            if (h30 == ff0_0.TJ0) {
                tw0_0.RE0.d00(true, (byte)2, (short)1583, 0.0f);
            }
            else {
                tw0_0.RE0.P7((short)1583);
            }
        }
    }
    
    public final void lq0() {
        ff0_0.TJ0.iY = this.Yx0.cx0 / 100.0f;
        if (this.fs.ty0()) {
            tw0_0.RE0.d00(true, (byte)2, (short)1583, 0.0f);
        }
    }
    
    public final void FL0() {
        this.Lz0 = true;
        this.a = (com7__2)this.kb.w7.get(this.iL.mu0.Mw0);
    }
    
    public final void pW() {
        if (this.dq.Vh0() == WN.Or0) {
            tw0_0.lM.getClass();
            if (!ANGLELoader.isInstalled()) {
                final lpt3__4 lpt3__4;
                (lpt3__4 = new lpt3__4(sm0_0.c0(1215), () -> {}, asBridge())).D80 = true;
                final Runnable runnable;
                if ((runnable = this::jv0) != null) {
                    lpt3__4.qp0.RR(runnable);
                }
                Qy0.yI0.sr0(lpt3__4);
            }
        }
    }
    
    public final void jv0() {
        this.dq.hK(WN.valueOf(dw_2.Og));
    }
}



