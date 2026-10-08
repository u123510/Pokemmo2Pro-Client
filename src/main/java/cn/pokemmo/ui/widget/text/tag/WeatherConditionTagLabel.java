package cn.pokemmo.ui.widget.text.tag;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.text.tag.BaseTaggedLabelWidget;

public class WeatherConditionTagLabel extends BaseTaggedLabelWidget implements GF0 {
    public int tB0;

    public WeatherConditionTagLabel(int i) {
        super(0, 0);
        bg0(i);
    }

    public final void Tj() {
        SU(sm0_0.c0(this.tB0));
    }

    public final void bg0(int i) {
        if (i != this.tB0) {
            this.tB0 = i;
            SU(sm0_0.c0(i));
        }
    }
}
