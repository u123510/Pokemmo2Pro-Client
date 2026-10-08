package cn.pokemmo.ui.widget;

import f.*;
import cn.pokemmo.ui.widget.table.model.AuctionHouseTableModel;

/**
 * 现代化重构类 - 原始混淆类: f.P70
 */
public class Modern_Ui_P70 implements Runnable {

    public final /* synthetic */ X90 Ka;
    public final /* synthetic */ AuctionHouseTableModel cc;

    public Modern_Ui_P70(AuctionHouseTableModel ca_12, X90 x90) {
        this.cc = ca_12;
        this.Ka = x90;
    }

    @Override
    public final void run() {
        COm8_ cOm8_ = this.cc.kz;
        cOm8_.EB0 = this.Ka.SG;
        cOm8_.Ib.Ll(false);
        cOm8_.Dy.Ll(true);
    }
}

