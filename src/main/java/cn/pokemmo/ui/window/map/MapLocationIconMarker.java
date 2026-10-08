package cn.pokemmo.ui.window.map;

import f.*;

public class MapLocationIconMarker extends nq0_0 {
    public final Z50 Bo;
    public final Wr E30;

    public MapLocationIconMarker(Z50 location, Wr icon) {
        this.Bo = location;
        this.E30 = icon;
    }

    @Override
    public final boolean nX(int ignored, String query) {
        return tx_1.qp0(tx_1.J10(this.Bo.mn(), false), query);
    }

    @Override
    public final void E60(A40 content) {
        S70 icon = new S70(24, 24, 0);
        icon.og.Nk(new Wr[]{this.E30});
        icon.og.OA0 = true;
        icon.og.IF = 24;
        icon.og.gx0 = 24;
        content.vx0(icon);

        if (this.Bo.lU.Tz() >= 0 && this.Bo.lU.Tz() < 10) {
            content.DL(250000 + this.Bo.lU.Tz());
        } else if (this.Bo.lU.Tz() == 10) {
            content.es("Custom");
        } else {
            content.es("-");
        }
        content.es(String.valueOf(this.Bo.O60));

        xe_1 button = new xe_1(this.Bo.getName());
        button.RR(this);
        content.vx0(button).goto$();
    }

    @Override
    public final void run() {
        BR server = tw0_0.rl;
        String command = "//moveto2 " + this.Bo.lU.Tz() + " " + this.Bo.O60;
        server.getClass();
        server.Cp(zo_0.Pk, command, "", true);
    }
}
