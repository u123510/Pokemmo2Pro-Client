package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

public class MapMiniNavigationComponent extends BaseComponent {
    public final Br0 hA;
    public boolean wg;

    public MapMiniNavigationComponent() {
        Br0 br0 = new Br0(this);
        this.hA = br0;
        this.wg = false;
        br0.o60(new AG0[]{ji0_0.Hg.Ls0()});
        br0.nq0(32, 16);
      }

    public final void HP(zk0_1 v1) {
        super.HP(v1);
        if (this.wg) {
            long j2 = hk0_1.KG % 512L;
            if (j2 > 255L) {
                j2 = 255L - j2;
            }
            this.hA.wx0(new gn_0((byte) -60, (byte) -60, (byte) 67, (byte) ((int) j2)));
        } else {
            this.hA.wx0(null);
        }
        this.hA.gY = this.A20;
        this.hA.a4 = this.SB0;
        this.hA.t00();
    }
}
