package cn.pokemmo.ui.widget.text;

import f.*;
import java.util.*;

public class RichParagraphLabel extends BaseLabel {
    public RichParagraphLabel() {
        super(new tq_0());
    }

    public RichParagraphLabel(E7 value) {
        super(new tq_0(value));
    }

    public RichParagraphLabel(String text) {
        this();
        this.SU(text);
    }

    @Override
    public String Ck() {
        return "togglebutton";
    }

    public final boolean VZ() {
        return this.ER.U20();
    }

    public final void k50(boolean value) {
        this.ER.lK0(value);
    }
}
