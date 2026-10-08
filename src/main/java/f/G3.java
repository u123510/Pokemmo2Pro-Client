/*
 * Decompiled with CFR 0.152.
 */
package f;

import f.FY;
import f.GY;
import f.ke_0;

/**
 * 编译器合成类 (Synthetic Switch Table) - f.G3
 * 由 Javac 编译 Enum Switch 语句生成的合成跳转表，保留在 f 包中供字节码与反射调用。
 */
public abstract class G3 {
    public static final /* synthetic */ int[] bl0;
    public static final /* synthetic */ int[] E7;
    public static final /* synthetic */ int[] Z5;

    static {
        int[] nArray = new int[FY.values().length];
        Z5 = nArray;
        try {
            nArray[FY.M5.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            G3.Z5[FY.Rb0.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            G3.Z5[FY.Af.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] nArray2 = new int[ke_0.values().length];
        E7 = nArray2;
        try {
            nArray2[ke_0.mJ.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            G3.E7[ke_0.jm.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] nArray3 = new int[GY.values().length];
        bl0 = nArray3;
        try {
            nArray3[GY.ok0.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            G3.bl0[GY.d.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            G3.bl0[GY.dp0.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

