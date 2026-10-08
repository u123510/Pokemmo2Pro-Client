// 
// Decompiled by Procyon v0.6.0
// 

package cn.pokemmo.ui.window.pokemon;

import f.*;

import java.util.function.Function;
import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Iterator;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffectExt;
import java.text.DecimalFormat;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.LinkedHashSet;

/**
 * 宝可梦电脑/箱子存储管理窗口
 *
 * 原混淆类: f.QT
 */
public class PokemonStorageWindow extends cx_0 implements tr_1
 {
    public final QT asBridge() {
        return (QT) (Object) this;
    }

    public static final int[] Jd0;
    public final tk0_0 tO;
    public NK[] Lh0;
    public Op0 BW;
    public final LH p6;
    public final wg0_0 Ly;
    public j1_0[] rG0;
    public final uk0_2 B00;
    public final tk0_0 BK;
    public tk0_0 zt0;
    public gk0_1 iq;
    public cg_0 v70;
    public lo0_0 bH;
    public S70 tr0;
    public Qz0 lH;
    public S70 qh0;
    public S70 i20;
    public S70 jB0;
    public S70 K10;
    public S70 Mj0;
    public S70 pD;
    public Jm0 kk0;
    public Jm0 Oa;
    public qj_2 B60;
    public fq_1 oq0;
    public wl0_2 JG;
    public ff_0 MT;
    public boolean Nc;
    public VU b1;
    public xt_0 pI0;
    public boolean An;
    public cn_0 i9;
    public cn_0 wO;
    public S70 Bd;
    public cn_0 og;
    public cn_0 Kf0;
    public cn_0 h1;
    public cn_0 ly;
    public cn_0 NS;
    public cn_0 sD0;
    public S70 CA0;
    public S70[] CL0;
    public cn_0[] gR;
    public cn_0 Z70;
    public S70 hd0;
    public cn_0 YL0;
    public qj_2[] II;
    public xe_1 JZ;
    public qj_2 cN;
    public int Z9;
    public jb0_0 W70;
    public final LinkedHashSet<jb0_0> lM;
    public Op0 o3;
    public ij0_1 Q2;
    public HV uf;
    public HV Eh;
    public boolean goto$;
    public cn_0 oL;
    public fy_2 Tu0;
    public lo0_0 QJ;
    public final ql_0 RX;
    public final ql_0 Js0;
    public int kw0;
    public final es_1 xw;
    public boolean qu;
    
    public PokemonStorageWindow(final LH p) {
        super(tw0_0.kz0());
        this.Nc = false;
        this.lM = new LinkedHashSet();
        this.uf = null;
        this.Eh = null;
        this.goto$ = false;
        this.RX = new ql_0();
        this.Js0 = new ql_0();
        this.kw0 = 0;
        this.xw = new es_1();
        this.qu = false;
        this.p6 = p;
        final tk0_0 to = new tk0_0();
        if (tw0_0.kz0()) {
            to.mz0();
        }
        final gn_0 gn_0 = new gn_0((byte)(-1), (byte)(-1), (byte)(-1), (byte)(-1));
        final N1 n1 = new N1(asBridge(), gn_0);
        this.LPT8(n1);
        this.uf("pc-frame");
        this.Hy(sm0_0.c0(1118));
        this.ff0(1);
        if (tw0_0.rl.r1(_volatile.Bf0) == null) {
            tw0_0.rl.ax(new ud0_0());
            Qy0.Sq().jE(sm0_0.c0(2312));
            this.tO = null;
            this.Ly = null;
            this.B00 = null;
            this.BK = null;
            return;
        }
        (this.MT = new ff_0(tw0_0.LD0.U1)).nI(tw0_0.Ll0.Qz0);
        this.Pb0(this::close);
        final uk0_2 b00 = new uk0_2();
        this.B00 = b00;
        if (tw0_0.kz0()) {
            final tk0_0 tk0_0 = to;
            final tk0_0 tk0_2 = new tk0_0();
            final A40 gg0 = tk0_2.gg0;
            gg0.vx0(this.N60()).Jq(60.0f).goto$().im0();
            final tk0_0 yn = this.YN();
            this.BK = yn;
            gg0.vx0(yn).Pt(310.0f).pJ0();
            tk0_0.Xf0(tk0_2).Wa0().Yt().p20();
        }
        else {
            final tk0_0 tk0_3 = to;
            final tk0_0 yn2 = this.YN();
            this.BK = yn2;
            final j1_0 wa0 = tk0_3.Xf0(yn2).Wa0();
            float n2;
            if (zb0_2.bigCJKFontSizes()) {
                n2 = 320.0f;
            }
            else {
                n2 = 275.0f;
            }
            wa0.Pt(n2).VN((float)(zb0_2.bigCJKFontSizes() ? 629 : 586)).pJ0();
        }
        final wg0_0 ly;
        final wg0_0 wg0_0 = ly = new wg0_0(BU.lh(), (boolean)(1 != 0));
        this.Ly = ly;
        wg0_0.nL(value -> this.Ob0((VU)value));
        final tk0_0 tk0_4 = new tk0_0();
        if (tw0_0.kz0()) {
            final tk0_0 tk0_5 = tk0_4;
            final j1_0 vx0 = tk0_5.gg0.vx0(this.b9());
            vx0.Xs(60.0f).pK0(5.0f).o(5.0f).NA().Wa0().Yt();
            vx0.im0();
            final tk0_0 tk0_6;
            final A40 gg2 = (tk0_6 = new tk0_0()).gg0;
            final wg0_0 wg0_2 = ly;
            gg2.vx0(b00).pK0(5.0f).Xs(5.0f).dw0().ru();
            gg2.vx0(wg0_2).GD().Xs(3.0f);
            tk0_5.gg0.vx0(tk0_6).bd().Xs(5.0f).o(5.0f).pJ0();
        }
        else {
            final tk0_0 tk0_7 = tk0_4;
            tk0_7.Xf0(this.N60()).VN(60.0f).NA().im0();
            tk0_7.Xf0(this.b9()).goto$().Xs(5.0f).im0();
            final tk0_0 tk0_8 = new tk0_0();
            final A40 gg3 = tk0_8.gg0;
            final wg0_0 wg0_3 = ly;
            gg3.vx0(b00).pK0(0.0f).goto$();
            gg3.vx0(wg0_3).NA().o(5.0f);
            tk0_7.Xf0(tk0_8).Pt(700.0f).pJ0().o(2.0f).Xs(5.0f).im0();
            tk0_7.Xf0(this.xY()).pK0(5.0f).jN().Yt().Wa(4.0f).Xs(5.0f);
        }
        if (tw0_0.kz0()) {
            final tk0_0 tk0_9 = new tk0_0();
            final tk0_0 to2 = tk0_9;
            final tk0_0 tk0_10 = to;
            final tk0_0 tk0_11 = tk0_4;
            new tk0_0();
            this.tO = to2;
            tk0_10.Xf0(tk0_11).NA().pJ0();
            tk0_9.Xf0(tk0_10);
            tk0_9.Nu();
            tk0_9.Xf0(this.xY()).Yt();
            this.iv(tw0_0.LD0.ew0(), tw0_0.LD0.Hv0());
        }
        else {
            final wg0_0 wg0_4 = ly;
            to.Xf0(tk0_4).p20();
            wg0_4.lt0();
            wg0_4.Iu();
            this.tO = to;
        }
        this.SL(this.tO);
        this.h0(0);
    }
    
    public static void b6(final le0_2 le0_2, final VU vu) {
        ((nq_1)le0_2.K20.K20).Ig0(vu);
    }
    
    public static void PU(final le0_2 le0_2, final VU vu) {
        ((XH)le0_2.K20.K20.K20).H6(vu);
    }
    
    public static void bN(final jb0_0 jb0_0) {
        jb0_0.pt0 = null;
    }
    
    public static int D00(final jb0_0 jb0_0, final jb0_0 jb0_2) {
        if (jb0_0 == jb0_2) {
            return 0;
        }
        if (jb0_0.pt0.ol0() == null && jb0_2.pt0.ol0() == null) {
            return 0;
        }
        if (jb0_0.pt0.ol0() == null) {
            return -1;
        }
        if (jb0_2.pt0.ol0() == null) {
            return 1;
        }
        if (jb0_0.Xh0() > jb0_0.pt0.y0().Xh0()) {
            return Integer.compare(jb0_0.Xh0(), jb0_2.Xh0());
        }
        return Integer.compare(jb0_2.Xh0(), jb0_0.Xh0());
    }
    
    public static boolean XL(final jb0_0 jb0_0) {
        final sg_2 pt0;
        final sg_2 pt2;
        return (pt0 = jb0_0.pt0) != null && pt0 != jb0_0 && jb0_0.ol0() != null && (pt2 = jb0_0.pt0) instanceof jb0_0 && (pt2.HP() ^ true);
    }

    public static void QC(final jb0_0 value) {
        value.uA(false);
    }

    public static void ja(final ye_0 value) {
        value.LPT8(true);
    }

    public static void P9(final ye_0 value) {
        value.LPT8(false);
    }
    
    public static boolean jp(final ye_0 ye_0) {
        final VU ol0;
        return (ol0 = ye_0.ol0()) != null && ol0.h10().isEmpty() && !ol0.I8.vn();
    }
    
    static {
        Jd0 = new int[] { 2371, 2388, 2378, 2375, 2376, 2389, 2377 };
    }
    
    public static ka0_1 an0(final cn_0 cn_0, final cn_0 cn_2) {
        final ka0_1 ka0_1 = new ka0_1(new le0_2[] { cn_0, cn_2 });
        ka0_1.C80 = 5.0f;
        return ka0_1;
    }
    
    public static ye_0 LPt7(final NK nk, final int n) {
        int n2 = 0;
        ye_0[] yg;
        for (int length = (yg = nk.YG()).length, i = 0; i < length; ++i) {
            final ye_0 ye_0;
            if ((ye_0 = yg[i]).ol0() == null) {
                if (n == n2) {
                    return ye_0;
                }
                ++n2;
            }
        }
        return null;
    }
    
    public final void hy0() {
        this.Oc();
        this.em();
        this.F9(this.fU(), super.Lr0);
        this.F9(this.fU(), this.zt0);
        this.qu = true;
    }
    
    public final void Uc(final boolean b) {
        if (b) {
            this.zt0 = null;
            this.xw.clear();
        }
        this.em();
        this.F9(this.fU(), super.Lr0);
        this.F9(this.fU(), this.tO);
        this.rt(false);
        final NK uc0 = this.Uc0();
        uc0.EP(uc0.yM);
        this.qu = false;
    }
    
    public final void QK() {
        if (!this.goto$) {
            this.oL.Sk(sm0_0.c0(nf0_0.EC0));
            tw0_0.rl.fk0.uQ(new F80());
            return;
        }
        if (this.Tu0 != null) {
            final ArrayList<un_1> list = new ArrayList<un_1>();
            if (this.uf != null) {
                list.add(new un_1(this.uf, true));
            }
            if (this.Eh != null) {
                list.add(new un_1(this.Eh, true));
            }
            final un_1[] array;
            if ((array = list.toArray(new un_1[0])).length > 0) {
                this.Tu0.em();
                final fy_2 tu0;
                final fy_2 fy_2 = tu0 = this.Tu0;
                fy_2.getClass();
                fy_2.WQ(new Hm0(tu0).LPt3((le0_2[])array));
                final fy_2 tu2;
                final fy_2 fy_3 = tu2 = this.Tu0;
                fy_3.getClass();
                fy_3.x40(new I7(tu2).Ze0().LPt3((le0_2[])array).Ze0());
                return;
            }
        }
        this.oL.Sk(sm0_0.c0(3004));
    }
    
    public final void CE(final Op0 op0) {
        this.h0(op0.p6);
        op0.Yk.EP(0);
    }
    
    public final void V4(final Op0 op0) {
        this.h0(op0.p6);
        op0.Yk.EP(0);
    }
    
    public final void kb() {
        final NK uc0;
        if ((uc0 = this.Uc0()).dz0 == _volatile.Bf0 && uc0.Uq0 >= 0) {
            final Op0 op0 = (Op0)this.rG0[this.Z9].kh0;
            final ox_1 ox_1 = new ox_1(sm0_0.c0(7004), 20, value -> this.za0(op0, uc0, value));
            final ox_1 ox_2 = ox_1;
            ox_1.Pw.Gv(this.p6.P2(uc0.dz0, (byte)op0.TH0));
            ox_1.Pw.LPt8("[ |\\p{L}|\\p{N}|\\p{P}]{1,20}");
            BU.T50.SL(ox_2);
            lg_0.k.lPT5(ox_2::Uj0);
        }
    }
    
    public final void za0(final Op0 op0, final NK nk, String input) {
        if (!LH.JU.reset(input).matches()) {
            input = "";
        }
        final byte b = (byte)op0.TH0;
        this.p6.iG0(b, input);
        tw0_0.rl.fk0.uQ(new y1_0((byte)op0.TH0, input));
        final String p3;
        op0.SU(p3 = this.p6.P2(nk.dz0, b));
        this.JZ.SU(p3);
        lg_0.k.lPT5(this::qs);
    }
    
    public final void SO(final VU vu, final int n) {
        final CE i8;
        final int n2;
        final byte jw0 = (byte)((i8 = vu.I8).jw0 ^ (n2 = 1 << n));
        final int n3 = n2;
        i8.jw0 = jw0;
        gn_0 darkgray = gn_0.DARKGRAY;
        if ((jw0 & n3) != 0x0) {
            darkgray = ng_2.MS[n];
        }
        this.II[n].tp0.wx0(darkgray);
        final BR rl;
        if ((rl = tw0_0.rl) != null) {
            rl.fk0.uQ(new Fo(vu.I8.jw0, vu.pu));
        }
    }
    
    public final void B4() {
        this.Pb0();
        final Jm0 kk0 = this.kk0;
        final Br0 fg = kk0.Fg;
        final LPT6_[] array = { null };
        final int n = 0;
        LPT6_ lpt6_;
        if (kk0.ER.U20()) {
            lpt6_ = fn_0.qz0().qx;
        }
        else {
            lpt6_ = fn_0.qz0().Com2;
        }
        final Br0 br0 = fg;
        array[n] = lpt6_;
        br0.r8(array);
    }
    
    public final void iI0(final xe_1 xe_1) {
        final Vt0 vt0 = new Vt0();
        final Vt0 vt2 = vt0;
        final G0 g0 = new G0();
        final v10_0 e = new v10_0(sm0_0.c0(2330), g0);
        final G0 g2 = new G0();
        final StringBuilder sb = new StringBuilder();
        final v10_0 e2 = new v10_0(ig_0.u9(1, sb, " ").append(sm0_0.c0(2331)).toString(), g2);
        final G0 g3 = new G0();
        final v10_0 e3 = new v10_0(sm0_0.c0(2332), g3);
        final G0 g4 = new G0();
        final v10_0 e4 = new v10_0(sm0_0.c0(2333), g4);
        final G0 g5 = new G0();
        final v10_0 e5 = new v10_0(sm0_0.c0(8100), g5);
        final G0 g6 = new G0();
        final v10_0 e6 = new v10_0(sm0_0.c0(2334), g6);
        final G0 g7 = new G0();
        final v10_0 e7 = new v10_0(sm0_0.c0(2329), g7);
        final G0 g8 = new G0();
        final v10_0 e8 = new v10_0(sm0_0.c0(2328), g8);
        final G0 g9 = new G0();
        final v10_0 e9 = new v10_0(sm0_0.c0(2336), g9);
        final at_0 at_0 = new at_0(sm0_0.c0(2335));
        final at_0 e10 = at_0;
        final G0 g10 = g0;
        at_0.eu0 = () -> this.zo(g0, g2, g7, g6, g5, g3, g4, g8, g9);
        vt2.hx.add(e);
        vt2.hx.add(e2);
        vt2.hx.add(e7);
        vt2.hx.add(e6);
        vt2.hx.add(e5);
        vt2.hx.add(e3);
        vt2.hx.add(e4);
        vt2.hx.add(e8);
        vt2.hx.add(e9);
        vt2.hx.add(new at_0());
        vt2.hx.add(e10);
        UA.rL(vt0, xe_1, xe_1.A20, xe_1.SB0);
    }
    
    public final void zo(final E7 e7, final E7 e8, final E7 e9, final E7 e10, final E7 e11, final E7 e12, final E7 e13, final E7 e14, final E7 e15) {
        short n = 0;
        if (e7.getValue()) {
            n = 1;
        }
        if (e8.getValue()) {
            n |= 0x2;
        }
        if (e9.getValue()) {
            n |= 0x4;
        }
        if (e10.getValue()) {
            n |= 0x8;
        }
        if (e11.getValue()) {
            n |= 0x10;
        }
        if (e12.getValue()) {
            n |= 0x20;
        }
        if (e13.getValue()) {
            n = (short)((short)(n | 0x40) | 0x4);
        }
        if (e14.getValue()) {
            n |= 0x80;
        }
        if (e15.getValue()) {
            n |= 0x100;
        }
        tw0_0.rl.fk0.uQ(new Sx0(this.Uc0().dz0, new int[] { this.Uc0().Uq0 }, n));
    }
    
    public final void Nw0() {
        final StringBuilder sb = new StringBuilder();
        final int[] jd0 = QT.Jd0;
        for (int n = 7, i = 0; i < n; ++i) {
            sb.append("\u2022 " + sm0_0.c0(jd0[i])).append("\n");
        }
        final tk0_0 tk0_2;
        final tk0_0 tk0_0 = tk0_2 = new tk0_0(new A40());
        final tk0_0 tk0_4;
        final tk0_0 tk0_3 = tk0_4 = new tk0_0(new A40());
        final S70 s71;
        final S70 s70 = s71 = new S70(0, 0, 0);
        s70.og.r8(fn_0.qz0().Wc0);
        final Br0 og = s70.og;
        s70.VA(og.IF, og.gx0);
        final cn_0 cn_0;
        (cn_0 = new cn_0(null, 0)).Sk(sm0_0.c0(2383));
        tk0_3.gg0.vx0(s71);
        tk0_3.gg0.vx0(cn_0);
        tk0_0.gg0.vx0(tk0_4);
        tk0_0.gg0.Rg();
        final Object o;
        ((cn_0)(o = new cn_0(null, 0))).Sk(sm0_0.wa0(2384, sb.toString()));
        tk0_0.gg0.vx0(o);
        tk0_0.gg0.EF(5.0f);
        tk0_0.uf("tooltipwindow");
        Qy0.yI0.vk(this.oq0, tk0_2, pa0_0.L00);
    }
    
    public final void O7() {
        this.rt(false);
        final Jm0 oa;
        final Br0 fg = (oa = this.Oa).Fg;
        final Wr[] array = { null };
        final int n = 0;
        final gh_1 ah0 = gh_1.aH0;
        final boolean b = oa.ER.U20() ^ true;
        ah0.getClass();
        array[n] = ah0.F10(gu0.l2.lPT6((short)5152), b);
        fg.Nk(array);
    }
    
    public final void no0() {
        this.zt0 = null;
        this.xw.clear();
        this.v70.Gv("");
        this.rt(false);
    }
    
    @Override
    public final void x00() {
        this.Uc0().EP(0);
        final wl0_2 jg;
        final VU b1;
        if ((jg = this.JG) != null && (b1 = this.b1) != null) {
            this.lH.Jj0 = jg.so((gn_0)rh_2.I2.get(b1.KD()));
        }
    }
    
    @Override
    public final void N00(final zk0_1 zk0_1) {
        super.N00(zk0_1);
        final di0_1 vs0;
        if ((vs0 = BU.T50.vs0) != null) {
            lpt6__0.v90(vs0.A30());
        }
    }
    
    @Override
    public final void K8() {
        super.K8();
        final wg0_0 ly;
        if ((ly = this.Ly) != null) {
            ly.lt0();
        }
        if (this.tr0 == null || this.tr0.og == null) {
            return;
        }
        final int de0 = this.tr0.og.De0();
        int n = 0;
        final VU b1;
        if (!this.An && (b1 = this.b1) != null) {
            final short yb0;
            if ((yb0 = b1.I8.Yb0) != 3) {
                if (yb0 == 130) {
                    n = -40;
                }
            }
            else {
                n = -20;
            }
        }
        final Br0 og;
        final Br0 br0 = og = this.tr0.og;
        final Qz0 lh;
        final int gy = (lh = this.lH).Mx / 2 - de0 / 2 + n;
        final int a4 = lh.OB / 2 - 10 - og.yH0() / 2;
        br0.gY = gy;
        br0.a4 = a4;
        if (tw0_0.kz0()) {
            final dz_2 qh0;
            if ((qh0 = super.QH0) != null) {
                final le0_2 k20 = qh0.K20;
            }
            final Br0 og2 = this.K10.og;
            final int gy2 = this.lH.Mx - og2.De0() - 5;
            final int a5 = this.lH.OB - this.K10.og.yH0() + 18;
            og2.gY = gy2;
            og2.a4 = a5;
            int n2 = 5;
            final VU b2;
            if ((b2 = this.b1) != null) {
                final VU vu = b2;
                final Br0 og3 = this.i20.og;
                final int a6 = n2;
                og3.gY = 5;
                og3.a4 = a6;
                if (vu.I8.I()) {
                    n2 += this.i20.og.yH0();
                }
                final Br0 og4 = this.jB0.og;
                final int a7 = n2;
                og4.gY = 5;
                og4.a4 = a7;
                if (this.b1.I8.aR()) {
                    this.jB0.og.getClass();
                }
                final Br0 og5 = this.pD.og;
                final int gy3 = this.lH.Mx - og5.De0() - 5;
                final int a8 = 5;
                og5.gY = gy3;
                og5.a4 = a8;
            }
            final Br0 og6;
            final Br0 br2 = og6 = this.qh0.og;
            final int gy4 = 1;
            final int a9 = this.lH.OB - og6.yH0() + 12;
            br2.gY = gy4;
            br2.a4 = a9;
            final Br0 og7;
            final Br0 br3 = og7 = this.Mj0.og;
            final int gy5 = 1;
            final int a10 = this.lH.OB - og7.yH0() * 2 + 9;
            br3.gY = gy5;
            br3.a4 = a10;
        }
        else {
            final Br0 og8 = this.K10.og;
            final int gy6 = this.lH.Mx - og8.De0() - 5;
            final int a11 = this.lH.OB - this.K10.og.yH0() + 35;
            og8.gY = gy6;
            og8.a4 = a11;
            int n3 = -28;
            final VU b3;
            if ((b3 = this.b1) != null) {
                final VU vu2 = b3;
                final Br0 og9 = this.i20.og;
                final int a12 = n3;
                og9.gY = 5;
                og9.a4 = a12;
                if (vu2.I8.I()) {
                    n3 = -8;
                }
                final Br0 og10 = this.jB0.og;
                final int a13 = n3;
                og10.gY = 5;
                og10.a4 = a13;
                if (this.b1.I8.aR()) {
                    n3 += 20;
                }
                final Br0 og11 = this.pD.og;
                final int a14 = n3;
                og11.gY = 5;
                og11.a4 = a14;
            }
            final int n4 = this.lH.Mx - this.qh0.og.De0() - 5;
            final Br0 og12 = this.qh0.og;
            final int gy7 = n4;
            final int a15 = -28;
            og12.gY = gy7;
            og12.a4 = a15;
            final Br0 og13 = this.Mj0.og;
            final int gy8 = n4;
            final int a16 = og13.yH0() - 26;
            og13.gY = gy8;
            og13.a4 = a16;
        }
    }
    
    public final tk0_0 YN() {
        final tk0_0 tk0_2;
        final tk0_0 tk0_0 = tk0_2 = new tk0_0(new A40());
        tk0_0.uf("preview-frame");
        final j1_0 fu = tk0_0.gg0.FU;
        final float n = 2.0f;
        fu.getClass();
        final IT rn = fu.IJ0 = new vl0_0(n);
        fu.wv = rn;
        fu.FI0 = rn;
        fu.rN = rn;
        fu.NA().Wa0();
        this.tr0 = new S70(-1, -1, 0);
        if (tw0_0.kz0()) {
            this.tr0.VA(280, 180);
            this.tr0.g2(280, 180);
        }
        else {
            this.tr0.VA(280, 100);
            this.tr0.g2(280, 100);
        }
        this.qh0 = new S70(-1, -1, 0);
        this.Mj0 = new S70(-1, -1, 0);
        this.i20 = new S70(-1, -1, 0);
        this.jB0 = new S70(-1, -1, 0);
        this.K10 = new S70(-1, -1, 0);
        this.pD = new S70(-1, -1, 0);
        (this.i9 = new cn_0(null, 0)).uf("monster-name-label");
        (this.wO = new cn_0(null, 0)).uf("monster-name-label");
        this.Bd = new S70(16, 16, 0);
        this.og = new cn_0(null, 0);
        this.Kf0 = new cn_0(null, 0);
        (this.h1 = new cn_0(null, 0)).uf("label-markup");
        this.ly = new cn_0(null, 0);
        this.NS = new cn_0(null, 0);
        this.sD0 = new cn_0(null, 0);
        int n2;
        if (tw0_0.kz0()) {
            n2 = 24;
        }
        else {
            n2 = 16;
        }
        final S70 ca0 = new S70(n2, 16, 0);
        final S70 s70 = ca0;
        this.CA0 = ca0;
        s70.og.sj = 1;
        this.CL0 = new S70[4];
        this.gR = new cn_0[4];
        S70[] cl0;
        for (int i = 0; i < (cl0 = this.CL0).length; ++i) {
            cl0[i] = new S70(-1, -1, 0);
            if (tw0_0.kz0()) {
                this.CL0[i].og.EJ0 = 2.0f;
            }
            this.gR[i] = new cn_0(null, 0);
        }
        this.Z70 = new cn_0(null, 0);
        this.hd0 = new S70(16, 16, 0);
        this.YL0 = new cn_0(null, 0);
        this.II = new qj_2[5];
        qj_2[] ii;
        for (int j = 0; j < (ii = this.II).length; ++j) {
            ii[j] = new qj_2("", 16, 16);
            this.II[j].uf("spritelabel");
            this.II[j].tp0.r8(fn_0.qz0().Ny0(j, false, false));
        }
        this.Bd.og.EJ0 = 2.0f;
        if (tw0_0.kz0() ^ true) {
            final Br0 og = this.Bd.og;
            final int gy = -8;
            final int a4 = 2;
            og.gY = gy;
            og.a4 = a4;
        }
        if (tw0_0.kz0()) {
            this.qh0.og.EJ0 = 2.0f;
            this.Mj0.og.EJ0 = 2.0f;
            this.i20.og.EJ0 = 2.0f;
            this.jB0.og.EJ0 = 2.0f;
            this.K10.og.EJ0 = 2.0f;
            this.hd0.og.EJ0 = 2.0f;
            this.pD.og.EJ0 = 2.0f;
        }
        final tk0_0 tk0_3 = tk0_2;
        final Qz0 lh = new Qz0(asBridge());
        (this.lH = lh).F9(lh.fU(), this.tr0);
        final Qz0 lh2 = this.lH;
        lh2.F9(lh2.fU(), this.i20);
        final Qz0 lh3 = this.lH;
        lh3.F9(lh3.fU(), this.jB0);
        final Qz0 lh4 = this.lH;
        lh4.F9(lh4.fU(), this.K10);
        final Qz0 lh5 = this.lH;
        lh5.F9(lh5.fU(), this.pD);
        final Qz0 lh6 = this.lH;
        lh6.F9(lh6.fU(), this.qh0);
        final Qz0 lh7 = this.lH;
        lh7.F9(lh7.fU(), this.Mj0);
        this.lH.uf("border-container");
        final A40 gg0 = tk0_3.gg0;
        final ka0_1 an0 = an0(this.i9, this.Bd);
        if (tw0_0.kz0()) {
            an0.RY(32, 50);
        }
        else {
            final int n3 = 32;
            int n4;
            if (zb0_2.bigCJKFontSizes()) {
                n4 = 45;
            }
            else {
                n4 = 38;
            }
            an0.RY(n3, n4);
        }
        final A40 a5 = gg0;
        final ka0_1 ka0_1 = an0;
        final A40 a6 = gg0;
        final j1_0 vx0 = a6.vx0(this.wO);
        vx0.mA = 1;
        vx0.d80 = 2;
        vx0.Rr0.Rg();
        final j1_0 vx2 = a6.vx0(this.lH);
        vx2.d80 = 2;
        final j1_0 goto$ = vx2.goto$();
        goto$.sn0 = new vl0_0(250.0f);
        goto$.jQ = new vl0_0(180.0f);
        goto$.Wa0().Rr0.Rg();
        final j1_0 vx3 = a5.vx0(ka0_1);
        vx3.mA = 1;
        vx3.d80 = 2;
        vx3.Rr0.Rg();
        final int n5 = 2318;
        final String s71 = "label-title";
        final Qs0 qs0 = new Qs0(n5);
        qs0.uf(s71);
        final j1_0 vx4 = a5.vx0(qs0);
        vx4.mA = 1;
        vx4.rs0 = 1.0f;
        vx4.Rr0.vx0(this.Kf0).goto$().Rr0.Rg();
        final int n6 = 1849;
        final String s72 = "label-title";
        final Qs0 qs2 = new Qs0(n6);
        qs2.uf(s72);
        final j1_0 vx5 = a5.vx0(qs2);
        vx5.mA = 1;
        vx5.rs0 = 1.0f;
        vx5.Rr0.vx0(this.h1).Rr0.Rg();
        final int n7 = 1800;
        final String s73 = "label-title";
        final Qs0 qs3 = new Qs0(n7);
        qs3.uf(s73);
        final j1_0 vx6 = a5.vx0(qs3);
        vx6.mA = 1;
        vx6.rs0 = 1.0f;
        vx6.Rr0.vx0(this.ly).Rr0.Rg();
        final int n8 = 1805;
        final String s74 = "label-title";
        final Qs0 qs4 = new Qs0(n8);
        qs4.uf(s74);
        final j1_0 vx7 = a5.vx0(qs4);
        vx7.mA = 1;
        vx7.rs0 = 1.0f;
        vx7.Rr0.vx0(this.NS).Rr0.Rg();
        final int n9 = 1824;
        final String s75 = "label-title";
        final Qs0 qs5 = new Qs0(n9);
        qs5.uf(s75);
        final j1_0 vx8 = a5.vx0(qs5);
        vx8.mA = 1;
        vx8.rs0 = 1.0f;
        vx8.Rr0.vx0(an0(this.Z70, this.hd0)).Rr0.Rg();
        final int n10 = 1842;
        final String s76 = "label-title";
        final Qs0 qs6 = new Qs0(n10);
        qs6.uf(s76);
        final j1_0 vx9 = a5.vx0(qs6);
        vx9.mA = 1;
        vx9.rs0 = 1.0f;
        vx9.Rr0.vx0(an0(this.sD0, this.CA0)).Rr0.Rg();
        final int n11 = 1869;
        final String s77 = "label-title";
        final Qs0 qs7 = new Qs0(n11);
        qs7.uf(s77);
        final j1_0 vx10 = a5.vx0(qs7);
        vx10.mA = 1;
        vx10.rs0 = 1.0f;
        final ka0_1 ka0_2;
        (ka0_2 = new ka0_1((le0_2[])this.II)).C80 = 2.0f;
        final j1_0 vx11 = vx10.Rr0.vx0(ka0_2);
        vx11.LPt7 = 1.0f;
        vx11.Rr0.Rg();
        for (int k = 0; k < 4; ++k) {
            final j1_0 vx12 = gg0.vx0(an0(this.CL0[k], this.gR[k]));
            vx12.Ek0 = new vl0_0(5.0f);
            vx12.d80 = 2;
            vx12.Rr0.Rg();
        }
        final tk0_0 tk0_4 = tk0_2;
        tk0_4.Ll(false);
        return tk0_4;
    }
    
    public final void Cy0(final VU vu) {
        String value = "???";
        if (!vu.I8.vn()) {
            value = String.valueOf(vu.I8.wj);
        }
        if (vu.I8.Y1()) {
            this.wO.Sk(vu.na0());
        }
        else {
            this.wO.Sk(" ");
        }
        this.i9.Sk(sm0_0.wa0(1731, value) + " " + vu.k30());
        if (vu.Dg0() >= 0 && !vu.I8.vn()) {
            this.Bd.og.r8(fn_0.qz0().vo0[vu.Dg0()]);
            this.Bd.RF();
        }
        else {
            this.Bd.og.lo0();
        }
        final xe_1 jz;
        String str;
        if ((jz = this.JZ) != null) {
            str = jz.U4;
        }
        else {
            str = super.h3;
        }
        this.og.Sk(ig_0.u9(2319, new StringBuilder(), " ").append(vu.I8.ou0).append(" (").append(str).append(")").toString());
        if (!vu.I8.vn()) {
            final gc_2 rc;
            final gc_2 r4;
            final gc_2 ly;
            final gc_2 ej;
            final gc_2 ll0;
            final gc_2 ie0;
            this.Kf0.Sk(vu.Ps.BL0(rc = gc_2.RC) + "/" + vu.Ps.BL0(r4 = gc_2.r4) + "/" + vu.Ps.BL0(ly = gc_2.ly) + "/" + vu.Ps.BL0(ej = gc_2.ej) + "/" + vu.Ps.BL0(ll0 = gc_2.lL0) + "/" + vu.Ps.BL0(ie0 = gc_2.ie0));
            final cn_0 h1 = this.h1;
            final String string = vu.I8.RI(rc) + "/" + vu.I8.RI(r4) + "/" + vu.I8.RI(ly) + "/" + vu.I8.RI(ej) + "/" + vu.I8.RI(ll0) + "/" + vu.I8.RI(ie0);
            final DecimalFormat mr = lb0_2.mR;
            h1.Sk(string.replace("31", "[#6fb76f]31[]").replaceAll("([^0-9])0", "$1[#ff6666]0[]").replaceAll("^0/", "[#ff6666]0[]/"));
            this.ly.Sk(vu.I8.ZY(rc) + "/" + vu.I8.ZY(r4) + "/" + vu.I8.ZY(ly) + "/" + vu.I8.ZY(ej) + "/" + vu.I8.ZY(ll0) + "/" + vu.I8.ZY(ie0));
            this.NS.Sk(sm0_0.c0(vu.I8.yb.f10 + 180000));
        }
        else {
            this.Kf0.Sk("???");
            this.h1.Sk("???");
            this.ly.Sk("???");
            this.NS.Sk("???");
        }
        final mc0_1 lpt6 = gu0.l2.lPT6(vu.I8.rh0());
        this.NS.GH0 = 0;
        if (vu.I8.vn()) {
            final cn_0 ns = this.NS;
            ns.yj0 = null;
            ns.yB0();
        }
        else {
            final rz_0 yb;
            cn_0 cn_2;
            cn_0 cn_0;
            String yj0;
            if ((yb = vu.I8.yb).Hv == null) {
                cn_0 = (cn_2 = this.NS);
                yj0 = sm0_0.c0(1806);
            }
            else {
                cn_0 = (cn_2 = this.NS);
                yj0 = lb0_2.GK0(yb);
            }
            cn_2.yj0 = yj0;
            cn_0.yB0();
        }
        if (vu.I8.rh0() > 0) {
            this.CA0.iy0 = true;
            this.CA0.og.Nk(gh_1.aH0.Jg(vu.I8.rh0(), false));
            final Br0 og = this.CA0.og;
            final int if1 = 24;
            final int gx0 = 24;
            og.OA0 = true;
            og.IF = if1;
            og.gx0 = gx0;
            this.sD0.Sk(sm0_0.c0(lpt6.Nl));
        }
        else {
            this.CA0.og.lo0();
            this.CA0.iy0 = false;
            this.sD0.Sk(sm0_0.c0(nf0_0.Po));
        }
        for (int i = 0; i < 4; ++i) {
            final vk0_1 vk0_1;
            if ((vk0_1 = (vk0_1)ec0_2.Sx().f4.f5(vu.I8.Gu[i])) != null && vk0_1.hC0 > 0) {
                this.CL0[i].og.r8(fn_0.qz0().jJ0(vk0_1.oG(vu.I8, null).j40));
                this.CL0[i].RF();
                this.gR[i].Sk(sm0_0.c0(vk0_1.bt));
                this.gR[i].GH0 = 200;
                if (tw0_0.kz0() ^ true) {
                    this.gR[i].Xr0(s2_0.tq0(vk0_1, vu));
                }
            }
            else {
                this.CL0[i].og.lo0();
                this.gR[i].Sk(" ");
            }
        }
        Label_1169: {
            cn_0 cn_3;
            String s;
            if (vu.I8.Xn0 == 2) {
                cn_3 = this.Z70;
                if ((s = "label-hidden-ability").equals(cn_3.gW)) {
                    break Label_1169;
                }
            }
            else {
                cn_3 = this.Z70;
                if ((s = "label").equals(cn_3.gW)) {
                    break Label_1169;
                }
            }
            final cn_0 cn_4 = cn_3;
            cn_4.uf(s);
            cn_4.yI();
        }
        if (vu.I8.vn()) {
            this.Z70.Sk("???");
        }
        else {
            this.Z70.Sk(sm0_0.c0(vu.Aq0() + 210000));
        }
        if (vu.I8.ca()) {
            this.hd0.og.r8(fn_0.qz0().yp0);
            this.hd0.RF();
        }
        else {
            this.hd0.og.lo0();
        }
        this.YL0.Sk(sm0_0.c0(vu.Aq0() + 220000));
        final cn_0 z70 = this.Z70;
        z70.GH0 = 0;
        z70.yj0 = this.YL0;
        z70.yB0();
        Label_1453: {
            cn_0 cn_5;
            String s2;
            if (tw0_0.kz0() && this.BK.Mx <= 305) {
                int n = 0;
                final XD0 ps = vu.Ps;
                gc_2[] wp;
                for (int length = (wp = gc_2.Wp).length, j = 0; j < length; ++j) {
                    if (ps.BL0(wp[j]) >= 100) {
                        ++n;
                    }
                }
                if (n >= 5) {
                    cn_5 = this.Kf0;
                    if ((s2 = "label-stats-small").equals(cn_5.gW)) {
                        break Label_1453;
                    }
                }
                else {
                    cn_5 = this.Kf0;
                    if ((s2 = "label").equals(cn_5.gW)) {
                        break Label_1453;
                    }
                }
            }
            else {
                cn_5 = this.Kf0;
                if ((s2 = "label").equals(cn_5.gW)) {
                    break Label_1453;
                }
            }
            final cn_0 cn_6 = cn_5;
            cn_6.uf(s2);
            cn_6.yI();
        }
        qj_2[] ii;
        for (int k = 0; k < (ii = this.II).length; ++k) {
            gn_0 darkgray = gn_0.DARKGRAY;
            if ((vu.I8.jw0 & 1 << k) != 0x0) {
                darkgray = ng_2.MS[k];
            }
            ii[k].tp0.wx0(darkgray);
            final qj_2 qj_2 = this.II[k];
            qj_2.ER.Fc0 = null;
            final int slot = k;
            qj_2.RR(() -> this.SO(vu, slot));
        }
    }
    
    public final void Ob0(final VU b1) {
        if (this.b1 == b1) {
            return;
        }
        this.b1 = b1;
        final xt_0 pi0;
        if ((pi0 = this.pI0) != null) {
            pi0.dispose();
        }
        this.pI0 = null;
        if (b1 == null) {
            this.tr0.og.lo0();
            this.lH.Ll(false);
            this.i9.Sk("");
            this.Bd.og.lo0();
            this.qh0.og.lo0();
            this.Mj0.og.lo0();
            this.i20.og.lo0();
            this.jB0.og.lo0();
            this.pD.og.lo0();
            this.K10.og.lo0();
            this.og.Sk("");
            this.Kf0.Sk("");
            this.h1.Sk("");
            this.ly.Sk("");
            this.NS.Sk("");
            this.sD0.Sk("");
            this.CA0.og.lo0();
            this.CA0.iy0 = false;
            for (int i = 0; i < 4; ++i) {
                this.CL0[i].og.lo0();
                this.gR[i].Sk("");
            }
            this.Z70.Sk("");
            this.hd0.og.lo0();
            this.YL0.Sk("");
            this.BK.Ll(false);
            return;
        }
        this.BK.Ll(true);
        final Br0 og;
        final Br0 br0 = og = this.tr0.og;
        final yh_0 xm0;
        final yh_0 yh_0 = xm0 = f.yh_0.Xm0;
        final float hs = yh_0.hS((byte)2, b1.I8.Yb0);
        float n = 1.0f;
        this.An = yh_0.ak0(b1.Dg0(), b1.I8.Kr(), false, b1.I8.I());
        br0.EJ0 = 1.0f;
        if (b1.I8.aR()) {
            Br0 br2;
            float ps;
            if (b1.I8.I()) {
                (br2 = og).ZC = x4_0.DS;
                ps = 1.0f;
            }
            else {
                (br2 = og).ZC = x4_0.EH0;
                ps = 0.8f;
            }
            br2.Ps = ps;
            og.d00 = 1.5f;
            n = 1.15f;
        }
        else {
            og.Ps = 0.0f;
        }
        final yh_0 yh_2 = xm0;
        final AG0[] kr0 = yh_2.Kr0(b1.Dg0(), b1.I8.Kr(), false, b1.I8.I());
        int[] r6 = null;
        if (yh_2.kJ(b1.Dg0(), b1.I8.Kr(), false, b1.I8.I())) {
            r6 = xm0.R6(b1.Dg0(), b1.I8.Kr(), false, b1.I8.I());
        }
        if (!xm0.ak0(b1.Dg0(), b1.I8.Kr(), false, b1.I8.I())) {
            (this.pI0 = xm0.P90(b1.Dg0(), b1.I8.Kr(), false, b1.I8.I())).j9(n * 2.0f);
        }
        if (kr0 != null && kr0.length > 2 && r6 != null) {
            final Br0 br3 = og;
            final int[] array = r6;
            og.o60(kr0);
            br3.aL(array);
            br3.G1 = true;
        }
        else {
            final xt_0 pi2;
            if ((pi2 = this.pI0) != null) {
                og.UU(pi2);
                final xt_0 pi3 = this.pI0;
                float b2;
                if (b1.I8.aR()) {
                    b2 = 0.9f;
                }
                else {
                    b2 = 1.0f;
                }
                pi3.B0 = b2;
            }
            else {
                og.o60(kr0);
            }
        }
        final float n2 = hs;
        final int yh0 = og.yH0();
        float ej0;
        if (LW.LH0(n2, 0.0f)) {
            ej0 = n * 2.0f;
        }
        else {
            ej0 = hs * n * 164.0f / yh0;
        }
        if (this.pI0 == null) {
            og.EJ0 = ej0;
        }
        this.lH.Ll(true);
        final wl0_2 jg;
        if ((jg = this.JG) != null) {
            this.lH.Jj0 = jg.so((gn_0)rh_2.I2.get(b1.KD()));
        }
        Label_1226: {
            S70 s70;
            if (!b1.I8.vn()) {
                if (b1.I8.N00.D7 > 0) {
                    final Br0 og2 = this.K10.og;
                    final LPT6_[] array2 = { null };
                    final int n3 = 0;
                    final fn_0 qz0 = fn_0.qz0();
                    final CE i2 = b1.I8;
                    array2[n3] = qz0.Ku(i2.N00.D7, i2.u3());
                    og2.r8(array2);
                }
                else {
                    this.K10.og.lo0();
                }
                if (b1.KD().j40 != b1.KI().j40) {
                    this.qh0.og.r8(fn_0.qz0().jJ0(b1.KD().j40));
                    this.Mj0.og.r8(fn_0.qz0().jJ0(b1.KI().j40));
                }
                else {
                    this.qh0.og.r8(fn_0.qz0().jJ0(b1.KD().j40));
                    this.Mj0.og.lo0();
                }
                if (b1.I8.I()) {
                    final Br0 og3 = this.i20.og;
                    final LPT6_[] array3 = { null };
                    final int n4 = 0;
                    final fn_0 qz2 = fn_0.qz0();
                    LPT6_ lpt6_;
                    if (b1.I8.u3()) {
                        lpt6_ = qz2.iz;
                    }
                    else {
                        lpt6_ = qz2.pL;
                    }
                    final Br0 br4 = og3;
                    array3[n4] = lpt6_;
                    br4.r8(array3);
                }
                else {
                    this.i20.og.lo0();
                }
                if (b1.I8.aR()) {
                    this.jB0.og.r8(fn_0.qz0().Ft0);
                }
                else {
                    this.jB0.og.lo0();
                }
                if (b1.I8.pg()) {
                    this.pD.og.Nk(gh_1.aH0.zm((short)1446));
                    break Label_1226;
                }
                s70 = this.pD;
            }
            else {
                this.qh0.og.lo0();
                this.Mj0.og.lo0();
                this.i20.og.lo0();
                this.jB0.og.lo0();
                this.K10.og.lo0();
                s70 = this.pD;
            }
            s70.og.lo0();
        }
        final ff_0 mt;
        if ((mt = this.MT) != null) {
            mt.aUX();
        }
        if (this.MT != null && dw_2.o70) {
            final i40_0 ze;
            final boolean nc = (ze = b1.ZE()) == i40_0.Kt || ze == i40_0.lpt8 || ze == i40_0.Us0;
            final i40_0 i40_0 = ze;
            this.Nc = nc;
            if (i40_0 != f.i40_0.Gc && ze != f.i40_0.g50) {
                final ParticleEffectExt uh0;
                (uh0 = this.MT.UH0("special/type_" + ze.j40)).start();
                this.MT.fY(uh0);
            }
        }
        this.Cy0(b1);
        this.COm3();
    }
    
    public final void h0(int n) {
        if (n < 0) {
            n = 0;
        }
        final j1_0[] rg0;
        if (n >= (rg0 = this.rG0).length) {
            n = rg0.length - 1;
        }
        this.B00.em();
        final Op0 op0;
        if ((op0 = (Op0)this.rG0[n].kh0).TH0 == -1) {
            final uk0_2 b00 = this.B00;
            b00.F9(b00.fU(), this.bH);
            this.JZ.SU(sm0_0.c0(2367));
        }
        else {
            final uk0_2 b2 = this.B00;
            b2.F9(b2.fU(), op0.Yk);
            this.JZ.SU(this.p6.P2(((Op0)this.rG0[n].kh0).Yk.dz0, (byte)op0.TH0));
        }
        final int z9 = n;
        final Op0 op2 = op0;
        this.Uc0().FL(false);
        op2.BL();
        this.Z9 = z9;
        this.rt(true);
    }
    
    public final tk0_0 N60() {
        final tk0_0 tk0_0 = new tk0_0(new A40());
        (this.JZ = new xe_1("BOX")).uf("box-name");
        this.JZ.RR(this.qs0());
        tk0_0.gg0.vx0(this.JZ);
        return tk0_0;
    }
    
    public final Runnable qs0() {
        return this::kb;
    }
    
    public final tk0_0 b9() {
        final tk0_0 tk0_0 = new tk0_0(new A40());
        final int n2;
        final int n = n2 = tw0_0.rl.r1(_volatile.Bf0).V2() / 60;
        this.Lh0 = new NK[n + 1];
        this.rG0 = new j1_0[n + 2];
        j1_0[] rg0;
        for (int i = 0; i < (rg0 = this.rG0).length; ++i) {
            if (i % 11 == 0) {
                tk0_0.gg0.Rg();
                ++this.kw0;
            }
            rg0[i] = tk0_0.gg0.vx0(null);
        }
        int n4;
        if (tw0_0.kz0()) {
            final na_0 nb0;
            int n3;
            if ((nb0 = tw0_0.LD0.nB0) != null) {
                n3 = nb0.dx0.Yd0;
            }
            else {
                n3 = lg_0.S4.Kr0();
            }
            if (n3 <= 1300) {
                n4 = 80;
            }
            else {
                n4 = 84;
            }
        }
        else {
            n4 = 60;
        }
        NK[] lh0;
        for (int j = 0; j < (lh0 = this.Lh0).length; ++j) {
            NK nk;
            if (j == lh0.length - 1) {
                nk = new NK(asBridge(), _volatile.Kb, 0);
            }
            else {
                nk = new NK(asBridge(), _volatile.Bf0, j);
            }
            final NK nk2 = nk;
            nk2.eB = value -> this.Ob0((VU)value);
            final Op0 bw;
            final Op0 op0 = bw = new Op0(asBridge(), this.p6, nk, j);
            op0.Ll(true);
            op0.pw0(true);
            if (nk2.dz0 == _volatile.Kb) {
                this.BW = bw;
            }
            bw.RR(() -> this.V4(bw));
            this.rG0[this.p6.g60(j)].tv0(bw).LPt4((float)n4);
            this.Lh0[j] = nk;
        }
        final int n5;
        (this.bH = new lo0_0(null)).Qs0(n5 = 2);
        final tz0_0 tz0_0;
        (tz0_0 = new tz0_0(asBridge())).eB = value -> this.Ob0((VU)value);
        this.bH.AH0(tz0_0);
        final Op0 op3;
        final Op0 op2 = op3 = new Op0(asBridge(), this.p6, tz0_0, -1);
        op2.Ll(true);
        op2.pw0(true);
        final float n6;
        this.rG0[this.Lh0.length].tv0(op3).LPt4(n6 = (float)n4);
        op2.RR(() -> this.CE(op3));
        final lo0_0 lo0_0 = new lo0_0(null);
        final lo0_0 qj = lo0_0;
        final int n7 = n5;
        lo0_0.Qs0(n7);
        this.Tu0 = new fy_2();
        this.oL = new cn_0(null, 0);
        final fy_2 tu0;
        final fy_2 fy_2 = tu0 = this.Tu0;
        fy_2.getClass();
        fy_2.WQ(new I7(tu0).Ze0().Kn0(this.oL).Ze0());
        final fy_2 tu2;
        final fy_2 fy_3 = tu2 = this.Tu0;
        fy_3.getClass();
        fy_3.x40(new I7(tu2).Ze0().Kn0(this.oL).Ze0());
        lo0_0.AH0(this.Tu0);
        this.QJ = qj;
        if (h50_0.Bj0 && tw0_0.rl.k0.Ta < 20) {
            final int n8 = n2;
            final xe_1 xe_2;
            final xe_1 xe_1 = xe_2 = new xe_1("+");
            xe_1.uf("pc-box-button");
            xe_1.Ll(true);
            xe_1.pw0(true);
            if ((n8 + 2) % 11 == 0) {
                tk0_0.gg0.Rg();
                ++this.kw0;
            }
            final xe_1 xe_3 = xe_2;
            tk0_0.gg0.vx0(null).tv0(xe_2).LPt4(n6);
            xe_3.RR(this::y1);
        }
        return tk0_0;
    }
    
    public final void y1() {
        this.J4();
        this.B00.em();
        final uk0_2 b00 = this.B00;
        b00.F9(b00.fU(), this.QJ);
    }
    
    public final void J4() {
        lg_0.k.lPT5(this::QK);
    }
    
    public final jb0_0 G20(final int n) {
        int n2 = 0;
        for (int i = this.Lh0.length - 1; i > 0; --i) {
            final NK nk;
            if ((nk = this.Lh0[i]).dz0 == _volatile.Kb) {
                ye_0[] yg;
                for (int length = (yg = nk.YG()).length, j = 0; j < length; ++j) {
                    final ye_0 ye_0;
                    if ((ye_0 = yg[j]).ol0() == null) {
                        if (n == n2) {
                            return ye_0;
                        }
                        ++n2;
                    }
                }
            }
        }
        return null;
    }
    
    public final NK Uc0() {
        return ((Op0)this.rG0[this.Z9].kh0).Yk;
    }
    
    public final void rt(final boolean b) {
        final wg0_0 ly;
        if ((ly = this.Ly) != null) {
            ly.GA0();
        }
        final String[] split = this.v70.dI0.toString().toLowerCase().split(" ");
        if (b) {
            if (this.Z9 < this.Lh0.length) {
                this.Uc0().PH(split);
            }
        }
        else {
            NK[] lh0;
            for (int length = (lh0 = this.Lh0).length, i = 0; i < length; ++i) {
                final NK nk;
                if ((nk = lh0[i]) != null) {
                    nk.PH(split);
                }
            }
        }
        ((tz0_0)this.bH.Fe).PH(null);
        final NK uc0 = this.Uc0();
        this.Ob0(uc0.YG()[uc0.yM].ol0());
    }
    
    @Override
    public final void HP(final zk0_1 zk0_1) {
        _volatile[] cOm9;
        for (int length = (cOm9 = _volatile.COm9).length, i = 0; i < length; ++i) {
            final _volatile volatile1;
            if ((volatile1 = cOm9[i]) != _volatile.BV || tw0_0.kz0()) {
                final Mj r1;
                if ((r1 = tw0_0.rl.r1(volatile1)) != null && r1.rr0) {
                    this.rt(r1.rr0 = false);
                    break;
                }
            }
        }
        if (this.W70 != null && this.Uc0() instanceof tz0_0) {
            final lo0_0 bh;
            final int n2;
            final int n = n2 = this.W70.rA0 - (bh = this.bH).SB0;
            final int ob = bh.OB;
            if (n > 0 && n2 < ob) {
                if (n2 < ob / 7) {
                    final lo0_0 lo0_0 = bh;
                    lo0_0.Xr0(lo0_0.g1.VP - 2);
                }
                else if (n2 > ob * 0.85714287f) {
                    final lo0_0 lo0_2 = bh;
                    lo0_2.Xr0(lo0_2.g1.VP + 2);
                }
            }
        }
        super.HP(zk0_1);
    }
    
    @Override
    public final void Dw0(final zk0_1 zk0_1) {
        super.Dw0(zk0_1);
        if (this.W70 != null) {
            for (final jb0_0 jb0_0 : this.lM) {
                jb0_0.Kp0(zk0_1, jb0_0.dV, jb0_0.rA0, 0);
            }
        }
    }
    
    @Override
    public final void aUX(final zk0_1 zk0_1) {
        if (lg_0.lW.eC0(129) && lg_0.lW.nI0(34)) {
            this.v70.BL();
        }
        if (dw_2.lp0) {
            final Iu0 hh0 = tw0_0.hH0;
            lg_0.S4.getClass();
            lg_0.S4.getClass();
        }
        final wl0_2 jj0;
        if ((jj0 = super.Jj0) != null) {
            jj0.uf(super.M, super.A20, super.SB0, super.Mx, super.OB);
        }
        final xt_0 pi0;
        if ((pi0 = this.pI0) != null) {
            lg_0.k.lPT5(pi0);
        }
    }
    
    @Override
    public final boolean nd0(final i70_0 i70_0) {
        if (E00.ZU(i70_0.zu) && i70_0.iT()) {
            boolean b = false;
            Label_0052: {
                if (this.K() instanceof cg_0) {
                    final int finally$ = i70_0.finally$;
                    final rp_0 sj0 = rp_0.sJ0;
                    if ((finally$ & 0x100) == 0x0) {
                        b = false;
                        break Label_0052;
                    }
                }
                b = true;
            }
            if (this.Ly.Of()) {
                final int finally$2 = i70_0.finally$;
                final rp_0 i90 = rp_0.I90;
                final int ff = dw_2.ff;
                if (i90 != null) {
                    if (i90.Ov(finally$2)) {
                        final NK uc0 = this.Uc0();
                        uc0.EP(uc0.yM);
                        final NK uc2 = this.Uc0();
                        final ye_0 ye_2;
                        final ye_0 ye_0 = ye_2 = uc2.YG()[uc2.yM];
                        this.fx0(ye_0.a3() / 2 + (ye_0.A20 + ye_2.e80), ye_0.k5() / 2 + (ye_0.SB0 + ye_2.y9));
                        return true;
                    }
                }
            }
            final int finally$3 = i70_0.finally$;
            final rp_0 mi0 = rp_0.Mi0;
            final int ff2 = dw_2.ff;
            if (mi0 != null) {
                if (mi0.Ov(finally$3) && b) {
                    final Jm0 kk0 = this.kk0;
                    kk0.ER.lK0(kk0.ER.U20() ^ true);
                    this.Pb0();
                    return true;
                }
            }
            final int finally$4 = i70_0.finally$;
            final rp_0 aq0;
            if ((aq0 = rp_0.Aq0) != null) {
                if (aq0.Ov(finally$4) && !this.qu) {
                    final int ym = this.Uc0().yM;
                    this.h0(this.Z9 + 1);
                    if (!(this.Uc0() instanceof tz0_0)) {
                        this.Uc0().EP(ym);
                    }
                    else {
                        this.Uc0().EP(0);
                    }
                    return true;
                }
            }
            final int finally$5 = i70_0.finally$;
            final rp_0 cb;
            if ((cb = rp_0.cB) != null) {
                if (cb.Ov(finally$5) && !this.qu) {
                    final int ym2 = this.Uc0().yM;
                    this.h0(this.Z9 - 1);
                    if (!(this.Uc0() instanceof tz0_0)) {
                        this.Uc0().EP(ym2);
                    }
                    else {
                        this.Uc0().EP(0);
                    }
                    return true;
                }
            }
            Label_0684: {
                if (this.W70 != null) {
                    final int finally$6 = i70_0.finally$;
                    final rp_0 nk0;
                    if ((nk0 = rp_0.nK0) != null) {
                        if (nk0.Ov(finally$6) && b) {
                            for (final jb0_0 jb0_0 : this.lM) {
                                jb0_0.uA(false);
                                jb0_0.pt0 = null;
                                jb0_0.LPT8(false);
                            }
                            this.W70 = null;
                            this.lM.clear();
                            return true;
                        }
                    }
                    final int finally$7 = i70_0.finally$;
                    Label_0619: {
                        final rp_0 kc0;
                        if ((kc0 = rp_0.kC0) != null) {
                            if (kc0.Ov(finally$7)) {
                                break Label_0619;
                            }
                        }
                        final int finally$8 = i70_0.finally$;
                        final rp_0 synchronized$;
                        if ((synchronized$ = rp_0.synchronized$) != null) {
                            if (synchronized$.Ov(finally$8)) {
                                break Label_0619;
                            }
                        }
                        final int finally$9 = i70_0.finally$;
                        final rp_0 i91;
                        if ((i91 = rp_0.I90) != null) {
                            if (i91.Ov(finally$9)) {
                                break Label_0619;
                            }
                        }
                        final int finally$10 = i70_0.finally$;
                        final rp_0 ni;
                        if ((ni = rp_0.Ni) != null) {
                            if (ni.Ov(finally$10)) {
                                break Label_0619;
                            }
                        }
                        final int finally$11 = i70_0.finally$;
                        final rp_0 sj2;
                        if ((sj2 = rp_0.sJ0) == null) {
                            break Label_0684;
                        }
                        if (!sj2.Ov(finally$11)) {
                            break Label_0684;
                        }
                    }
                    super.nd0(i70_0);
                    if (this.W70 == null) {
                        return true;
                    }
                    final le0_2 k;
                    final le0_2 le0_2 = k = this.K();
                    this.fx0(le0_2.a3() / 2 + (le0_2.A20 + k.e80), le0_2.k5() / 2 + (le0_2.SB0 + k.y9));
                    return true;
                }
            }
            final int finally$12 = i70_0.finally$;
            final rp_0 nk2;
            if ((nk2 = rp_0.nK0) != null) {
                if (nk2.Ov(finally$12) && b) {
                    if (!super.nd0(i70_0)) {
                        this.close();
                    }
                    return true;
                }
            }
        }
        return super.nd0(i70_0);
    }
    
    public final void fx0(int n, int n2) {
        if (this.W70 != null) {
            le0_2 le0_2;
            final le0_2 dh0;
            if ((dh0 = (le0_2 = Qy0.yI0.zK0).dh0(n, n2)) != null) {
                le0_2 = dh0.BQ(n, n2);
            }
            final boolean b;
            if (!(b = (le0_2 instanceof Op0))) {
                this.o3 = null;
            }
            final int n3 = n2;
            final jb0_0 w70;
            n2 = n - (w70 = this.W70).dV;
            n = n3 - w70.rA0;
            for (final jb0_0 jb0_2 : this.lM) {
                final jb0_0 jb0_0 = jb0_2;
                final int n4 = jb0_0.dV += n2;
                final int n5 = jb0_0.rA0 += n;
                le0_2 le0_3;
                final le0_2 dh2;
                if ((dh2 = (le0_3 = Qy0.yI0.zK0).dh0(n4, n5)) != null) {
                    le0_3 = dh2.BQ(n4, n5);
                }
                final le0_2 k20;
                if (!(le0_3 instanceof sg_2) && (k20 = le0_3.K20) instanceof sg_2) {
                    le0_3 = k20;
                }
                if (le0_3 instanceof sg_2) {
                    jb0_2.pt0 = (sg_2)le0_3;
                }
                else {
                    if (le0_3 instanceof NK) {
                        continue;
                    }
                    jb0_2.pt0 = null;
                }
                if (jb0_2.pt0 != null) {
                    jb0_2.ad(true, true);
                }
            }
            if (b) {
                final Op0 o3 = (Op0)le0_2;
                if (this.o3 != o3) {
                    final ij0_1 q2;
                    if ((q2 = this.Q2) != null) {
                        q2.ky0();
                    }
                    _finally.HG().dH0(this.Q2 = new ij0_1(asBridge(), o3), 0.5f);
                }
                this.o3 = o3;
                int n6 = 0;
                final Iterator iterator2 = ((List)this.lM.stream().sorted().collect(Collectors.toList())).iterator();
                while (iterator2.hasNext()) {
                    ((jb0_0)iterator2.next()).pt0 = LPt7(o3.Yk, n6);
                    ++n6;
                }
            }
        }
    }
    
    public final void mf0(final int n, final int n2) {
        final ij0_1 q2;
        if ((q2 = this.Q2) != null) {
            q2.ky0();
        }
        if (this.W70 != null) {
            this.fx0(n, n2);
            if (tw0_0.PK0 == null) {
                jb0_0 jb0_0 = null;
                final Iterator iterator = this.lM.iterator();
                while (iterator.hasNext()) {
                    final jb0_0 jb0_2;
                    if ((jb0_2 = (jb0_0)iterator.next()).ol0() == null) {
                        continue;
                    }
                    final sg_2 pt0;
                    if ((pt0 = jb0_2.pt0) == null || !(pt0 instanceof jb0_0) || (jb0_0 != null && jb0_0.pt0.y0().Xh0() <= jb0_2.pt0.y0().Xh0())) {
                        continue;
                    }
                    jb0_0 = jb0_2;
                }
                Object o;
                if (this.lM.size() > 1 && jb0_0 != null && jb0_0.h80().vr0 && jb0_0.pt0.y0().h80() == _volatile.BV) {
                    final jb0_0 jb0_3 = jb0_0;
                    final ArrayList list = new ArrayList(this.lM);
                    Collections.sort((List<Comparable>)list);
                    int xh0 = jb0_3.pt0.y0().Xh0();
                    o = new ArrayList<Object>();
                    final Iterator iterator2 = list.iterator();
                    while (iterator2.hasNext()) {
                        final jb0_0 e;
                        if ((e = (jb0_0)iterator2.next()).ol0() == null) {
                            continue;
                        }
                        if (xh0 >= 6) {
                            continue;
                        }
                        final int n3 = xh0;
                        final wg0_0 ly = this.Ly;
                        final short n4 = (short)(xh0 + 1);
                        ly.getClass();
                        jb0_0 pt2;
                        if (n3 >= 0 && xh0 <= 6) {
                            pt2 = ly.dz[xh0];
                        }
                        else {
                            pt2 = null;
                        }
                        final List<jb0_0> list2 = (List<jb0_0>)o;
                        e.pt0 = pt2;
                        ((ArrayList<jb0_0>)list2).add(e);
                        xh0 = n4;
                    }
                }
                else {
                    o = this.lM.stream().filter(QT::XL).sorted(QT::D00).collect(Collectors.toList());
                }
                final List<jb0_0> list3 = (List<jb0_0>)o;
                final jb0_0[] array = new jb0_0[list3.size()];
                final jb0_0[] array2 = new jb0_0[list3.size()];
                for (int i = 0; i < ((List)o).size(); ++i) {
                    array2[i] = (array[i] = (jb0_0)((List<Object>)o).get(i)).pt0.y0();
                }
                final List<jb0_0> list4 = (List<jb0_0>)o;
                tw0_0.rl.qn(array, array2);
                list4.stream().peek(jb0_6 -> jb0_6.uA(false)).peek(QT::bN).forEach(this.lM::remove);
            }
            le0_2 le0_2;
            final le0_2 dh0;
            if ((dh0 = (le0_2 = Qy0.yI0).dh0(n, n2)) != null) {
                le0_2 = dh0.BQ(n, n2);
            }
            final le0_2 k20;
            if ((k20 = le0_2.K20) instanceof cg_0) {
                final le0_2 k21;
                if ((k21 = k20.K20.K20).K20 instanceof XH) {
                    this.lM.stream().map(jb0_0::ol0).forEach(value -> QT.PU(k20.K20.K20, value));
                }
                else if (k21 instanceof nq_1) {
                    this.lM.stream().map(jb0_0::ol0).forEach(value -> QT.b6(k20.K20.K20, value));
                }
            }
            for (final jb0_0 jb0_5 : this.lM) {
                final jb0_0 jb0_4 = jb0_5;
                jb0_4.uA(false);
                final sg_2 pt3;
                if ((pt3 = jb0_4.pt0) != null) {
                    pt3.G9(jb0_5);
                }
                jb0_5.pt0 = null;
            }
        }
        this.W70 = null;
        this.lM.clear();
    }
    
    public final j1_0[] v50() {
        return this.rG0;
    }
    
    public final boolean wf0() {
        final Jm0 kk0;
        return (kk0 = this.kk0) != null && kk0.ER.U20();
    }
    
    public final void Pb0() {
        this.Uc0().FL(false);
        final NK uc0 = this.Uc0();
        final ye_0 ye_0;
        if ((ye_0 = uc0.YG()[uc0.yM]).Of()) {
            final ye_0 ye_2 = ye_0;
            ye_2.M.j70(sg_2.cv0, this.kk0.ER.U20());
            ye_2.M.j70(sg_2.throws$, false);
        }
    }
    
    public final void Oc() {
        if (this.zt0 != null) {
            return;
        }
        final tk0_0 zt0 = new tk0_0(new A40());
        zt0.gg0.vx0(new u8_0(qd_0.Vx0, tw0_0.rl.sN, this.xw, false, () -> this.Uc((boolean)(1 != 0)), () -> this.Uc((boolean)(0 != 0)))).p20().NA().ck0 = new vl0_0(7.0f);
        this.zt0 = zt0;
    }
    
    public final void close() {
        if (this.qu) {
            this.Uc(false);
            return;
        }
        final BU zk0;
        if ((zk0 = Qy0.yI0.zK0).Xf0 == null && zk0.de0 == null) {
            tw0_0.rl.fk0.uQ(new re_2());
        }
        Qy0.yI0.zm0();
        Qy0.yI0.zK0.Nc0(false);
        this.Cp0();
    }

    public final void SW() {
        final ff_0 mt = this.MT;
        if (mt != null) {
            mt.aUX();
            mt.dispose();
            this.MT = null;
        }
        final xt_0 texture = this.pI0;
        if (texture != null) {
            texture.dispose();
        }
    }

    public final void xH0() {
        this.Uc(false);
    }

    public final void Mq() {
        this.Uc(true);
    }
    
    public final void Cp0() {
        lg_0.k.lPT5(() -> {
            final ff_0 mt = this.MT;
            if (this.MT != null) {
                mt.aUX();
                this.MT.dispose();
                this.MT = null;
            }
            final xt_0 pi0 = this.pI0;
            final xt_0 xt_0;
            if ((xt_0 = pi0) != null) {
                xt_0.dispose();
            }
        });
    }
    
    public final void AM() {
        final int n;
        final byte[] array = new byte[n = this.rG0.length - 2];
        for (int i = 0; i < n; ++i) {
            array[i] = (byte)((Op0)this.rG0[i].kh0).TH0;
        }
        if (!Arrays.equals(this.p6.pw0, array)) {
            this.p6.pw0 = array;
            tw0_0.rl.fk0.uQ(new y1_0(array));
        }
    }

    public final void Ak0() {
        for (final ye_0 value : this.Uc0().YG()) {
            value.LPT8(false);
            if (QT.jp(value)) {
                value.LPT8(true);
            }
        }
    }

    public final void sq(final int ignored) {
        this.rt(false);
    }
    
    public final void qs() {
        final NK uc0 = this.Uc0();
        lpt6__0.v90(uc0.YG()[uc0.yM]);
    }
    
    public final gk0_1 xY() {
        final gk0_1 iq = new gk0_1(asBridge());
        final cg_0 v70 = new cg_0(null, new wn0_0());
        this.v70 = v70;
        v70.NR = true;
        v70.Ii(p0 -> this.rt((boolean)(0 != 0)));
        final qj_2 qj_3;
        final qj_2 qj_2 = qj_3 = new qj_2("", 0, 0);
        qj_2.uf("hud-spritetoggle");
        qj_2.tp0.r8(fn_0.qz0().Qr0);
        final int de0 = qj_2.tp0.De0();
        final int yh0 = qj_3.tp0.yH0();
        qj_2.iK = de0;
        qj_2.oY = yh0;
        qj_2.yj0 = sm0_0.c0(8036);
        qj_2.yB0();
        qj_2.GH0 = 100;
        qj_2.RR(this::no0);
        final xe_1 xe_1;
        (xe_1 = new xe_1(sm0_0.c0(8010))).RR(this::hy0);
        (this.Oa = new Jm0(0, 0, 0)).RR(this::O7);
        final Jm0 oa;
        final Br0 fg = (oa = this.Oa).Fg;
        final Wr[] array = { null };
        final int n = 0;
        final gh_1 ah0 = gh_1.aH0;
        final boolean b = oa.ER.U20() ^ true;
        ah0.getClass();
        array[n] = ah0.F10(gu0.l2.lPT6((short)5152), b);
        fg.Nk(array);
        if (tw0_0.kz0()) {
            this.Oa.Fg.EJ0 = 2.0f;
        }
        final Jm0 oa2;
        final Jm0 jm0 = oa2 = this.Oa;
        final Br0 fg2 = jm0.Fg;
        final int if1 = 24;
        final int gx0 = 24;
        fg2.OA0 = true;
        fg2.IF = if1;
        fg2.gx0 = gx0;
        final int de2 = fg2.De0();
        final int yh2 = oa2.Fg.yH0();
        jm0.z00 = de2;
        jm0.eK0 = yh2;
        this.Oa.uf("hud-spritetoggle");
        (this.B60 = new qj_2("", 0, 0)).RR(() -> Arrays.stream(this.Uc0().YG()).peek(ye_0 -> ye_0.LPT8(false)).filter(QT::jp).forEach(ye_ -> ye_.LPT8(true)));
        this.B60.tp0.r8(fn_0.qz0().Eg0);
        this.B60.uf("hud-spritetoggle");
        final qj_2 b2;
        final qj_2 qj_4 = b2 = this.B60;
        final int de3 = qj_4.tp0.De0();
        final int yh3 = b2.tp0.yH0();
        qj_4.iK = de3;
        qj_4.oY = yh3;
        (this.oq0 = new fq_1()).RR(this::Nw0);
        this.oq0.uf("hud-spritetoggle");
        this.oq0.tp0.r8(fn_0.qz0().dm0);
        final fq_1 oq0;
        final fq_1 fq_1 = oq0 = this.oq0;
        final int de4 = fq_1.tp0.De0();
        final int yh4 = oq0.tp0.yH0();
        fq_1.iK = de4;
        fq_1.oY = yh4;
        final xe_1 xe_2;
        (xe_2 = new xe_1(sm0_0.c0(2315))).RR(() -> this.iI0(xe_2));
        (this.kk0 = new Jm0(0, 0, 0)).RR(this::B4);
        this.kk0.Fg.r8(fn_0.qz0().Com2);
        this.kk0.uf("hud-spritetoggle");
        final Jm0 kk0;
        final Jm0 jm2 = kk0 = this.kk0;
        final int de5 = jm2.Fg.De0();
        final int yh5 = kk0.Fg.yH0();
        jm2.z00 = de5;
        jm2.eK0 = yh5;
        (this.cN = new qj_2("", 0, 0)).uf("box-name");
        this.cN.RR(this.qs0());
        this.cN.tp0.r8(fn_0.qz0().Qv);
        if (tw0_0.kz0()) {
            this.cN.tp0.EJ0 = 2.0f;
        }
        final gk0_1 gk0_1 = iq;
        final qj_2 cn;
        final qj_2 qj_5 = cn = this.cN;
        final int de6 = qj_5.tp0.De0();
        final int yh6 = cn.tp0.yH0();
        qj_5.iK = de6;
        qj_5.oY = yh6;
        final A40 gg0 = gk0_1.gg0;
        if (tw0_0.kz0()) {
            final j1_0 wa0 = gg0.vx0(xe_2).Wa0();
            wa0.Ek0 = new vl0_0(10.0f);
            wa0.J90 = new vl0_0(10.0f);
            gg0.vx0(this.kk0).J90 = new vl0_0(15.0f);
            gg0.vx0(this.Oa).J90 = new vl0_0(15.0f);
            gg0.vx0(this.B60).J90 = new vl0_0(15.0f);
            gg0.vx0(this.oq0);
            gg0.vx0(this.cN);
            gg0.vx0(new le0_2(null, false)).goto$();
            gg0.vx0(xe_1).J90 = new vl0_0(10.0f);
            gg0.vx0(this.v70).J90 = new vl0_0(10.0f);
            gg0.vx0(qj_3).GD().J90 = new vl0_0(10.0f);
        }
        else {
            final j1_0 fu = gg0.FU;
            final float n2 = 5.0f;
            fu.getClass();
            fu.J90 = new vl0_0(n2);
            gg0.vx0(xe_2);
            gg0.vx0(this.kk0);
            gg0.vx0(this.Oa);
            gg0.vx0(this.B60);
            gg0.vx0(this.oq0);
            gg0.vx0(this.cN);
            gg0.vx0(new le0_2(null, false)).goto$();
            gg0.vx0(this.v70);
            gg0.vx0(qj_3);
            gg0.vx0(xe_1);
        }
        final gk0_1 gk0_2 = iq;
        gk0_2.NUL = true;
        this.iq = iq;
        return gk0_2;
    }
    
    public final void vu0(final jb0_0 w70, final List list) {
        this.lM.addAll(list);
        this.lM.add(w70);
        for (final jb0_0 jb0_0 : this.lM) {
            jb0_0.uA(true);
            jb0_0.dV = jb0_0.A20;
            jb0_0.rA0 = jb0_0.SB0;
        }
        this.W70 = w70;
        if (this.lM.size() == 1) {
            this.Ob0(w70.ol0());
        }
    }
}
