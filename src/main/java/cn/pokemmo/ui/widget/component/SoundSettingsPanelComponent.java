// 
// Decompiled by Procyon v0.6.0
// 

package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

import java.util.Iterator;
import java.util.Arrays;
import java.util.ArrayList;

public class SoundSettingsPanelComponent extends BaseComponent implements fy0_0
{
    public final a10_0 xA0;
    public xt_0 P90;
    public final tk0_0 Nn;
    public final ArrayList E70;
    
    public SoundSettingsPanelComponent(final a10_0 xa0, final se_0 se_0) {
        this.P90 = null;
        this.Nn = new tk0_0();
        this.E70 = new ArrayList();
        this.uf("monster-preview-panel");
        this.xA0 = xa0;
        final i40_0 c90;
        final int r90 = fn_0.qz0().ML0(c90 = i40_0.c90).R90();
        final int dv = fn_0.qz0().ML0(c90).dV();
        final PF nd0 = xa0.nd0(se_0.rH0());
        final tk0_0 tk0_0 = new tk0_0();
        final S70 s70 = new S70(r90, dv);
        if (tw0_0.kz0()) {
            s70.JH().dA(2.0f);
        }
        if (se_0.Sy0() != -1) {
            final S70 s71 = s70;
            final LPT6_ cn = fn_0.qz0().Cn(se_0.Sy0());
            s71.JH().r8(cn);
            final Br0 jh = s71.JH();
            final int n = s71.R00() + s71.Nl0() - cn.R90();
            int n2;
            if (tw0_0.kz0()) {
                n2 = 10;
            }
            else {
                n2 = 0;
            }
            final S70 s72 = s70;
            final int n3 = n - n2;
            final int wf = s72.wF();
            int n4;
            if (tw0_0.kz0()) {
                n4 = 9;
            }
            else {
                n4 = 0;
            }
            jh.Gy0(n3, wf - n4);
        }
        final cn_0 cn_0;
        (cn_0 = new cn_0()).Sk(ig_0.u9(59, new StringBuilder().append(sm0_0.c0(se_0.SD0() + 150000)).append(" "), " ").append(se_0.mf0().tr0()).toString());
        if (se_0.hf0()) {
            cn_0.uf("/monster-preview-panel-label-red");
        }
        else {
            cn_0.uf("/monster-preview-panel-label");
        }
        final PF pf = nd0;
        final tk0_0 tk0_2 = tk0_0;
        final cn_0 cn_2 = cn_0;
        tk0_0.SL(s70);
        tk0_2.SL(cn_2);
        tk0_2.gg0.rx0(5.0f);
        final tk0_0 tk0_3 = new tk0_0();
        final S70 s73 = new S70(r90, dv);
        short n5;
        if (pf != null) {
            n5 = nd0.Ql();
        }
        else {
            n5 = se_0.E3();
        }
        final cn_0 cn_3 = new cn_0(sm0_0.c0(n5 + 210000));
        if (se_0.E3() != n5) {
            cn_3.uf("/monster-preview-panel-label-teal");
        }
        else if (se_0.mf0().an() == 2) {
            cn_3.uf("/monster-preview-panel-label-yellow");
            LPT6_ lpt6_;
            if (tw0_0.kz0()) {
                lpt6_ = fn_0.qz0().BX();
            }
            else {
                lpt6_ = fn_0.qz0().Ki0();
            }
            final S70 s74 = s73;
            s74.JH().r8(lpt6_);
            final Br0 jh2 = s74.JH();
            final int n6 = s74.R00() + s74.Nl0() - lpt6_.R90();
            final int n7 = s74.wF() - 1;
            int n8;
            if (tw0_0.kz0()) {
                n8 = 4;
            }
            else {
                n8 = 0;
            }
            jh2.Gy0(n6, n7 - n8);
        }
        else {
            cn_3.uf("/monster-preview-panel-label");
        }
        final tk0_0 tk0_4 = tk0_3;
        final cn_0 cn_4 = cn_3;
        tk0_3.SL(s73);
        tk0_4.SL(cn_4);
        final tk0_0 tk0_5 = new tk0_0();
        final S70 s75 = new S70(r90, dv);
        final cn_0 cn_5;
        (cn_5 = new cn_0()).uf("/monster-preview-panel-label");
        final short ga0;
        if ((ga0 = X4.gA0(se_0.mf0().rh0())) > 0) {
            s75.iy0 = true;
            final cn_0 cn_6 = cn_5;
            final mc0_1 lpt6 = gu0.Az0().lPT6(ga0);
            final S70 s76 = s75;
            final Xm0 coM8 = gh_1.Jh0().Xj0(lpt6).coM8();
            s76.JH().r8(coM8);
            final Br0 jh3 = s76.JH();
            final S70 s77 = s75;
            jh3.Gy0(s77.R00() + s77.Nl0() - coM8.R90(), s70.wF() - 4);
            cn_6.Sk(lpt6.getName());
        }
        else {
            final cn_0 cn_7 = cn_5;
            s75.JH().lo0();
            s75.iy0 = false;
            cn_7.Sk(sm0_0.c0(nf0_0.Po));
        }
        final PF pf2 = nd0;
        final tk0_0 tk0_6 = tk0_5;
        tk0_6.SL(s75);
        tk0_6.SL(cn_5);
        final int n9;
        final tk0_0[] array = new tk0_0[n9 = 4];
        final int n10 = 0;
        short[] qz0;
        int n11;
        if (pf2 != null) {
            n11 = ((Arrays.equals(qz0 = nd0.qz0(), se_0.mf0().B5()) ^ true) ? 1 : 0);
        }
        else {
            final short[] b5 = se_0.mf0().B5();
            n11 = n10;
            qz0 = b5;
        }
        for (int i = 0; i < n9; ++i) {
            final tk0_0 tk0_7 = new tk0_0();
            final vk0_1 sx;
            final vk0_1 vk0_1 = sx = ec0_2.Sx().SX(qz0[i]);
            final S70 s78 = new S70(r90, dv);
            final cn_0 cn_8 = new cn_0();
            if (vk0_1 != null) {
                if (sx.oC0() > 0) {
                    s78.JH().r8(fn_0.qz0().ML0(sx.yS(se_0.mf0())));
                }
                cn_8.Sk(sx.CoM2());
            }
            else {
                cn_8.Sk("-----");
            }
            final PF pf3 = nd0;
            final tk0_0 tk0_8 = tk0_7;
            tk0_8.SL(s78);
            tk0_8.SL(cn_8);
            if (((pf3 != null) ? nd0.um0()[i] : se_0.mf0().xm((byte)i)) < 1 && sx != null && sx.oC0() > 0) {
                cn_8.uf("/monster-preview-panel-label-red");
            }
            else if (n11 != 0) {
                cn_8.uf("/monster-preview-panel-label-teal");
            }
            else {
                cn_8.uf("/monster-preview-panel-label");
            }
            final int n12 = i;
            array[i] = tk0_7;
            if (n12 == 3) {
                tk0_7.gg0.qf(3.0f);
            }
        }
        this.Nn.uf("/monster-preview-panel-boxlayout");
        this.Nn.SL(this.si(se_0));
        this.Nn.Nu();
        this.Nn.Nu().yi0(tk0_0);
        this.Nn.Nu().yi0(tk0_3);
        this.Nn.Nu().yi0(tk0_5);
        this.Nn.gg0.qE0(7.0f);
        this.Nn.gg0.Dr0(7.0f);
        for (int j = 0; j < n9; ++j) {
            this.Nn.Nu().yi0(array[j]);
        }
        this.SL(this.Nn);
        this.lt0();
    }
    
    @Override
    public final void K8() {
        this.Nn.lt0();
        this.lt0();
    }
    
    @Override
    public final void aUX(final zk0_1 zk0_1) {
        super.aUX(zk0_1);
        final xt_0 p;
        if ((p = this.P90) != null) {
            lg_0.k.lPT5(p);
        }
    }
    
    @Override
    public final void dispose() {
        final Iterator iterator = this.E70.iterator();
        while (iterator.hasNext()) {
            ((fy0_0)iterator.next()).dispose();
        }
    }
    
    public final S70 si(final se_0 se_0) {
        final S70 s70 = new S70(-1, -1, 0);
        final S70 s71 = s70;
        s70.ZZ(e -> this.NW(se_0, (e90_0)e));
        final yh_0 xm0;
        float hs;
        if ((hs = (xm0 = yh_0.Xm0).hS((byte)2, se_0.Bn.Yb0)) == 0.0f) {
            if (tw0_0.kz0()) {
                hs = 3.0f;
            }
            else {
                hs = 2.0f;
            }
        }
        final yh_0 yh_0 = xm0;
        final short kr = se_0.Bn.Kr();
        final boolean b = false;
        final byte d4 = se_0.D4;
        final boolean i = se_0.Bn.I();
        final AG0[] kr2 = yh_0.Kr0(d4, kr, b, i);
        final byte b2 = d4;
        final AG0 ag0 = kr2[0];
        int[] r6 = null;
        if (yh_0.ak0(b2, kr, b, i)) {
            if (xm0.kJ(se_0.D4, se_0.Bn.Kr(), b, se_0.Bn.I())) {
                r6 = xm0.R6(se_0.D4, se_0.Bn.Kr(), b, se_0.Bn.I());
            }
        }
        else {
            this.E70.add(this.P90 = xm0.P90(se_0.D4, se_0.Bn.Kr(), b, se_0.Bn.I()));
            if (tw0_0.kz0()) {
                hs = 4.0f;
            }
            else {
                hs = 2.0f;
            }
        }
        if (kr2.length > 1 && r6 != null) {
            final S70 s72 = s71;
            s72.og.o60(kr2);
            s72.og.aL(r6);
            s72.og.G1 = true;
        }
        else {
            final xt_0 p;
            if ((p = this.P90) != null) {
                final S70 s73 = s71;
                p.j9((float)Math.round(hs));
                this.P90.run();
                s73.og.r8(this.P90.yq());
                Br0 br3;
                Br0 br2;
                int gy;
                int a4;
                if (tw0_0.kz0()) {
                    final Br0 br0;
                    gy = (br0 = (br2 = (br3 = s71.og))).gY - 100;
                    a4 = br0.a4 - 50;
                }
                else {
                    final Br0 br4;
                    gy = (br4 = (br2 = (br3 = s71.og))).gY - 50;
                    a4 = br4.a4 - 15;
                }
                br2.gY = gy;
                br3.a4 = a4;
                s71.og.EJ0 = 0.5f;
            }
            else {
                s71.og.o60(ag0);
            }
        }
        if (tw0_0.kz0()) {
            s71.VA(ag0.d3().bz * 2, ag0.d3().xZ * 2);
        }
        else {
            s71.VA(ag0.d3().bz, ag0.d3().xZ);
        }
        final S70 s74 = s71;
        s74.COm3();
        s74.lt0();
        return s74;
    }
    
    public final void NW(final se_0 se_0, final e90_0 e90_0) {
        if (e90_0 == e90_0.VG) {
            Mj mj;
            if (this.xA0.kd0()) {
                mj = tw0_0.rl.r1(this.xA0.DF0);
            }
            else {
                mj = tw0_0.rl.PC0;
            }
            final VU sf;
            if ((sf = mj.sF(se_0.Bn.YD0)) != null) {
                final BU t50 = BU.T50;
                le0_2 le0_2 = null;
                if (!tw0_0.kz0()) {
                    le0_2 = null;
                }
                t50.FI(sf, le0_2, qo_1.DL, false);
            }
        }
    }
}

