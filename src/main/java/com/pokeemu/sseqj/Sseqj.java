/*
 * Decompiled with CFR 0.152.
 */
package com.pokeemu.sseqj;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public abstract class Sseqj {
    public static native int getApiLevel();

    public static native long newPlayer(int var0);

    public static native int loadSDAT(byte var0, ByteBuffer var1, int var2);

    public static native int loadSSEQ(long var0, byte var2, int var3, short var4);

    public static native int generateSamples(long var0, Buffer var2, int var3);

    public static native boolean isStopped(long var0);

    public static native void setVolume(long var0, float var2);

    public static native void setPan(long var0, float var2);

    public static native void setTrackMuted(long var0, int var2, boolean var3);

    public static native void setPitchShift(long var0, float var2);

    public static native void deletePlayer(long var0);
}

