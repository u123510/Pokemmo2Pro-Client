/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import java.nio.FloatBuffer;
import org.lwjgl.opengles.GLES;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NVSampleLocations {
    public static final int GL_SAMPLE_LOCATION_SUBPIXEL_BITS_NV = 37693;
    public static final int GL_SAMPLE_LOCATION_PIXEL_GRID_WIDTH_NV = 37694;
    public static final int GL_SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_NV = 37695;
    public static final int GL_PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_NV = 37696;
    public static final int GL_SAMPLE_LOCATION_NV = 36432;
    public static final int GL_PROGRAMMABLE_SAMPLE_LOCATION_NV = 37697;
    public static final int GL_FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_NV = 37698;
    public static final int GL_FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_NV = 37699;

    public NVSampleLocations() {
        throw new UnsupportedOperationException();
    }

    public static native void nglFramebufferSampleLocationsfvNV(int var0, int var1, int var2, long var3);

    public static void glFramebufferSampleLocationsfvNV(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLfloat const *") FloatBuffer floatBuffer) {
        int n3 = n;
        FloatBuffer floatBuffer2 = floatBuffer;
        n = floatBuffer2.remaining();
        long l = MemoryUtil.memAddress(floatBuffer2);
        NVSampleLocations.nglFramebufferSampleLocationsfvNV(n3, n2, n, l);
    }

    public static native void nglNamedFramebufferSampleLocationsfvNV(int var0, int var1, int var2, long var3);

    public static void glNamedFramebufferSampleLocationsfvNV(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLfloat const *") FloatBuffer floatBuffer) {
        int n3 = n;
        FloatBuffer floatBuffer2 = floatBuffer;
        n = floatBuffer2.remaining();
        long l = MemoryUtil.memAddress(floatBuffer2);
        NVSampleLocations.nglNamedFramebufferSampleLocationsfvNV(n3, n2, n, l);
    }

    public static native void glResolveDepthValuesNV();

    public static void glFramebufferSampleLocationsfvNV(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLfloat const *") float[] fArray) {
        long l = GLES.getICD().glFramebufferSampleLocationsfvNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, fArray.length, fArray, l);
    }

    public static void glNamedFramebufferSampleLocationsfvNV(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLfloat const *") float[] fArray) {
        long l = GLES.getICD().glNamedFramebufferSampleLocationsfvNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, fArray.length, fArray, l);
    }

    static {
        GLES.initialize();
    }
}

