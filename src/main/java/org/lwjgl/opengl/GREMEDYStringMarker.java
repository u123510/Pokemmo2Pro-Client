/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class GREMEDYStringMarker {
    public GREMEDYStringMarker() {
        throw new UnsupportedOperationException();
    }

    public static native void nglStringMarkerGREMEDY(int var0, long var1);

    public static void glStringMarkerGREMEDY(@NativeType(value="GLchar const *") ByteBuffer byteBuffer) {
        GREMEDYStringMarker.nglStringMarkerGREMEDY(byteBuffer.remaining(), MemoryUtil.memAddress(byteBuffer));
    }

    public static void glStringMarkerGREMEDY(@NativeType(value="GLchar const *") CharSequence charSequence) {
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n = memoryStack.getPointer();
        try {
            GREMEDYStringMarker.nglStringMarkerGREMEDY(memoryStack.nUTF8(charSequence, false), memoryStack.getPointerAddress());
            memoryStack.setPointer(n);
            return;
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n);
            throw throwable;
        }
    }

    static {
        GL.initialize();
    }
}

