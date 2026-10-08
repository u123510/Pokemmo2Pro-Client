package cn.pokemmo.ui.widget.model;

import f.CH0;
import f.bm0_1;
import f.tx_0;

public class ChatChannelConfigRegistry {
    public final bm0_1 C20;

    public ChatChannelConfigRegistry() {
        super();
        this.C20 = new bm0_1();
    }

    public tx_0 Ed0(byte i1) {
        tx_0 value = (tx_0) this.C20.BM(i1);
        if (value == null) {
            CH0[] channels = new CH0[]{CH0.j1, CH0.j1, CH0.j1, CH0.j1, CH0.j1, CH0.j1};
            value = new tx_0(i1, "", channels);
            this.C20.gE0(i1, value);
        }
        return value;
    }
}
