package cn.pokemmo.ui.widget.text.tag;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.text.tag.BaseTaggedLabelWidget;

public class RankTierTagLabel extends BaseTaggedLabelWidget {
    public RankTierTagLabel(lpt2__5 value, boolean showQuantity) {
        super("", 160, 32);
        this.uf("market-button");

        StringBuilder prefix = new StringBuilder();
        String quantity;
        if (value.n7() > 1 || showQuantity) {
            quantity = new StringBuilder()
                    .append(value.n7())
                    .append("x ")
                    .toString();
        } else {
            quantity = "";
        }

        this.SU(prefix.append(quantity).append(value.JJ0()).toString());
        if (value.k6() == null) {
            this.sl().Nk(new Wr[]{gh_1.Jh0().Xj0(value.gk())});
            this.sl().Gy0(123, 3);
            this.sl().nq0(24, 24);
        }

        if (tw0_0.kz0()) {
            this.xf0(500, 64);
            this.sl().Gy0(this.Se() / 2 - 24, 3);
            this.sl().nq0(48, 48);
        }
    }

    public RankTierTagLabel(cq_0 value) {
        super("", 160, 32);
        this.uf("market-button");
        this.SU(value.zj());
        this.sl().o60(yh_0.Dl0().qC0(value.Nm(), (byte)0, false));
        this.sl().Gy0(123, -7);
        this.sl().nq0(36, 36);

        if (tw0_0.kz0()) {
            this.xf0(320, 64);
        }
    }
}
