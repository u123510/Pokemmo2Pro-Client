package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.E10
 */
public class Modern_Battle_E10 {

    public static final E10 qb0;
    public static final E10 ug0;
    public static final E10 tJ;
    public static final E10 WD;
    public static final E10[] pN;
    public static final bm0_1 h50;
    public final byte zg;
    public final int Vx0;

    public Modern_Battle_E10(byte type, int messageId) {
        super();
        this.zg = type;
        this.Vx0 = messageId;
    }

    static {
        E10 first = new E10((byte) 0, 3050);
        qb0 = first;
        E10 second = new E10((byte) 1, 3051);
        E10 third = new E10((byte) 2, 3052);
        ug0 = third;
        E10 fourth = new E10((byte) 3, 3053);
        E10 fifth = new E10((byte) 4, 3054);
        E10 sixth = new E10((byte) 5, 3055);
        tJ = sixth;
        E10 seventh = new E10((byte) 6, 3056);
        E10 eighth = new E10((byte) 7, 3057);
        WD = eighth;
        E10 ninth = new E10((byte) 8, 3058);

        E10[] all = new E10[]{first, second, third, fourth, fifth, sixth, seventh, eighth, ninth};
        pN = all.clone();
        h50 = new bm0_1();
        for (E10 item : all.clone()) {
            h50.gE0(item.zg, item);
        }
    }
}

