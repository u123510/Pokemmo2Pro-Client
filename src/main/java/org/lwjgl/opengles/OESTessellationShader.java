/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class OESTessellationShader {
    public static final int GL_PATCHES_OES = 14;
    public static final int GL_PATCH_VERTICES_OES = 36466;
    public static final int GL_TESS_CONTROL_OUTPUT_VERTICES_OES = 36469;
    public static final int GL_TESS_GEN_MODE_OES = 36470;
    public static final int GL_TESS_GEN_SPACING_OES = 36471;
    public static final int GL_TESS_GEN_VERTEX_ORDER_OES = 36472;
    public static final int GL_TESS_GEN_POINT_MODE_OES = 36473;
    public static final int GL_ISOLINES_OES = 36474;
    public static final int GL_QUADS_OES = 7;
    public static final int GL_FRACTIONAL_ODD_OES = 36475;
    public static final int GL_FRACTIONAL_EVEN_OES = 36476;
    public static final int GL_MAX_PATCH_VERTICES_OES = 36477;
    public static final int GL_MAX_TESS_GEN_LEVEL_OES = 36478;
    public static final int GL_MAX_TESS_CONTROL_UNIFORM_COMPONENTS_OES = 36479;
    public static final int GL_MAX_TESS_EVALUATION_UNIFORM_COMPONENTS_OES = 36480;
    public static final int GL_MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS_OES = 36481;
    public static final int GL_MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS_OES = 36482;
    public static final int GL_MAX_TESS_CONTROL_OUTPUT_COMPONENTS_OES = 36483;
    public static final int GL_MAX_TESS_PATCH_COMPONENTS_OES = 36484;
    public static final int GL_MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS_OES = 36485;
    public static final int GL_MAX_TESS_EVALUATION_OUTPUT_COMPONENTS_OES = 36486;
    public static final int GL_MAX_TESS_CONTROL_UNIFORM_BLOCKS_OES = 36489;
    public static final int GL_MAX_TESS_EVALUATION_UNIFORM_BLOCKS_OES = 36490;
    public static final int GL_MAX_TESS_CONTROL_INPUT_COMPONENTS_OES = 34924;
    public static final int GL_MAX_TESS_EVALUATION_INPUT_COMPONENTS_OES = 34925;
    public static final int GL_MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS_OES = 36382;
    public static final int GL_MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS_OES = 36383;
    public static final int GL_MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS_OES = 37581;
    public static final int GL_MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS_OES = 37582;
    public static final int GL_MAX_TESS_CONTROL_ATOMIC_COUNTERS_OES = 37587;
    public static final int GL_MAX_TESS_EVALUATION_ATOMIC_COUNTERS_OES = 37588;
    public static final int GL_MAX_TESS_CONTROL_IMAGE_UNIFORMS_OES = 37067;
    public static final int GL_MAX_TESS_EVALUATION_IMAGE_UNIFORMS_OES = 37068;
    public static final int GL_MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS_OES = 37080;
    public static final int GL_MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS_OES = 37081;
    public static final int GL_PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED_OES = 33313;
    public static final int GL_IS_PER_PATCH_OES = 37607;
    public static final int GL_REFERENCED_BY_TESS_CONTROL_SHADER_OES = 37639;
    public static final int GL_REFERENCED_BY_TESS_EVALUATION_SHADER_OES = 37640;
    public static final int GL_TESS_EVALUATION_SHADER_OES = 36487;
    public static final int GL_TESS_CONTROL_SHADER_OES = 36488;
    public static final int GL_TESS_CONTROL_SHADER_BIT_OES = 8;
    public static final int GL_TESS_EVALUATION_SHADER_BIT_OES = 16;

    public OESTessellationShader() {
        throw new UnsupportedOperationException();
    }

    public static native void glPatchParameteriOES(@NativeType(value="GLenum") int var0, @NativeType(value="GLint") int var1);

    static {
        GLES.initialize();
    }
}

