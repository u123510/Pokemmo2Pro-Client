package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.L20
 */
public class Modern_Battle_L20 {

    public Modern_Battle_L20() {
        super();
    }

    public static final int[] Gq0 = new int[256];
    public byte[] Lz0;
    public int kf0;
    public int yu0;
    public byte[] JD;
    public int GL0;
    public int iB0;

    static {
        int n = 0;
        while (true) {
            int[] nArray = Gq0;
            if (n >= Gq0.length) break;
            int n2 = n << 24;
            for (int j = 0; j < 8; ++j) {
                if ((n2 & Integer.MIN_VALUE) != 0) {
                    n2 = n2 << 1 ^ 0x4C11DB7;
                    continue;
                }
                n2 <<= 1;
            }
            nArray[n] = n2;
            ++n;
        }
    }

    public final int mK() {
        byte[] byArray = this.Lz0;
        int n = this.kf0;
        return this.Lz0[n + 14] & 0xFF | (byArray[n + 15] & 0xFF) << 8 | (byArray[n + 16] & 0xFF) << 16 | (byArray[n + 17] & 0xFF) << 24;
    }

    public final void Sk() {
        int n;
        int n2 = 0;
        for (n = 0; n < this.yu0; ++n) {
            n2 = n2 << 8 ^ Gq0[n2 >>> 24 & 0xFF ^ this.Lz0[this.kf0 + n] & 0xFF];
        }
        for (n = 0; n < this.iB0; ++n) {
            n2 = n2 << 8 ^ Gq0[n2 >>> 24 & 0xFF ^ this.JD[this.GL0 + n] & 0xFF];
        }
        byte[] byArray = this.Lz0;
        int n3 = n2;
        int n4 = n2;
        int n5 = n2;
        int n6 = n2;
        int n7 = this.kf0;
        n2 = n7 + 22;
        byArray[n2] = (byte)n6;
        n2 = n7 + 23;
        byArray[n2] = (byte)(n5 >>> 8);
        n2 = n7 + 24;
        byArray[n2] = (byte)(n4 >>> 16);
        this.Lz0[n7 += 25] = (byte)(n3 >>> 24);
    }
}


