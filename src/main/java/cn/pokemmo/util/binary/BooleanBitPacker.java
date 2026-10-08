package cn.pokemmo.util.binary;

public abstract class BooleanBitPacker {
    public static byte packBooleans(boolean z, boolean z2) {
        byte b = 0;
        if (z) {
            b = (byte) -128;
        }
        if (z2) {
            b = (byte) (b | 64);
        }
        return b;
    }

    public static byte Ak0(boolean z, boolean z2) {
        return packBooleans(z, z2);
    }
}
