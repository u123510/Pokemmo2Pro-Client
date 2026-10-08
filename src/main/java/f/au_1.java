package f;

import cn.pokemmo.battle.Modern_Battle_Au1;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.au_1
 * 核心实现已迁移至 {@link Modern_Battle_Au1}
 */
public final class au_1 extends Modern_Battle_Au1 {
    public static final au_1 PI;
    public static final au_1[] Pw0;
    public static final bm0_1 Ty;

    public au_1(int value) {
        super(value);
    }

    static {
        au_1 first = new au_1(1);
        au_1 second = new au_1(2);
        au_1 third = new au_1(3);
        au_1 fourth = new au_1(4);
        au_1 fifth = new au_1(5);
        au_1 sixth = new au_1(6);
        au_1 seventh = new au_1(7);
        au_1 eighth = new au_1(8);
        au_1 ninth = new au_1(9);
        au_1 tenth = new au_1(10);
        au_1 eleventh = new au_1(11);
        au_1 twelfth = new au_1(12);
        au_1 thirteenth = new au_1(13);
        au_1 fourteenth = new au_1(14);
        au_1[] values = new au_1[]{first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth};
        PI = first;
        Pw0 = values.clone();
        Ty = new bm0_1();
        for (au_1 value : values.clone()) {
            Ty.gE0(value.zc, value);
        }
    }
}
