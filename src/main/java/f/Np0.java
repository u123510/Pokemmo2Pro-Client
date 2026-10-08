package f;

/**
 * 编译器合成类 (Synthetic Switch Table) - f.Np0
 * 由 Javac 编译 Enum Switch 语句生成的合成跳转表，保留在 f 包中供字节码与反射调用。
 */
public abstract class Np0 {
    public static final int[] As;

    static {
        // f/b.<clinit> allocates vJ0 with four entries in the current JASM.
        int[] values = new int[4];
        As = values;
        try {
            Object ignored = b.JW;
            values[0] = 1;
        } catch (NoSuchFieldError ignored) {
        }
        try {
            Object ignored = b.JW;
            values[1] = 2;
        } catch (NoSuchFieldError ignored) {
        }
        try {
            Object ignored = b.JW;
            values[2] = 3;
        } catch (NoSuchFieldError ignored) {
        }
    }
}
