package cn.pokemmo.io.util;

import cn.pokemmo.client.ClientRevision;
import java.io.File;
import java.nio.charset.Charset;

/**
 * @deprecated 历史误命名类。f.x0_0 实际语义为客户端版本号管理类 (内置版本 28887，可由 revision.txt 覆盖)。
 * 现代规范实现请使用 {@link ClientRevision}，向下兼容垫片请使用 {@link f.x0_0}。
 */
@Deprecated
public abstract class StreamCharsetReader extends ClientRevision {
    public static String readFileToString(File file, Charset charset) {
        return "";
    }
}
