package cn.pokemmo.battle;

import f.*;
import java.util.ArrayList;

/**
 * 现代化重构类 - 原始混淆类: f.hr_1
 */
public abstract class Modern_Battle_Hr1 {

    public Modern_Battle_Hr1() {
        super();
    }

    public static final ArrayList GB0 = new ArrayList();

    public static void t1(String string, String string2, boolean bl) {
        int n = string.length();
        byte[] byArray = new byte[n / 2];
        for (int j = 0; j < n; j += 2) {
            int n2 = j;
            int n3 = n2 / 2;
            int n4 = Character.digit(string.charAt(n2), 16) << 4;
            byArray[n3] = (byte)(Character.digit(string.charAt(j + 1), 16) + n4);
        }
        ms_0 ms_02 = new ms_0(byArray, string2, bl);
        GB0.add(ms_02);
    }

    static {
        hr_1.t1("425A68", "Bzip2", false);
        hr_1.t1("4C5A4950", "lzip", false);
        hr_1.t1("504B0304", "Zip", true);
        hr_1.t1("504B0506", "Zip", false);
        hr_1.t1("504B0708", "Zip", true);
        hr_1.t1("526172211A0700", "RAR", true);
        hr_1.t1("526172211A070100", "RAR", true);
        hr_1.t1("6B6F6C79", "DMG", false);
        hr_1.t1("78617221", "XAR", false);
        hr_1.t1("7573746172003030", "TAR", true);
        hr_1.t1("7573746172202000", "TAR", true);
        hr_1.t1("377ABCAF271C", "7-Zip", true);
        hr_1.t1("1F8B", "GZIP", true);
        hr_1.t1("FD377A585A00", "XZ", false);
        hr_1.t1("28B52FFD", "Zstandard", false);
    }
}


