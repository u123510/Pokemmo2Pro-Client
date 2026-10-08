package cn.pokemmo.util.codec;

import java.util.Arrays;

/**
 * 客户端 Base64 编解码器 (Base64 Codec)
 * <p>
 * 原始混淆类: f.TI0
 * 职责:
 * 提供高效无依赖的 Base64 编码与解码算法，广泛用于配置解析、资源签名、公钥反序列化与网络 Token 转换。
 */
public abstract class Base64Codec {
    public static final char[] Ni0;
    public static final int[] Up0;

    protected Base64Codec() {
    }

    /**
     * 编码字节数组为 Base64 字符串 (Ga)
     */
    public static String Ga(byte[] data) {
        return encode(data);
    }

    /**
     * 现代命名：Base64 编码
     */
    public static String encode(byte[] data) {
        int i;
        if (data != null) {
            i = data.length;
        } else {
            i = 0;
        }

        char[] achar2;
        if (i == 0) {
            achar2 = new char[0];
        } else {
            int j = i / 3 * 3;
            int k;
            int l;
            char[] achar = new char[l = (k = i - 1) / 3 + 1 << 2];
            byte b0 = 0;
            byte b1 = 0;

            while (b0 < j) {
                int i1 = b0 + 1;
                int k2 = (data[b0] & 255) << 16;
                int i2 = b0 + 2;
                k2 |= (data[i1] & 255) << 8;
                b0 += 3;
                i1 = k2 | data[i2] & 255;
                int j1 = b1 + 1;
                char[] achar1 = Ni0;
                achar[b1] = achar1[i1 >>> 18 & 63];
                int j2 = b1 + 2;
                achar[j1] = achar1[i1 >>> 12 & 63];
                j1 = b1 + 3;
                achar[j2] = achar1[i1 >>> 6 & 63];
                b1 += 4;
                achar[j1] = Ni0[i1 & 63];
            }

            if ((i = i - j) > 0) {
                int remainder = i;
                j = (data[j] & 255) << 10;
                int k1;
                if (remainder == 2) {
                    k1 = (data[k] & 255) << 2;
                } else {
                    k1 = 0;
                }

                int l1 = j | k1;
                i = l - 4;
                char[] achar3 = Ni0;
                achar[i] = achar3[l1 >> 12];
                i = l - 3;
                achar[i] = Ni0[l1 >>> 6 & 63];
                i = l - 2;
                char c0;
                if (remainder == 2) {
                    c0 = achar3[l1 & 63];
                } else {
                    c0 = '=';
                }

                achar[i] = c0;
                achar[l - 1] = '=';
            }

            achar2 = achar;
        }

        return new String(achar2);
    }

    /**
     * 解码 Base64 字符串为字节数组 (Kd)
     */
    public static byte[] Kd(String var0) {
        return decode(var0);
    }

    /**
     * 现代命名：Base64 解码
     */
    public static byte[] decode(String var0) {
        int i;
        if (var0 != null) {
            i = var0.length();
        } else {
            i = 0;
        }

        if (i == 0) {
            return new byte[0];
        }

        int j = 0;

        for (int k = 0; k < i; k++) {
            char c = var0.charAt(k);
            if (c >= Up0.length || Up0[c] < 0) {
                j++;
            }
        }

        if ((j = i - j) % 4 != 0) {
            return null;
        }

        int l1 = 0;

        while (i > 1 && var0.charAt(i - 1) < Up0.length && Up0[var0.charAt(i - 1)] <= 0) {
            i--;
            if (var0.charAt(i) == '=') {
                l1++;
            }
        }

        byte[] abyte = new byte[i = (j * 6 >> 3) - l1];
        l1 = 0;
        int l = 0;

        while (l < i) {
            int i1 = 0;

            for (int j1 = 0; j1 < 4; j1++) {
                int k1;
                char c = var0.charAt(l1++);
                if (c < Up0.length && (k1 = Up0[c]) >= 0) {
                    i1 |= k1 << 18 - j1 * 6;
                } else {
                    j1--;
                }
            }

            int i2;
            int k2 = i2 = l + 1;
            abyte[l] = (byte)(i1 >> 16);
            if (k2 < i) {
                int j2;
                k2 = j2 = l + 2;
                abyte[i2] = (byte)(i1 >> 8);
                if (k2 < i) {
                    l += 3;
                    abyte[j2] = (byte)i1;
                } else {
                    l = j2;
                }
            } else {
                l = i2;
            }
        }

        return abyte;
    }

    static {
        char[] achar = Ni0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        Arrays.fill(Up0 = new int[256], -1);
        int i = 0;
        int j = achar.length;

        while (i < j) {
            Up0[Ni0[i]] = i++;
        }

        Up0[61] = 0;
    }
}
