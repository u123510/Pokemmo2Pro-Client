package cn.pokemmo.graphics.model;

import f.TU;
import java.util.LinkedHashSet;

public class ModelSubmeshNodeArray {
    public static final ModelSubmeshNodeArray D0 = new ModelSubmeshNodeArray(new TU[0]);
    public final TU[] Ts0;

    public ModelSubmeshNodeArray(TU[] v1) {
        this.Ts0 = v1;
    }

    public ModelSubmeshNodeArray kb0(LinkedHashSet v1) {
        int i2 = v1.size();
        if (i2 == 0) {
            return this;
        }
        int i0 = this.Ts0.length + i2;
        TU[] v3 = new TU[i0];
        v1.toArray(v3);
        TU[] v4 = this.Ts0;
        int i5 = v4.length;
        for (int i6 = 0; i6 < i5; i6++) {
            TU v7 = v4[i6];
            if (!v1.contains(v7)) {
                v3[i2++] = v7;
            }
        }
        if (i2 != i0) {
            TU[] newArr = new TU[i2];
            System.arraycopy(v3, 0, newArr, 0, i2);
            v3 = newArr;
        }
        return new ModelSubmeshNodeArray(v3);
    }
}
