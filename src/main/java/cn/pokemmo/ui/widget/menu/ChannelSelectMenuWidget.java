package cn.pokemmo.ui.widget.menu;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.menu.BasePopupMenuWidget;

public class ChannelSelectMenuWidget extends BasePopupMenuWidget {
    public final ChatFilterMenuWidget yd0;

    public ChannelSelectMenuWidget(ChatFilterMenuWidget owner) {
        this.yd0 = owner;
    }

    @Override
    public final boolean nd0(i70_0 value) {
        if (!E00.ZU(value.zu) || !value.iT()) {
            return super.nd0(value);
        }
        boolean special = (value.finally$ & 256) != 0 || this.K() instanceof cg_0;
        if (special) {
            if (value.finally$ == 66) {
                this.yd0.rT();
                return true;
            }
            if (!rp_0.JI()) {
                return super.nd0(value);
            }
        }
        int flags = value.finally$;
        rp_0 first = rp_0.I90;
        if (first != null && first.Ov(flags)) {
            this.Uz(-1, true);
            return true;
        }
        flags = value.finally$;
        rp_0 second = rp_0.Ni;
        if (second != null && second.Ov(flags)) {
            this.Uz(1, true);
            return true;
        }
        flags = value.finally$;
        rp_0 third = rp_0.synchronized$;
        if (third != null && third.Ov(flags)) {
            this.yd0.sd0(0, 0);
            return true;
        }
        flags = value.finally$;
        rp_0 fourth = rp_0.nK0;
        if (fourth != null && fourth.Ov(flags) && !special) {
            this.yd0.Ag0.hq.f00();
            lpt6__0.v90(this.yd0.Ag0.hq);
            return true;
        }
        return super.nd0(value);
    }
}
