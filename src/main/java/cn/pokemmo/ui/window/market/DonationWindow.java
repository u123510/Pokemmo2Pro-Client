package cn.pokemmo.ui.window.market;

import f.*;

/**
 * 赞助与捐赠链接对话框
 *
 * 原混淆类: f.in0_0
 */
public class DonationWindow extends yz_1 {
    public DonationWindow(String url) {
        super();
        this.Pb0(this::close);

        fy_2 panel = new fy_2();
        panel.uf("donation-link-dialog");
        this.Hy(sm0_0.c0(1132));

        cn_0 message = new cn_0(sm0_0.c0(1373));
        cg_0 link = new cg_0();
        link.mm(url);
        link.RD(true);

        xe_1 closeButton = new xe_1(sm0_0.c0(65));
        closeButton.RR(this::close);
        xe_1 openButton = new xe_1(sm0_0.c0(1133));
        openButton.RR(() -> xf(url));

        panel.x40(panel.H10()
                .Kn0(message)
                .Kn0(link)
                .X20(panel.H10().LPt3(openButton, closeButton).Ze0()));
        panel.WQ(panel.lo0()
                .Kn0(message)
                .Kn0(link)
                .X20(panel.lo0().Kn0(openButton).Kn0(closeButton)));
        this.SL(panel);
    }

    public static void xf(String url) {
        if (tw0_0.lM.kA(url)) {
            tw0_0.rl.qK(sm0_0.c0(1134));
        }
    }

    public final void close() {
        BU hud = BU.T50;
        in0_0 current = hud.x30;
        if (current != null) {
            current.xe0();
            hud.x30 = null;
        }
    }
}
