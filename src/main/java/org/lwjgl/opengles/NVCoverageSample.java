/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class NVCoverageSample {
    public static final int GL_COVERAGE_COMPONENT_NV = 36560;
    public static final int GL_COVERAGE_COMPONENT4_NV = 36561;
    public static final int GL_COVERAGE_ALL_FRAGMENTS_NV = 36565;
    public static final int GL_COVERAGE_EDGE_FRAGMENTS_NV = 36566;
    public static final int GL_COVERAGE_AUTOMATIC_NV = 36567;
    public static final int GL_COVERAGE_ATTACHMENT_NV = 36562;
    public static final int GL_COVERAGE_BUFFER_BIT_NV = 32768;
    public static final int GL_COVERAGE_BUFFERS_NV = 36563;
    public static final int GL_COVERAGE_SAMPLES_NV = 36564;

    public NVCoverageSample() {
        throw new UnsupportedOperationException();
    }

    public static native void glCoverageMaskNV(@NativeType(value="GLboolean") boolean var0);

    public static native void glCoverageOperationNV(@NativeType(value="GLenum") int var0);

    static {
        GLES.initialize();
    }
}

