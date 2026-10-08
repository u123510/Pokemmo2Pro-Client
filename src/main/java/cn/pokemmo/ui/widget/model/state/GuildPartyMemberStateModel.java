package cn.pokemmo.ui.widget.model.state;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import cn.pokemmo.ui.widget.model.state.BaseObservableStateModel;

import java.util.Collections;
import java.util.Iterator;

public class GuildPartyMemberStateModel extends BaseObservableStateModel implements sz_0 {
    public final D90 FN;
    public B60 ro0;

    public GuildPartyMemberStateModel() {
        super();
        this.FN = new D90();
    }

    public final void xc(String value) {
        D90 parser = new D90(this.FN);
        parser.cR(I0.PREFORMATTED, Boolean.TRUE);
        this.ro0 = new B60(parser, value);
        a7_0.bH(this.RD0);
    }

    @Override
    public final Iterator iterator() {
        if (this.ro0 != null) {
            return Collections.singletonList(this.ro0).iterator();
        }
        return Collections.emptyList().iterator();
    }
}
