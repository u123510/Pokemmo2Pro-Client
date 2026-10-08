package cn.pokemmo.ui.input;

import f.hl_2;
import f.lg_0;

public abstract class GlobalClipboardSetter {
    public static void setClipboard(String string) {
        hl_2 hl_22 = lg_0.k.E00;
        if (hl_22 == null) {
            return;
        }
        hl_22.getClass();
        hl_2.Ja0(string);
    }

    public static void ZN(String string) {
        setClipboard(string);
    }
}
