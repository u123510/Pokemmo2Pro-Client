package cn.pokemmo.ui.widget;

import f.*;
import cn.pokemmo.ui.widget.table.model.QuestLogTableModel;

/**
 * 现代化重构类 - 原始混淆类: f.ub0_1
 */
public class Modern_Ui_ub0_1 implements Runnable {

    public final /* synthetic */ QuestLogTableModel L9;
    public final /* synthetic */ e70_0 lpt4;

    public Modern_Ui_ub0_1(QuestLogTableModel v1, e70_0 v2) {
        this.L9 = v1;
        this.lpt4 = v2;
    }

    public final void run() {
        vl_0 v1 = this.L9.coM2;
        e70_0 v_e70 = this.lpt4;
        v_e70.getClass();
        String msg = sm0_0.wa0(1664, v_e70.zJ0);
        Qy0.yI0.sr0(new lpt3__4(msg, new KJ(v_e70), v1));
    }
}

