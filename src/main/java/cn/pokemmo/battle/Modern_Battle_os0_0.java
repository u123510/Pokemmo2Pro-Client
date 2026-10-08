package cn.pokemmo.battle;

import f.*;
import java.io.File;

/**
 * 现代化重构类 - 原始混淆类: f.os0_0
 */
public class Modern_Battle_os0_0
implements uv_2 {

    public Modern_Battle_os0_0() {
        super();
    }

    public static final String L10;
    public static final String D70;

    static {
        String string = File.separator;
        L10 = System.getProperty("user.home") + string;
        D70 = new File("").getAbsolutePath() + string;
    }

    public final VE US(String string, zv_1 zv_12) {
        return new VE(string, zv_12);
    }

    public final VE kv0(String string) {
        return new VE(string, zv_1.Gi0);
    }

    public final VE cD0(String string) {
        return new VE(string, zv_1.tt0);
    }

    public final VE GK(String string) {
        return new VE(string, zv_1.uq0);
    }

    public final VE Wl0(String string) {
        return new VE(string, zv_1.kE);
    }
}


