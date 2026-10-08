package cn.pokemmo.rom.nds.narc;

/**
 * NARC 数字索引字符缓存
 */
public abstract class NarcIndexStrings {
    public static final String[] DB0 = new String[400];

    static {
        for (int i = 0; i < DB0.length; i++) {
            DB0[i] = Integer.toString(i);
        }
    }

    public static String getIndexString(int index) {
        if (index >= 0 && index < DB0.length) {
            return DB0[index];
        }
        return Integer.toString(index);
    }
}
