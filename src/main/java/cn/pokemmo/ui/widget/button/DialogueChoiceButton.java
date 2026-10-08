package cn.pokemmo.ui.widget.button;

import f.*;
import java.util.*;

public class DialogueChoiceButton extends BaseButton {
    public final ng_2 Ju;
    public DialogueChoiceButton(ng_2 source, String text) { super(text); this.Ju = source; }
    @Override public final boolean nd0(i70_0 value) { return this.Ju.mA0.nd0(value); }
}
