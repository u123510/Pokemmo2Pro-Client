package cn.pokemmo.audio;

import f.od_1;

public class BitstreamException extends od_1 {
    public int COm8 = 256;

    public BitstreamException(String string, Exception exception) {
        super(string, exception);
    }

    public static String ri(int n) {
        return "Bitstream errorcode " + Integer.toHexString(n);
    }
}
