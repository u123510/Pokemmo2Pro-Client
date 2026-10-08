/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.platform.desktop.glfw;

import f.*;


import f.Su0;
import f.nw_0;
import org.lwjgl.glfw.GLFWWindowCloseCallback;

/*
 * Renamed from f.qd0
 */
public class GlfwWindowCloseCallback
extends GLFWWindowCloseCallback {
    public final /* synthetic */ Su0 HH0;

    public GlfwWindowCloseCallback(Su0 su0) {
        this.HH0 = su0;
    }

    @Override
    public final void invoke(long l) {
        this.HH0.Df(new nw_0((qd0_1) (Object) this, l));
    }
}

