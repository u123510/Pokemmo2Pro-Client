package cn.pokemmo.constant;

public abstract class ChannelTypeSwitchTable {
    public static final int[] TH;

    static {
        TH = new int[11];
        try {
            TH[7] = 1;
        } catch (NoSuchFieldError ignored) {
        }
        try {
            TH[6] = 2;
        } catch (NoSuchFieldError ignored) {
        }
        try {
            TH[8] = 3;
        } catch (NoSuchFieldError ignored) {
        }
    }
}
