package cn.pokemmo.graphics.gl;

import f.Tr0;
import f.pt0_0;
import org.lwjgl.PointerBuffer;

/**
 * 原生 LWJGL 指针缓冲区资源分配器
 */
public class NativePointerBufferResource extends Tr0 implements pt0_0 {
    static {
        PointerBuffer.allocateDirect(16);
    }
}
