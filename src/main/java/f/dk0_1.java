package f;

import cn.pokemmo.ui.widget.menu.ChatFilterMenuWidget;

public final class dk0_1 extends V1 {
    public final lr_0 Zm;
    public final qd_0 GI0;
    public final ChatFilterMenuWidget I2;

    public dk0_1(ChatFilterMenuWidget eg0, lr_0 lr_0, qd_0 qd_0) {
        super(10, 15, true);
        this.I2 = eg0;
        this.Zm = lr_0;
        this.GI0 = qd_0;
    }

    @Override
    public final void Ff(int i) {
        this.I2.RV = (short) i;
        this.Zm.If(this.GI0);
    }
}