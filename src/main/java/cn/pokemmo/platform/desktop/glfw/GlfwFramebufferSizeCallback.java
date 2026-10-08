/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.platform.desktop.glfw;

import f.*;


import f.k3_0;
import f.lg_0;
import f.rp0_0;
import org.lwjgl.glfw.GLFWFramebufferSizeCallback;
import org.lwjgl.system.Configuration;

public class GlfwFramebufferSizeCallback
extends GLFWFramebufferSizeCallback {
    public volatile boolean Ni;
    public final /* synthetic */ k3_0 Kl;

    public GlfwFramebufferSizeCallback(k3_0 k3_02) {
        this.Kl = k3_02;
    }

    @Override
    public final void invoke(long l, int n, int n2) {
        if (((Boolean)Configuration.GLFW_CHECK_THREAD0.get(Boolean.TRUE)).booleanValue()) {
            k3_0.iJ0(this.Kl, l);
        } else {
            if (this.Ni) {
                return;
            }
            this.Ni = true;
            lg_0.k.lPT5(new rp0_0((_public) (Object) this, l, n, n2));
        }
    }
}

