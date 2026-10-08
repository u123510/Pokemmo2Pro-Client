package cn.pokemmo.ui.widget.component;

import f.KG0;
import f.pc0_1;
import f.qw0_0;

public class DualToggledComponentHolder {
    public int OE;
    public int Zg;
    public pc0_1 lr0;
    public final KG0 eD;
    public final KG0 im;

    public DualToggledComponentHolder(KG0 kg0) {
        this.eD = new KG0(kg0);
        this.eD.j70(qw0_0.oC, false);
        this.im = new KG0(kg0);
        this.im.j70(qw0_0.oC, true);
    }
}
