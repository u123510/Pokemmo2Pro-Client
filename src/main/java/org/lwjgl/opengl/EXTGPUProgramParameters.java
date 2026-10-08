/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class EXTGPUProgramParameters {
    public EXTGPUProgramParameters() {
        throw new UnsupportedOperationException();
    }

    public static native void nglProgramEnvParameters4fvEXT(int var0, int var1, int var2, long var3);

    public static void glProgramEnvParameters4fvEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLfloat const *") FloatBuffer floatBuffer) {
        int n3 = n;
        FloatBuffer floatBuffer2 = floatBuffer;
        n = floatBuffer2.remaining() >> 2;
        long l = MemoryUtil.memAddress(floatBuffer2);
        EXTGPUProgramParameters.nglProgramEnvParameters4fvEXT(n3, n2, n, l);
    }

    public static native void nglProgramLocalParameters4fvEXT(int var0, int var1, int var2, long var3);

    public static void glProgramLocalParameters4fvEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLfloat const *") FloatBuffer floatBuffer) {
        int n3 = n;
        FloatBuffer floatBuffer2 = floatBuffer;
        n = floatBuffer2.remaining() >> 2;
        long l = MemoryUtil.memAddress(floatBuffer2);
        EXTGPUProgramParameters.nglProgramLocalParameters4fvEXT(n3, n2, n, l);
    }

    public static void glProgramEnvParameters4fvEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLfloat const *") float[] fArray) {
        long l = GL.getICD().glProgramEnvParameters4fvEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, fArray.length >> 2, fArray, l);
    }

    public static void glProgramLocalParameters4fvEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLfloat const *") float[] fArray) {
        long l = GL.getICD().glProgramLocalParameters4fvEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, fArray.length >> 2, fArray, l);
    }

    static {
        GL.initialize();
    }
}

