package cn.pokemmo.graphics.gl;

import f.Kr0;
import f.sY;
import f.u_0;
import f.yr_1;

public abstract class GlErrorStringifier implements sY {
    public int lf;
    public int tA;
    public int B1;
    public int BJ0;
    public final u_0 bH;
    public final Kr0 qL0;

    public GlErrorStringifier(Kr0 v1) {
        this.bH = new u_0(0);
        this.qL0 = v1;
    }

    public static String sa0(int i0) {
        switch (i0) {
            case 1280:
                return "GL_INVALID_ENUM";
            case 1281:
                return "GL_INVALID_VALUE";
            case 1282:
                return "GL_INVALID_OPERATION";
            case 1285:
                return "GL_OUT_OF_MEMORY";
            case 1286:
                return "GL_INVALID_FRAMEBUFFER_OPERATION";
            default:
                return yr_1.pG("number ", i0);
        }
    }
}
