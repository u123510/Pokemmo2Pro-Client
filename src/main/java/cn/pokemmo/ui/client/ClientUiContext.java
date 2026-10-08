/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.client;

import f.*;

import f.BR;
import f.Iu0;
import f.Jw;
import f.Kr0;
import f.NR;
import f.Vs0;
import f.Yo0;
import f._native;
import f.a10_0;
import f.aa0_2;
import f.bu_0;
import f.d8_0;
import f.dw_2;
import f.hb0_2;
import f.jn_0;
import f.jv_1;
import f.kc_1;
import f.lg_0;
import f.mh0_2;
import f.pk0_0;
import f.qt_2;
import f.ru0_0;
import f.ss_2;
import f.tj0_0;
import f.wg_1;
import f.xr_0;
import f.yt_1;
import f.z60_0;

/*
 * Renamed from f.tw0
 */
public abstract class ClientUiContext {

    public static boolean isMobilePlatform() {
        return xj0();
    }

    public static boolean isTouchUiMode() {
        return kz0();
    }

    public static boolean isDesktopUiMode() {
        return H30();
    }

    public static Iu0 hH0;
    public static aa0_2 Ll0;
    public static final mh0_2 Ht0;
    public static Yo0 iE;
    public static z60_0 Wv0;
    public static final jv_1 Xl0;
    public static bu_0 RE0;
    public static NR lM;
    public static _native pv;
    public static qt_2 d7;
    public static BR rl;
    public static final wg_1 aB;
    public static yt_1 e60;
    public static a10_0 PK0;
    public static xr_0 Jp;
    public static jn_0 LD0;
    public static ru0_0 KW;
    public static tj0_0 Tl0;
    public static pk0_0 FL;
    public static Vs0 ys0;
    public static Kr0 t30;
    public static d8_0 Ro0;
    public static ss_2 uV;
    public static final int Vp0;
    public static Jw hg;
    public static boolean In0;

    public static boolean ng() {
        return tw0_0.Eu(1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean Xy0() {
        if (tw0_0.xj0()) return true;
        lg_0.k.getClass();
        if (hb0_2.BN != hb0_2.XU) return false;
        return true;
    }

    public static boolean xj0() {
        lg_0.k.getClass();
        return hb0_2.BN == hb0_2.cw;
    }

    public static void Dc0() {
        lg_0.k.getClass();
    }

    public static boolean kz0() {
        return tw0_0.Xy0() || dw_2.xu;
    }

    public static boolean H30() {
        return tw0_0.kz0() ^ true;
    }

    public static boolean Eu(int n) {
        BR bR = rl;
        return bR != null && bR.yn() >= n;
    }

    public static boolean Yw(int n) {
        BR bR = rl;
        return bR != null && bR.yn() >= n;
    }

    public static void M2() {
        Jw jw = hg;
        if (jw != null) {
            lg_0.lv0.Lf("https://support.pokemmo.com/auth/" + jw.v7 + "/" + jw.UD0 + "/" + kc_1.Dh(jw.js0));
        } else {
            lg_0.lv0.Lf("https://support.pokemmo.com");
        }
    }

    static {
        Ht0 = new mh0_2();
        iE = new Yo0();
        Wv0 = null;
        Xl0 = new jv_1();
        RE0 = null;
        lM = null;
        pv = null;
        d7 = null;
        rl = null;
        aB = new wg_1();
        e60 = null;
        PK0 = null;
        Jp = null;
        LD0 = null;
        KW = null;
        Tl0 = null;
        FL = null;
        ys0 = null;
        t30 = null;
        Ro0 = null;
        uV = null;
        Vp0 = -1;
        In0 = false;
    }
}

