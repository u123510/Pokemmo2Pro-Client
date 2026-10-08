package f;

/**
 * 编译器合成类 (Synthetic Switch Table) - f.EO
 * 由 Javac 编译 Enum Switch 语句生成的合成跳转表，保留在 f 包中供字节码与反射调用。
 */
public abstract class EO {
    public static final int[] pm0;

    private EO() {
    }

    static {
        pm0 = new int[((Q50[]) Q50.X.clone()).length];
        try {
            pm0[3] = 1;
        } catch (NoSuchFieldError ignored) {
        }
        try {
            pm0[2] = 2;
        } catch (NoSuchFieldError ignored) {
        }
        try {
            pm0[1] = 3;
        } catch (NoSuchFieldError ignored) {
        }
    }
}
