/*
 * Decompiled with CFR 0.152.
 */
package com.pokeemu.agbplayj;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public abstract class Agbplayj {
    public static native int getApiLevel();

    public static native long newPlayer();

    public static native int loadRom(byte var0, ByteBuffer var1, int var2);

    public static native int loadSong(long var0, byte var2, int var3);

    public static native int generateSamples(long var0, Buffer var2, int var3);

    public static native boolean isStopped(long var0);

    public static native void setVolume(long var0, float var2);

    public static native void deletePlayer(long var0);
}

