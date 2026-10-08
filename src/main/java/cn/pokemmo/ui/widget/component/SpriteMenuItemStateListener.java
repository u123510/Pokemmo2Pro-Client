package cn.pokemmo.ui.widget.component;

import f.E90;
import f.ps_1;
import f.rh0_0;
import f.zk0_1;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public abstract class SpriteMenuItemStateListener extends rh0_0 implements PropertyChangeListener {
    public final ps_1 gl;

    public SpriteMenuItemStateListener(ps_1 owner, String text, int index, E90 sprite) {
        super(text, index, sprite);
        this.gl = owner;
        this.NL0();
    }

    @Override
    public void C(zk0_1 style) {
        super.C(style);
        this.gl.gn(this);
    }

    @Override
    public void N00(zk0_1 style) {
        this.gl.Ag(this);
        super.N00(style);
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        this.NL0();
    }

    public void NL0() {
        this.pw0(this.gl.w1);
        this.gl.getClass();
        this.yj0 = null;
        this.yB0();
        this.SU(this.gl.ln);
    }
}
