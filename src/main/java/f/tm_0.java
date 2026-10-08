package f;

import cn.pokemmo.ui.twl.core.TwlInfoWindow;

/**
 * 悬浮信息提示窗口兼容垫片
 * @see cn.pokemmo.ui.twl.core.TwlInfoWindow
 */
public class tm_0 extends TwlInfoWindow {
    public final le0_2 gI0;

    public tm_0(le0_2 owner) {
        super(owner);
        this.gI0 = owner;
    }

    @Override
    public void openInfo() {
        this.Ey();
    }

    public final void Ey() {
        if (this.K20 != null) {
            return;
        }
        le0_2 le0_22 = this.gI0;
        while (le0_22 != null) {
            if (le0_22 instanceof tm_0) {
                return;
            }
            le0_22 = le0_22.K20;
        }
        le0_22 = this.gI0.Em0;
        if (le0_22 != null) {
            ((zk0_1) le0_22).PG0(this);
            this.Uz(1, false);
        }
    }
}
