package f;

import cn.pokemmo.ui.input.GlfwWindowIconifyCallback;
import f.Su0;
import f.iy_2;

public final class L80 extends GlfwWindowIconifyCallback {
    public L80(Su0 su0) {
        super(su0);
    }

    @Override
    public final void invoke(long l, boolean bl) {
        this.rk0.Df(new iy_2(this, bl));
    }
}
