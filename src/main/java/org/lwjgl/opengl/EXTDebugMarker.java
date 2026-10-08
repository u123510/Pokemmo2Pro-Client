/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class EXTDebugMarker {
    public EXTDebugMarker() {
        throw new UnsupportedOperationException();
    }

    public static native void nglInsertEventMarkerEXT(int var0, long var1);

    public static void glInsertEventMarkerEXT(@NativeType(value="GLchar const *") ByteBuffer byteBuffer) {
        EXTDebugMarker.nglInsertEventMarkerEXT(byteBuffer.remaining(), MemoryUtil.memAddress(byteBuffer));
    }

    public static void glInsertEventMarkerEXT(@NativeType(value="GLchar const *") CharSequence charSequence) {
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n = memoryStack.getPointer();
        try {
            EXTDebugMarker.nglInsertEventMarkerEXT(memoryStack.nUTF8(charSequence, false), memoryStack.getPointerAddress());
            memoryStack.setPointer(n);
            return;
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n);
            throw throwable;
        }
    }

    public static native void nglPushGroupMarkerEXT(int var0, long var1);

    public static void glPushGroupMarkerEXT(@NativeType(value="GLchar const *") ByteBuffer byteBuffer) {
        EXTDebugMarker.nglPushGroupMarkerEXT(byteBuffer.remaining(), MemoryUtil.memAddress(byteBuffer));
    }

    public static void glPushGroupMarkerEXT(@NativeType(value="GLchar const *") CharSequence charSequence) {
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n = memoryStack.getPointer();
        try {
            EXTDebugMarker.nglPushGroupMarkerEXT(memoryStack.nUTF8(charSequence, false), memoryStack.getPointerAddress());
            memoryStack.setPointer(n);
            return;
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n);
            throw throwable;
        }
    }

    public static native void glPopGroupMarkerEXT();

    static {
        GL.initialize();
    }
}

