/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.twl.core;

import f.*;

import com.badlogic.gdx.graphics.Texture;
import f.CO;
import f.E00;
import f.EN;
import f.ET;
import f.G50;
import f.I2;
import f.Jn0;
import f.KG0;
import f.KU;
import f.LC0;
import f.MD0;
import f.N1;
import f.Qf;
import f.R40;
import f.T8;
import f.TU;
import f.VG;
import f.X8;
import f.Z30;
import f.dc0_0;
import f.es_1;
import f.fp0_0;
import f.hd_1;
import f.i70_0;
import f.lg_0;
import f.nf_1;
import f.pa0_0;
import f.pu_2;
import f.qj_0;
import f.qq_0;
import f.ux0_0;
import f.wl0_2;
import f.xd0_2;
import f.zk0_1;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * TWL 客户端 UI 基础组件 (Widget)
 */
public class TwlWidget {
    public static final MD0 gz;
    public static final MD0 Hp0;
    public static final MD0 rH;
    public static final MD0 pf0;
    public static final ThreadLocal Vu;
    public static final boolean Wy;
    public static final /* synthetic */ boolean kk;
    public le0_2 K20;
    public int A20;
    public int SB0;
    public int Mx;
    public int OB;
    public int r90;
    public boolean IM;
    public boolean eE;
    public boolean sO;
    public boolean OI;
    public boolean yC0;
    public String gW;
    public R40 Gq0;
    public wl0_2 Jj0;
    public wl0_2 ga0;
    public Object yj0;
    public Object LT;
    public hd_1 Kj;
    public pu_2 o5;
    public N1 z70;
    public PropertyChangeSupport Xu;
    public volatile zk0_1 Em0;
    public final KG0 M;
    public final boolean z7;
    public short e80;
    public short y9;
    public short NV;
    public short Cz;
    public short vK0;
    public short tU;
    public short Ya0;
    public short G4;
    public KU t30;
    public le0_2 E30;
    public le0_2 bx;
    public dc0_0 Zt;
    public boolean lk;
    public boolean lv;
    public boolean Eo0;
    public int GH0;
    public String A80;
    public final pa0_0 Ls0;
    public Object kg;
    public final int zV;
    public int Pl0;

    public TwlWidget() {
        this(null, false);
    }

    public TwlWidget(KG0 kG0, boolean bl) {
        this.eE = true;
        this.OI = true;
        this.yC0 = true;
        this.lk = true;
        this.Eo0 = true;
        this.GH0 = 1000;
        this.A80 = "";
        this.Ls0 = pa0_0.L00;
        this.zV = -1;
        this.gW = this.Ck();
        if (kG0 != null && !bl) {
            this.M = kG0;
            this.z7 = true;
        } else {
            this.M = new KG0(kG0);
            this.z7 = false;
        }
    }

    public static int du0(int n, int n2, int n3) {
        if (n3 > 0) {
            n2 = Math.min(n2, n3);
        }
        return Math.max(n, n2);
    }

    static {
        boolean bl;
        kk = TwlWidget.class.desiredAssertionStatus() ^ true;
        Logger.getLogger(TwlWidget.class.getName());
        gz = MD0.cB("keyboardFocus");
        Hp0 = MD0.cB("hasOpenPopups");
        rH = MD0.cB("hasFocusedChild");
        pf0 = MD0.cB("disabled");
        Vu = new ThreadLocal();
        try {
            bl = Boolean.getBoolean("warnOnUnhandledAction");
        }
        catch (SecurityException securityException) {
            bl = false;
        }
        Wy = bl;
    }

    public static void Dd(le0_2 le0_22) {
        while (le0_22 != null) {
            le0_2 le0_23 = le0_22;
            le0_2 le0_24 = le0_23.bx;
            if (!le0_23.z7) {
                le0_22.M.j70(gz, false);
            }
            try {
                le0_22.Bt();
            }
            catch (Exception exception) {
                Logger.getLogger(le0_2.class.getName()).log(Level.SEVERE, "Exception in keyboardFocusLost()", exception);
            }
            le0_22.bx = null;
            le0_22 = le0_24;
        }
        return;
    }

    public final int LN(ArrayList arrayList) {
        KU kU = this.t30;
        if (kU == null) {
            return -1;
        }
        int n = -1;
        I2 i2 = kU.ZD();
        while (i2.hasNext()) {
            int n2;
            le0_2 le0_22 = (le0_2)i2.next();
            if (!le0_22.eE || !le0_22.OI) continue;
            if (le0_22.lv) {
                if (le0_22 == this.bx) {
                    n = arrayList.size();
                }
                arrayList.add(le0_22);
            }
            if (!le0_22.Eo0 || (n2 = le0_22.LN(arrayList)) == -1) continue;
            n = n2;
        }
        return n;
    }

    public final boolean JQ() {
        if ((le0_2[])Vu.get() != null) {
            return false;
        }
        le0_2 root = (le0_2) this;
        while (root.K20 != null) {
            root = root.K20;
        }
        le0_2 focus = root;
        while (focus.bx != null) {
            focus = focus.bx;
        }
        if (focus == root) {
            focus = null;
        }
        Vu.set(new le0_2[]{focus});
        return true;
    }

    public final void XL0(le0_2 le0_22) {
        zk0_1 zk0_12 = this.Em0;
        if (le0_22.sO) {
            if (!kk && zk0_12 == null) {
                throw new AssertionError();
            }
            int n = zk0_12.fU() - 2;
            while (true) {
                int n2 = n;
                n = n2 + -1;
                if (n2 <= 1) break;
                qj_0 qj_02 = (qj_0)zk0_12.qA(n);
                le0_2 le0_23 = qj_02.LI0;
                while (le0_23 != null && le0_23 != le0_22) {
                    le0_23 = le0_23.K20;
                }
                if (le0_23 != le0_22) continue;
                zk0_12.TD(qj_02);
            }
        }
        le0_2.Dd(le0_22);
        if (zk0_12 != null) {
            le0_22.uQ(zk0_12);
        }
        le0_2 le0_24 = le0_22;
        le0_24.tb(zk0_12);
        le0_24.K20 = null;
        try {
            le0_24.t5();
        }
        catch (Exception exception) {
            Logger.getLogger(le0_2.class.getName()).log(Level.SEVERE, "Exception in destroy()", exception);
        }
        le0_2 le0_25 = le0_22;
        le0_2 le0_26 = (le0_2) this;
        int n = -le0_26.A20;
        int n3 = -le0_26.SB0;
        le0_25.E40(le0_25.A20 + n, le0_22.SB0 + n3);
        le0_25.lpt8(null, le0_25.yC0);
    }

    public final void GX(zk0_1 zk0_12) {
        if (!kk && this.Em0 != null) {
            throw new AssertionError((Object)"guiInstance must be null");
        }
        le0_2 le0_22 = (le0_2) this;
        le0_22.Em0 = zk0_12;
                KU childList = le0_22.t30;
                if (le0_22.t30 != null) {
                    le0_2[] le0_2Array = (le0_2[])childList.pa();
            int n = this.t30.KB;
            while (true) {
                int n2 = n;
                n = n2 + -1;
                if (n2 <= 0) break;
                le0_2Array[n].GX(zk0_12);
            }
            this.t30.Gj0();
        }
    }

    public final void Im(zk0_1 zk0_12) {
        if (!kk && this.Em0 != zk0_12) {
            throw new AssertionError((Object)"guiInstance must be equal to gui");
        }
        if (this.r90 != 0) {
            zk0_12.kb0 = true;
        }
        if (!this.z7) {
            this.M.W20(zk0_12);
        }
        try {
            this.C(zk0_12);
        }
        catch (Exception exception) {
            Logger.getLogger(le0_2.class.getName()).log(Level.SEVERE, "Exception in afterAddToGUI()", exception);
        }
            KU childList = this.t30;
            if (this.t30 != null) {
                le0_2[] le0_2Array = (le0_2[])childList.pa();
            int n = this.t30.KB;
            while (true) {
                int n2 = n;
                n = n2 + -1;
                if (n2 <= 0) break;
                le0_2Array[n].Im(zk0_12);
            }
            this.t30.Gj0();
        }
    }

    public final void tb(zk0_1 zk0_12) {
        if (!kk && this.Em0 != zk0_12) {
            throw new AssertionError((Object)"guiInstance must be null");
        }
        le0_2 le0_22 = (le0_2) this;
        le0_22.Em0 = null;
        le0_22.Gq0 = null;
        KU childList = le0_22.t30;
        if (le0_22.t30 != null) {
            le0_2[] le0_2Array = (le0_2[])childList.pa();
            int n = this.t30.KB;
            while (true) {
                int n2 = n;
                n = n2 + -1;
                if (n2 <= 0) break;
                le0_2Array[n].tb(zk0_12);
            }
            this.t30.Gj0();
        }
    }

    public final void uQ(zk0_1 zk0_12) {
        if (!kk && this.Em0 != zk0_12) {
            throw new AssertionError((Object)"guiInstance must be equal to gui");
        }
        KU childList = this.t30;
        if (this.t30 != null) {
            le0_2[] le0_2Array = (le0_2[])childList.pa();
            int n = this.t30.KB;
            while (true) {
                int n2 = n;
                n = n2 + -1;
                if (n2 <= 0) break;
                le0_2Array[n].uQ(zk0_12);
            }
            this.t30.Gj0();
        }
        this.bx = null;
        if (!this.z7) {
            this.M.W20(null);
        }
        try {
            this.N00(zk0_12);
        }
        catch (Exception exception) {
            Logger.getLogger(le0_2.class.getName()).log(Level.SEVERE, "Exception in beforeRemoveFromGUI()", exception);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    public final void lpt8(zk0_1 zk0_12, boolean bl) {
        bl &= this.yC0;
        if (this.OI == bl) {
            return;
        }
        this.OI = bl;
        if (!this.z7) {
            this.M.j70(pf0, !bl);
        }
        if (!bl) {
            if (zk0_12 != null) {
                if (this instanceof qj_0) {
                    zk0_12.TD((qj_0)(le0_2)this);
                }
                zk0_12.wP((le0_2) this);
            }
            try {
                this.yr0();
            } catch (Exception exception) {
                Logger.getLogger(le0_2.class.getName()).log(Level.SEVERE, "Exception in widgetDisabled()", exception);
            }
            try {
                this.f00();
            } catch (Exception exception) {
                Logger.getLogger(le0_2.class.getName()).log(Level.SEVERE, "Exception in giveupKeyboardFocus()", exception);
            }
        }
        try {
            this.ow("enabled", !bl, bl);
        } catch (Exception exception) {
            Logger.getLogger(le0_2.class.getName()).log(Level.SEVERE, "Exception in firePropertyChange(\"enabled\")", exception);
        }
        KU childList = this.t30;
        if (childList != null) {
            le0_2[] children = (le0_2[])childList.pa();
            int count = childList.KB;
            for (int i = count - 1; i >= 0; --i) {
                children[i].lpt8(zk0_12, bl);
            }
            childList.Gj0();
        }
    }

    /*
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Zo0(zk0_1 zk0_12) {
        if (this.z70.pb0) {
            this.xh();
        }
        float f = this.z70.gh0[0];
        float f2 = this.z70.gh0[1];
        float f3 = this.z70.gh0[2];
        float f4 = this.z70.gh0[3];
        qq_0 qq_02 = (qq_0)zk0_12.AK;
        qq_02.g50 = qq_02.g50.j60(f, f2, f3, f4);
        try {
            if (this.IM) {
                this.U10(zk0_12);
            } else {
                this.HP(zk0_12);
            }
        } catch (Throwable throwable) {
            qq_02.kY();
            throw throwable;
        }
        qq_02.kY();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    public final void U10(zk0_1 zk0_12) {
        int n;
        int n2;
        le0_2 le0_22 = (le0_2) this;
        int n3 = le0_22.A20;
        int n4 = le0_22.SB0;
        int n5 = le0_22.Mx;
        int n6 = le0_22.OB;
        qq_0 qq_02 = (qq_0)zk0_12.AK;
        le0_2 le0_23 = (le0_2) this;
        qq_02.al(n3, n4, n5, n6);
        try {
            n2 = le0_23.A20;
        }
        catch (Throwable throwable) {
            qq_02.Lpt9();
            throw throwable;
        }
        {
            n = le0_23.SB0;
        }
        {
            n3 = le0_23.Mx;
        }
        {
            n4 = le0_23.OB;
        }
        {
            this.oa0(zk0_12, n2, n, n3, n4);
            qq_02.Lpt9();
            return;
        }
    }

    public final void zX(R40 r40, Jn0 jn0, T8 t8) {
        KU childList = this.t30;
        if (this.t30 != null && jn0 != null) {
            le0_2[] le0_2Array = (le0_2[])childList.pa();
            int n = childList.KB;
            for (int i = 0; i < n; ++i) {
                Object object;
                le0_2 le0_22 = le0_2Array[i];
                le0_22.Gq0 = r40;
                if (le0_22.gW.length() > 0) {
                    object = le0_22.gW;
                    if (((String)object).length() > 1 && ((String)object).charAt(0) == '/') {
                        object = r40.VB(le0_22.gW.substring(1), true, true);
                    } else {
                        object = le0_22.gW;
                        object = ((xd0_2)jn0).vn((String)object, true);
                    }
                    if (object != null) {
                        try {
                            le0_22.Ib((Jn0)object);
                        } catch (Exception exception) {
                            Logger.getLogger(le0_2.class.getName()).log(Level.SEVERE, "Exception in applyTheme()", exception);
                        }
                    }
                } else {
                    object = jn0;
                }
                le0_22.zX(r40, (Jn0)object, t8);
            }
            this.t30.Gj0();
        }
    }

    public final StringBuilder Lf(int n) {
        n = this.gW.length() + n;
        String string = this.gW;
        boolean bl = string.length() > 1 && string.charAt(0) == '/';
        StringBuilder result;
        if (this.K20 != null && !bl) {
            result = this.K20.Lf(n + 1);
            if (this.gW.length() > 0 && result.length() > 0) {
                result.append('.');
            }
        } else {
            result = new StringBuilder(n);
        }
        if (bl) {
            return result.append(this.gW.substring(1));
        }
        return result.append(this.gW);
    }

    public String Ck() {
        return "widget";
    }

    public final void u5(PropertyChangeListener propertyChangeListener) {
        if (this.Xu == null) {
            this.Xu = new PropertyChangeSupport(this);
        }
        this.Xu.addPropertyChangeListener(propertyChangeListener);
    }

    public final le0_2 NI() {
        return this.K20;
    }

    public final boolean Bf0(le0_2 le0_22) {
        le0_2 le0_23 = this.K20;
        if (le0_23 == null) {
            return false;
        }
        if (le0_23 == le0_22) {
            return true;
        }
        return le0_23.Bf0(le0_22);
    }

    public void Ll(boolean bl) {
        if (this.eE != bl) {
            this.eE = bl;
            if (!bl) {
                le0_2 le0_22;
                le0_2 le0_23 = this.Em0;
                if (le0_23 != null) {
                    lg_0.k.lPT5(new X8((zk0_1)le0_23, (le0_2) this));
                    le0_22 = ((zk0_1)le0_23).Dq0;
                    while (le0_22 != null && le0_22 != this) {
                        le0_22 = le0_22.K20;
                    }
                    if (le0_22 == this) {
                        ((zk0_1)le0_23).JJ0();
                        ((zk0_1)le0_23).M70 = false;
                    }
                }
                if ((le0_23 = this.K20) != null) {
                    le0_22 = le0_23.bx;
                    if (le0_22 == this) {
                        le0_2.Dd(le0_22);
                        le0_23.bx = null;
                    }
                    if (le0_23.E30 == this) {
                        le0_23.E30 = null;
                    }
                }
            }
            le0_2 parent = this.K20;
            if (parent != null) {
                parent.ld();
            }
        }
    }

    public final boolean uo() {
        return this.OI;
    }

    public void pw0(boolean bl) {
        if (this.yC0 != bl) {
            le0_2 le0_22 = (le0_2) this;
            this.yC0 = bl;
            Object object = "locallyEnabled";
            le0_22.ow((String)object, bl ^ true, bl);
            zk0_1 zk0_12 = le0_22.Em0;
            object = le0_22.K20;
            boolean bl2 = object != null ? ((le0_2)object).OI : true;
            this.lpt8(zk0_12, bl2);
        }
    }

    public final int Nl0() {
        return this.A20;
    }

    public final int wF() {
        return this.SB0;
    }

    public final int R00() {
        return this.Mx;
    }

    public final int RR() {
        return this.OB;
    }

    public final int a3() {
        return Math.max(0, this.Mx - this.e80 - this.NV);
    }

    public final int k5() {
        return Math.max(0, this.OB - this.y9 - this.Cz);
    }

    public final int cz() {
        le0_2 le0_22 = (le0_2) this;
        int n = le0_22.A20;
        return Math.max(le0_22.e80, this.Mx - this.NV) + n;
    }

    public final int VM() {
        le0_2 le0_22 = (le0_2) this;
        int n = le0_22.SB0;
        return Math.max(le0_22.y9, this.OB - this.Cz) + n;
    }

    public final boolean yv0(int n, int n2) {
        int n3;
        int n4 = this.A20;
        return n >= n4 && n2 >= (n3 = this.SB0) && n < n4 + this.Mx && n2 < n3 + this.OB;
    }

    public void iv(int n, int n2) {
        le0_2 le0_22 = (le0_2) this;
        le0_22.oY(n, n2);
        le0_22.RY(n, n2);
        le0_22.g2(n, n2);
    }

    public final void kh0() {
        le0_2 le0_22 = (le0_2) this;
        le0_22.iv(le0_22.Em0.Mx, this.Em0.OB);
        le0_22.sy(0, 0);
    }

    public final boolean oY(int n, int n2) {
        if (n >= 0 && n2 >= 0) {
            int n3 = this.Mx;
            int n4 = this.OB;
            if (n3 == n && n4 == n2) {
                return false;
            }
            le0_2 le0_22 = (le0_2) this;
            this.Mx = n;
            le0_22.OB = n2;
            le0_22.Ej0();
            if (le0_22.Xu != null) {
                le0_2 le0_23 = (le0_2) this;
                le0_23.vI0(n3, n, "width");
                le0_23.vI0(n4, n2, "height");
            }
            return true;
        }
        Logger.getLogger(le0_2.class.getName()).log(Level.SEVERE, "Exception in setSize() " + this.Lf(0).toString(), new IllegalArgumentException("negative size"));
        return false;
    }

    public final short Bx() {
        return this.y9;
    }

    public final short Vx0() {
        return this.e80;
    }

    public final short P6() {
        return this.Cz;
    }

    public final short DN() {
        return this.NV;
    }

    public final boolean vi(int n, int n2, int n3, int n4) {
        if (n >= 0 && n2 >= 0 && n3 >= 0 && n4 >= 0) {
            if (this.y9 == n && this.Cz == n3 && this.e80 == n2 && this.NV == n4) {
                return false;
            }
            le0_2 le0_22 = (le0_2) this;
            int n5 = n3;
            int n6 = n4;
            int n7 = n;
            int n8 = n2;
            int n9 = n;
            int n10 = n2;
            le0_2 le0_23 = (le0_2) this;
            n = le0_23.a3();
            n2 = le0_23.k5();
            n3 = n10 - le0_23.e80;
            n4 = n9 - this.y9;
            this.e80 = (short)n8;
            this.y9 = (short)n7;
            this.NV = (short)n6;
            le0_22.Cz = (short)n5;
            KU childList = le0_22.t30;
            if (le0_22.t30 != null && (n3 != 0 || n4 != 0)) {
                le0_2[] le0_2Array = (le0_2[])childList.pa();
                int n11 = this.t30.KB;
                for (int i = 0; i < n11; ++i) {
                    le0_2 le0_24 = le0_2Array[i];
                    le0_24.E40(le0_24.A20 + n3, le0_24.SB0 + n4);
                }
                this.t30.Gj0();
            }
            le0_2 le0_25 = (le0_2) this;
            le0_25.gC0(n, n2);
            le0_25.COm3();
            return true;
        }
        throw new IllegalArgumentException("negative border size");
    }

    public int R1() {
        return Math.max(this.vK0, this.e80 + this.NV);
    }

    public int Se() {
        return Math.max(this.tU, this.y9 + this.Cz);
    }

    public void RY(int n, int n2) {
        if (n >= 0 && n2 >= 0) {
            this.vK0 = (short)Math.min(n, Short.MAX_VALUE);
            this.tU = (short)Math.min(n2, Short.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("negative size");
    }

    public int pi0() {
        le0_2 le0_22 = (le0_2) this;
        int n = le0_22.A20 + this.e80;
        KU childList = le0_22.t30;
        if (le0_22.t30 != null) {
            le0_2[] le0_2Array = (le0_2[])childList.pa();
            int n2 = this.t30.KB;
            for (int i = 0; i < n2; ++i) {
                le0_2 le0_23 = le0_2Array[i];
                n = Math.max(n, le0_23.A20 + le0_23.Mx);
            }
            this.t30.Gj0();
        }
        return n - (this.A20 + this.e80);
    }

    public int m0() {
        le0_2 le0_22 = (le0_2) this;
        int n = le0_22.e80 + this.NV;
        n = le0_22.pi0() + n;
        wl0_2 wl0_22 = le0_22.Jj0;
        if (wl0_22 != null) {
            n = Math.max(n, wl0_22.Nx());
        }
        return Math.max(this.vK0, n);
    }

    public int zs0() {
        le0_2 le0_22 = (le0_2) this;
        int n = le0_22.SB0 + this.y9;
        KU childList = le0_22.t30;
        if (le0_22.t30 != null) {
            le0_2[] le0_2Array = (le0_2[])childList.pa();
            int n2 = this.t30.KB;
            for (int i = 0; i < n2; ++i) {
                le0_2 le0_23 = le0_2Array[i];
                n = Math.max(n, le0_23.SB0 + le0_23.OB);
            }
            this.t30.Gj0();
        }
        return n - (this.SB0 + this.y9);
    }

    public int rm0() {
        le0_2 le0_22 = (le0_2) this;
        int n = le0_22.y9 + this.Cz;
        n = le0_22.zs0() + n;
        wl0_2 wl0_22 = le0_22.Jj0;
        if (wl0_22 != null) {
            n = Math.max(n, wl0_22.Af());
        }
        return Math.max(this.tU, n);
    }

    public int S2() {
        return this.Ya0;
    }

    public int KC0() {
        return this.G4;
    }

    public void g2(int n, int n2) {
        if (n >= 0 && n2 >= 0) {
            this.Ya0 = (short)Math.min(n, Short.MAX_VALUE);
            this.G4 = (short)Math.min(n2, Short.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("negative size");
    }

    public void lt0() {
        le0_2 le0_22 = (le0_2) this;
        le0_2 le0_23 = (le0_2) this;
        int n = le0_23.m0();
        le0_2 le0_24 = (le0_2) this;
        int n2 = le0_24.rm0();
        le0_22.oY(le0_2.du0(le0_22.R1(), n, le0_23.S2()), le0_2.du0(this.Se(), n2, le0_24.KC0()));
        le0_22.Iu();
    }

    public void COm3() {
        if (this.r90 < 3) {
            le0_2 le0_22 = (le0_2) this;
            le0_22.bA0();
            le0_2 le0_23 = le0_22.K20;
            if (le0_23 != null) {
                this.r90 = 3;
                le0_23.es((le0_2) this);
            }
        }
    }

    public void Iu() {
        if (this.r90 != 0) {
            this.r90 = 0;
            this.K8();
        }
        KU childList = this.t30;
        if (this.t30 != null) {
            le0_2[] le0_2Array = (le0_2[])childList.pa();
            int n = this.t30.KB;
            for (int i = 0; i < n; ++i) {
                le0_2Array[i].Iu();
            }
            this.t30.Gj0();
        }
    }

    public String vV() {
        return this.gW;
    }

    public final void kx0(String string) {
        if (string.equals(this.gW)) {
            return;
        }
        le0_2 le0_22 = (le0_2) this;
        le0_22.uf(string);
        le0_22.yI();
    }

    public final String aq() {
        return this.Lf(0).toString();
    }

    public final wl0_2 Jh0() {
        return this.Jj0;
    }

    public dc0_0 KK0(i70_0 i70_02) {
        return this.Zt;
    }

    public final int fU() {
        KU kU = this.t30;
        if (kU != null) {
            return kU.KB;
        }
        return 0;
    }

    public final le0_2 qA(int n) {
        KU kU = this.t30;
        if (kU != null) {
            return (le0_2)kU.get(n);
        }
        throw new IndexOutOfBoundsException();
    }

    public void SL(le0_2 le0_22) {
        le0_2 le0_23 = (le0_2) this;
        le0_23.F9(le0_23.fU(), le0_22);
    }

    public final int Dp(le0_2 le0_22) {
        KU kU = this.t30;
        if (kU != null) {
            return kU.E8(le0_22, true);
        }
        return -1;
    }

    public boolean xe0() {
        le0_2 le0_22 = (le0_2) this;
        le0_22.t5();
        le0_2 le0_23 = le0_22.K20;
        if (le0_23 != null) {
            return le0_23.u3((le0_2) this);
        }
        return false;
    }

    public boolean u3(le0_2 le0_22) {
        int n = this.Dp(le0_22);
        if (n >= 0) {
            this.fC0(n);
            return true;
        }
        return false;
    }

    public le0_2 fC0(int n) {
        KU kU = this.t30;
        if (kU == null) {
            throw new IndexOutOfBoundsException();
        }
        le0_2 le0_22 = (le0_2) this;
        le0_2 le0_23 = (le0_2)kU.Tx0(n);
        le0_22.XL0(le0_23);
        if (le0_22.E30 == le0_23) {
            this.E30 = null;
        }
        if (this.bx == le0_23) {
            this.bx = null;
        }
        this.zf();
        return le0_23;
    }

    public void em() {
        KU childList = this.t30;
        if (childList != null) {
            le0_2 le0_22 = (le0_2) this;
            le0_22.bx = null;
            le0_22.E30 = null;
            le0_2[] children = (le0_2[])childList.pa();
            int n = childList.KB;
            for (int i = 0; i < n; ++i) {
                this.XL0(children[i]);
            }
            le0_2 le0_23 = (le0_2) this;
            le0_23.t30.Gj0();
            le0_23.t30.clear();
            if (le0_23.sO) {
                zk0_1 gui = this.Em0;
                if (!kk && gui == null) {
                    throw new AssertionError();
                }
                this.dv(gui);
            }
            this.Pp0();
        }
    }

    public final void aS(Class object) {
        KU childList = this.t30;
        if (this.t30 != null) {
            es_1 es_12 = new es_1();
            le0_2 le0_22 = (le0_2) this;
            le0_22.bx = null;
            le0_22.E30 = null;
            le0_2[] le0_2Array = (le0_2[])childList.pa();
            es_1 es_13 = es_12;
            int n = this.t30.KB;
            for (int i = 0; i < n; ++i) {
                le0_2 le0_23 = le0_2Array[i];
                if (!((Class)object).isInstance(le0_23)) continue;
                es_13.Ue0(le0_23);
                this.XL0(le0_23);
            }
            le0_2 le0_24 = (le0_2) this;
            le0_24.t30.Gj0();
            le0_24.t30.fp0(es_13, false);
            if (le0_24.sO) {
                zk0_1 gui = this.Em0;
                if (!kk && gui == null) {
                    throw new AssertionError();
                }
                this.dv(gui);
            }
        }
    }

    public void t5() {
        block15: {
            int n;
            le0_2 target = (le0_2) this;
            KU childList = target.t30;
            if (target.t30 != null) {
                le0_2[] le0_2Array = (le0_2[])childList.pa();
                int n2 = childList.KB;
                for (n = 0; n < n2; n += 1) {
                    le0_2Array[n].t5();
                }
                target.t30.Gj0();
            }
            if (target.zV <= 0) break block15;
            le0_2 le0_22 = target;
            Qf qf = ((qq_0)le0_22.Em0.AK).GC0;
            int n3 = le0_22.zV;
            if (qf.Zy0 != null) {
                throw new IllegalStateException("endCache must be called before begin.");
            }
            n = 1;
            Object object = qf.mc0.COM6.st0(n != 0);
            es_1 textureList = qf.BU;
            if (n3 == textureList.KB - 1) {
                ET eT;
                ((Buffer)object).limit(((ET)textureList.Tx0(n3)).ZS);
                if (qf.Zy0 != null) {
                    throw new IllegalStateException("endCache must be called before begin.");
                }
                qf.mc0.Sw0.Id();
                n3 = 1;
                FloatBuffer floatBuffer = qf.mc0.COM6.st0(n3 != 0);
                n3 = qf.BU.KB;
                eT = new ET(n3, floatBuffer.limit());
                qf.Zy0 = eT;
                textureList.Ue0(eT);
                floatBuffer.compact();
            } else {
                qf.Zy0 = (ET)textureList.get(n3);
                ((Buffer)object).position(qf.Zy0.ZS);
            }
            ET eT = qf.Zy0;
            if (eT == null) {
                throw new IllegalStateException("beginCache must be called before endCache.");
            }
            int n4 = 0;
            n4 = qf.mc0.COM6.st0(n4 != 0).position() - eT.ZS;
            Texture[] textureArray = eT.VJ;
            if (eT.VJ == null) {
                eT.vI = n4;
                es_1 es_12 = qf.JG;
                eT.xU = es_12.KB;
                eT.VJ = (Texture[])es_12.Mo0(Texture.class);
                eT.Lt0 = new int[eT.xU];
                int n5 = qf.gI0.Ml;
                for (n4 = 0; n4 < n5; ++n4) {
                    eT.Lt0[n4] = qf.gI0.X8(n4);
                }
                boolean bl = true;
                ((Buffer)qf.mc0.COM6.st0(bl)).flip();
            } else {
                int n6;
                if (n4 > eT.vI) {
                    throw new nf_1(fp0_0.uD(CO.go("If a cache is not the last created, it cannot be redefined with more entries than when it was first created: ", n4, " ("), eT.vI, " max)"));
                }
                eT.xU = n4 = qf.JG.KB;
                if (textureArray == null || textureArray.length < n4) {
                    eT.VJ = new Texture[n4];
                }
                for (n6 = 0; n6 < n4; ++n6) {
                    eT.VJ[n6] = (Texture)qf.JG.get(n6);
                }
                n4 = eT.xU;
                if (eT.Lt0.length < n4) {
                    eT.Lt0 = new int[n4];
                }
                for (n6 = 0; n6 < n4; ++n6) {
                    eT.Lt0[n6] = qf.gI0.X8(n6);
                }
                boolean bl = true;
                FloatBuffer floatBuffer = qf.mc0.COM6.st0(bl);
                ((Buffer)floatBuffer).position(0);
                es_1 es_13 = qf.BU;
                ET eT2 = (ET)es_13.get(es_13.KB - 1);
                ((Buffer)floatBuffer).limit(eT2.ZS + eT2.vI);
            }
            qf.Zy0 = null;
            qf.JG.clear();
            qf.gI0.Ml = 0;
        }
    }

    public final void Oq0(boolean bl) {
        this.lv = bl;
    }

    public boolean BL() {
        le0_2 le0_22 = this.K20;
        if (le0_22 != null && this.eE) {
            if (le0_22.bx == this) {
                return true;
            }
            boolean bl = this.JQ();
            try {
                boolean bl2 = this.K20.nA0((le0_2) this);
                return bl2;
            }
            finally {
                if (bl) {
                    Vu.set(null);
                }
            }
        }
        return false;
    }

    public void f00() {
        le0_2 le0_22 = this.K20;
        if (le0_22 != null && le0_22.bx == this) {
            le0_22.nA0(null);
        }
    }

    public boolean Of() {
        le0_2 le0_22 = this.K20;
        if (le0_22 == null) {
            return false;
        }
        return le0_22.bx == this;
    }

    public final KG0 Ed0() {
        return this.M;
    }

    public final N1 nf() {
        return this.z70;
    }

    public final void LPT8(N1 n1) {
        this.z70 = n1;
    }

    public Object AR() {
        return this.yj0;
    }

    public void Xr0(Object object) {
        this.yj0 = object;
        this.yB0();
    }

    public final pu_2 v() {
        if (this.o5 == null) {
            this.o5 = new pu_2();
        }
        return this.o5;
    }

    public le0_2 BQ(int n, int n2) {
        le0_2 le0_22 = this.dh0(n, n2);
        if (le0_22 != null) {
            return le0_22.BQ(n, n2);
        }
        return (le0_2) this;
    }

    public void Ib(Jn0 object) {
        block5: {
            LC0 lC0;
            block4: {
                this.Qa((Jn0)object);
                this.el0((Jn0)object);
                this.uA0((Jn0)object);
                Object object2 = "offscreenExtra";
                int n = 0;
                Class<ux0_0> clazz = ux0_0.class;
                lC0 = (LC0)object;
                object2 = (ux0_0)lC0.N30((String)object2, n != 0, clazz, null);
                if (object2 == null) break block4;
                Object object3 = object2;
                int n2 = ((ux0_0)object3).ZK0;
                n = ((ux0_0)object3).W30;
                int n3 = ((ux0_0)object3).Ar0;
                if (((ux0_0)object2).aP < 0 || n2 < 0 || n < 0 || n3 < 0) break block5;
            }
            this.a80((Jn0)object);
            this.Kz0((Jn0)object);
            this.ZP((Jn0)object);
            this.Kj = (hd_1)lC0.N30("inputMap", false, hd_1.class, null);
            String tooltip = "tooltip";
            this.LT = lC0.wa0.B20(tooltip);
            if (this.yj0 == null) {
                this.yB0();
            }
            this.COm3();
            return;
        }
        throw new IllegalArgumentException("negative offscreen extra size");
    }

    public void Qa(Jn0 jn0) {
        this.Jj0 = ((LC0)((Object)jn0)).uT("background");
    }

    public void el0(Jn0 jn0) {
        this.ga0 = ((LC0)((Object)jn0)).uT("overlay");
    }

    public void uA0(Jn0 object) {
        Jn0 jn0 = object;
        String borderName = "border";
        Class<ux0_0> clazz = ux0_0.class;
        ux0_0 border = (ux0_0)((LC0)jn0).N30(borderName, false, clazz, null);
        if (border == null) {
            this.vi(0, 0, 0, 0);
        } else {
            this.vi(border.aP, border.ZK0, border.W30, border.Ar0);
        }
    }

    public void a80(Jn0 jn0) {
        this.RY(((LC0)((Object)jn0)).H10(0, "minWidth"), ((LC0)((Object)jn0)).H10(0, "minHeight"));
    }

    public void Kz0(Jn0 jn0) {
        this.g2(((LC0)((Object)jn0)).H10(Short.MAX_VALUE, "maxWidth"), ((LC0)((Object)jn0)).H10(Short.MAX_VALUE, "maxHeight"));
    }

    public void ZP(Jn0 jn0) {
        this.Zt = ((LC0)((Object)jn0)).oX("mouseCursor");
    }

    public Object rd(int n, int n2) {
        Object object = this.AR();
        if (object == null) {
            object = this.LT;
        }
        return object;
    }

    public final void yB0() {
        zk0_1 zk0_12 = this.Em0;
        if (zk0_12 != null && zk0_12.Dq0 == this) {
            zk0_12.Dq0 = null;
        }
    }

    public final void ur0() {
        zk0_1 zk0_12 = this.Em0;
        if (zk0_12 != null && zk0_12.Dq0 == this) {
            zk0_1 zk0_13 = zk0_12;
            zk0_13.Dq0 = null;
            zk0_13.JJ0();
            zk0_13.M70 = false;
            zk0_13.Fs = zk0_13.ss0;
        }
    }

    public void nE() {
    }

    public final void Na(String string, Runnable runnable) {
        this.v().B8(string, runnable, 1);
    }

    public void yI() {
        R40 r40 = this.Gq0;
        if (r40 != null) {
            this.pO(r40);
        }
    }

    public boolean no0(i70_0 i70_02) {
        i70_0 i70_03 = i70_02;
        int n = i70_03.f8;
        return this.yv0(n, i70_03.AN);
    }

    public boolean nd0(i70_0 event) {
        if (!E00.ZU(event.zu)) {
            return false;
        }
        if (this.t30 != null) {
            if (this.lk && this.Em0 != null) {
                zk0_1 gui = this.Em0;
                if (gui.T90 == null) {
                    i70_0 focusEvent = gui.Lh0;
                    if (focusEvent.finally$ == 61 && (focusEvent.J30 & 0x636) == 0) {
                        gui.T90 = (le0_2) this;
                    }
                }
            }
            le0_2 keyboardFocusChild = this.bx;
            if (keyboardFocusChild != null && keyboardFocusChild.eE
                    && keyboardFocusChild.nd0(event)) {
                return true;
            }
        }
        hd_1 bindings = this.Kj;
        if (bindings == null) {
            return false;
        }

        int eventMask = event.J30;
        int actionMask = 0;
        if ((eventMask & 9) != 0) {
            actionMask = 1;
        }
        if ((eventMask & 0x24) != 0) {
            actionMask |= 2;
        }
        if ((eventMask & 0x12) != 0) {
            actionMask |= 4;
        }
        if ((eventMask & 2) != 0) {
            actionMask |= 0x14;
        }
        if ((eventMask & 0x600) != 0) {
            actionMask |= 8;
        }

        String action = null;
        TU[] actions = bindings.Ts0;
        for (TU candidate : actions) {
            if (actionMask != candidate.DI0) {
                continue;
            }
            int eventType = candidate.PP;
            if (eventType != 0 && eventType != event.finally$) {
                continue;
            }
            if (candidate.gl != '\u0000' && (!event.L8() || candidate.gl != event.TD)) {
                continue;
            }
            action = candidate.r90;
            break;
        }
        if (action == null) {
            return false;
        }
        if (this.OE(event, action)) {
            return true;
        }
        if (Wy) {
            Logger.getLogger(this.getClass().getName()).log(
                    Level.WARNING,
                    "Unhandled action ''{0}'' for class ''{1}''",
                    new Object[]{action, this.getClass().getName()});
        }
        return false;
    }

    public final void ND0(int n, int n2) {
        int n3;
        KU kU = this.t30;
        if (kU == null) {
            throw new IndexOutOfBoundsException();
        }
        if (n2 >= 0 && n2 < (n3 = kU.KB)) {
            if (n >= 0 && n < n3) {
                le0_2 child = (le0_2)kU.Tx0(n);
                this.t30.P6(n2, child);
                return;
            }
            throw new IndexOutOfBoundsException("from");
        }
        throw new IndexOutOfBoundsException("to");
    }

    public boolean nA0(le0_2 child) {
        if (child != null && child.K20 != this) {
            throw new IllegalArgumentException("not a direct child");
        }
        le0_2 oldChild = this.bx;
        if (oldChild != child) {
            if (child == null) {
                le0_2.Dd(oldChild);
                this.bx = null;
                this.Pv0(null);
            } else {
                boolean resetThreadLocal = this.JQ();
                int oldFocusTraversal = this.Pl0;
                try {
                    if (oldFocusTraversal == 0) {
                        this.Pl0 = 3;
                    }
                    if (!this.BL()) {
                        return false;
                    }
                    this.Pl0 = oldFocusTraversal;
                    le0_2.Dd(this.bx);
                    this.bx = child;
                    this.Pv0(child);
                    if (!child.z7) {
                        child.M.j70(gz, true);
                    }
                    int childFocusTraversal = child.Pl0;
                    le0_2[] focusPath = (le0_2[])Vu.get();
                    if (childFocusTraversal == 0) {
                        childFocusTraversal = 4;
                    }
                    le0_2 focusOwner = focusPath == null ? null : focusPath[0];
                    child.mz0(childFocusTraversal, focusOwner);
                } catch (Throwable throwable) {
                    this.Pl0 = oldFocusTraversal;
                    throw throwable;
                } finally {
                    if (resetThreadLocal) {
                        Vu.set(null);
                    }
                }
            }
        }
        if (!this.z7) {
            this.M.j70(rH, this.bx != null);
        }
        return this.bx != null;
    }

    public void N00(zk0_1 zk0_12) {
    }

    public void C(zk0_1 zk0_12) {
    }

    public void K8() {
    }

    public void N70() {
    }

    public void Ej0() {
        this.bA0();
    }

    public void es(le0_2 le0_22) {
        this.COm3();
    }

    public void Pp0() {
        this.COm3();
    }

    public void Pv0(le0_2 le0_22) {
    }

    public void Bt() {
    }

    public void hs() {
    }

    public void yr0() {
    }

    public void HP(zk0_1 zk0_12) {
        le0_2 le0_22 = (le0_2) this;
        le0_22.aUX(zk0_12);
        le0_22.FW(zk0_12);
            KU childList = le0_22.t30;
            if (le0_22.t30 != null) {
                le0_2[] le0_2Array = (le0_2[])childList.pa();
            int n = this.t30.KB;
            for (int i = 0; i < n; ++i) {
                le0_2 le0_23 = le0_2Array[i];
                if (le0_23 == null || !le0_23.eE) continue;
                N1 n1 = le0_23.z70;
                if (n1 != null && n1.LpT8) {
                    le0_23.Zo0(zk0_12);
                    continue;
                }
                if (le0_23.IM) {
                    le0_23.U10(zk0_12);
                    continue;
                }
                le0_23.HP(zk0_12);
            }
            this.t30.Gj0();
        }
        this.Dw0(zk0_12);
    }

    public void oa0(zk0_1 zk0_12, int n, int n2, int n3, int n4) {
        le0_2 le0_22 = (le0_2) this;
        le0_22.aUX(zk0_12);
        le0_22.FW(zk0_12);
        KU childList = le0_22.t30;
        if (le0_22.t30 != null) {
            le0_2[] le0_2Array = (le0_2[])childList.pa();
            int n5 = this.t30.KB;
            for (int i = 0; i < n5; ++i) {
                le0_2 le0_23 = le0_2Array[i];
                if (!le0_23.eE) continue;
                N1 n1 = le0_23.z70;
                if (n1 != null && n1.LpT8) {
                    le0_23.Zo0(zk0_12);
                    continue;
                }
                if (le0_23.IM) {
                    le0_23.U10(zk0_12);
                    continue;
                }
                int n6 = le0_23.SB0;
                int n7 = le0_23.OB;
                if ((n2 >= n6 + n7 || n2 + n4 <= n6) && n4 >= n7) continue;
                le0_23.oa0(zk0_12, n, n2, n3, n4);
            }
            this.t30.Gj0();
        }
        this.Dw0(zk0_12);
    }

    public void FW(zk0_1 zk0_12) {
    }

    public void aUX(zk0_1 object) {
        wl0_2 background = this.Jj0;
        if (background != null) {
            background.uf(this.M, this.A20, this.SB0, this.Mx, this.OB);
        }
    }

    public void Dw0(zk0_1 object) {
        wl0_2 overlay = this.ga0;
        if (overlay != null) {
            overlay.uf(this.M, this.A20, this.SB0, this.Mx, this.OB);
        }
    }

    public void Kp0(zk0_1 zk0_12, int n, int n2, int n3) {
    }

    public final void bA0() {
        if (this.r90 < 1) {
            this.r90 = 1;
            zk0_1 gui = this.Em0;
            if (gui != null) {
                gui.kb0 = true;
            }
        }
    }

    public final void uM(le0_2 le0_22) {
        if (le0_22.K20 == this) {
            le0_2 le0_23 = (le0_2) this;
            le0_22.sy(this.A20 + this.e80, this.SB0 + this.y9);
            int n = le0_23.a3();
            le0_22.oY(n, le0_23.k5());
            return;
        }
        throw new IllegalArgumentException("can only layout direct children");
    }

    public final le0_2 dh0(int n, int n2) {
        KU childList = this.t30;
        if (childList != null) {
            block2: {
                le0_2 le0_22;
                le0_2[] children = (le0_2[])childList.pa();
                int n3 = childList.KB;
                do {
                    int n4 = n3;
                    n3 = n4 + -1;
                    if (n4 <= 0) break block2;
                    le0_22 = children[n3];
                } while (!le0_22.eE || !le0_22.yv0(n, n2));
                return le0_22;
            }
            this.t30.Gj0();
        }
        return null;
    }

    public void xh() {
        this.z70.dn0();
    }

    public final void ow(String string, boolean bl, boolean bl2) {
        PropertyChangeSupport propertyChangeSupport = this.Xu;
        if (propertyChangeSupport != null) {
            propertyChangeSupport.firePropertyChange(string, bl, bl2);
        }
    }

    public void ej(le0_2 le0_22) {
        this.K20 = le0_22;
    }

    public final void xg0(zk0_1 zk0_12, boolean bl) {
        if (this.sO != bl) {
            this.sO = bl;
            if (!this.z7) {
                this.M.j70(Hp0, bl);
            }
            le0_2 parent = this.K20;
            if (parent != null) {
                if (bl) {
                    parent.xg0(zk0_12, true);
                } else {
                    parent.dv(zk0_12);
                }
            }
        }
    }

    public final void dv(zk0_1 zk0_12) {
        block3: {
            int n = zk0_12.fU() - 2;
            do {
                int n2 = n;
                n = n2 + -1;
                if (n2 <= 1) break block3;
            } while (((qj_0)zk0_12.qA((int)n)).LI0 != this);
            this.xg0(zk0_12, true);
            return;
        }
        KU childList = this.t30;
        if (childList != null) {
            block4: {
                le0_2[] children = (le0_2[])childList.pa();
                int n = childList.KB;
                do {
                    int n3 = n;
                    n = n3 + -1;
                    if (n3 <= 0) break block4;
                } while (!children[n].sO);
                this.xg0(zk0_12, true);
                return;
            }
            childList.Gj0();
        }
        this.xg0(zk0_12, false);
    }

    public le0_2 UA0() {
        if (!this.eE) {
            return null;
        }
        le0_2 result = (le0_2) this;
        while (result.E30 != null && result.eE) {
            result = result.E30;
        }
        return result;
    }

    public final boolean E40(int n, int n2) {
        int n3 = n - this.A20;
        int n4 = n2 - this.SB0;
        if (n3 == 0 && n4 == 0) {
            return false;
        }
        le0_2 le0_22 = (le0_2) this;
        le0_22.A20 = n;
        le0_22.SB0 = n2;
        KU childList = le0_22.t30;
        if (childList != null) {
            le0_2[] children = (le0_2[])childList.pa();
            int n5 = childList.KB;
            for (int i = 0; i < n5; ++i) {
                le0_2 le0_23 = children[i];
                le0_23.E40(le0_23.A20 + n3, le0_23.SB0 + n4);
            }
            childList.Gj0();
        }
        le0_2 le0_24 = (le0_2) this;
        le0_24.N70();
        if (le0_24.Xu != null) {
            this.vI0(n - n3, n, "x");
            this.vI0(n2 - n4, n2, "y");
        }
        return true;
    }

    public void pO(R40 r40) {
        this.Gq0 = r40;
        String themePath = this.Lf(0).toString();
        if (themePath.length() == 0) {
            KU childList = this.t30;
            if (childList != null) {
                le0_2[] children = (le0_2[])childList.pa();
                int n = childList.KB;
                for (int i = 0; i < n; ++i) {
                    children[i].pO(r40);
                }
                childList.Gj0();
            }
            return;
        }
        T8 themeContext = (T8)T8.wD0.get();
        themeContext.getClass();
        Jn0 jn0 = r40.VB(themePath, true, true);
        if (jn0 != null && this.gW.length() > 0) {
            try {
                this.Ib(jn0);
            } catch (Exception exception) {
                Logger.getLogger(le0_2.class.getName()).log(Level.SEVERE, "Exception in applyTheme()", exception);
            }
        }
        this.zX(r40, jn0, themeContext);
    }

    public le0_2 r1(i70_0 i70_02) {
        if (!kk && i70_02.VP) {
            throw new AssertionError();
        }
        le0_2 result = null;
        le0_2 candidate = null;
        KU childList = this.t30;
        if (childList != null) {
            le0_2[] children = (le0_2[])childList.pa();
            int count = childList.KB;
            for (int i = count - 1; i >= 0; --i) {
                candidate = children[i];
                if (!candidate.eE || !candidate.no0(i70_02) || !this.Xv(candidate, i70_02)) {
                    continue;
                }
                int eventType = i70_02.zu;
                if (eventType == 1 || eventType == 7) {
                    childList.Gj0();
                    return candidate;
                }
                result = candidate.r1(i70_02);
                if (result != null) {
                    break;
                }
            }
            if (result != null && i70_02.zu == 3 && this.bx != candidate) {
                try {
                    candidate.Pl0 = 2;
                    if (candidate.OI && candidate.lv) {
                        this.nA0(candidate);
                    }
                    candidate.Pl0 = 0;
                } catch (Throwable throwable) {
                    candidate.Pl0 = 0;
                    childList.Gj0();
                    throw throwable;
                }
            }
            childList.Gj0();
            if (result != null) {
                return result;
            }
        }
        if (i70_02.zu == 3 && this.OI && this.lv) {
            try {
                this.Pl0 = 2;
                if (this.bx != null) {
                    this.nA0(null);
                }
                this.BL();
                this.Pl0 = 0;
            } catch (Throwable throwable) {
                this.Pl0 = 0;
                throw throwable;
            }
        }
        if (i70_02.zu != 8) {
            this.Xv(null, i70_02);
        }
        if (!this.OI) {
            int n = i70_02.zu;
            if (n == 3) return (le0_2) this;
            if (n == 4) return (le0_2) this;
            if (n == 5) return (le0_2) this;
            if (n == 6) {
                return (le0_2) this;
            }
        }
        if (!this.nd0(i70_02)) return null;
        return (le0_2) this;
    }

    public final void ga0(i70_0 i70_02) {
        le0_2 le0_22 = (le0_2) this;
        le0_22.nd0(i70_02);
        KU childList = le0_22.t30;
        if (childList != null) {
            le0_2[] children = (le0_2[])childList.pa();
            int n = childList.KB;
            for (int i = 0; i < n; ++i) {
                children[i].ga0(i70_02);
            }
            childList.Gj0();
        }
    }

    public final boolean Xv(le0_2 le0_22, i70_0 i70_02) {
        if (this.E30 != le0_22) {
            if (le0_22 != null && le0_22.r1(i70_02.K3(1)) == null) {
                return false;
            }
            le0_2 le0_23 = this.E30;
            if (le0_23 != null) {
                le0_23.r1(i70_02.K3(7));
            }
            this.E30 = le0_22;
        }
        return true;
    }

    public final void iY(ArrayList arrayList) {
        if (this.r90 != 0) {
            arrayList.add((le0_2) this);
        }
        KU childList = this.t30;
        if (this.t30 != null) {
            le0_2[] le0_2Array = (le0_2[])childList.pa();
            int n = this.t30.KB;
            for (int i = 0; i < n; ++i) {
                le0_2Array[i].iY(arrayList);
            }
            this.t30.Gj0();
        }
    }

    public int yd0() {
        return this.GH0;
    }

    public void Bb(int n) {
        this.GH0 = n;
    }

    public int Xg0() {
        return 0;
    }

    public int R90() {
        return 0;
    }

    public void lPT3() {
        KU childList = this.t30;
        if (this.t30 != null) {
            le0_2[] le0_2Array = (le0_2[])childList.pa();
            int n = this.t30.KB;
            for (int i = 0; i < n; ++i) {
                le0_2 le0_22 = le0_2Array[i];
                if (!le0_22.eE) continue;
                le0_22.lPT3();
            }
            this.t30.Gj0();
        }
    }

    public boolean f2() {
        return this instanceof EN;
    }

    public final le0_2 K() {
        if (!this.Of()) {
            return null;
        }
        le0_2 result = (le0_2) this;
        le0_2 child;
        while ((child = result.bx) != null) {
            result = child;
        }
        return result;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    public final boolean Uz(int n, boolean bl) {
        ArrayList<le0_2> focusables = new ArrayList<>();
        int n2 = this.LN(focusables);
        if (focusables.isEmpty()) {
            return false;
        }
        if (n < 0) {
            if (!bl || (n = n2 + -1) < 0) {
                n = focusables.size() - 1;
            }
        } else if (!bl || (n = n2 + 1) >= focusables.size()) {
            n = 0;
        }
        le0_2 object = focusables.get(n);
        try {
            ((le0_2)object).Pl0 = 1;
            ((le0_2)object).nA0(null);
        }
        catch (Throwable throwable) {
            ((le0_2)object).Pl0 = 0;
            throw throwable;
        }
        {
            ((le0_2)object).BL();
        }
        ((le0_2)object).Pl0 = 0;
        return true;
    }

    public void F9(int n, le0_2 le0_22) {
        if (le0_22 == null) {
            throw new IllegalArgumentException("child is null");
        }
        if (le0_22 == this) {
            throw new IllegalArgumentException("can't add to self");
        }
        if (le0_22.K20 != null) {
            throw new IllegalArgumentException("child widget already in tree");
        }
        if (this.t30 == null) {
            this.t30 = new KU(true, 4, le0_2.class);
        }
        if (n >= 0 && n <= this.t30.KB) {
            le0_2 le0_23 = (le0_2) this;
            le0_22.ej((le0_2) this);
            le0_23.t30.P6(n, le0_22);
            Object object = le0_23.Em0;
            if (object != null) {
                le0_22.GX((zk0_1)object);
            }
            le0_2 le0_24 = le0_22;
            le0_2 le0_25 = (le0_2) this;
            int n2 = le0_25.A20 + this.e80;
            int n3 = le0_25.SB0 + this.y9;
            le0_24.E40(le0_24.A20 + n2, le0_22.SB0 + n3);
            le0_22.lpt8(null, this.OI);
            if (object != null) {
                le0_22.Im((zk0_1)object);
            }
            if ((object = this.Gq0) != null) {
                le0_22.pO((R40)object);
            }
            try {
                this.XK0();
            }
            catch (Exception exception) {
                Logger.getLogger(le0_2.class.getName()).log(Level.SEVERE, "Exception in childAdded()", exception);
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public boolean OE(i70_0 i70_02, String string) {
        pu_2 pu_22 = this.o5;
        if (pu_22 != null) {
            return pu_22.jf0(i70_02, string);
        }
        return false;
    }

    public final void vI0(int n, int n2, String string) {
        PropertyChangeSupport propertyChangeSupport = this.Xu;
        if (propertyChangeSupport != null) {
            propertyChangeSupport.firePropertyChange(string, n, n2);
        }
    }

    public final void s70(G50 g50) {
        this.kg = g50;
    }

    public final boolean O0() {
        return this.eE;
    }

    public void sy(int n, int n2) {
        this.E40(n, n2);
    }

    public final void vf(pa0_0 pa0_02) {
        le0_2 le0_22 = this.K20;
        if (le0_22 == null) {
            return;
        }
        le0_2 le0_23 = (le0_2) this;
        int n = le0_22.Mx;
        n = pa0_02.uD0(n, this.Mx);
        int n2 = le0_23.K20.OB;
        this.E40(n, pa0_02.Kr0(n2, le0_23.OB));
    }

    public final void N80(pa0_0 pa0_02) {
        if (this.K20 == null) {
            return;
        }
        le0_2 le0_22 = (le0_2) this;
        le0_2 le0_23 = (le0_2) this;
        int n = le0_23.Em0.Mx;
        n = pa0_02.uD0(n, le0_23.Mx);
        int n2 = le0_22.Em0.OB;
        this.E40(n, pa0_02.Kr0(n2, le0_22.OB));
    }

    public final void E2(pa0_0 pa0_02, int n, int n2) {
        if (this.K20 == null) {
            return;
        }
        le0_2 le0_22 = (le0_2) this;
        le0_2 le0_23 = (le0_2) this;
        int n3 = le0_23.Em0.Mx;
        n3 = pa0_02.uD0(n3, le0_23.Mx) + n;
        int n4 = le0_22.Em0.OB;
        this.E40(n3, pa0_02.Kr0(n4, le0_22.OB) + n2);
    }

    public final void A20(pa0_0 pa0_02, int n, int n2) {
        le0_2 le0_22 = this.K20;
        if (le0_22 == null) {
            return;
        }
        le0_2 le0_23 = (le0_2) this;
        int n3 = le0_22.Mx;
        n3 = pa0_02.uD0(n3, this.Mx) + n;
        int n4 = le0_23.K20.OB;
        this.E40(n3, pa0_02.Kr0(n4, le0_23.OB) + n2);
    }

    public final boolean nk0(pa0_0 pa0_02, int n) {
        le0_2 le0_22 = this.K20;
        if (le0_22 == null) {
            return false;
        }
        le0_2 le0_23 = (le0_2) this;
        le0_2 le0_24 = le0_22;
        int n2 = le0_24.A20;
        int n3 = le0_24.Mx;
        n2 = pa0_02.uD0(n3, this.Mx) + n2;
        le0_2 le0_25 = le0_23.K20;
        n3 = le0_25.SB0;
        int n4 = le0_25.OB;
        return this.E40(n2, pa0_02.Kr0(n4, le0_23.OB) + n3 + n);
    }

    public final void gC0(int n, int n2) {
        n = n + this.e80 + this.NV;
        this.oY(n, n2 + this.y9 + this.Cz);
    }

    public final void uf(String charSequence) {
        if (charSequence == null) {
            throw new IllegalArgumentException("theme is null");
        }
        if (charSequence.length() > 0) {
            int n = charSequence.lastIndexOf(47);
            if (n > 0) {
                throw new IllegalArgumentException("'/' is only allowed as first character in theme name");
            }
            if (n < 0) {
                if (charSequence.indexOf(46) >= 0) {
                    throw new IllegalArgumentException("'.' is only allowed for absolute theme paths");
                }
            } else if (charSequence.length() == 1) {
                throw new IllegalArgumentException("'/' requires a theme path");
            }
            int n2 = charSequence.length();
            for (n = 0; n < n2; ++n) {
                StringBuilder stringBuilder;
                char c = charSequence.charAt(n);
                if (!Character.isISOControl(c) && c != '*') {
                    continue;
                }
                stringBuilder = new StringBuilder("invalid character '");
                String string = Character.isISOControl(c) ? "\\" + Integer.toOctalString(c) : Character.toString(c);
                throw new IllegalArgumentException(
                        VG.Mq(stringBuilder, string, "' in theme name"));
            }
        }
        this.gW = charSequence;
    }

    public final void m00() {
        this.IM = true;
    }

    public final void QI() {
        this.lk = false;
    }

    public final void Nd(Z30 z30) {
        this.Jj0 = z30;
    }

    public final void q20() {
        this.Eo0 = false;
    }

    public void nD() {
        this.Uz(1, false);
    }

    public final void MB0() {
        this.Kj = hd_1.D0;
    }

    public void XK0() {
        this.COm3();
    }

    public void zf() {
        this.COm3();
    }

    public void ld() {
    }

    public void mz0(int n, le0_2 le0_22) {
        this.hs();
    }

    public /* synthetic */ void Es() {
        this.xe0();
    }

    public int getX() { return this.A20; }
    public int getY() { return this.SB0; }
    public int getWidth() { return this.Mx; }
    public int getHeight() { return this.OB; }
    public boolean isVisible() { return this.IM; }
    public boolean isEnabled() { return this.eE; }
    public le0_2 getParent() { return this.K20; }
    public void setPosition(int x, int y) { sy(x, y); }
    public void setSize(int width, int height) { RY(width, height); }
    public void setVisible(boolean visible) { pw0(visible); }
    public void setEnabled(boolean enabled) { Oq0(enabled); }
    public void setTheme(String theme) { kx0(theme); }
}
