/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.platform.desktop.glfw;

import f.*;


import f.Su0;
import f.dt_1;
import org.lwjgl.glfw.GLFWDropCallback;

/*
 * Renamed from f.Id0
 */
public class GlfwDropCallback
extends GLFWDropCallback {
    public final /* synthetic */ Su0 bg0;

    public GlfwDropCallback(Su0 su0) {
        this.bg0 = su0;
    }

    @Override
    public final void invoke(long l, int n, long l2) {
        String[] stringArray = new String[n];
        for (int j = 0; j < n; ++j) {
            stringArray[j] = GLFWDropCallback.getName(l2, j);
        }
        this.bg0.Df(new dt_1((id0_0) (Object) this, stringArray));
    }
}

