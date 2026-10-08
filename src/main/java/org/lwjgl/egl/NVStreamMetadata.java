/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.egl;

import java.nio.ByteBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.egl.EGL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NVStreamMetadata {
    public static final int EGL_MAX_STREAM_METADATA_BLOCKS_NV = 12880;
    public static final int EGL_MAX_STREAM_METADATA_BLOCK_SIZE_NV = 12881;
    public static final int EGL_MAX_STREAM_METADATA_TOTAL_SIZE_NV = 12882;
    public static final int EGL_PRODUCER_METADATA_NV = 12883;
    public static final int EGL_CONSUMER_METADATA_NV = 12884;
    public static final int EGL_PENDING_METADATA_NV = 13096;
    public static final int EGL_METADATA0_SIZE_NV = 12885;
    public static final int EGL_METADATA1_SIZE_NV = 12886;
    public static final int EGL_METADATA2_SIZE_NV = 12887;
    public static final int EGL_METADATA3_SIZE_NV = 12888;
    public static final int EGL_METADATA0_TYPE_NV = 12889;
    public static final int EGL_METADATA1_TYPE_NV = 12890;
    public static final int EGL_METADATA2_TYPE_NV = 12891;
    public static final int EGL_METADATA3_TYPE_NV = 12892;

    public NVStreamMetadata() {
        throw new UnsupportedOperationException();
    }

    public static int neglQueryDisplayAttribNV(long l, int n, long l2) {
        long l3 = EGL.getCapabilities().eglQueryDisplayAttribNV;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
        }
        return JNI.callPPI(l, n, l2, l3);
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglQueryDisplayAttribNV(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLint") int n, @NativeType(value="EGLAttrib *") PointerBuffer pointerBuffer) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer)pointerBuffer, 1);
        }
        return NVStreamMetadata.neglQueryDisplayAttribNV(l, n, MemoryUtil.memAddress(pointerBuffer)) != 0;
    }

    public static int neglSetStreamMetadataNV(long l, long l2, int n, int n2, int n3, long l3) {
        long l4 = EGL.getCapabilities().eglSetStreamMetadataNV;
        if (Checks.CHECKS) {
            Checks.check(l4);
            Checks.check(l);
            Checks.check(l2);
        }
        return JNI.callPPPI(l, l2, n, n2, n3, l3, l4);
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglSetStreamMetadataNV(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLStreamKHR") long l2, @NativeType(value="EGLint") int n, @NativeType(value="EGLint") int n2, @NativeType(value="void const *") ByteBuffer byteBuffer) {
        long l3;
        ByteBuffer byteBuffer2 = byteBuffer;
        int n3 = byteBuffer2.remaining();
        return NVStreamMetadata.neglSetStreamMetadataNV(l, l2, n, n2, n3, l3 = MemoryUtil.memAddress(byteBuffer2)) != 0;
    }

    public static int neglQueryStreamMetadataNV(long l, long l2, int n, int n2, int n3, int n4, long l3) {
        long l4 = EGL.getCapabilities().eglQueryStreamMetadataNV;
        if (Checks.CHECKS) {
            Checks.check(l4);
            Checks.check(l);
            Checks.check(l2);
        }
        return JNI.callPPPI(l, l2, n, n2, n3, n4, l3, l4);
    }

    @NativeType(value="EGLBoolean")
    public static boolean eglQueryStreamMetadataNV(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLStreamKHR") long l2, @NativeType(value="EGLenum") int n, @NativeType(value="EGLint") int n2, @NativeType(value="EGLint") int n3, @NativeType(value="void *") ByteBuffer byteBuffer) {
        long l3;
        ByteBuffer byteBuffer2 = byteBuffer;
        int n4 = byteBuffer2.remaining();
        return NVStreamMetadata.neglQueryStreamMetadataNV(l, l2, n, n2, n3, n4, l3 = MemoryUtil.memAddress(byteBuffer2)) != 0;
    }
}

