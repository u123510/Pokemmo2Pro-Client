package cn.pokemmo.rom.gba.sprite;

import f.*;

public class GbaMapEnvironmentalSpriteManager {
    public static GbaMapEnvironmentalSpriteManager uu;
    public Wr Qh0;
    public Wr ki;
    public AG0[] LL0;
    public Wr bt0;
    public Wr pK0;
    public AG0[] nF0;
    public AG0[] Zd0;

    public GbaMapEnvironmentalSpriteManager() {
        this.Qh0 = null;
        this.ki = null;
        this.LL0 = null;
        this.bt0 = null;
        this.pK0 = null;
        this.nF0 = null;
        this.Zd0 = null;
    }

    public static GbaMapEnvironmentalSpriteManager Ry() {
        return getInstance();
    }

    public static GbaMapEnvironmentalSpriteManager getInstance() {
        if (uu == null) {
            uu = new GbaMapEnvironmentalSpriteManager();
        }
        return uu;
    }

    public final void wx0(qa0_1 source) {
        if (source.rt0() != 0) {
            return;
        }
        int width = source.EZ.V(br_2.GE0);
        int height = source.EZ.V(br_2.QF0);
        int depth = source.EZ.V(br_2.l9);
        this.Qh0 = new Wr(new v70_0(source, width, height));
        this.ki = new Wr(new uk0_0(source, width, height));
        this.LL0 = new AG0[6];
        for (int i = 0; i < this.LL0.length; i++) {
            this.LL0[i] = new AG0(this.ki, 0, i * 32, 16, 32);
        }
        this.bt0 = new Wr(new d7_0(source, width, depth));
        this.pK0 = new Wr(new kc_0(source, width, height));
        this.nF0 = new AG0[2];
        for (int i = 0; i < this.nF0.length; i++) {
            this.nF0[i] = new AG0(this.pK0, 0, i * 64, 64, 64);
        }
        this.Zd0 = new AG0[4];
        Wr sourceWrapper = new Wr(new ex_2(source, width, height));
        for (int i = 0; i < this.Zd0.length; i++) {
            this.Zd0[i] = new AG0(sourceWrapper, 0, i * 8, 8, 8);
        }
    }
}
