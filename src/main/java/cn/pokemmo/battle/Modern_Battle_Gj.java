package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.GJ
 */
public class Modern_Battle_Gj {

    public static final GJ Ig0;
    public final x[] je;

    public Modern_Battle_Gj() {
        this.je = new w7_0[5];
        for (int i = 0; i < this.je.length; i++) {
            this.je[i] = new w7_0();
        }
    }

    static {
        Ig0 = new GJ();
    }

    public final String wG0(byte language, short id) {
        int group = id / 512;
        if (group == 19 || group == 18) {
            vk0_1 value = (vk0_1) ec0_2.Sx().f4.f5((short) (id % 512));
            if (value == null) {
                return "???";
            }
            return sm0_0.c0(value.bt);
        }
        if (group == 0 || group == 21) {
            cq_0 value = (cq_0) mp_1.vf0().k2.get(Short.valueOf((short) (id % 512)));
            if (value == null) {
                return "???";
            }
            return value.Ay(false);
        }
        return (String) this.je[language].f5(id);
    }

    public final String Xw(byte language, short[] ids) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ids.length; i++) {
            if (ids[i] > 0) {
                if (i == 3) {
                    result.append("\n");
                } else if (result.length() > 0) {
                    result.append(' ');
                }
                result.append(this.wG0(language, ids[i]));
            }
        }
        return result.toString();
    }
}

