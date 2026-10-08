package f;

import cn.pokemmo.pokemon.PokemonGenderRatio;

/**
 * 宝可梦性别比例门面
 * @see cn.pokemmo.pokemon.PokemonGenderRatio
 */
/**
 * 兼容垫片 (Shim) - 原始混淆类: f.A5
 * 核心实现已迁移至 {@link cn.pokemmo.pokemon.PokemonGenderRatio}
 */
public final class A5 extends PokemonGenderRatio {
    public static final A5 PG0;
    public static final A5 O1;
    public static final A5 N00;
    public static final A5[] B4;
    public static final bm0_1 N8;

    public A5(byte var1, boolean var2, boolean var3) {
        super(var1, var2, var3);
    }

    static {
        A5 var0 = new A5((byte)0, true, false);
        A5 var1 = new A5((byte)1, true, true);
        PG0 = var1;
        A5 var2 = new A5((byte)2, true, false);
        A5 var3 = new A5((byte)3, true, false);
        A5 var4 = new A5((byte)4, false, true);
        O1 = var4;
        A5 var5 = new A5((byte)5, false, false);
        N00 = var5;
        A5[] var6 = (A5[])(new A5[]{var0, var1, var2, var3, var4, var5}).clone();
        B4 = var6;
        N8 = new bm0_1();

        for (A5 var9 : var6) {
            N8.gE0(var9.ec0, var9);
        }
    }
}
