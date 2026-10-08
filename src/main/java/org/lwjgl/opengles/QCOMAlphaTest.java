/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class QCOMAlphaTest {
    public static final int GL_ALPHA_TEST_QCOM = 3008;
    public static final int GL_ALPHA_TEST_FUNC_QCOM = 3009;
    public static final int GL_ALPHA_TEST_REF_QCOM = 3010;

    public QCOMAlphaTest() {
        throw new UnsupportedOperationException();
    }

    public static native void glAlphaFuncQCOM(@NativeType(value="GLenum") int var0, @NativeType(value="GLfloat") float var1);

    static {
        GLES.initialize();
    }
}

