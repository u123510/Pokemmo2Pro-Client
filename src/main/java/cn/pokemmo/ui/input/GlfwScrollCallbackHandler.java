package cn.pokemmo.ui.input;

import f.DB0;
import f.y5;
import org.lwjgl.glfw.GLFWScrollCallback;

public class GlfwScrollCallbackHandler extends GLFWScrollCallback {
    public final DB0 pU;

    public GlfwScrollCallbackHandler(DB0 v1) {
        this.pU = v1;
    }

    @Override
    public void invoke(long j1, double d3, double d5) {
        this.pU.wc0.gw.rt0.G20();
        y5 v_ki = this.pU.ki;
        float f1 = (float) -d3;
        float f2 = (float) -d5;
        long j3 = System.nanoTime();
        synchronized (v_ki) {
            v_ki.kr0.ja0(7);
            v_ki.P20(j3);
            v_ki.kr0.ja0(Float.floatToIntBits(f1));
            v_ki.kr0.ja0(Float.floatToIntBits(f2));
        }
    }
}
