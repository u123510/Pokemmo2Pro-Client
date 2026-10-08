package cn.pokemmo.ui.widget.component;

import f.V1;
import f.Yl;
import f.ZI;
import f.tw0_0;
import f.wn0_0;

public class PacketSliderActionCallback extends V1 {
    public final Yl Xj0;

    public PacketSliderActionCallback(Yl v1) {
        super(50, 5);
        this.Xj0 = v1;
    }

    public void Ff(int i1) {
        byte b = (byte) i1;
        this.Xj0.D10 = b;
        String str = ((wn0_0) this.Xj0.aB.dI0).YA.toString();
        tw0_0.rl.fk0.uQ(new ZI(b, str));
    }
}
