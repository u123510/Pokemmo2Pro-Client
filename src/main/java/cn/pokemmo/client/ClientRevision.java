package cn.pokemmo.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * 客户端版本号与版本文件加载器 (Client Revision & Version Manager)
 * <p>
 * 对应原始混淆类: f.x0_0
 * 职责:
 * 1. 提供客户端核心版本号（内置硬编码基础版本: 28887）；
 * 2. 检测并支持从外部 "revision.txt" 文件动态读取覆盖更高版本；
 * 3. 标识版本号是否来自文件 (Xn0)，供客户端启动日志与登录握手包使用。
 */
public abstract class ClientRevision {
    public static final int BASE_REVISION = 28887;
    public static final int k40;
    public static final boolean Xn0;

    static {
        int revision = BASE_REVISION;
        boolean fromFile = false;
        try {
            File revFile = new File("revision.txt");
            if (revFile.exists()) {
                try (FileInputStream fis = new FileInputStream(revFile);
                     InputStreamReader reader = new InputStreamReader(fis, Charset.defaultCharset())) {
                    char[] buffer = new char[1024];
                    StringBuilder sb = new StringBuilder();
                    int count;
                    while ((count = reader.read(buffer)) != -1) {
                        sb.append(buffer, 0, count);
                    }
                    int parsed = Integer.parseInt(sb.toString().trim());
                    if (parsed > revision) {
                        revision = parsed;
                        fromFile = true;
                    }
                }
            }
        } catch (Exception ignored) {
        }
        k40 = revision;
        Xn0 = fromFile;
    }

    /**
     * 现代命名：获取客户端版本号
     */
    public static int getRevision() {
        return k40;
    }

    /**
     * 现代命名：当前版本号是否从外部文件载入
     */
    public static boolean isFromFile() {
        return Xn0;
    }
}
