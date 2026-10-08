package cn.pokemmo.ui.widget.button;

import f.*;
import cn.pokemmo.ui.widget.text.tag.ServerRegionTagLabel;
import java.util.*;

public class QuickSlotActionButton extends BaseButton {
    public final ServerRegionTagLabel Vz0;

    public QuickSlotActionButton(ServerRegionTagLabel sg_2) {
        super("");
        this.Vz0 = sg_2;
    }

    @Override
    public final boolean nd0(i70_0 i70_0) {
        return false;
    }

    public final void Kp0(zk0_1 zk0_1, int i, int j, int k) {
        this.Vz0.Kp0(zk0_1, i, j, k);
    }
}
