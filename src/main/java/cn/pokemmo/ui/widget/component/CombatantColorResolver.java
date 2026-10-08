package cn.pokemmo.ui.widget.component;

import f.Mm;
import f.Ss0;
import f.f00_0;
import f.gn_0;
import f.le0_2;
import f.q10_0;
import f.qe0_2;
import f.yb_1;

public class CombatantColorResolver extends Mm {
    public final f00_0 ut0;

    public CombatantColorResolver(f00_0 owner, le0_2 view) {
        super(view);
        this.ut0 = owner;
    }

    @Override
    public short ck0(q10_0 type) {
        short value = this.ut0.ko0.n4.pr[type.iL];
        if (Ss0.Fv(type, value) > Ss0.C70
                && yb_1.f9(this.ut0.ko0.n4.iu0[type.iL]) != yb_1.Cy0) {
            value = Ss0.Fv(type, value);
        }
        return value;
    }

    @Override
    public gn_0 xG0(q10_0 type) {
        qe0_2 data = this.ut0.ko0.n4;
        if (data.Fw == -1) {
            return gn_0.BLACK;
        }
        short value = data.pr[type.iL];
        if (Ss0.Fv(type, value) > Ss0.C70
                && yb_1.f9(data.iu0[type.iL]) != yb_1.Cy0) {
            value = Ss0.Fv(type, value);
        }
        if (!type.Yy(value)) {
            return gn_0.WHITE;
        }
        yb_1 palette = yb_1.f9(data.iu0[type.iL]);
        return new gn_0((byte) palette.cOM7.Cc(),
                (byte) palette.cOM7.TB0(),
                (byte) palette.cOM7.tr(),
                (byte) (palette.TH * 2));
    }
}
