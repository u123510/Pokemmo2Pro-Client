/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.NativeType;

public class EXTWin32KeyedMutex {
    public EXTWin32KeyedMutex() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="GLboolean")
    public static native boolean glAcquireKeyedMutexWin32EXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint64") long var1, @NativeType(value="GLuint") int var3);

    @NativeType(value="GLboolean")
    public static native boolean glReleaseKeyedMutexWin32EXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint64") long var1);

    static {
        GL.initialize();
    }
}

