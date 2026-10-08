package cn.pokemmo.ui.widget.tournament;

import f.*;

public class TournamentQueueCardWidget {
    public final zp0_0 RU;
    public final xe_1 d4;
    public final xe_1 ub0;
    public final cn_0 Y2;
    public final cn_0 p1;
    public final ae0_1 pi0;
    public final S70 Am;
    public final cn_0 Rd;
    public fy_2 gr0;
    public boolean XR;

    public TournamentQueueCardWidget(Yl yl, zp0_0 zp00) {
        this.XR = true;
        this.RU = zp00;
        if (tw0_0.kz0()) {
            S70 s70 = new S70(72, 72);
            this.Am = s70;
            s70.JH().Gy0(128, 0);
            s70.JH().nq0(72, 72);
        } else {
            S70 s70 = new S70(48, 48);
            this.Am = s70;
            s70.JH().Gy0(85, 0);
            s70.JH().nq0(48, 48);
        }
        this.Am.JH().Nk(new Wr[]{zr_2.MA0.He0()});
        this.Am.JH().u8(false);
        this.Am.uf("label-animation");
        cn_0 labelQueue = new cn_0();
        this.Rd = labelQueue;
        labelQueue.uf("label-queue-positions");
        xe_1 btnName = new xe_1(zp00.Y10());
        this.d4 = btnName;
        btnName.uf("label-tournament-name");
        btnName.RR(new H1(zp00.X00()));
        this.Y2 = new cn_0();
        this.pi0 = new ae0_1();
        cn_0 labelTime = new cn_0();
        this.p1 = labelTime;
        labelTime.uf("label-time-tournament");
        xe_1 btnAction = new xe_1(sm0_0.c0(5515));
        this.ub0 = btnAction;
        btnAction.uf("buttondouble");
        this.Jq0();
        btnAction.RR(new y8_0(yl, zp00));
        this.hp0();
    }

    public final void Jq0() {
        byte status = this.RU.NO;
        boolean canReg = (status == 2 || status == 3);
        this.ub0.pw0(this.XR && canReg);
    }

    public final void hp0() {
        fy_2 panel = new fy_2();
        this.gr0 = panel;
        panel.uf("game-mode");
        panel.WQ(D5.fE0(panel, panel).Xq(new ya_1[]{
                panel.hb(new le0_2[]{this.d4}),
                panel.hb(new le0_2[]{this.p1}),
                panel.hb(new le0_2[]{this.pi0}),
                panel.hb(new le0_2[]{this.Am}),
                panel.hb(new le0_2[]{this.Rd}),
                panel.hb(new le0_2[]{this.ub0})
        }));
        panel.x40(XN.sA(panel, panel).Xq(new ya_1[]{
                panel.C7(new le0_2[]{this.d4}),
                panel.C7(new le0_2[]{this.p1}),
                panel.C7(new le0_2[]{this.pi0}),
                panel.C7(new le0_2[]{this.Am}),
                panel.C7(new le0_2[]{this.Rd}),
                panel.C7(new le0_2[]{this.ub0})
        }));
    }
}
