package cn.pokemmo.battle;

import f.*;
import java.util.Comparator;

/**
 * 现代化重构类 - 原始混淆类: f.bf0_0
 */
public class Modern_Battle_Bf00  {

    public static final Comparator mJ0;
    public static final Comparator MY;
    public static final Comparator LO;
    public final short RX;
    public byte SF0;
    public final int lPt1;
    public final int Kc0;
    public float Av0;

    public Modern_Battle_Bf00(int first, int second, short type) {
        this.RX = type;
        this.lPt1 = first;
        this.Kc0 = second;
        this.Dn0();
    }

    public static int S00(bf0_0 value) {
        return value != null ? value.SF0 : Integer.MAX_VALUE;
    }

    public static int BJ(bf0_0 first, bf0_0 second) {
        float firstValue = first.Av0;
        float secondValue = second.Av0;
        if (firstValue == secondValue) {
            return 0;
        }
        return secondValue > firstValue ? 1 : -1;
    }

    public static int xb0(bf0_0 first, bf0_0 second) {
        int firstValue = first.lPt1;
        int secondValue = second.lPt1;
        if (firstValue == secondValue) {
            return 0;
        }
        return secondValue > firstValue ? 1 : -1;
    }

    static {
        Cq0.E1(bf0_0.class);
        mJ0 = (first, second) -> xb0((bf0_0) first, (bf0_0) second);
        MY = (first, second) -> BJ((bf0_0) first, (bf0_0) second);
        LO = Comparator.comparingInt(value -> S00((bf0_0) value));
    }

    public final void Dn0() {
        this.Av0 = (float) this.Kc0 / (float) this.lPt1 * 100.0f;
    }
}

