package cn.pokemmo.graphics.gl;

import org.lwjgl.system.Checks;

/**
 * LWJGL 缓冲区内存地址偏移计算器
 */
public abstract class BufferOffsetCalculator {
    public static long calculateOffset(int n, int n2, long l, long l2) {
        return Checks.check(n, n2) * l + l2;
    }

    public static long oE(int n, int n2, long l, long l2) {
        return calculateOffset(n, n2, l, l2);
    }
}
