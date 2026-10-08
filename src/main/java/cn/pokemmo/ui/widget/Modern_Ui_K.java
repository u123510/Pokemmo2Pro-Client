package cn.pokemmo.ui.widget;

import f.*;
import cn.pokemmo.ui.widget.slot.MailAttachmentSlotWidget;

/**
 * 现代化重构类 - 原始混淆类: f.K
 */
public class Modern_Ui_K implements uw_0 {

    public final /* synthetic */ K5 Jp0;
    public final /* synthetic */ MailAttachmentSlotWidget cM;

    public Modern_Ui_K(MailAttachmentSlotWidget lpt1__32, K5 k5) {
        this.cM = lpt1__32;
        this.Jp0 = k5;
    }

    @Override
    public final void Q(int n) {
        hl0_0 hl0_02 = this.Jp0.nn;
        short s = hl0_02.wQ;
        short s2 = (short)n;
        this.cM.Uj0(hl0_02.N50, s, s2);
        this.cM.XX = this.Jp0.nn.Br;
    }

    @Override
    public final void run() {
    }
}

