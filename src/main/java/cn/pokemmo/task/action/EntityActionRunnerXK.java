package cn.pokemmo.task.action;

import cn.pokemmo.task.callback.TaskCallbackPr0;
import f.BU;
import f.HX;
import f.Mm;
import f.ez_1;
import f.le0_2;
import f.tw0_0;

public class EntityActionRunnerXK implements Runnable {
    public final TaskCallbackPr0 Sb;

    public EntityActionRunnerXK(TaskCallbackPr0 v1) {
        this.Sb = v1;
    }

    @Override
    public void run() {
        ez_1 v1 = this.Sb.lr0;
        le0_2 v2 = v1.K20;
        if (v2 == null) {
            return;
        }
        v2.u3(v1);
        BU v1_bu = BU.T50;
        HX v2_hx = v1_bu.Cs0;
        if (v2_hx != null) {
            v2_hx.xe0();
            v1_bu.Cs0 = null;
        }
        byte byte0 = this.Sb.Od0;
        byte byteRHH = this.Sb.RH;
        byte[] arr = new byte[2];
        arr[0] = byteRHH;
        Mm this_mm = v1.Lpt3;
        arr[1] = this_mm.QA0[this_mm.zJ.iL];
        tw0_0.rl.hB(byte0, arr);
    }
}
