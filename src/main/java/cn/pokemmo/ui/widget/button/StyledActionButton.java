package cn.pokemmo.ui.widget.button;

import f.*;
import java.util.*;

public class StyledActionButton extends BaseButton {
    public final rn0_0 lpT6;

    public StyledActionButton(rn0_0 p1, String p2) {
        super(p2);
        this.lpT6 = p1;
    }

    public final boolean nd0(i70_0 p1) {
        int eventType = p1.zu;
        if (E00.C10(eventType) && eventType == 5) {
            this.lpT6.getClass();
            rn0_0.jd();
            return true;
        }
        return super.nd0(p1);
    }
}
