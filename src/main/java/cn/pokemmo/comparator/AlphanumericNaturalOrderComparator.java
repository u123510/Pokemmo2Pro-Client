package cn.pokemmo.comparator;

import java.util.Comparator;

public abstract class AlphanumericNaturalOrderComparator implements Comparator {
    public static boolean G10(char i0) {
        return i0 >= 48 && i0 <= 57;
    }

    public static String mG0(int i0, int i1, String v2) {
        StringBuilder sb = new StringBuilder();
        char c = v2.charAt(i1);
        sb.append(c);
        i1++;
        if (G10(c)) {
            while (i1 < i0) {
                char next = v2.charAt(i1);
                if (!G10(next)) break;
                sb.append(next);
                i1++;
            }
        } else {
            while (i1 < i0) {
                char next = v2.charAt(i1);
                if (G10(next)) break;
                sb.append(next);
                i1++;
            }
        }
        return sb.toString();
    }
}
