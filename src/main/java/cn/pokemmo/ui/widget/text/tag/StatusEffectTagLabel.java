package cn.pokemmo.ui.widget.text.tag;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.text.tag.BaseTaggedLabelWidget;

public class StatusEffectTagLabel extends BaseTaggedLabelWidget {
    public StatusEffectTagLabel(lf0_0 owner, Fr0 value, int index) {
        super("", index * 16, index * 16);
        this.sl().o60(i5_0.Jg0().Me0());
        this.sl().Gy0(index * -3, index * -3);
        this.sl().hG();
        this.sl().C80(800);
        this.sl().nq0(index * 16, index * 16);
        this.uf("townmap-cursor");
        this.RR(() -> owner.dq(value));
    }
}
