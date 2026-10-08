package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.Q0
 */
public class Modern_Battle_Q0
extends ka_1 {

    public Modern_Battle_Q0() {
        super();
    }

    @Override
    public final boolean nd0(i70_0 i70_02) {
        Object object;
        if (J90.Qj(i70_02.zu) == 2 && i70_02.nA0 == 0 && (object = tw0_0.e60.jB0) != null && tw0_0.Eu(1)) {
            String string;
            object = ((bi0_1)object).ba0;
            if (N50.Aa(((zv_2)object).uS)) {
                string = "//moveto " + ((zv_2)object).uS + " " + ((zv_2)object).o0 + " " + ((zv_2)object).ID0 + " " + ((zv_2)object).Lq0 + " " + ((zv_2)object).B5 + " " + ((zv_2)object).JT;
            } else {
                Object object2 = object;
                object = new StringBuilder("//moveto2 ").append(((zv_2)object).uS).append(" ").append(J4.p5(((zv_2)object).o0, ((zv_2)object).ID0)).append(" ").append(((zv_2)object).Lq0).append(" ").append(((zv_2)object).B5).append(" ").append(((zv_2)object).JT);
                String string2 = ((zv_2)object2).Lpt2 ? " NG" : "";
                string = ((StringBuilder)object).append(string2).toString();
            }
            II0.ZN(string);
            Qy0.yI0.dk(-1, "Location copied to clipboard");
        }
        return super.nd0(i70_02);
    }
}


