package cn.pokemmo.graphics.gl;

import org.lwjgl.system.MemoryUtil;

public abstract class NativeMemoryReader {
    public static int readInt(long l, long l2) {
        return MemoryUtil.memGetInt(MemoryUtil.memGetAddress(l + l2));
    }

    public static int mY(long l, long l2) {
        return readInt(l, l2);
    }
}
