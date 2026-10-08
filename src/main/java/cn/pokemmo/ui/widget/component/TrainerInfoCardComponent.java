/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

import f.Br0;
import f.hk0_1;
import f.ji0_0;
import f.le0_2;
import f.rg0_2;
import f.tw0_0;
import f.zk0_1;

public class TrainerInfoCardComponent extends BaseComponent {
    public int bb0 = 0;
    public int Qi0 = 0;
    public long B40 = 0L;
    public final Br0 dM = new Br0(this);

    public TrainerInfoCardComponent() {
        this.dM.o60(ji0_0.Hg.qG0());
        this.dM.nq0(16, 16);
        this.Qi0 = rg0_2.r4(4);
    }

    @Override
    public final void HP(zk0_1 zk0_12) {
        TrainerInfoCardComponent j70 = this;
        super.HP(zk0_12);
        if (j70.Qi0 != this.bb0) {
            int n;
            int n2;
            long l = hk0_1.KG;
            while (this.B40 + 250L < l && (n2 = this.Qi0) != (n = this.bb0)) {
                if (n2 > n) {
                    tw0_0.RE0.Hq0((byte)1, (short)91);
                }
                TrainerInfoCardComponent j702 = this;
                n2 = j702.bb0;
                n = j702.Qi0 > n2 ? 1 : -1;
                this.bb0 = n2 + n;
                this.B40 += 250L;
            }
        }
        for (int j = 0; j < this.bb0; ++j) {
            TrainerInfoCardComponent j703 = this;
            int n = j703.A20;
            int n3 = j703.SB0;
            n3 = j * 16 + n3;
            this.dM.gY = n;
            this.dM.a4 = n3;
            this.dM.t00();
        }
    }
}

