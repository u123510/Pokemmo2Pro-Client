package cn.pokemmo.ui.layout.twl;

import f.JJ0;
import f.bm0_1;

public class LayoutDirectionEnum {
    public static final JJ0 PQ = new JJ0(0, 0);
    public static final JJ0 g2 = new JJ0(1, 1);
    public static final JJ0[] Mh = new JJ0[]{PQ, g2};
    public static final bm0_1 y30 = new bm0_1();
    public final byte implements$;
    public final int Qs0;

    public LayoutDirectionEnum(int var1, int var2) {
        this.Qs0 = var1;
        this.implements$ = (byte) var2;
    }

    static {
        for (JJ0 var0 : (JJ0[]) Mh.clone()) {
            y30.gE0(var0.implements$, var0);
        }
    }
}
