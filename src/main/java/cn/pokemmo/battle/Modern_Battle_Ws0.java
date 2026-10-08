package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.Ws0
 */
public abstract class Modern_Battle_Ws0 {

    public Modern_Battle_Ws0() {
        super();
    }

    public static byte[] Go(byte[] byArray) {
        byte[] byArray2 = new byte[byArray.length * 2];
        for (int j = 0; j < byArray.length; ++j) {
            int n = j;
            int n2 = n * 2;
            byArray2[n2] = (byte)(byArray[n] & 0xF);
            byArray2[++n2] = (byte)((byArray[j] & 0xF0) >> 4);
        }
        return byArray2;
    }

    public static byte[] ut(byte[] byArray, int n, int n2, int n3, int n4) {
        int n5 = n2;
        int n6 = n4;
        byte[] byArray2 = new byte[byArray.length];
        n2 = n6 * n3 / 8;
        n3 = n / n6;
        int n7 = n5 / n4;
        int n8 = 0;
        for (int j = 0; j < n7; ++j) {
            for (int k = 0; k < n3; ++k) {
                for (int i2 = 0; i2 < n4; ++i2) {
                    for (int i3 = 0; i3 < n2; ++i3) {
                        int n9 = i2 * n2 * n3 + i3;
                        n9 = k * n2 + n9;
                        if ((n9 = j * n3 * n4 * n2 + n9) >= byArray.length || n8 >= byArray.length) continue;
                        int n10 = n8 + 1;
                        byArray2[n9] = byArray[n8];
                        n8 = n10;
                    }
                }
            }
        }
        return byArray2;
    }
}


