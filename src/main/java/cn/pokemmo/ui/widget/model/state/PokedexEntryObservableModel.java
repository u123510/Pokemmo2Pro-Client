package cn.pokemmo.ui.widget.model.state;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import cn.pokemmo.ui.widget.model.state.BaseObservableStateModel;

public class PokedexEntryObservableModel extends BaseObservableStateModel implements E7 {
    public final o10_0 oq0;
    public le0_2 pe0;
    public final ZW A8;

    public PokedexEntryObservableModel(ZW owner) {
        super();
        this.A8 = owner;
        this.oq0 = new o10_0(this);
    }

    public final boolean getValue() {
        return this.A8.tI == this;
    }

    public final void Dc0(boolean enabled) {
        if (enabled) {
            this.A8.qf((PB) this);
        }
    }

    public final void Iw0() {
        le0_2 target = this.pe0;
        if (target != null) {
            target.Ll(this.getValue());
        }
        a7_0.bH(this.RD0);
    }
}
