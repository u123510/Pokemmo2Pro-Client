package f;

import cn.pokemmo.ui.input.GlfwWindowFocusCallback;
import f.DO;
import f.Su0;

public final class H20 extends GlfwWindowFocusCallback {
    public H20(Su0 su0) {
        super(su0);
    }

    @Override
    public final void invoke(long l, boolean bl) {
        this.Nf.Df(new DO(this, bl));
    }
}
