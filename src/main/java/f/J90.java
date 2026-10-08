/*
 * Decompiled with CFR 0.152.
 */
package f;

/**
 * 编译器合成类 (Synthetic Switch Table) - f.J90
 * 由 Javac 编译 Enum Switch 语句生成的合成跳转表，保留在 f 包中供字节码与反射调用。
 */
public abstract class J90 {
    public static final /* synthetic */ int[] SL0;

    static {
        SL0 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    }

    public static /* synthetic */ int Qj(int n) {
        if (n != 0) {
            return n - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] uY(int n) {
        int[] nArray = new int[n];
        System.arraycopy(SL0, 0, nArray, 0, n);
        return nArray;
    }
}

