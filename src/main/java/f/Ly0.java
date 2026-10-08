package f;

/**
 * 编译器合成类 (Synthetic Switch Table) - f.Ly0
 * 由 Javac 编译 Enum Switch 语句生成的合成跳转表，保留在 f 包中供字节码与反射调用。
 */
public abstract class Ly0 {
    public static final int[] jP;

    private Ly0() {
    }

    static {
        // The original reads MG0's synthetic values array, which javac cannot name.
        MG0 initialized = MG0.lpt6;
        jP = new int[3];
        try {
            MG0 ignored = MG0.lpt6;
            jP[1] = 1;
        } catch (NoSuchFieldError ignored) {
        }
        try {
            MG0 ignored = MG0.lpt6;
            jP[2] = 2;
        } catch (NoSuchFieldError ignored) {
        }
    }
}
