package cn.pokemmo.ui.widget.slot;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.slot.BaseCompositeSlotWidget;

public class BagInventoryItemSlotWidget extends BaseCompositeSlotWidget {
    public final IA g1;

    public BagInventoryItemSlotWidget(IA ia, IA ia2, short s, CH0 ch0, short s2) {
        super(ia2, s, ch0, s2);
        this.g1 = ia;
    }

    @Override
    public final boolean nd0(i70_0 i70_0) {
        if (E00.C10(i70_0.zu) && this.g1.fh0) {
            super.nd0(i70_0);
            return this.g1.nd0(i70_0);
        }
        return super.nd0(i70_0);
    }
}
