/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class OESGeometryShader {
    public static final int GL_GEOMETRY_SHADER_OES = 36313;
    public static final int GL_GEOMETRY_SHADER_BIT_OES = 4;
    public static final int GL_GEOMETRY_LINKED_VERTICES_OUT_OES = 35094;
    public static final int GL_GEOMETRY_LINKED_INPUT_TYPE_OES = 35095;
    public static final int GL_GEOMETRY_LINKED_OUTPUT_TYPE_OES = 35096;
    public static final int GL_GEOMETRY_SHADER_INVOCATIONS_OES = 34943;
    public static final int GL_LAYER_PROVOKING_VERTEX_OES = 33374;
    public static final int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_OES = 36319;
    public static final int GL_MAX_GEOMETRY_UNIFORM_BLOCKS_OES = 35372;
    public static final int GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS_OES = 35378;
    public static final int GL_MAX_GEOMETRY_INPUT_COMPONENTS_OES = 37155;
    public static final int GL_MAX_GEOMETRY_OUTPUT_COMPONENTS_OES = 37156;
    public static final int GL_MAX_GEOMETRY_OUTPUT_VERTICES_OES = 36320;
    public static final int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_OES = 36321;
    public static final int GL_MAX_GEOMETRY_SHADER_INVOCATIONS_OES = 36442;
    public static final int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_OES = 35881;
    public static final int GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS_OES = 37583;
    public static final int GL_MAX_GEOMETRY_ATOMIC_COUNTERS_OES = 37589;
    public static final int GL_MAX_GEOMETRY_IMAGE_UNIFORMS_OES = 37069;
    public static final int GL_MAX_GEOMETRY_SHADER_STORAGE_BLOCKS_OES = 37079;
    public static final int GL_FIRST_VERTEX_CONVENTION_OES = 36429;
    public static final int GL_LAST_VERTEX_CONVENTION_OES = 36430;
    public static final int GL_UNDEFINED_VERTEX_OES = 33376;
    public static final int GL_PRIMITIVES_GENERATED_OES = 35975;
    public static final int GL_LINES_ADJACENCY_OES = 10;
    public static final int GL_LINE_STRIP_ADJACENCY_OES = 11;
    public static final int GL_TRIANGLES_ADJACENCY_OES = 12;
    public static final int GL_TRIANGLE_STRIP_ADJACENCY_OES = 13;
    public static final int GL_FRAMEBUFFER_DEFAULT_LAYERS_OES = 37650;
    public static final int GL_MAX_FRAMEBUFFER_LAYERS_OES = 37655;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_OES = 36264;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED_OES = 36263;
    public static final int GL_REFERENCED_BY_GEOMETRY_SHADER_OES = 37641;

    public OESGeometryShader() {
        throw new UnsupportedOperationException();
    }

    public static native void glFramebufferTextureOES(@NativeType(value="GLenum") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLuint") int var2, @NativeType(value="GLint") int var3);

    static {
        GLES.initialize();
    }
}

