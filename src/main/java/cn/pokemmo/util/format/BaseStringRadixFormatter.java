package cn.pokemmo.util.format;

import f.sw0;

public class BaseStringRadixFormatter {
    public static BaseStringRadixFormatter j;
    public final String NO;

    public BaseStringRadixFormatter() {
        this.NO = null;
    }

    public BaseStringRadixFormatter(String v1) {
        this.NO = v1;
    }

    static {
        if (sw0.j == null) {
            try {
                Class.forName(sw0.class.getName());
            } catch (Throwable ignored) {}
        }
    }

    public String MB(int i1) {
        if (i1 >= 1 && this.NO != null) {
            if (i1 < 1) {
                throw new IllegalArgumentException("value");
            }
            int i2 = 16;
            char[] v3 = new char[16];
            int i4 = i2;
            do {
                i4--;
                i1--;
                v3[i4] = this.NO.charAt(i1 % this.NO.length());
                i1 = i1 / this.NO.length();
            } while (i1 > 0);
            return new String(v3, i4, i2 - i4);
        }
        return Integer.toString(i1);
    }
}
