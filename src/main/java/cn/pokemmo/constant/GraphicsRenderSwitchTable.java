package cn.pokemmo.constant;

import f.ft_1;

public abstract class GraphicsRenderSwitchTable {
    public static final int[] Ex0;

    static {
        int len;
        try {
            java.lang.reflect.Field f = ft_1.class.getDeclaredField(new String(new char[]{'Q', 'e', '0'}));
            f.setAccessible(true);
            len = ((Object[]) f.get(null)).length;
        } catch (Throwable t) {
            len = 16;
        }
        Ex0 = new int[len];
        try {
            ft_1 unused = ft_1.LPT2;
            Ex0[2] = 1;
        } catch (NoSuchFieldError unused) {}
        try {
            ft_1 unused = ft_1.LPT2;
            Ex0[3] = 2;
        } catch (NoSuchFieldError unused) {}
    }
}
