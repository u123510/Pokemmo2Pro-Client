package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.RL0
 */
public class Modern_Battle_RL0 {

    public static final RL0 S60;
    public static final RL0 YC;
    public static final RL0 Com5;
    public static final RL0 mD;
    public static final RL0 aN;
    public static final bm0_1 rO;
    public static final RL0[] Af0;
    public final byte BN;
    public final int Yk;

    public Modern_Battle_RL0(byte id, int value) {
        this.Yk = value;
        this.BN = id;
    }

    static {
        RL0 value0 = new RL0((byte)0, 0);
        S60 = value0;
        RL0 value1 = new RL0((byte)1, 1);
        YC = value1;
        RL0 value2 = new RL0((byte)2, 2);
        Com5 = value2;
        RL0 value3 = new RL0((byte)3, 3);
        RL0 value4 = new RL0((byte)4, 4);
        mD = value4;
        RL0 value5 = new RL0((byte)5, 5);
        RL0 value6 = new RL0((byte)6, 6);
        aN = value6;
        RL0 value7 = new RL0((byte)7, 7);
        Af0 = new RL0[]{value0, value1, value2, value3, value4, value5, value6, value7};
        rO = new bm0_1();
        for (RL0 value : (RL0[])Af0.clone()) {
            rO.gE0(value.BN, value);
        }
    }
}

