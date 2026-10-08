package cn.pokemmo.data.buffer;

/**
 * 共享临时静态字节缓冲区 (Shared Scratch Buffer Pool)
 * 提供 32,000 字节全局静态工作缓冲区，用于大型封包临时缓存与解压缩。
 *
 * 对应混淆类: f.yo0_0
 */
public abstract class SharedScratchBuffer {
    public static final byte[] BUFFER = new byte[32000];
    public static final byte[] NUl = BUFFER;
}
