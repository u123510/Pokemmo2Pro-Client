package cn.pokemmo.ui.widget;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.T70
 */
public class Modern_Ui_T70 extends nq0_0 {

    public final ZT UV;
    public final Wr jG0;

    public Modern_Ui_T70(ZT location, Wr icon) {
        this.UV = location;
        this.jG0 = icon;
    }

    public final boolean nX(int ignored, String query) {
        return tx_1.qp0(tx_1.J10(this.UV.Nw0(), false), query);
    }

    public final void E60(A40 content) {
        S70 icon = new S70(24, 24, 0);
        icon.og.Nk(new Wr[]{this.jG0});
        icon.og.OA0 = true;
        icon.og.IF = 24;
        icon.og.gx0 = 24;
        content.vx0(icon);

        int region = this.UV.OF0;
        if (region >= 0 && region < 10) {
            content.DL(region + 250000);
        } else if (region == 10) {
            content.es("Custom");
        } else {
            content.es("-");
        }
        content.es(this.UV.OF0 * 50 + this.UV.XL0 + "." + this.UV.eW);

        xe_1 button = new xe_1(this.UV.Nw0());
        button.RR(this);
        content.vx0(button).goto$();
    }

    public final void run() {
        int mapX = this.UV.XL0 + (this.UV.OF0 == 1 ? 50 : 0);
        String command = "//moveto " + this.UV.OF0 + " " + mapX + " " + this.UV.eW + " 0 0";
        tw0_0.rl.Cp(zo_0.Pk, command, "", true);
    }
}

