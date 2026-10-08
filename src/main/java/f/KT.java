package f;

import cn.pokemmo.io.util.StreamIoUtils;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;

public final class KT extends StreamIoUtils {
    public static byte[] Vc(InputStream var0, int var1) {
        return readBytes(var0, var1);
    }

    public static int hH0(InputStream var0, OutputStream var1, byte[] var2) {
        return copyStream(var0, var1, var2);
    }

    public static String MI0(InputStream var0, int var1) {
        return readString(var0, var1);
    }

    public static String Uf0(InputStream var0, int var1) {
        return readString(var0, var1);
    }

    public static void E1(Closeable var0) {
        closeQuietly(var0);
    }
}
