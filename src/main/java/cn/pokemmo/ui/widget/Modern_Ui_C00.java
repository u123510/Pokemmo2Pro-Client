package cn.pokemmo.ui.widget;

import f.*;
import cn.pokemmo.ui.widget.slot.CosmeticDressSlotWidget;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 现代化重构类 - 原始混淆类: f.c0_0
 */
public class Modern_Ui_C00 implements Runnable {

    public final CosmeticDressSlotWidget Dc;

    public Modern_Ui_C00(CosmeticDressSlotWidget owner) {
        this.Dc = owner;
    }

    @Override
    public final void run() {
        Qy0.yI0.zm0();
        Vt0 panel = new Vt0();
        byte currentRegion = tw0_0.e60.Com4;
        HashMap<Integer, List<K5>> groups = new HashMap<>();
        for (K5 item : tw0_0.rl.NC[1].KL()) {
            mc0_1 species = item.cL;
            byte region = item.nn.Ps;
            if (species.Yt0 != l5_0.Hj || (region != currentRegion && region != -1) || !species.Iq.yt()) {
                continue;
            }
            groups.computeIfAbsent(species.pe(), ignored -> new ArrayList<>()).add(item);
        }
        for (Map.Entry<Integer, List<K5>> group : groups.entrySet()) {
            List<K5> items = group.getValue();
            r7 category = new r7(sm0_0.c0(group.getKey() + 10000), gh_1.aH0.Jg((short)5459, false));
            if (items.isEmpty()) {
                continue;
            }
            panel.hx.add(category);
            Collections.sort(items, new Wz0());
            for (K5 item : items) {
                category.hx.add(new kf0_1(item.nn.PA0 + "x " + item.Ua(), gh_1.aH0.F10(item.cL, false), 3, 3, 24, 24, new ig0_1(this.Dc, item), true));
            }
        }
        if (panel.hx.size() < 1) {
            panel.mA0(sm0_0.c0(6007), new qp0_0());
        }
        UA.zd(panel, this.Dc);
    }
}

