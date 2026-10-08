/*
 * Decompiled with CFR 0.152.
 */
package com.pokeemu.client;

import f.dw_2;
import org.lwjgl.glfw.GLFWWindowPosCallbackI;

public final class fp0
implements GLFWWindowPosCallbackI {
    @Override
    public final void invoke(long l, int n, int n2) {
        if (dw_2.xv0 != n || dw_2.aux != n2) {
            dw_2.xv0 = n;
            dw_2.aux = n2;
            dw_2.Va = true;
        }
    }
}

