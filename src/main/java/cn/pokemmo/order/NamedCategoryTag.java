package cn.pokemmo.order;

import f.*;

public class NamedCategoryTag implements Comparable {
    public final String wx;
    public final byte uH0;

    public NamedCategoryTag(String str, byte b) {
        this.wx = str;
        this.uH0 = b;
    }

    public static String uA(NamedCategoryTag tag) {
        return tag.wx;
    }

    @Override
    public final int compareTo(Object obj) {
        NamedCategoryTag other = (NamedCategoryTag) obj;
        return this.wx.compareTo(other.wx);
    }
}
