package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

public class GtlMarketListingComponent extends BaseComponent {
    public final fy_2 hC;
    public final int S00;
    public final int gL;

    public GtlMarketListingComponent(short i1, byte i2, boolean i3) {
        super();
        this.uf("hudgui");
        fy_2 container = new fy_2();
        this.hC = container;
        AG0 image = yh_0.Dl0().Kr0(i2, yh_0.Ed(i2, i1), false, i3)[0];
        int scale = 2;
        this.uf("npc-interaction-panel");
        if (image.k60() < 0) {
            image.d3();
        }

        int width = Math.max(64, image.k60()) * scale;
        this.S00 = width;
        int height = Math.max(64, image.COM9()) * scale + 16;
        this.gL = height;
        int imageHeight = Math.max(64, image.COM9()) * scale;

        S70 panel = new S70(width, height);
        panel.JH().o60(new AG0[]{image});
        panel.JH().nq0(width, imageHeight);
        container.WQ(container.hb(new le0_2[]{panel}));
        container.x40(container.C7(new le0_2[]{panel}));
        this.SL(container);
    }

    @Override
    public final void K8() {
        this.hC.oY(this.S00, this.gL);
        this.hC.E40(
                (tw0_0.LD0.ew0() - this.S00) / 2,
                (tw0_0.LD0.Hv0() - this.hC.OB) / 3);
    }
}
