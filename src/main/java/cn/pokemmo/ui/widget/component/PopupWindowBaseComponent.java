/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

import f.Bp0;
import f.E00;
import f.E20;
import f.PC0;
import f.R40;
import f.T8;
import f.Tv0;
import f.VT;
import f.Yo0;
import f.cn_0;
import f.com8__3;
import f.d6_0;
import f.dc0_0;
import f.dp0;
import f.h20_0;
import f.hb0_2;
import f.hz0;
import f.i70_0;
import f.jv_1;
import f.le0_2;
import f.lg_0;
import f.mh_1;
import f.ok_0;
import f.pc0_1;
import f.qj_0;
import f.qq_0;
import f.tg_2;
import f.tm_0;
import f.ue0_1;
import f.wk_1;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.lwjgl.glfw.GLFW;

/*
 * Renamed from f.zK0
 */
public class PopupWindowBaseComponent extends BaseComponent {
    public static final Bp0 u6;
    public static final int II;
    public static final /* synthetic */ boolean lf;
    public int Aq0 = 1000;
    public final int xx;
    public final pc0_1 AK;
    public final tg_2 yz0;
    public final mh_1 cL;
    public long ss0;
    public int HA;
    public final le0_2 nl0;
    public boolean kb0;
    public final i70_0 Lh0;
    public boolean FT;
    public boolean Cr0;
    public int Y5;
    public int pd0 = -1;
    public int FV;
    public int HL;
    public int wr;
    public int Y80;
    public int bn0;
    public int WZ;
    public long cl;
    public long Fs;
    public long Op;
    public long Ef0;
    public int QD;
    public boolean jm0;
    public le0_2 L90;
    public le0_2 UY;
    public le0_2 T90;
    public final int QY;
    public boolean Gy;
    public tm_0 rm;
    public final le0_2 NF;
    public final E20 Cy0;
    public final cn_0 FB0;
    public le0_2 Dq0;
    public boolean M70;
    public long P;
    public final ArrayList GG0;
    public final Object R8;
    public Runnable[] v5;
    public int Du0;
    public Runnable[] yo;
    public final Tv0 ps;
    public final h20_0 LA;
    public boolean vi;

    static {
        lf = PopupWindowBaseComponent.class.desiredAssertionStatus() ^ true;
        u6 = new Bp0();
        II = dp0.aK0() ? 10 : 3;
    }

    public PopupWindowBaseComponent(le0_2 rootPane, qq_0 renderer, Yo0 input, jv_1 eventHandler, PC0 projection, ok_0 resources) {
        this.Aq0 = 1000;
        this.xx = 100;
        this.pd0 = -1;
        this.QY = 60;
        if (rootPane == null) throw new IllegalArgumentException("rootPane is null");
        if (renderer == null) throw new IllegalArgumentException("renderer is null");
        this.Em0 = (f.zk0_1)(Object)this;
        this.AK = renderer;
        this.yz0 = input;
        this.cL = eventHandler;
        this.Lh0 = new i70_0();
        this.nl0 = rootPane;
        rootPane.QI();
        this.NF = new le0_2();
        this.NF.uf("");
        this.FB0 = new cn_0();
        this.Cy0 = new E20();
        this.Cy0.Ll(false);
        this.GG0 = new ArrayList();
        Executors.newSingleThreadExecutor(new ue0_1());
        this.R8 = new Object();
        this.v5 = new Runnable[16];
        this.yo = new Runnable[16];
        this.ps = projection;
        this.LA = resources;
        this.uf("");
        this.QI();
        this.jR();
        super.F9(0, this.NF);
        super.F9(1, this.Cy0);
        super.F9(0, rootPane);
        this.wu();
    }

    @Override
    public final String Ck() {
        return "gui";
    }

    @Override
    public final void pO(R40 r40) {
        if (r40 != null) {
            super.pO(r40);
            return;
        }
        throw new IllegalArgumentException("themeManager is null");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void xx(Runnable runnable) {
        if (runnable == null) throw new IllegalArgumentException("runnable is null");
        synchronized (this.R8) {
            int size = this.Du0;
            Runnable[] queue = this.v5;
            if (size == queue.length) {
                queue = new Runnable[size * 2];
                System.arraycopy(this.v5, 0, queue, 0, size);
                this.v5 = queue;
            }
            this.v5[this.Du0++] = runnable;
        }
    }

    @Override
    public final int yd0() {
        return this.Aq0;
    }

    @Override
    public final void Bb(int n) {
        if (n >= 1) {
            this.Aq0 = n;
            return;
        }
        throw new IllegalArgumentException("tooltipDelay");
    }

    @Override
    public final int Xg0() {
        return 0;
    }

    @Override
    public final int R90() {
        return 0;
    }

    @Override
    public final void em() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final le0_2 fC0(int n) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void lt0() {
    }

    @Override
    public final void K8() {
        PopupWindowBaseComponent zk0_12 = this;
        zk0_12.uM(zk0_12.nl0);
    }

    @Override
    public final void Iu() {
        if (!this.kb0) return;
        int iterations = 0;
        boolean stillInvalid;
        while ((stillInvalid = this.kb0) && iterations < 1000) {
            this.kb0 = false;
            super.Iu();
            iterations++;
        }
        ArrayList widgetsInLoop = null;
        if (stillInvalid) {
            widgetsInLoop = new ArrayList();
            this.iY(widgetsInLoop);
        }
        T8.wD0.get().getClass();
        if (widgetsInLoop != null) {
            T8.l10.severe("layout loop detected - printing");
            int index = 1;
            for (Object value : widgetsInLoop) {
                T8.l10.severe(index + ": " + (le0_2)value);
                index++;
            }
        }
    }

    public final void jR() {
        qq_0 renderer = (qq_0)this.AK;
        this.oY(renderer.kA0, renderer.M00);
    }

    public void update() {
        PopupWindowBaseComponent zk0_12 = this;
        zk0_12.jR();
        long l = System.currentTimeMillis();
        zk0_12.HA = Math.max(0, (int)(l - this.ss0));
        zk0_12.ss0 = l;
        int n = zk0_12.QD;
        if (n != 0 && l - this.Ef0 > (long)n) {
            this.Ef0 = l;
            this.QD = 33;
            this.Lh0.bp0 = true;
            this.A90(9);
        }
        PopupWindowBaseComponent zk0_13 = this;
        zk0_13.Gy0();
        zk0_13.X10();
        zk0_13.kg();
        zk0_13.Iu();
        zk0_13.tl0();
    }

    public final void wu() {
        this.HA = 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void X10() {
        int n = 0;
        while (n < this.GG0.size()) {
            PopupWindowBaseComponent zk0_12 = this;
            com8__3 com8__32 = (com8__3)zk0_12.GG0.get(n);
            int n2 = com8__32.Ln - zk0_12.HA;
            if (n2 <= 0) {
                int n3;
                com8__3 com8__33 = com8__32;
                boolean bl = com8__33.ad0 ^ true;
                com8__33.Ln = -1;
                Runnable runnable = com8__33.bm0;
                if (runnable != null) {
                    try {
                        runnable.run();
                    }
                    catch (Throwable throwable) {
                        Logger.getLogger(com8__3.class.getName()).log(Level.SEVERE, "Exception in callback", throwable);
                    }
                }
                if ((n3 = com8__32.Ln) == -3 || bl && n3 != -2) {
                    com8__32.Ln = 0;
                    this.GG0.remove(n);
                    continue;
                }
                com8__32.Ln = Math.max(1, n2 + com8__32.Ig0);
            } else {
                com8__32.Ln = n2;
            }
            ++n;
        }
        return;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void kg() {
        Runnable[] queue = null;
        int size;
        synchronized (this.R8) {
            size = this.Du0;
            if (size > 0) {
                this.Du0 = 0;
                queue = this.v5;
                this.v5 = this.yo;
                this.yo = queue;
            }
        }
        for (int index = 0; index < size; index++) {
            Runnable runnable = queue[index];
            queue[index] = null;
            try {
                runnable.run();
            } catch (Throwable ex) {
                Logger.getLogger(PopupWindowBaseComponent.class.getName()).log(Level.SEVERE, "Exception in runnable", ex);
            }
        }
    }

    public final void rH() {
        qq_0 renderer = (qq_0)this.AK;
        if (renderer.kA0 <= 0 || renderer.M00 <= 0) return;
        try {
            renderer.J2 = false;
            renderer.g50 = renderer.VK;
            renderer.J50.CF = 0;
            this.HP((f.zk0_1)(Object)this);
            if (this.Cr0 && this.L90 != null) {
                this.L90.Kp0((f.zk0_1)(Object)this, this.Lh0.f8, this.Lh0.AN, this.Lh0.J30);
            }
        } finally {
            renderer.ga();
        }
    }

    public boolean Wq0(int n, int n2, int n3, boolean bl) {
        long l;
        Bp0 bp0 = u6;
        float f = n;
        float f2 = n2;
        bp0.x = f;
        bp0.y = f2;
        ((qq_0)this.AK).va.lPt8(bp0);
        int n4 = (int)bp0.x;
        int n5 = (int)bp0.y;
        this.cl = l = this.ss0;
        this.Fs = l;
        i70_0 i70_02 = this.Lh0;
        i70_02.nA0 = n3;
        int n6 = i70_02.J30;
        int n7 = n6 & 0x1C0;
        int n8 = 0;
        if (n3 != 0) {
            if (n3 != 1) {
                if (n3 == 2) {
                    n8 = 256;
                }
            } else {
                n8 = 128;
            }
        } else {
            n8 = 64;
        }
        i70_02.J30 = bl ? n6 | n8 : n6 & ~n8;
        boolean bl2 = (n7 & n8) != 0;
        if (n8 != 0) {
            VT vT = ((qq_0)this.AK).eI0;
            vT.getClass();
            if (n3 >= 0 && n3 < 3 && vT.sC[n3] != bl) {
                VT vT2 = vT;
                vT2.Le[n3] = System.currentTimeMillis();
                vT2.sC[n3] = bl;
            }
        }
        boolean bl3 = this.Cr0;
        n6 = bl3 ? 1 : 0;
        if (!bl3 && n7 != 0) {
            i70_0 i70_03 = this.Lh0;
            i70_03.f8 = this.FV;
            i70_03.AN = this.HL;
        } else {
            i70_0 i70_04 = this.Lh0;
            i70_04.f8 = n4;
            i70_04.AN = n5;
        }
        int n9 = n6;
        n6 = 0;
        boolean bl4 = false;
        if (n9 == 0) {
            if (!this.yv0(n4, n5)) {
                bl = false;
                this.Y5 = 0;
                if (this.FT) {
                    this.iH0(7, null);
                    this.FT = false;
                }
            } else if (!this.FT) {
                this.FT = true;
                if (this.iH0(1, null) != null) {
                    n6 = 1;
                }
            }
        }
        if (n4 != this.wr || n5 != this.Y80) {
            this.wr = n4;
            this.Y80 = n5;
            if (n7 != 0 && !this.Cr0) {
                int n10 = II;
                if (Math.abs(n4 - this.FV) > n10 || Math.abs(n5 - this.HL) > n10) {
                    this.Cr0 = true;
                    this.Y5 = 0;
                    this.JJ0();
                    this.M70 = false;
                    this.Dq0 = this.L90;
                }
            }
            if (this.Cr0) {
                le0_2 le0_22 = this.L90;
                if (le0_22 != null) {
                    this.iH0(6, le0_22);
                }
            } else if (n7 == 0 && this.iH0(2, null) != null) {
                n6 = 1;
            }
        }
        if (n8 != 0 && bl != bl2) {
            le0_2 le0_23;
            if (bl) {
                if (this.pd0 < 0) {
                    this.FV = n4;
                    this.HL = n5;
                    this.pd0 = n3;
                    this.L90 = this.iH0(3, null);
                } else {
                    le0_2 le0_24 = this.L90;
                    if (le0_24 != null) {
                        this.iH0(3, le0_24);
                    }
                }
            } else if (this.pd0 >= 0 && (le0_23 = this.L90) != null) {
                this.iH0(4, le0_23);
                if (this.jm0 || !dp0.aK0()) {
                    bl4 = true;
                }
            }
            le0_2 le0_25 = this.L90;
            if (le0_25 != null) {
                n6 = 1;
            }
            if (!(n3 != 0 || this.jm0 || bl || this.Cr0)) {
                if (this.Y5 == 0 || this.ss0 - this.Op > 500L || this.UY != le0_25) {
                    long l2;
                    this.bn0 = n4;
                    this.WZ = n5;
                    this.UY = le0_25;
                    this.Y5 = 0;
                    this.Op = l2 = this.ss0;
                }
                if (Math.abs(n4 - this.bn0) < (n4 = II) && Math.abs(n5 - this.WZ) < n4) {
                    long l3;
                    i70_0 i70_05 = this.Lh0;
                    i70_05.f8 = this.bn0;
                    i70_05.AN = this.WZ;
                    i70_05.kA = ++this.Y5;
                    this.Op = l3 = this.ss0;
                    le0_2 le0_26 = this.UY;
                    if (le0_26 != null) {
                        this.iH0(5, le0_26);
                    }
                } else {
                    this.UY = null;
                }
            }
        }
        if (this.Lh0.LI0()) {
            if (this.Cr0) {
                this.Cr0 = false;
                this.iH0(2, null);
            }
            this.pd0 = -1;
        }
        if (bl4 && dp0.aK0()) {
            this.L90 = null;
        }
        return n6 != 0;
    }

    public final boolean DJ0(int keyCode, char keyChar, boolean pressed, boolean repeated) {
        i70_0 event = this.Lh0;
        event.finally$ = keyCode;
        event.TD = keyChar;
        event.bp0 = false;
        event.l6 = repeated;
        this.Ef0 = this.ss0;
        if (keyCode == 0 && keyChar == '\0') {
            this.QD = 0;
            return false;
        }
        int modifier;
        switch (keyCode) {
            case 129: modifier = 4; break;
            case 130: modifier = 32; break;
            case 60: modifier = 8; break;
            case 59: modifier = 1; break;
            case 58: modifier = 1024; break;
            case 57: modifier = 512; break;
            default: modifier = 0; break;
        }
        if (modifier != 0) {
            if (pressed) event.J30 |= modifier;
            else event.J30 &= ~modifier;
        }
        if (pressed) {
            this.QD = 250;
            return this.A90(9);
        }
        this.QD = 0;
        return this.A90(10);
    }

    /*
     * Unable to fully structure code
     */
    public final void Gy0() {
        le0_2 widget = this.UA0();
        if (widget != this.Dq0) {
            if (widget != null && (this.ss0 - this.Fs > widget.yd0() || (this.M70 && this.ss0 - this.P >= this.xx))) {
                int x = widget.A20 + widget.Mx / 2;
                int y = widget.SB0;
                Object content = widget.rd(this.Lh0.f8, this.Lh0.AN);
                pa0_0 alignment = widget.Ls0;
                if (content == null) {
                    this.JJ0();
                } else {
                    this.Cy0.uf(widget.A80.isEmpty() ? "tooltipwindow" : widget.A80);
                    this.Cy0.yI();
                    if (content instanceof String) {
                        String text = (String)content;
                        if (text.length() == 0) {
                            this.JJ0();
                            this.Gy = this.ss0 - this.cl > this.QY;
                            return;
                        }
                        if (this.FB0.K20 != this.Cy0) {
                            this.Cy0.em();
                            this.Cy0.F9(this.Cy0.fU(), this.FB0);
                        }
                        this.FB0.Jj0 = null;
                        this.FB0.Sk(text);
                    } else {
                        le0_2 contentWidget;
                        if (content instanceof le0_2) {
                            contentWidget = (le0_2)content;
                        } else if (content instanceof Supplier) {
                            contentWidget = (le0_2)((Supplier)content).get();
                        } else {
                            throw new IllegalArgumentException("Unsupported data type");
                        }
                        if (contentWidget.K20 != null && contentWidget.K20 != this.Cy0) {
                            this.JJ0();
                            this.Gy = this.ss0 - this.cl > this.QY;
                            return;
                        }
                        this.Cy0.em();
                        this.Cy0.F9(this.Cy0.fU(), contentWidget);
                    }
                    this.Cy0.lt0();
                    if (this.Cy0.r90 != 0) this.Cy0.lt0();
                    int width = this.Cy0.Mx;
                    int height = this.Cy0.OB;
                    switch (alignment.ordinal()) {
                        case 2: case 6: case 8: x -= width; break;
                        case 1: case 3: case 4: x -= width / 2; break;
                        default: break;
                    }
                    switch (alignment.ordinal()) {
                        case 4: case 7: case 8: y -= height; break;
                        case 0: case 1: case 2: y -= height / 2; break;
                        default: break;
                    }
                    x += widget.Xg0();
                    y += widget.R90();
                    if (x + width > this.Mx) x = this.Mx - width;
                    if (y + height > this.OB) y = this.OB - height;
                    if (x < 0) x = 0;
                    if (y < 0) y = 0;
                    this.Dq0 = widget;
                    this.Cy0.E40(x, y);
                    this.Cy0.Ll(true);
                    widget.nE();
                }
            } else {
                this.JJ0();
            }
        }
        boolean idle = this.ss0 - this.cl > this.QY;
        if (this.Gy != idle) this.Gy = idle;
    }

    @Override
    public final le0_2 UA0() {
        PopupWindowBaseComponent zk0_12 = this;
        return zk0_12.qA(zk0_12.fU() - 3).UA0();
    }

    public final void Wh0(qj_0 popup) {
        le0_2 parent = popup.K20;
        if (parent == this) {
            this.TD(popup);
        } else if (parent != null) {
            throw new IllegalArgumentException("popup must not be added anywhere");
        }
        this.JJ0();
        this.M70 = false;
        this.AE(11);
        super.F9(this.fU() - 2, popup);
        popup.LI0.xg0((f.zk0_1)(Object)this, true);
        this.jm0 = true;
        if (this.rm != null) this.ZC0(this.rm);
    }

    public final void TD(qj_0 qj_02) {
        int n = this.Dp(qj_02);
        if (n > 0) {
            super.fC0(n);
        }
        PopupWindowBaseComponent zk0_12 = this;
        qj_02.LI0.dv((f.zk0_1)(Object)this);
        this.AE(12);
        this.jm0 = true;
        zk0_12.wP(qj_02);
        zk0_12.nA0(zk0_12.qA(zk0_12.fU() - 3));
        if (!zk0_12.Cr0) {
            this.iH0(2, null);
        }
    }

    @Override
    public final boolean f2() {
        return this.Cr0 && this.L90 != null && this.L90.f2();
    }

    public final void wP(le0_2 widget) {
        tm_0 infoWindow = this.rm;
        if (infoWindow == null) return;
        if (infoWindow != widget) {
            le0_2 parent = infoWindow.gI0;
            while (parent != null && parent != widget) parent = parent.K20;
            if (parent != widget) return;
        }
        this.ZC0(infoWindow);
    }

    public final void PG0(tm_0 tm_02) {
        PopupWindowBaseComponent zk0_12 = this;
        int n = zk0_12.fU() - 2;
        super.fC0(n);
        super.F9(n, tm_02);
        this.rm = tm_02;
    }

    public final void ZC0(tm_0 tm_02) {
        if (tm_02 == this.rm) {
            PopupWindowBaseComponent zk0_12 = this;
            int n = zk0_12.fU() - 2;
            super.fC0(n);
            super.F9(n, zk0_12.NF);
            zk0_12.rm = null;
            try {
                tm_02.UU();
            }
            catch (Exception exception) {
                Logger.getLogger(PopupWindowBaseComponent.class.getName()).log(Level.SEVERE, "Exception in infoWindowClosed()", exception);
            }
        }
    }

    @Override
    public final boolean Of() {
        return true;
    }

    @Override
    public final boolean BL() {
        return true;
    }

    @Override
    public final boolean nA0(le0_2 le0_22) {
        if (le0_22 != null) {
            PopupWindowBaseComponent zk0_12 = this;
            if (le0_22 != zk0_12.qA(zk0_12.fU() - 3)) {
                return false;
            }
        }
        return super.nA0(le0_22);
    }

    public final void JJ0() {
        E20 tooltip = this.Cy0;
        if (tooltip.eE) {
            this.P = this.ss0;
            this.M70 = true;
        }
        tooltip.Ll(false);
        this.Dq0 = null;
        if (this.FB0.K20 != tooltip) tooltip.em();
    }

    @Override
    public final void F9(int n, le0_2 le0_22) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void sy(int n, int n2) {
        throw new UnsupportedOperationException();
    }

    public final void tl0() {
        lg_0.k.getClass();
        hb0_2 cursorState = hb0_2.BN;
        if (cursorState == hb0_2.cw || cursorState == hb0_2.XU) return;
        this.Lh0.zu = 2;
        le0_2 widget = this.UA0();
        dc0_0 cursor = null;
        while (widget != null && (!widget.OI || (cursor = widget.KK0(this.Lh0)) == null)) widget = widget.K20;
        qq_0 renderer = (qq_0)this.AK;
        renderer.NG = null;
        if (cursor instanceof wk_1) {
            hz0 mouseCursor = ((wk_1)cursor).um0;
            GLFW.glfwSetCursor(lg_0.S4.rt0.hc0, mouseCursor.FQ);
        } else if (cursor instanceof d6_0) {
            qq_0.hx0();
            renderer.NG = (d6_0)cursor;
        } else {
            qq_0.hx0();
        }
    }

    public final le0_2 iH0(int n, le0_2 le0_22) {
        boolean bl;
        boolean bl2 = lf;
        if (!bl2 && !E00.C10(n)) {
            throw new AssertionError();
        }
        PopupWindowBaseComponent zk0_12 = this;
        zk0_12.jm0 = false;
        i70_0 i70_02 = zk0_12.Lh0;
        i70_02.zu = n;
        zk0_12.Lh0.VP = bl = this.Cr0;
        i70_0 i70_03 = i70_02;
        int n2 = i70_03.f8;
        int n3 = i70_03.AN;
        qq_0 qq_02 = (qq_0)zk0_12.AK;
        qq_02.jF = n2;
        qq_02.f3 = n3;
        if (le0_22 != null) {
            if (le0_22.OI || n != 3 && n != 4 && n != 5 && n != 6) {
                le0_22.nd0(i70_02);
            }
            return le0_22;
        }
        if (!bl2 && bl) {
            throw new AssertionError();
        }
        le0_2 le0_23 = null;
        le0_22 = this.rm;
        if (le0_22 != null && le0_22.yv0(n2, n3)) {
            PopupWindowBaseComponent zk0_13 = this;
            le0_22 = zk0_13.rm;
            if (zk0_13.Xv(le0_22, zk0_13.Lh0)) {
                le0_23 = this.rm;
            }
        }
        if (le0_23 == null) {
            PopupWindowBaseComponent zk0_14 = this;
            le0_23 = zk0_14.qA(zk0_14.fU() - 3);
            zk0_14.Xv(le0_23, zk0_14.Lh0);
        }
        return le0_23.r1(this.Lh0);
    }

    public final boolean A90(int n) {
        le0_2 le0_22;
        if (!lf && !E00.ZU(n)) {
            throw new AssertionError();
        }
        PopupWindowBaseComponent zk0_12 = this;
        zk0_12.jm0 = false;
        zk0_12.T90 = null;
        i70_0 i70_02 = zk0_12.Lh0;
        i70_02.zu = n;
        i70_02.VP = false;
        boolean bl = zk0_12.qA(zk0_12.fU() - 3).nd0(this.Lh0);
        n = bl ? 1 : 0;
        if (!bl && (le0_22 = this.T90) != null) {
            i70_0 i70_03 = this.Lh0;
            if (i70_03.iT()) {
                if ((i70_03.J30 & 9) != 0) {
                    le0_22.Uz(-1, true);
                } else {
                    le0_22.Uz(1, true);
                }
            }
            n = 1;
        }
        this.T90 = null;
        return n != 0;
    }

    public final void AE(int n) {
        if (!lf && n != 11 && n != 12) {
            throw new AssertionError();
        }
        PopupWindowBaseComponent zk0_12 = this;
        zk0_12.jm0 = false;
        i70_0 i70_02 = zk0_12.Lh0;
        i70_02.zu = n;
        i70_02.VP = false;
        int n2 = zk0_12.fU();
        try {
            zk0_12.qA(n2 - 3).ga0(this.Lh0);
        }
        catch (Exception exception) {
            Logger.getLogger(PopupWindowBaseComponent.class.getName()).log(Level.SEVERE, "Exception in sendPopupEvent()", exception);
        }
    }
}

