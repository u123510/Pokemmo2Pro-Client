package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.kc_1
 */
public abstract class Modern_Battle_Kc1 {

    public Modern_Battle_Kc1() {
        super();
    }

    public static final char[] xh = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String Dh(byte[] byArray) {
        StringBuilder stringBuilder2 = new StringBuilder(byArray.length * 2);
        for (byte by : byArray) {
            char[] cArray = xh;
            stringBuilder2.append(cArray[by >> 4 & 0xF]);
            stringBuilder2.append(xh[by & 0xF]);
        }
        return stringBuilder2.toString();
    }

    public static String fu(short s, boolean bl) {
        String string = Integer.toHexString(s).toUpperCase();
        if (string.length() == 8 && string.startsWith("FFFF")) {
            string = string.substring(4);
        }
        while (string.length() < 4) {
            string = "0".concat(string);
        }
        if (bl) {
            return "(short)0x".concat(string);
        }
        return "0x".concat(string);
    }
}


