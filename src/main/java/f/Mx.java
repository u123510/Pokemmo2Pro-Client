package f;

import cn.pokemmo.ui.input.GlfwWindowMaximizeCallback;
import f.Pw0;
import f.Su0;

public final class Mx extends GlfwWindowMaximizeCallback {
    public Mx(Su0 su0) {
        super(su0);
    }

    @Override
    public final void invoke(long l, boolean bl) {
        this.JY.Df(new Pw0(this, bl));
    }
}
