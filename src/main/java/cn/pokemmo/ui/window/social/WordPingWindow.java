package cn.pokemmo.ui.window.social;

import f.*;

/**
 * 聊天关键字提示配置窗口
 *
 * 原混淆类: f.zs_2
 */
public class WordPingWindow extends cx_0 {
    public final zs_2 asBridge() {
        return (zs_2) (Object) this;
    }

    public final cg_0 OD0;
    public final oa0_0 XC0;
    public final oa0_0 Cu;

    public WordPingWindow(BU owner) {
        super(tw0_0.kz0());
        this.Pb0(new ez_2(owner));
        this.uf("word-ping-window");
        this.Hy(sm0_0.c0(1546));
        this.ff0(1);
        this.bD(true);

        cn_0 title = new cn_0(sm0_0.c0(1547));
        xe_1 close = new xe_1(sm0_0.c0(54));
        close.RR(new q5_0(asBridge(), owner));

        oa0_0 online = new oa0_0(1327);
        this.XC0 = online;
        online.uK0(dw_2.Zd);
        oa0_0 offline = new oa0_0(1348);
        this.Cu = offline;
        offline.uK0(dw_2.He0);

        cg_0 text = new cg_0();
        this.OD0 = text;
        text.c2();
        text.ef0(1000);
        text.mm(dw_2.lL0.replaceAll(";", "\n"));
        text.RD(false);

        lo0_0 textPanel = new lo0_0(text);
        textPanel.Qs0(2);
        textPanel.so();

        fy_2 panel = new fy_2();
        panel.WQ(panel.lo0()
                .X20(panel.C7(online.LD()))
                .X20(panel.C7(offline.LD()))
                .LPt3(new le0_2[]{title, textPanel, close}));
        panel.x40(panel.H10()
                .X20(panel.hb(online.LD()))
                .X20(panel.hb(offline.LD()))
                .qd(15)
                .LPt3(new le0_2[]{title, textPanel, close}));
        this.SL(panel);
    }

    @Override
    public final void K8() {
        if (tw0_0.kz0()) {
            this.kh0();
        }
        super.K8();
    }
}
