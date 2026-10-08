package cn.pokemmo.battle;

import f.*;
import java.util.Comparator;

/**
 * 现代化重构类 - 原始混淆类: f.v9_0
 */
public class Modern_Battle_v9_0 {

    public static final v9_0 ZW;
    public static final v9_0[] Ui;
    public final Comparator LC0;
    public final int ss0;

    public Modern_Battle_v9_0(int n, Comparator comparator) {
        this.ss0 = n;
        this.LC0 = comparator;
    }

    public static int yM(OJ oJ) {
        return oJ.cT & 0xFF;
    }

    static {
        ZW = new v9_0(0, Comparator.comparingInt(v9_0::yM));
        v9_0 v9_08 = new v9_0(1, Comparator.comparing(OJ::ZX));
        v9_0 v9_09 = new v9_0(2, Comparator.comparingInt(OJ::zg0));
        v9_0 v9_010 = new v9_0(3, Comparator.comparingInt(OJ::Ef0));
        v9_0 v9_011 = new v9_0(4, Comparator.comparingInt(OJ::oc));
        Ui = (v9_0[])new v9_0[]{ZW, v9_08, v9_09, v9_010, v9_011}.clone();
    }
}


