/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class EXTGeometryShader {
    public static final int GL_GEOMETRY_SHADER_EXT = 36313;
    public static final int GL_GEOMETRY_SHADER_BIT_EXT = 4;
    public static final int GL_GEOMETRY_LINKED_VERTICES_OUT_EXT = 35094;
    public static final int GL_GEOMETRY_LINKED_INPUT_TYPE_EXT = 35095;
    public static final int GL_GEOMETRY_LINKED_OUTPUT_TYPE_EXT = 35096;
    public static final int GL_GEOMETRY_SHADER_INVOCATIONS_EXT = 34943;
    public static final int GL_LAYER_PROVOKING_VERTEX_EXT = 33374;
    public static final int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_EXT = 36319;
    public static final int GL_MAX_GEOMETRY_UNIFORM_BLOCKS_EXT = 35372;
    public static final int GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS_EXT = 35378;
    public static final int GL_MAX_GEOMETRY_INPUT_COMPONENTS_EXT = 37155;
    public static final int GL_MAX_GEOMETRY_OUTPUT_COMPONENTS_EXT = 37156;
    public static final int GL_MAX_GEOMETRY_OUTPUT_VERTICES_EXT = 36320;
    public static final int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_EXT = 36321;
    public static final int GL_MAX_GEOMETRY_SHADER_INVOCATIONS_EXT = 36442;
    public static final int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_EXT = 35881;
    public static final int GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS_EXT = 37583;
    public static final int GL_MAX_GEOMETRY_ATOMIC_COUNTERS_EXT = 37589;
    public static final int GL_MAX_GEOMETRY_IMAGE_UNIFORMS_EXT = 37069;
    public static final int GL_MAX_GEOMETRY_SHADER_STORAGE_BLOCKS_EXT = 37079;
    public static final int GL_FIRST_VERTEX_CONVENTION_EXT = 36429;
    public static final int GL_LAST_VERTEX_CONVENTION_EXT = 36430;
    public static final int GL_UNDEFINED_VERTEX_EXT = 33376;
    public static final int GL_PRIMITIVES_GENERATED_EXT = 35975;
    public static final int GL_LINES_ADJACENCY_EXT = 10;
    public static final int GL_LINE_STRIP_ADJACENCY_EXT = 11;
    public static final int GL_TRIANGLES_ADJACENCY_EXT = 12;
    public static final int GL_TRIANGLE_STRIP_ADJACENCY_EXT = 13;
    public static final int GL_FRAMEBUFFER_DEFAULT_LAYERS_EXT = 37650;
    public static final int GL_MAX_FRAMEBUFFER_LAYERS_EXT = 37655;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_EXT = 36264;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED_EXT = 36263;
    public static final int GL_REFERENCED_BY_GEOMETRY_SHADER_EXT = 37641;

    public EXTGeometryShader() {
        throw new UnsupportedOperationException();
    }

    public static native void glFramebufferTextureEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLuint") int var2, @NativeType(value="GLint") int var3);

    static {
        GLES.initialize();
    }
}

