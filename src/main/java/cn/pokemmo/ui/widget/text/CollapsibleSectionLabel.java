package cn.pokemmo.ui.widget.text;

import f.*;
import java.util.*;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;

public class CollapsibleSectionLabel extends BaseLabel {
    public final us_0 pRn;
    public final S70[] YF;
    public final cn_0 PO;
    public final cn_0 YR;
    public final cn_0 jy0;
    public final cn_0 hL;
    public final ch0_2 ko0;
    public final wb_2 fF;
    public final int cT;

    public CollapsibleSectionLabel(ch0_2 v1) {
        super();
        this.cT = tw0_0.kz0() ? 2 : 1;
        uf("character-select-button");
        this.ko0 = v1;
        us_0 us = new us_0();
        this.pRn = us;
        SL(us);
        String name = v1.sm().uv0();
        if (v1.sm().eo0() && !v1.sm().Y00().isEmpty()) {
            name = v1.sm().Y00() + "*";
        }
        cn_0 cn_name = new cn_0(name);
        this.PO = cn_name;
        SL(cn_name);
        this.YR = new cn_0("$" + NumberFormat.getInstance().format((long) v1.sm().bk0()));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        this.hL = new cn_0(ig_0.u9(1659, new StringBuilder(), ": ").append(sdf.format(Long.valueOf((long) v1.sm().kJ0() * 1000L))).toString());
        int playHours = v1.sm().k10() / 3600;
        this.jy0 = new cn_0(sm0_0.wa0(1603, NumberFormat.getInstance().format((long) playHours)));
        this.YF = new S70[6];
        for (byte b = 0; b < this.YF.length; b = (byte) (b + 1)) {
            CE ce = v1.a00(b);
            S70 s70 = new S70(this.cT * 16, this.cT * 16);
            this.YF[b] = s70;
            if (ce != null) {
                VU vu = new VU(ce);
                s70.JH().o60(new AG0[]{yh_0.Dl0().qC0(ce.Kr(), vu.Dg0(), vu.LPt6())[0]});
                s70.Bb(0);
                s70.Xr0(mp_1.vf0().W50(vu.U8()).zj());
                s70.JH().nq0(this.cT * 36, this.cT * 36);
            }
            this.pRn.SL(this.YF[b]);
        }
        wb_2 wb = new wb_2((f.f00_0)(Object)this, this);
        this.fF = wb;
        ew0_0 ew = ew0_0.C1;
        wb.MA();
        wb.CF0(this.cT);
    }

    @Override
    public final void K8() {
        this.PO.qF0(pa0_0.Ol);
        this.PO.RY(a3(), 0);
        this.PO.lt0();
        this.PO.E40(this.pRn.A20, this.pRn.SB0 + 5);
        this.YR.E40(this.pRn.A20 + this.cT * 10, this.pRn.SB0 + this.cT * 30);
        this.jy0.E40(this.pRn.A20 + this.cT * 10, this.pRn.SB0 + this.cT * 50);
        this.hL.E40(this.pRn.A20 + this.cT * 10, this.pRn.SB0 + this.cT * 70);
        for (int i = 0; i < 6; i++) {
            S70 s70 = this.YF[i];
            if (s70 != null) {
                int col = i % 3;
                int row = i / 3;
                int x = this.pRn.A20 + this.cT * 70 + col * 32 * this.cT;
                int y = this.PO.SB0 + this.cT * 25 + row * 32 * this.cT;
                s70.E40(x, y);
            }
        }
    }

    @Override
    public final void Dw0(zk0_1 v1) {
        int x = 0;
        int y = this.cT * 16 + 11;
        COm3();
        this.fF.pR = this.ko0.n4.Fw;
        this.fF.eQ(this.ko0.Pc0.Gi0, x, y);
    }
}
