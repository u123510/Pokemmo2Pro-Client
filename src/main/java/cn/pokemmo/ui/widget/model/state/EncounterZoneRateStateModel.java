/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.widget.model.state;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import cn.pokemmo.ui.widget.model.state.BaseObservableStateModel;

import f.V;
import f.V7;
import f.xp_1;

public class EncounterZoneRateStateModel extends BaseObservableStateModel
implements V {
    public final int ud0;
    public final /* synthetic */ V7 Xt;

    public EncounterZoneRateStateModel(int n, V7 v7) {
        this.Xt = v7;
        this.ud0 = n;
    }

    @Override
    public final int OD() {
        return 255;
    }

    @Override
    public final int vu0() {
        return 0;
    }

    @Override
    public final int getValue() {
        return this.Xt.u20 >> this.ud0 & 0xFF;
    }

    @Override
    public final void X90(int n) {
        V7 v7 = this.Xt;
        int n2 = this.ud0;
        v7.cS(v7.u20 & ~(255 << n2) | n << n2);
    }
}

