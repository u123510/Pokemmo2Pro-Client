/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.widget.model.state;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import cn.pokemmo.ui.widget.model.state.BaseObservableStateModel;

import f.E7;
import f.a7_0;
import f.xp_1;

public class MarketTradeListingStateModel extends BaseObservableStateModel
implements E7 {
    public boolean rl = false;

    @Override
    public final boolean getValue() {
        return this.rl;
    }

    @Override
    public final void Dc0(boolean bl) {
        if (this.rl != bl) {
            this.rl = bl;
            a7_0.bH(this.RD0);
        }
    }
}

