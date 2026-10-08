/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class ARMShaderCoreProperties {
    public static final int GL_SHADER_CORE_COUNT_ARM = 38640;
    public static final int GL_SHADER_CORE_ACTIVE_COUNT_ARM = 38641;
    public static final int GL_SHADER_CORE_PRESENT_MASK_ARM = 38642;
    public static final int GL_SHADER_CORE_MAX_WARP_COUNT_ARM = 38643;
    public static final int GL_SHADER_CORE_PIXEL_RATE_ARM = 38644;
    public static final int GL_SHADER_CORE_TEXEL_RATE_ARM = 38645;
    public static final int GL_SHADER_CORE_FMA_RATE_ARM = 38646;

    public ARMShaderCoreProperties() {
        throw new UnsupportedOperationException();
    }

    public static native void glMaxActiveShaderCoresARM(@NativeType(value="GLuint") int var0);

    static {
        GLES.initialize();
    }
}

