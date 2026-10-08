package cn.pokemmo.battle;

import f.*;
import java.util.Arrays;
import java.util.HashMap;

/**
 * 现代化重构类 - 原始混淆类: f.et_1
 */
public class Modern_Battle_Et1
extends ZB0 {

    public Modern_Battle_Et1() {
        super();
    }

    @Override
    public final void Pr0(LH0 lH0) {
        HashMap hashMap = el0_0.Cn0;
        gc0_0 gc0_02 = (gc0_0)hashMap.get(lH0);
        if (gc0_02 != null) {
            Object object = "Controller {} detached. {}";
            String string = gc0_02.LPT8;
            o3_0 o3_02 = (o3_0)lH0;
            el0_0.zb0.info((String)object, (Object)string, (Object)o3_02.I80);
            object = Qy0.yI0;
            if (object != null) {
                ((Qy0)object).dk(-1, sm0_0.wa0(1396, o3_02.vC0));
            }
            if (gc0_02.Dq0 == lH0) {
                gc0_02.Dq0 = null;
                Arrays.fill(gc0_02.te, false);
                hashMap.remove(lH0);
            }
        }
    }

    @Override
    public final void COm6(o3_0 o3_02) {
        el0_0.aY(o3_02);
    }
}


