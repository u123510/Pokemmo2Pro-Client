package cn.pokemmo.graphics.gl;

import org.lwjgl.system.MemoryUtil;

public abstract class NativeMemoryAddressResolver {
    public static long ox0(long l, long l2) {
        return MemoryUtil.memGetAddress(MemoryUtil.memGetAddress(l + l2));
    }
}
