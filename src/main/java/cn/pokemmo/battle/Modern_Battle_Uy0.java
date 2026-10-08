package cn.pokemmo.battle;

import f.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * 现代化重构类 - 原始混淆类: f.Uy0
 */
public class Modern_Battle_Uy0 {

    public Modern_Battle_Uy0() {
        super();
    }

    public static final DecimalFormat xT;
    public static long B0;
    public final long[] Fw = new long[500];
    public int sS;
    public float RI0;
    public float xH0;
    public float Np0;
    public float BC;
    public int p30;
    public int Ml;
    public float ir0;
    public int th;
    public int zy;
    public int xh;
    public float P50;
    public int finally$;

    static {
        xT = new DecimalFormat("000.00");
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator('.');
        xT.setDecimalFormatSymbols(symbols);
    }

    public final String toString() {
        return xT.format(this.RI0) + " / " + xT.format(this.xH0) + " / " + xT.format(this.Np0) + " / " + xT.format(this.BC);
    }
}

