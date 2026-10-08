package cn.pokemmo.battle;

import f.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 现代化重构类 - 原始混淆类: f.o50_0
 */
public class Modern_Battle_o50_0 {

    public int H20;
    public int zM;
    public int K4;
    public final String jP;
    public final String u3;
    public final vy_1 Fk0;

    public Modern_Battle_o50_0(hb0_2 hb0_2Var, String str, String str2, String str3) {
        if (hb0_2Var == hb0_2.cw || hb0_2Var == hb0_2.XU) {
            this.Fk0 = vy_1.C00;
        } else if (hb0_2Var == hb0_2.BN || hb0_2Var == hb0_2.xp) {
            this.Fk0 = vy_1.PJ0;
        } else if (hb0_2Var == hb0_2.Rv0) {
            this.Fk0 = vy_1.AZ;
        } else {
            this.Fk0 = vy_1.COM5;
        }

        if (this.Fk0 == vy_1.C00) {
            b8("OpenGL ES (\\d(\\.\\d){0,2})", str);
        } else if (this.Fk0 == vy_1.AZ) {
            b8("WebGL (\\d(\\.\\d){0,2})", str);
        } else if (this.Fk0 == vy_1.PJ0) {
            b8("(\\d(\\.\\d){0,2})", str);
        } else {
            this.H20 = -1;
            this.zM = -1;
            this.K4 = -1;
            str2 = "";
            str3 = "";
        }
        this.jP = str2;
        this.u3 = str3;
    }

    public static int Rh(int i, String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            lg_0.k.Xd0("libGDX GL", "Error parsing number: " + str + ", assuming: " + i);
            return i;
        }
    }

    public final void b8(String str, String str2) {
        Matcher matcher = Pattern.compile(str).matcher(str2);
        if (matcher.find()) {
            String[] split = matcher.group(1).split("\\.");
            this.H20 = Rh(2, split[0]);
            this.zM = split.length < 2 ? 0 : Rh(0, split[1]);
            this.K4 = split.length < 3 ? 0 : Rh(0, split[2]);
        } else {
            lg_0.k.k7("GLVersion", "Invalid version string: " + str2);
            this.H20 = 2;
            this.zM = 0;
            this.K4 = 0;
        }
    }
}

