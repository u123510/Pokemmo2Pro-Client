/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.stb;

import org.lwjgl.stb.LibSTB;
import org.lwjgl.stb.STBRPContext;
import org.lwjgl.stb.STBRPNode;
import org.lwjgl.stb.STBRPRect;
import org.lwjgl.system.NativeType;

public class STBRectPack {
    public static final int STBRP__MAXVAL = Integer.MAX_VALUE;
    public static final int STBRP_HEURISTIC_Skyline_default = 0;
    public static final int STBRP_HEURISTIC_Skyline_BL_sortHeight = 0;
    public static final int STBRP_HEURISTIC_Skyline_BF_sortHeight = 1;

    public STBRectPack() {
        throw new UnsupportedOperationException();
    }

    public static native int nstbrp_pack_rects(long var0, long var2, int var4);

    public static int stbrp_pack_rects(@NativeType(value="stbrp_context *") STBRPContext sTBRPContext, @NativeType(value="stbrp_rect *") STBRPRect.Buffer buffer) {
        STBRPRect.Buffer buffer2 = buffer;
        long l = buffer2.address();
        int n = buffer2.remaining();
        return STBRectPack.nstbrp_pack_rects(sTBRPContext.address(), l, n);
    }

    public static native void nstbrp_init_target(long var0, int var2, int var3, long var4, int var6);

    public static void stbrp_init_target(@NativeType(value="stbrp_context *") STBRPContext sTBRPContext, int n, int n2, @NativeType(value="stbrp_node *") STBRPNode.Buffer buffer) {
        STBRPNode.Buffer buffer2 = buffer;
        long l = buffer2.address();
        int n3 = buffer2.remaining();
        STBRectPack.nstbrp_init_target(sTBRPContext.address(), n, n2, l, n3);
    }

    public static native void nstbrp_setup_allow_out_of_mem(long var0, int var2);

    public static void stbrp_setup_allow_out_of_mem(@NativeType(value="stbrp_context *") STBRPContext sTBRPContext, @NativeType(value="int") boolean bl) {
        STBRectPack.nstbrp_setup_allow_out_of_mem(sTBRPContext.address(), bl ? 1 : 0);
    }

    public static native void nstbrp_setup_heuristic(long var0, int var2);

    public static void stbrp_setup_heuristic(@NativeType(value="stbrp_context *") STBRPContext sTBRPContext, int n) {
        STBRectPack.nstbrp_setup_heuristic(sTBRPContext.address(), n);
    }

    static {
        LibSTB.initialize();
    }
}

