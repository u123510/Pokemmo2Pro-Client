package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

public class WeatherStatusIndicatorComponent extends BaseComponent {
    public int ap;
    public int vF0;
    public long ci;
    public final int e70;
    public final Br0 Dg0;
    public final Br0 iz0;
    public final Br0 lp0;
    public byte m90;
    public short Ph;
    public short Ro0;

    public WeatherStatusIndicatorComponent() {
        this(0);
    }

    public WeatherStatusIndicatorComponent(int count) {
        super();
        this.ap = 0;
        this.vF0 = 0;
        this.ci = 0L;
        this.Dg0 = new Br0(this);
        this.iz0 = new Br0(this);
        this.lp0 = new Br0(this);
        this.m90 = 0;
        this.Ph = 0;
        this.Ro0 = 0;
        this.e70 = count;
        this.Dg0.o60(new AG0[]{ji0_0.Hg.UH(1)});
        this.iz0.o60(new AG0[]{ji0_0.Hg.UH(3)});
        this.lp0.o60(new AG0[]{ji0_0.Hg.UH(4)});
        this.Dg0.nq0(16, 16);
        this.iz0.nq0(16, 16);
        this.lp0.nq0(16, 16);
    }

    public WeatherStatusIndicatorComponent I60(short first, short second) {
        this.m90 = 1;
        this.Ph = first;
        this.Ro0 = second;
        return this;
    }

    @Override
    public final void HP(zk0_1 window) {
        super.HP(window);
        if (this.vF0 != this.ap) {
            long now = hk0_1.KG;
            while (this.ci + 250L < now) {
                int current = this.vF0;
                int target = this.ap;
                if (current != target) {
                    int amount = current > target ? this.Ph : this.Ro0;
                    if (amount > 0) {
                        tw0_0.RE0.Hq0(this.m90, (short) amount);
                    }
                }
                this.ap += this.ap > this.vF0 ? 1 : -1;
                this.ci += 250L;
            }
        }
        int i1 = 0;
        while (true) {
            int i2 = this.ap;
            if (i1 < i2 || (i1 < this.e70 && i2 >= 0)) {
                int offset = i1 * 16;
                int secondary = 0;
                if (i1 > 7) {
                    offset -= 128;
                    secondary = 16;
                }
                Br0 sprite = i1 >= i2 ? this.lp0 : this.Dg0;
                sprite.gY = offset;
                sprite.a4 = secondary;
                sprite.t00();
                i1++;
                continue;
            }
            i1 = -i2;
            i2 = 0;
            while (i2 < i1) {
                int offset = i2 * 16;
                int secondary = 0;
                if (i2 > 6) {
                    offset -= 112;
                    secondary = 16;
                }
                this.iz0.gY = offset;
                this.iz0.a4 = secondary;
                this.iz0.t00();
                i2++;
            }
            return;
        }
    }
}
