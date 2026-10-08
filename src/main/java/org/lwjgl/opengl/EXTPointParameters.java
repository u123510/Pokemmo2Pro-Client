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

public class EXTPointParameters {
    public static final int GL_POINT_SIZE_MIN_EXT = 33062;
    public static final int GL_POINT_SIZE_MAX_EXT = 33063;
    public static final int GL_POINT_FADE_THRESHOLD_SIZE_EXT = 33064;
    public static final int GL_DISTANCE_ATTENUATION_EXT = 33065;

    public EXTPointParameters() {
        throw new UnsupportedOperationException();
    }

    public static native void glPointParameterfEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLfloat") float var1);

    public static native void nglPointParameterfvEXT(int var0, long var1);

    public static void glPointParameterfvEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLfloat const *") FloatBuffer floatBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)floatBuffer, 1);
        }
        EXTPointParameters.nglPointParameterfvEXT(n, MemoryUtil.memAddress(floatBuffer));
    }

    public static void glPointParameterfvEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLfloat const *") float[] fArray) {
        long l = GL.getICD().glPointParameterfvEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(fArray, 1);
        }
        JNI.callPV(n, fArray, l);
    }

    static {
        GL.initialize();
    }
}

