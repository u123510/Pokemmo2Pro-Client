package cn.pokemmo.ui.widget.menu;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.menu.BasePopupMenuWidget;

public class ItemUseContextMenuWidget extends BasePopupMenuWidget {
    public final QT UH0;

    public ItemUseContextMenuWidget(QT owner) {
        super();
        this.UH0 = owner;
    }

    @Override
    public final boolean nd0(i70_0 event) {
        if (E00.ZU(event.zu) && event.iT()) {
            boolean special = rp_0.JI();
            if (this.UH0.v70.Of() && !special) {
                int flags = event.finally$;
                if ((flags & 256) == 0) {
                    rp_0 binding = rp_0.I90;
                    if (binding != null && binding.Ov(flags)) {
                        return false;
                    }
                    binding = rp_0.Ni;
                    if (binding != null && binding.Ov(flags)) {
                        return false;
                    }
                    binding = rp_0.kC0;
                    if (binding != null && binding.Ov(flags)) {
                        return false;
                    }
                    binding = rp_0.synchronized$;
                    if (binding != null && binding.Ov(flags)) {
                        return false;
                    }
                    if (flags == 66) {
                        this.Uz(1, true);
                        return true;
                    }
                }
            }

            int flags = event.finally$;
            rp_0 binding = rp_0.kC0;
            if (binding != null && binding.Ov(flags)) {
                NK value = this.UH0.Uc0();
                value.EP(value.yM);
                return true;
            }
        }
        return super.nd0(event);
    }
}
