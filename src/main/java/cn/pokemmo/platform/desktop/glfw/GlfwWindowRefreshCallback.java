/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.platform.desktop.glfw;

import f.*;


import f.Su0;
import f.bp_1;
import org.lwjgl.glfw.GLFWWindowRefreshCallback;

/*
 * Renamed from f.Ag0
 */
public class GlfwWindowRefreshCallback
extends GLFWWindowRefreshCallback {
    public final /* synthetic */ Su0 cL0;

    public GlfwWindowRefreshCallback(Su0 su0) {
        this.cL0 = su0;
    }

    @Override
    public final void invoke(long l) {
        this.cL0.Df(new bp_1((ag0_0) (Object) this));
    }
}

