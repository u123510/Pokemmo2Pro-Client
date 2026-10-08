package f;

import cn.pokemmo.ui.widget.menu.ChatFilterMenuWidget;

public final class ZL0 extends V1 {
    public final lr_0 JI0;
    public final qd_0 xF;
    public final ChatFilterMenuWidget CoM2;

    public ZL0(ChatFilterMenuWidget eg0, lr_0 lr_0, qd_0 qd_0) {
        super(10, 15, true);
        this.CoM2 = eg0;
        this.JI0 = lr_0;
        this.xF = qd_0;
    }

    @Override
    public final void Ff(int i) {
        this.CoM2.RV = (short) i;
        this.JI0.If(this.xF);
    }
}