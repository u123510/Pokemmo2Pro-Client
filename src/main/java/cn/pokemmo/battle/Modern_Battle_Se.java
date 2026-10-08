package cn.pokemmo.battle;

import f.*;
import java.util.Comparator;

/**
 * 现代化重构类 - 原始混淆类: f.Se
 */
public class Modern_Battle_Se {

    public static final Se IK0;
    public static final Se[] g00;
    public final Comparator WR;
    public final int Uj;

    public Modern_Battle_Se(int n, Comparator comparator) {
        this.Uj = n;
        this.WR = comparator;
    }

    static {
        Se se5 = new Se(0, ud0_1.R1);
        Se se6 = new Se(1, gi0_1.sp);
        Se se7 = new Se(2, j70_0.Ft0);
        Se se8 = new Se(3, or_0.CB0);
        IK0 = se8;
        g00 = (Se[])new Se[]{se5, se6, se7, se8}.clone();
    }

}


