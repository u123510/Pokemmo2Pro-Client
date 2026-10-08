package f;

import cn.pokemmo.ui.widget.text.tag.ServerRegionTagLabel;

public final class P10 extends S70 {
    public final ServerRegionTagLabel bL0;

    public P10(ServerRegionTagLabel owner, int width, int height) {
        super(width, height);
        ((le0_2) this).Oq0(false);
        this.bL0 = owner;
    }

    public final boolean nd0(i70_0 value) {
        return this.bL0.nd0(value);
    }

    public final void Kp0(zk0_1 context, int x, int y, int state) {
        this.bL0.Kp0(context, x, y, state);
    }
}
