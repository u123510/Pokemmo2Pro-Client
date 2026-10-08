package cn.pokemmo.game.event;

import f.*;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class GameEventConstantsRegistry {
    public static final CopyOnWriteArrayList ui0 = new CopyOnWriteArrayList();
    public static le0_2 bF0;

    public static boolean v90(le0_2 widget) {
        if (widget == null) {
            return false;
        }
        CopyOnWriteArrayList list = ui0;
        if (list.contains(widget)) {
            widget.BL();
            return true;
        }
        bF0 = widget;
        if (!yJ(widget)) {
            for (Object value : list) {
                le0_2 current = (le0_2) value;
                if (!current.Of()) {
                    continue;
                }
                if (widget.Bf0(current)) {
                    continue;
                }
                if (lpt3__1.sk) {
                    System.out.println("ignore list focus " + widget);
                }
                return false;
            }
        }
        widget.BL();
        return true;
    }

    public static boolean yJ(le0_2 widget) {
        if (widget instanceof uf0_0 || widget instanceof ng_2 || widget instanceof lpt3__4) {
            return true;
        }
        le0_2 parent = widget.K20;
        return parent != null && yJ(parent);
    }

    public static void mG(le0_2 widget) {
        ui0.add(widget);
    }

    public static void qK0(le0_2 widget, boolean index) {
        if (widget == null) {
            return;
        }
        if (!ui0.remove(widget)) {
            return;
        }
        try {
            int i = index ? 1 : 0;
            while (i < widget.fU()) {
                qK0(widget.qA(i), true);
                i++;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
