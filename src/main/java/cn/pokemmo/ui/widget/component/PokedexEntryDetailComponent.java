package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

public class PokedexEntryDetailComponent extends BaseComponent {
    public final fy_2 eD;
    public final cn_0 V8;
    public final cn_0 SI;
    public final cn_0 hz0;
    public final cn_0 BA0;
    public final S70[][] KI;
    public final int[] Na0;

    public PokedexEntryDetailComponent(String v1, String v2) {
        this.Na0 = new int[2];
        uf("setko-judge");
        this.eD = new fy_2();
        this.eD.uf("setko-judge-dialog");
        this.eD.oY(450, 270);
        oY(450, 270);
        this.V8 = new cn_0(v1);
        this.SI = new cn_0(v2);
        this.hz0 = new cn_0("0");
        this.BA0 = new cn_0("0");
        cn_0 l1 = new cn_0(sm0_0.c0(206101));
        cn_0 l2 = new cn_0(sm0_0.c0(206103));
        cn_0 l3 = new cn_0(sm0_0.c0(206104));
        cn_0 l4 = new cn_0(sm0_0.c0(206105));
        cn_0 l5 = new cn_0(sm0_0.vs(206106, new byte[]{0, 1}, new String[]{"", ""}));
        this.KI = new S70[2][3];
        for (int i6 = 0; i6 < 3; ++i6) {
            this.KI[0][i6] = new S70(16, 16);
            this.KI[1][i6] = new S70(16, 16);
            this.KI[0][i6].JH().dA(2.0f);
            this.KI[1][i6].JH().dA(2.0f);
            this.KI[0][i6].JH().Gy0(-10, 0);
            this.KI[1][i6].JH().Gy0(-10, 0);
        }

        this.eD.WQ(this.eD.H10().Xq(new ya_1[]{
                this.eD.lo0().LPt3(new le0_2[]{this.V8, this.KI[0][0], this.KI[0][1], this.KI[0][2], this.hz0}),
                this.eD.lo0().LPt3(new le0_2[]{l1, l2, l3, l4, l5}),
                this.eD.lo0().LPt3(new le0_2[]{this.SI, this.KI[1][0], this.KI[1][1], this.KI[1][2], this.BA0})
        }));

        this.eD.x40(this.eD.H10().Xq(new ya_1[]{
                this.eD.lo0().LPt3(new le0_2[]{this.V8, l1, this.SI}),
                this.eD.lo0().LPt3(new le0_2[]{this.KI[0][0], l2, this.KI[1][0]}),
                this.eD.lo0().LPt3(new le0_2[]{this.KI[0][1], l3, this.KI[1][1]}),
                this.eD.lo0().LPt3(new le0_2[]{this.KI[0][2], l4, this.KI[1][2]}),
                this.eD.lo0().LPt3(new le0_2[]{this.hz0, l5, this.BA0})
        }));

        SL(this.eD);

        this.eD.Yg(pa0_0.dC0, l1);
        this.eD.Yg(pa0_0.dC0, l2);
        this.eD.Yg(pa0_0.dC0, l3);
        this.eD.Yg(pa0_0.dC0, l4);
        this.eD.Yg(pa0_0.dC0, l5);
        this.eD.Yg(pa0_0.dC0, this.hz0);
        this.eD.Yg(pa0_0.dC0, this.BA0);
        for (int i1 = 0; i1 < 3; ++i1) {
            this.eD.Yg(pa0_0.dC0, this.KI[0][i1]);
            this.eD.Yg(pa0_0.dC0, this.KI[1][i1]);
        }
        lt0();
    }

    public final void Pw(int i1, byte[][] v2) {
        byte b1 = v2[0][i1];
        byte b2 = v2[1][i1];
        if (b1 == b2) {
            this.Na0[0] += 1;
            this.Na0[1] += 1;
            lg_0.k.lPT5(() -> Nf(i1));
        } else if (b1 > b2) {
            this.Na0[0] += 2;
            lg_0.k.lPT5(() -> dI(i1));
        } else {
            this.Na0[1] += 2;
            lg_0.k.lPT5(() -> Zf0(i1));
        }
        this.hz0.Sk("" + this.Na0[0]);
        this.BA0.Sk("" + this.Na0[1]);
    }

    @Override
    public final void K8() {
        int x = (tw0_0.LD0.ew0() / 2) - (this.Mx / 2);
        int y = (tw0_0.LD0.Hv0() / 2) - (this.OB / 2) - 100;
        E40(x, y);
    }

    public final void Zf0(int i1) {
        this.KI[0][i1].og.o60(new AG0[]{bi0_0.cs.tf0[0]});
        this.KI[1][i1].og.o60(new AG0[]{bi0_0.cs.tf0[2]});
    }

    public final void dI(int i1) {
        this.KI[0][i1].og.o60(new AG0[]{bi0_0.cs.tf0[2]});
        this.KI[1][i1].og.o60(new AG0[]{bi0_0.cs.tf0[0]});
    }

    public final void Nf(int i1) {
        this.KI[0][i1].og.o60(new AG0[]{bi0_0.cs.tf0[1]});
        this.KI[1][i1].og.o60(new AG0[]{bi0_0.cs.tf0[1]});
    }
}
