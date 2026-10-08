package cn.pokemmo.ui.widget.text;

import f.*;
import java.util.*;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PropertyBoundLabel extends BaseLabel implements PropertyChangeListener {
    public final q90_0 Rf;

    public PropertyBoundLabel(q90_0 owner) {
        super();
        this.Rf = owner;
        this.a40();
    }

    @Override
    public String Ck() {
        return "menubtn";
    }

    @Override
    public final void C(zk0_1 style) {
        super.C(style);
        this.Rf.gn(this);
    }

    @Override
    public final void N00(zk0_1 style) {
        this.Rf.Ag(this);
        super.N00(style);
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        this.a40();
    }

    public final void a40() {
        this.pw0(this.Rf.w1);
        this.Rf.getClass();
        this.yj0 = null;
        this.yB0();
        this.SU(this.Rf.ln);
    }
}
