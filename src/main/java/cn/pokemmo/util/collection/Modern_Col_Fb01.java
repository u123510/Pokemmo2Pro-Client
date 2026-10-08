package cn.pokemmo.util.collection;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.fb0_1
 */
public class Modern_Col_Fb01 {

    public byte rO;
    public byte AH0;
    public rz_0 Jg;
    public byte BL0;
    public short[] cI;
    public mv_1 Ie0;

    public Modern_Col_Fb01(byte by) {
        this.Ie0 = new mv_1();
        if (by != 1 && by != 6) {
            this.rO = by;
            return;
        }
        throw new RuntimeException();
    }

    public Modern_Col_Fb01(byte by, int n) {
        int n2 = 6;
        this.Ie0 = new mv_1();
        this.rO = (byte)n2;
        this.AH0 = by;
    }

    public Modern_Col_Fb01(rz_0 rz_02, byte by, short[] sArray, gc_2[] gc_2Array, byte[] byArray) {
        this.Ie0 = new mv_1();
        this.rO = 1;
        this.Jg = rz_02;
        this.BL0 = by;
        this.cI = sArray;
        if (gc_2Array.length == byArray.length) {
            for (int n = 0; n < gc_2Array.length; n = (int)((byte)(n + 1))) {
                by = byArray[n];
                if (by >= 0 && by <= 31) {
                    this.Ie0.Is0(by, (Object)gc_2Array[n]);
                    continue;
                }
                throw new RuntimeException();
            }
            return;
        }
        throw new RuntimeException();
    }
}

