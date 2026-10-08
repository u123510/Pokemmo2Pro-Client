/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.opengles.GLES;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class QCOMFramebufferFoveated {
    public static final int GL_FOVEATION_ENABLE_BIT_QCOM = 1;
    public static final int GL_FOVEATION_SCALED_BIN_METHOD_BIT_QCOM = 2;

    public QCOMFramebufferFoveated() {
        throw new UnsupportedOperationException();
    }

    public static native void nglFramebufferFoveationConfigQCOM(int var0, int var1, int var2, int var3, long var4);

    public static void glFramebufferFoveationConfigQCOM(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLuint") int n3, @NativeType(value="GLuint") int n4, @NativeType(value="GLuint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        QCOMFramebufferFoveated.nglFramebufferFoveationConfigQCOM(n, n2, n3, n4, l);
    }

    public static native void glFramebufferFoveationParametersQCOM(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint") int var1, @NativeType(value="GLuint") int var2, @NativeType(value="GLfloat") float var3, @NativeType(value="GLfloat") float var4, @NativeType(value="GLfloat") float var5, @NativeType(value="GLfloat") float var6, @NativeType(value="GLfloat") float var7);

    public static void glFramebufferFoveationConfigQCOM(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLuint") int n3, @NativeType(value="GLuint") int n4, @NativeType(value="GLuint *") int[] nArray) {
        long l = GLES.getICD().glFramebufferFoveationConfigQCOM;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, n3, n4, nArray, l);
    }

    static {
        GLES.initialize();
    }
}

