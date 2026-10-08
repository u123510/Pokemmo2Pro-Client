package cn.pokemmo.ui.widget;

import f.*;
import cn.pokemmo.ui.widget.table.model.AuctionHouseTableModel;

/**
 * 现代化重构类 - 原始混淆类: f.r
 */
public class Modern_Ui_r implements Runnable {

    public final X90 Pz;
    public final AuctionHouseTableModel NJ;

    public Modern_Ui_r(AuctionHouseTableModel v1, X90 v2) {
        this.NJ = v1;
        this.Pz = v2;
    }

    public final void run() {
        COm8_ v1 = this.NJ.kz;
        X90 this_x90 = this.Pz;
        v1.ip.qd((byte) -1, this_x90.SG, (short) -1);
        v1.COM1.remove(this_x90.SG);
        Au0 v1_uv0 = v1.uv0;
        v1.COM1.getClass();
        v1_uv0.cr = new Mz0(v1.COM1);
        v1_uv0.lA();
    }
}

