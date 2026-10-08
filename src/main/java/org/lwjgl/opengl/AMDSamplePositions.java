/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class AMDSamplePositions {
    public static final int GL_SUBSAMPLE_DISTANCE_AMD = 34879;

    public AMDSamplePositions() {
        throw new UnsupportedOperationException();
    }

    public static native void nglSetMultisamplefvAMD(int var0, int var1, long var2);

    public static void glSetMultisamplefvAMD(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLfloat const *") FloatBuffer floatBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)floatBuffer, 2);
        }
        long l = MemoryUtil.memAddress(floatBuffer);
        AMDSamplePositions.nglSetMultisamplefvAMD(n, n2, l);
    }

    public static void glSetMultisamplefvAMD(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLfloat const *") float[] fArray) {
        long l = GL.getICD().glSetMultisamplefvAMD;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(fArray, 2);
        }
        JNI.callPV(n, n2, fArray, l);
    }

    static {
        GL.initialize();
    }
}

