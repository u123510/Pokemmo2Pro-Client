package cn.pokemmo.ui.widget.text;

import f.*;
import java.util.*;

public class IconPrefixLabel extends BaseLabel {
    public final s7_0 b3;
    public final String em0;

    public IconPrefixLabel(s7_0 v1, String v2, String v3) {
        super(v2);
        this.b3 = v1;
        this.em0 = v3;
    }

    public final boolean nd0(i70_0 v1) {
        int i2 = v1.zu;
        if (E00.C10(i2) && i2 == 3) {
            return this.b3.Zm.gy0(v1, this.em0);
        }
        return super.nd0(v1);
    }
}
