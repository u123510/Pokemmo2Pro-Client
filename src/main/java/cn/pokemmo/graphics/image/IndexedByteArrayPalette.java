package cn.pokemmo.graphics.image;

import f.gb_0;
import f.ol0_0;

public class IndexedByteArrayPalette extends gb_0 {
    public final byte[] lx0;

    public IndexedByteArrayPalette(byte[] v1) {
        this.lx0 = v1;
    }

    public byte[] COm6(ol0_0 v1) {
        if (v1 == ol0_0.Jk0) {
            return this.lx0;
        }
        throw new RuntimeException();
    }

    public int[] yF0(ol0_0 v1) {
        byte[] bArr = COm6(v1);
        int[] res = new int[bArr.length / 2];
        for (int i = 0; i < bArr.length / 2; i++) {
            int idx = i * 2;
            short s = (short) ((bArr[idx] & 0xFF) | ((bArr[idx + 1] & 0xFF) << 8));
            res[i] = gb_0.f20(s);
        }
        return res;
    }
}
