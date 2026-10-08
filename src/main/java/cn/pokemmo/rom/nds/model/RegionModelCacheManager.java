package cn.pokemmo.rom.nds.model;

import f.*;

import java.nio.ByteBuffer;

public abstract class RegionModelCacheManager {
    public static final dl_1 Eq = Cq0.E1(RegionModelCacheManager.class);
    public final byte JL0;
    public final int Ko;
    public boolean rB;
    public boolean Cj0;
    public ByteBuffer ra;
    public final VE mi0;
    public pe_1 sk0;

    public RegionModelCacheManager(byte b, int i) {
        this.rB = false;
        this.Cj0 = false;
        this.sk0 = null;
        this.JL0 = b;
        this.Ko = i;
        VE ve = lg_0.I70.Wl0("cache/region-models-" + ((int) b) + ".bin");
        this.mi0 = ve;
        if (!dw_2.bn || dw_2.oN) {
            if (ve.os0()) {
                Eq.info("Deleting model cache {}", ve.l00().getAbsolutePath());
                ve.sf();
            }
        }
    }

    public abstract Ou0 CE0(int i, u4_0 u40);

    public Ou0 yt0(MG0 mg0, int i, int i2, pc_1 pc1) {
        return null;
    }

    public Ou0 L0(int i, pc_1 pc1) {
        return null;
    }

    public Ou0 aj(MG0 mg0, int i, pc_1 pc1) {
        return null;
    }

    public final boolean eT() {
        if (!this.CW()) {
            this.Ro0();
        }
        return this.Ro0();
    }

    public abstract boolean CW();

    public final boolean Ro0() {
        try {
            if (this.Cj0 || this.rB) {
                return true;
            }
            pe_1 pe1 = this.sk0;
            if (pe1 == null) {
                Eq.info("Starting cache write for region {}", Byte.valueOf(this.JL0));
                this.sk0 = new pe_1(this.JL0, this.mi0, this.Ko);
                return false;
            }
            if (pe1.Pg()) {
                this.sk0 = null;
                if (this.CW()) {
                    return true;
                }
                this.rB = true;
                this.sk0 = null;
                Eq.error("Could not load cache");
                return false;
            }
            return false;
        } catch (Exception e) {
            this.rB = true;
            this.sk0 = null;
            Eq.error("Could not create cache", e);
            Qy0 qy0 = Qy0.yI0;
            if (qy0 != null) {
                qy0.dk(-1, ig_0.u9(926, new StringBuilder(), "\n(").append((int) this.JL0).append(")").toString());
            }
            return true;
        }
    }
}
