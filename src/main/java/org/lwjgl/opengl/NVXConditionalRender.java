/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.NativeType;

public class NVXConditionalRender {
    public NVXConditionalRender() {
        throw new UnsupportedOperationException();
    }

    public static native void glBeginConditionalRenderNVX(@NativeType(value="GLuint") int var0);

    public static native void glEndConditionalRenderNVX();

    static {
        GL.initialize();
    }
}

