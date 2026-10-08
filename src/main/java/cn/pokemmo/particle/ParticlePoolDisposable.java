package cn.pokemmo.particle;

import f.*;
import java.util.ArrayList;

/**
 * 现代化重构类 - 原始类: f.d3
 */
public abstract class ParticlePoolDisposable implements fy0_0 {

    public final ArrayList<G00> bj0;
    public boolean coM9;
    public long ry0;
    public int D;
    public long nP;

    public ParticlePoolDisposable(int ignored) {
        super();
        this.bj0 = new ArrayList<>();
        this.ry0 = 0L;
        this.D = 200;
        this.nP = -1L;
        this.coM9 = false;
    }

    public ParticlePoolDisposable() {
        super();
        this.bj0 = new ArrayList<>();
        this.ry0 = 0L;
        this.D = 200;
        this.nP = -1L;
        this.coM9 = false;
    }

    static {
        Cq0.E1(ParticlePoolDisposable.class);
    }

    @Override
    public void dispose() {
    }

    public boolean gL0() {
        return this.coM9 && this.ry0 > (long)this.D;
    }

    public final void W1() {
        this.D = 1310;
    }

    public void nr(hl0_1 target) {
        long now = hk0_1.KG;
        if (this.nP == -1L) {
            this.nP = now;
        }
        long elapsed = now - this.nP;
        if (elapsed > 0L) {
            this.ry0 += elapsed;
            int updated = 0;
            for (G00 item : this.bj0) {
                if (!item.H40()) {
                    if (!item.Com4) {
                        item.Ks();
                    }
                    updated++;
                } else {
                    item.VG(elapsed);
                    item.UT();
                    item.Rn0(hk0_1.KG);
                }
            }
            if (!this.coM9 && updated == this.bj0.size() && this.ry0 > (long)this.D) {
                this.coM9 = true;
                this.D = 0;
                this.dispose();
            }
            this.nP = now;
        }
        for (G00 item : this.bj0) {
            if (item.DH != 1 || !item.Dk0() || item.I3.length == 0 || !item.H40()) {
                continue;
            }
            jk_0 point = item.I3[item.cs0];
            if (point != null) {
                point.Ql(target, item.hC(), item.lt0());
            }
        }
    }

    public void T30(fh_1 first, BJ0 second) {
    }
}
