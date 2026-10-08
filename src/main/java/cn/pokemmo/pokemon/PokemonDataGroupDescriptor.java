package cn.pokemmo.pokemon;

import f.b;
import f.bm0_1;

/**
 * 宝可梦数据分组描述符 (Pokemon Data Group Descriptor)
 * 对应混淆类: f.b
 */
public class PokemonDataGroupDescriptor {
    public static final bm0_1 REGISTRY;
    public static final bm0_1 JW;
    public static final b[] VALUES;
    public static final b[] vJ0;

    public final byte groupId;
    public final byte uD;
    public final int categoryIndex;
    public final int Cg;

    public PokemonDataGroupDescriptor(byte by, int n) {
        this.categoryIndex = n;
        this.Cg = n;
        this.groupId = by;
        this.uD = by;
    }

    static {
        b b0 = new b((byte) 0, 0);
        b b1 = new b((byte) 1, 1);
        b b2 = new b((byte) 2, 2);
        b b3 = new b((byte) 3, 3);
        vJ0 = new b[]{b0, b1, b2, b3};
        VALUES = vJ0;
        JW = new bm0_1();
        REGISTRY = JW;
        for (b value : vJ0) {
            JW.gE0(value.uD, value);
        }
    }
}
