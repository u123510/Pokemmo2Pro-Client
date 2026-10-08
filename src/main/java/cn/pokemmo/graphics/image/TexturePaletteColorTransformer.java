package cn.pokemmo.graphics.image;

import f.*;

public class TexturePaletteColorTransformer {
    public static TexturePaletteColorTransformer[] N0;
    public static SQ kx0;
    public static TexturePaletteColorTransformer[] xh;
    public final int jK0;
    public final int Cq;
    public final int nUl;

    public TexturePaletteColorTransformer(int key, int value) {
        this.nUl = value;
        this.jK0 = key;
        this.Cq = key + 7600;
    }

    static {
        if (f.lpt6__1.N0 == null) {
            try {
                Class.forName(f.lpt6__1.class.getName());
            } catch (Throwable ignored) {}
        }
    }

    @Override
    public final String toString() {
        if (sm0_0.cU.l90(this.Cq)) {
            return sm0_0.c0(this.Cq);
        }
        return super.toString();
    }
}
