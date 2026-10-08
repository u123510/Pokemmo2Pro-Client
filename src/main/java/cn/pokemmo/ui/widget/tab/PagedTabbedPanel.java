package cn.pokemmo.ui.widget.tab;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.util.ArrayList;

public class PagedTabbedPanel extends BaseTabbedPanel {
    public boolean mt0;
    public cn_0 pd;
    public X6 Bk;

    public PagedTabbedPanel(BU bu, byte b, String str, int i4, int i5, int i6, byte b7, Cq cq, boolean z9, boolean z10, boolean z11, byte b12, byte b13, lq0[] lqArr) {
        super(bu, b, 200, 201);
        this.mt0 = false;
        String strRegion = "";
        if (b13 > 0) {
            N2 n2 = N2.FW(b13);
            strRegion = n2.wI();
            if (!n2.H8()) {
                if (this.pd != null) {
                    this.pd.Ll(false);
                }
                if (this.Bk != null) {
                    this.Bk.pw0(false);
                    this.Bk.Ll(false);
                }
            }
        }
        StringBuilder clausesSb = new StringBuilder();
        if (lqArr.length < 1) {
            clausesSb = new StringBuilder(sm0_0.c0(nf0_0.Po));
        } else {
            for (int i = 0; i < lqArr.length; i++) {
                if (i > 0) {
                    clausesSb.append(", ");
                }
                if (i == 4) {
                    clausesSb.append("\n     ");
                }
                clausesSb.append(lqArr[i].R3());
            }
        }
        String feeStr;
        if (b12 < 1) {
            feeStr = sm0_0.c0(nf0_0.Po);
        } else {
            feeStr = sm0_0.wa0(226, Integer.toString(b12) + "");
        }
        StringBuilder descSb = new StringBuilder();
        if (z9) {
            descSb.append(sm0_0.Bx(2212, new String[] { str, sm0_0.c0(cq.MI()) }));
        } else {
            descSb.append(sm0_0.Bx(2200, new String[] { str, sm0_0.c0(cq.MI()) }));
        }
        descSb.append("\n\n");
        if (i4 > 0) {
            descSb.append(sm0_0.wa0(2206, Integer.toString(i4)));
            descSb.append("\n");
        }
        if (b7 > 0) {
            descSb.append(sm0_0.wa0(2213, Integer.toString(b7)));
            descSb.append("\n");
        } else {
            if (i5 > 0) {
                descSb.append(sm0_0.wa0(2207, Integer.toString(i5)));
                descSb.append("\n");
            }
            if (i6 > 0) {
                descSb.append(sm0_0.wa0(2208, Integer.toString(i6)));
                descSb.append("\n");
            }
        }
        if (b12 > 0) {
            descSb.append(sm0_0.wa0(2209, feeStr));
            descSb.append("\n");
        }
        if (!strRegion.isEmpty()) {
            descSb.append(sm0_0.wa0(2210, strRegion));
            descSb.append("\n");
        }
        descSb.append(sm0_0.wa0(2211, clausesSb.toString()));
        descSb.append("\n");
        if (z10 || z11) {
            descSb.append(sm0_0.c0(2214));
            descSb.append(" ");
            if (z10) {
                descSb.append(sm0_0.c0(2215));
            }
            if (z11) {
                if (z10) {
                    descSb.append(", ");
                }
                descSb.append(sm0_0.c0(2216));
            }
            descSb.append("\n");
        }
        dd(descSb.toString());
        if (dw_2.t00) {
            tw0_0.RE0.P7((short) 1619);
        }
    }

    public final void CP() {
        cn_0 cn = new cn_0(null, 0);
        cn.Sk(sm0_0.c0(227));
        this.pd = cn;
        cn.uf("label-title");
        ArrayList list = new ArrayList();
        list.add(new WJ0((tx_0) null));
        HY hy = tw0_0.rl.dh0;
        byte maxRegion = tx_0.bm0(tw0_0.rl.k0.hL0);
        for (byte b = 0; b < maxRegion; b = (byte) (b + 1)) {
            tx_0 tx = hy.Ed0(b);
            if (tx.Xr0()) {
                list.add(new WJ0(tx));
            }
        }
        X6 x6 = new X6();
        x6.r30(new pg0_2(list));
        this.Bk = x6;
        x6.uf("combobox");
        this.Bk.Bd(0);
        this.Bk.pw0(list.size() > 1);

        this.A3.x40(XN.sA(this.A3, this.A3).Kn0(this.DR).Kn0(this.DE)
            .X20(D5.fE0(this.A3, this.A3).LPt3(new le0_2[] { this.pd, this.Bk }))
            .X20(XN.sA(this.A3, this.A3).LPt3(new le0_2[] { this.tf0, this.FI0, this.WB0 }))
            .Ze0());

        this.A3.WQ(D5.fE0(this.A3, this.A3).Kn0(this.DR).Kn0(this.DE)
            .X20(XN.sA(this.A3, this.A3).LPt3(new le0_2[] { this.pd, this.Bk }))
            .X20(D5.fE0(this.A3, this.A3).Kn0(this.tf0).Kn0(this.FI0).Kn0(this.WB0)));
    }

    public final byte Tg0() {
        return (byte) (FD.Q70.Zz0 | (((WJ0) this.Bk.Vh0()).DZ << 3));
    }

    public final void HP(zk0_1 zk) {
        float remainingSec = (float) (this.Nw0 - System.currentTimeMillis()) / 1000.0f;
        if (dw_2.t00 && (int) remainingSec <= 5 && !this.mt0) {
            this.mt0 = true;
            tw0_0.RE0.P7((short) 1619);
        }
        super.HP(zk);
    }
}
