package cn.pokemmo.ui.widget;

import f.*;
import cn.pokemmo.ui.widget.table.model.TradeHistoryTableModel;

/**
 * 现代化重构类 - 原始混淆类: f.qa0_2
 */
public class Modern_Ui_qa0_2 implements Runnable {

    public final zp0_0 I50;
    public final TradeHistoryTableModel xf;

    public Modern_Ui_qa0_2(TradeHistoryTableModel owner, zp0_0 row) {
        this.xf = owner;
        this.I50 = row;
    }

    @Override
    public final void run() {
        cb0_1 table = this.xf.oh0.ff;
        CH0 channel = this.I50.LB0;
        if (table.Z60.Bb() > 1) {
            table.Z60.Zd(table.Z60.g6.get(0));
        }
        tw0_0.rl.fk0.uQ(new yz_0(channel));
    }
}

