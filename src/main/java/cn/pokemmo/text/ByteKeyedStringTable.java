package cn.pokemmo.text;

import f.bm0_1;

public class ByteKeyedStringTable {
    public final bm0_1 qE0 = new bm0_1();
    public final byte[] Is = new byte[0];
    public boolean y0 = false;

    public void FU(byte by, String string) {
        if (string == null) {
            string = "null";
        }
        this.qE0.gE0(by, string);
    }
}
