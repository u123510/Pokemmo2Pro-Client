package cn.pokemmo.ui.window.social;

import f.*;

/**
 * 社交好友/玩家搜索窗口
 *
 * 原混淆类: f.vl_0
 */
public class SocialSearchWindow extends cx_0 implements tr_1  {
    public final vl_0 asBridge() {
        return (vl_0) (Object) this;
    }

    public final P8 j50;
    public final xe_1 E20;
    public final cg_0 uj0;
    public final xe_1 hn;
    public final cg_0 vo;
    public final cg_0 y7;
    public final we0_0 jP;
    public final yq_2 LB0;
    public boolean rE0;
    public final cg_0 interface$;
    public final cg_0 tI0;

    public SocialSearchWindow(BU v1) {
        super(tw0_0.kz0());
        this.rE0 = false;
        uf("social-window");
        Hy(sm0_0.c0(1649));
        ff0(1);
        Pb0(new of_0(v1));
        P8 p8 = new P8();
        this.j50 = p8;
        p8.I6(false);
        fy_2 tabHost = new fy_2();
        tabHost.x40(XZ.BC0(tabHost.lo0(), new ya_1[]{tabHost.H10().qd(10).LPt3(new le0_2[]{p8})}, tabHost).Xq(new ya_1[]{tabHost.lo0().LPt3(new le0_2[]{p8})}));

        fy_2 tab1 = new fy_2();
        we0_0 we0 = new we0_0();
        this.jP = we0;
        we0.hk0();
        we0.Qm0(new r20(asBridge()));
        lo0_0 scroll1 = new lo0_0(we0);
        scroll1.Qs0(2);
        scroll1.so();
        xe_1 btn1 = new xe_1(sm0_0.c0(1653));
        this.E20 = btn1;
        cg_0 field1 = new cg_0();
        this.uj0 = field1;
        field1.I7();
        field1.uf("editfield-fancy");
        btn1.RR(new YU(asBridge()));
        cg_0 search1 = new cg_0();
        this.tI0 = search1;
        search1.I7();
        search1.uf("editfield-search");
        W9 w9 = new W9();
        search1.Ii(new OC0(asBridge(), w9));
        w9.RR(new fe_0(asBridge(), w9));
        w9.k50(this.rE0);
        cn_0 label1 = new cn_0(sm0_0.c0(1682));
        label1.coM8(w9);
        tab1.x40(XZ.BC0(tab1.lo0(), new ya_1[]{
            tab1.C7(new le0_2[]{search1, w9, label1}),
            tab1.C7(new le0_2[]{scroll1}),
            tab1.C7(new le0_2[]{field1, btn1})
        }, tab1).Xq(new ya_1[]{
            tab1.hb(new le0_2[]{search1, w9, label1}),
            tab1.hb(new le0_2[]{scroll1}),
            tab1.hb(new le0_2[]{field1, btn1})
        }));

        fy_2 tab2 = new fy_2();
        yq_2 yq = new yq_2(asBridge());
        this.LB0 = yq;
        yq.LD0();
        yq.Qm0(new g40_0(asBridge()));
        lo0_0 scroll2 = new lo0_0(yq);
        scroll2.Qs0(2);
        scroll2.so();
        xe_1 btn2 = new xe_1(sm0_0.c0(1665));
        this.hn = btn2;
        cg_0 field2_1 = new cg_0();
        this.vo = field2_1;
        field2_1.I7();
        field2_1.uf("editfield-fancy");
        cn_0 label2 = new cn_0(sm0_0.c0(1661));
        cg_0 field2_2 = new cg_0();
        this.y7 = field2_2;
        field2_2.uf("editfield-fancy");
        field2_2.ef0(10);
        btn2.RR(new rq_1(asBridge()));
        cg_0 search2 = new cg_0();
        this.interface$ = search2;
        search2.I7();
        search2.uf("editfield-search");
        search2.Ii(new ol_1(asBridge()));
        tab2.x40(XZ.BC0(tab2.lo0(), new ya_1[]{
            tab2.C7(new le0_2[]{search2}),
            tab2.C7(new le0_2[]{scroll2}),
            tab2.C7(new le0_2[]{field2_1, label2, field2_2, btn2})
        }, tab2).Xq(new ya_1[]{
            tab2.hb(new le0_2[]{search2}),
            tab2.hb(new le0_2[]{scroll2}),
            tab2.hb(new le0_2[]{field2_1, label2, field2_2, btn2})
        }));

        this.j50.Wq(tab1, sm0_0.c0(1650));
        this.j50.Wq(tab2, sm0_0.c0(1660));
        SL(tabHost);
    }

    @Override
    public final void K8() {
        if (tw0_0.kz0()) {
            kh0();
        }
        super.K8();
    }

    public final void x00() {
        lpt6__0.v90(this);
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        if (E00.ZU(v1.zu) && v1.iT()) {
            if (Qy0.af(this)) {
                return super.nd0(v1);
            }
            int key = v1.finally$;
            if (key == 34 && v1.J30 == 4) {
                int tab = this.j50.Bb();
                if (tab == 0) {
                    this.tI0.BL();
                } else if (tab == 1) {
                    this.interface$.BL();
                }
                return true;
            }
            rp_0 rp = rp_0.nK0;
            int unused = dw_2.ff;
            if (rp != null && rp.Ov(key)) {
                BU.T50.jw0();
                return true;
            }
        }
        return super.nd0(v1);
    }
}
