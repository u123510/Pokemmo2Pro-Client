package cn.pokemmo.ui.twl.theme;

/**
 * 文本值度量单位 (Value.Unit)
 */
public abstract class TwlTextUnit {
    public static final int PX = 1;
    public static final int PT = 2;
    public static final int EM = 3;
    public static final int EX = 4;
    public static final int PERCENT = 5;
    public static final int AUTO = 6;

    public static boolean isFontRelative(int unit) {
        return unit == EM || unit == EX;
    }

    public static String getSuffix(int unit) {
        switch (unit) {
            case PX: return "px";
            case PT: return "pt";
            case EM: return "em";
            case EX: return "ex";
            case PERCENT: return "%";
            case AUTO: return "auto";
            default: throw new IllegalArgumentException("Unknown unit: " + unit);
        }
    }
}
