package cn.pokemmo.ui.widget;

import f.*;
import cn.pokemmo.ui.widget.table.model.FriendListTableModel;

/**
 * 现代化重构类 - 原始混淆类: f.pj0_0
 */
public class Modern_Ui_pj0_0 implements Runnable {

    public final ce0_0 sG;
    public final xe_1 B3;
    public final FriendListTableModel sp;

    public Modern_Ui_pj0_0(FriendListTableModel px, ce0_0 ce0_0, xe_1 xe_1) {
        this.sp = px;
        this.sG = ce0_0;
        this.B3 = xe_1;
    }

    @Override
    public final void run() {
        this.sp.kY.Px0(this.sG, this.B3, 0, 0);
    }
}

