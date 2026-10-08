/*
 * Decompiled with CFR 0.152.
 */
package f;

import f.VV;

/**
 * 编译器合成类 (Synthetic Switch Table) - f.HQ
 * 由 Javac 编译 Enum Switch 语句生成的合成跳转表，保留在 f 包中供字节码与反射调用。
 */
public abstract class HQ {
    public static final /* synthetic */ int[] zl0;

    static {
        int[] nArray = new int[VV.values().length];
        zl0 = nArray;
        try {
            nArray[VV.cG0.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            HQ.zl0[VV.nJ0.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            HQ.zl0[VV.at.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            HQ.zl0[VV.mR.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

