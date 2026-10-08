package cn.pokemmo.util.binary;

public abstract class BitPackMathUtils {
    public static short p5(byte by, byte by2) {
        return (short)(by & 0xFF | (by2 & 0xFF) << 8);
    }

    public static int iA0(byte by, byte by2, byte by3) {
        return by | (by2 & 0xFF) << 8 | (by3 & 0xFF) << 16;
    }

    public static byte AD0(short s) {
        return (byte)(s & 0xFF);
    }

    public static byte K9(short s) {
        return (byte)(s >> 8 & 0xFF);
    }
}
