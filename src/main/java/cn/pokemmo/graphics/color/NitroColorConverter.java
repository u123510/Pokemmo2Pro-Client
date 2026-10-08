package cn.pokemmo.graphics.color;

import com.badlogic.gdx.graphics.Color;
import java.nio.ByteBuffer;

/**
 * 掌机 GBA / NDS 调色盘颜色解码与定点数转换引擎 (Nitro Color & Fixed-Point Converter)
 * 对应混淆类: f.px_1
 */
public abstract class NitroColorConverter {
    public static final float[] KF = new float[]{0.0f, 2.0f, 4.0f, 8.0f, 16.0f, 32.0f, 64.0f, 128.0f, 256.0f, 512.0f, 1024.0f, 2048.0f, 4096.0f};

    public static float[] oV(int n, ByteBuffer byteBuffer) {
        float[] fArray = new float[n];
        for (int j = 0; j < n; ++j) {
            fArray[j] = NitroColorConverter.dg(byteBuffer.getShort(), 3, 12);
        }
        return fArray;
    }

    public static Color ep0(int n) {
        int n2 = n;
        float f = (float)(n2 & 0x1F) / 31.0f;
        float f2 = (float)(n2 >> 5 & 0x1F) / 31.0f;
        float f3 = (float)(n2 >> 10 & 0x1F) / 31.0f;
        return new Color(f, f2, f3, 1.0f);
    }

    public static Color toColorRgb555(int rgb555) {
        return ep0(rgb555);
    }

    public static int XK0(int n) {
        return (int)((float)(n & 0x1F) / 31.0f * 255.0f) << 24 | (int)((float)(n >> 5 & 0x1F) / 31.0f * 255.0f) << 16 | (int)((float)(n >> 10 & 0x1F) / 31.0f * 255.0f) << 8 | 0xFF;
    }

    public static int toRgba8888(int rgb555) {
        return XK0(rgb555);
    }

    public static int[] BJ0(int n, ByteBuffer byteBuffer) {
        int[] nArray = new int[n];
        for (int j = 0; j < n; ++j) {
            nArray[j] = byteBuffer.getShort() & 0xFFFF;
        }
        return nArray;
    }

    public static float[] x6(int n, ByteBuffer byteBuffer) {
        float[] fArray = new float[n];
        for (int j = 0; j < n; ++j) {
            fArray[j] = (float)byteBuffer.getInt() / 4096.0f;
        }
        return fArray;
    }

    public static float dg(short s, int n, int n2) {
        if ((s & 1 << (n = 1 + n + n2) - 1) != 0) {
            s = (short)(s | -1 << n);
        }
        return (float)s / KF[n2];
    }

    public static float Ei0(int n) {
        return (float)n / KF[12];
    }

    public static float f8(int n) {
        int n2 = n;
        n = 12;
        return (float)n2 / KF[n];
    }
}
