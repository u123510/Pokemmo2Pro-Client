/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.platform.desktop.glfw;

import f.*;


import f.DB0;
import org.lwjgl.glfw.GLFWCharCallback;

/*
 * Renamed from f.Mo
 */
public class GlfwCharCallback
extends GLFWCharCallback {
    public final /* synthetic */ DB0 YJ;

    public GlfwCharCallback(DB0 dB0) {
        this.YJ = dB0;
    }

    @Override
    public final void invoke(long l, int n) {
        char c;
        if ((n & 0xFF00) == 63232) {
            return;
        }
        GlfwCharCallback mo_02 = this;
        mo_02.YJ.f7 = c = (char)n;
        mo_02.YJ.wc0.gw.rt0.G20();
        mo_02.YJ.ki.I8(c, System.nanoTime());
    }
}

