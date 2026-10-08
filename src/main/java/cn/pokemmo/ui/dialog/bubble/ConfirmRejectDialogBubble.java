package cn.pokemmo.ui.dialog.bubble;

import f.*;

/**
 * 确认/拒绝交互对话气泡 (Confirm / Reject Dialog Bubble)
 * 用于需要玩家二选一确认操作的场景（如改名、购买确认、交互抉择等）。
 *
 * 原混淆类: f.OU
 */
public class ConfirmRejectDialogBubble extends iw_1 {
    public OU asBridge() {
        return (OU) (Object) this;
    }

    public final fy_2 Z50;
    public final cg_0 Cz0;
    public final lo0_0 lPt9;
    public final xe_1 kw;
    public final xe_1 wR;

    public ConfirmRejectDialogBubble(byte mode, String message) {
        super(mode, jm_1.eZ);
        this.Cz0 = new cg_0();
        String[] parts = message.split("\n\n");
        if (parts.length > 1) {
            message = parts[0];
        }

        this.uf("messagebox");
        fy_2 panel = new fy_2();
        this.Z50 = panel;
        panel.uf("npc-interaction-panel");
        panel.Oq0(true);

        fy_2 buttonPanel = new fy_2();
        Hm0 row = buttonPanel.lo0();
        I7 column = buttonPanel.H10();

        xe_1 accept = new xe_1(sm0_0.c0(nf0_0.BA));
        this.kw = accept;
        accept.RR(new c7(asBridge()));
        row.Kn0(accept);
        column.Kn0(accept);

        xe_1 cancel = new xe_1(sm0_0.c0(nf0_0.Bq0).toUpperCase());
        this.wR = cancel;
        cancel.RR(new nr0_0(asBridge()));
        row.Kn0(cancel);
        column.Kn0(cancel);

        buttonPanel.WQ(row);
        buttonPanel.x40(column);

        lo0_0 layout = new lo0_0();
        this.lPt9 = layout;
        layout.Qs0(2);
        layout.AH0(buttonPanel);
        buttonPanel.Oq0(true);

        cn_0 text = new cn_0(message);
        panel.WQ(
                panel.H10()
                        .X20(panel.hb(new le0_2[]{text, this.Cz0}))
                        .qd(150));
        panel.x40(
                panel.lo0()
                        .X20(panel.C7(new le0_2[]{text, this.Cz0}))
                        .X20(panel.lo0()));

        this.SL(buttonPanel);
        this.SL(layout);
    }

    @Override
    public void C(zk0_1 context) {
        lg_0.k.lPT5(new lk0_1(asBridge()));
    }

    @Override
    public boolean p3(int value) {
        return false;
    }

    @Override
    public boolean zn0() {
        return false;
    }

    @Override
    public void K8() {
        this.Cz0.vi(0, 0, 0, 0);
        this.Cz0.g2(400, 40);
        this.Z50.oY(800, 115);

        int horizontal = (tw0_0.LD0.Hv0() - 500) / 4;
        int vertical = tw0_0.LD0.ew0() / 2 - 400;
        this.Z50.E40(vertical, horizontal + 350);

        this.lPt9.oY(150, 105);
        this.lPt9.E40(
                this.Z50.A20 + this.Z50.e80 + 640,
                this.Z50.SB0 + this.Z50.y9);
        this.kw.RY(140, 24);
        this.kw.g2(140, 48);
        this.wR.RY(140, 24);
        this.wR.g2(140, 48);
        this.lt0();
    }

    @Override
    public boolean hy0() {
        return false;
    }

    @Override
    public void Jh(int first, int second) {
    }
}
