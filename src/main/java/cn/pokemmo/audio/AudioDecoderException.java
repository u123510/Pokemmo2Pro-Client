package cn.pokemmo.audio;

import f.od_1;

public class AudioDecoderException extends od_1 {
    public AudioDecoderException(String string) {
        super(string, null);
    }

    public static String vx0(int n) {
        return "Decoder errorcode " + Integer.toHexString(n);
    }
}
