/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class EXTTessellationShader {
    public static final int GL_PATCHES_EXT = 14;
    public static final int GL_PATCH_VERTICES_EXT = 36466;
    public static final int GL_TESS_CONTROL_OUTPUT_VERTICES_EXT = 36469;
    public static final int GL_TESS_GEN_MODE_EXT = 36470;
    public static final int GL_TESS_GEN_SPACING_EXT = 36471;
    public static final int GL_TESS_GEN_VERTEX_ORDER_EXT = 36472;
    public static final int GL_TESS_GEN_POINT_MODE_EXT = 36473;
    public static final int GL_ISOLINES_EXT = 36474;
    public static final int GL_QUADS_EXT = 7;
    public static final int GL_FRACTIONAL_ODD_EXT = 36475;
    public static final int GL_FRACTIONAL_EVEN_EXT = 36476;
    public static final int GL_MAX_PATCH_VERTICES_EXT = 36477;
    public static final int GL_MAX_TESS_GEN_LEVEL_EXT = 36478;
    public static final int GL_MAX_TESS_CONTROL_UNIFORM_COMPONENTS_EXT = 36479;
    public static final int GL_MAX_TESS_EVALUATION_UNIFORM_COMPONENTS_EXT = 36480;
    public static final int GL_MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS_EXT = 36481;
    public static final int GL_MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS_EXT = 36482;
    public static final int GL_MAX_TESS_CONTROL_OUTPUT_COMPONENTS_EXT = 36483;
    public static final int GL_MAX_TESS_PATCH_COMPONENTS_EXT = 36484;
    public static final int GL_MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS_EXT = 36485;
    public static final int GL_MAX_TESS_EVALUATION_OUTPUT_COMPONENTS_EXT = 36486;
    public static final int GL_MAX_TESS_CONTROL_UNIFORM_BLOCKS_EXT = 36489;
    public static final int GL_MAX_TESS_EVALUATION_UNIFORM_BLOCKS_EXT = 36490;
    public static final int GL_MAX_TESS_CONTROL_INPUT_COMPONENTS_EXT = 34924;
    public static final int GL_MAX_TESS_EVALUATION_INPUT_COMPONENTS_EXT = 34925;
    public static final int GL_MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS_EXT = 36382;
    public static final int GL_MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS_EXT = 36383;
    public static final int GL_MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS_EXT = 37581;
    public static final int GL_MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS_EXT = 37582;
    public static final int GL_MAX_TESS_CONTROL_ATOMIC_COUNTERS_EXT = 37587;
    public static final int GL_MAX_TESS_EVALUATION_ATOMIC_COUNTERS_EXT = 37588;
    public static final int GL_MAX_TESS_CONTROL_IMAGE_UNIFORMS_EXT = 37067;
    public static final int GL_MAX_TESS_EVALUATION_IMAGE_UNIFORMS_EXT = 37068;
    public static final int GL_MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS_EXT = 37080;
    public static final int GL_MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS_EXT = 37081;
    public static final int GL_PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED = 33313;
    public static final int GL_IS_PER_PATCH_EXT = 37607;
    public static final int GL_REFERENCED_BY_TESS_CONTROL_SHADER_EXT = 37639;
    public static final int GL_REFERENCED_BY_TESS_EVALUATION_SHADER_EXT = 37640;
    public static final int GL_TESS_EVALUATION_SHADER_EXT = 36487;
    public static final int GL_TESS_CONTROL_SHADER_EXT = 36488;
    public static final int GL_TESS_CONTROL_SHADER_BIT_EXT = 8;
    public static final int GL_TESS_EVALUATION_SHADER_BIT_EXT = 16;

    public EXTTessellationShader() {
        throw new UnsupportedOperationException();
    }

    public static native void glPatchParameteriEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLint") int var1);

    static {
        GLES.initialize();
    }
}

