package cn.pokemmo.ui.widget.text.tag;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.text.tag.BaseTaggedLabelWidget;

public class PokedexStatusTagLabel extends BaseTaggedLabelWidget {
    public final int fe0;
    public final pv_0 hZ;
    public final Ou0 ja;
    public final gb_0 tO;
    public final wt_0 ov;

    public PokedexStatusTagLabel(wt_0 owner, int x, int y, int scale,
                pv_0 pixels, Ou0 model, gb_0 palette) {
        super(x, y);
        this.ov = owner;
        this.fe0 = scale;
        this.hZ = pixels;
        this.ja = model;
        this.tO = palette;
    }

    @Override
    public final boolean nd0(i70_0 input) {
        if (input.zu != 5) {
            return super.nd0(input);
        }
        int width = (input.f8 - this.A20) / this.fe0;
        int height = (input.AN - this.SB0) / this.fe0;
        am_2 decoder = this.ov.i1;
        pv_0 pixels = this.hZ;
        byte[] data = pixels.break$();
        int index = height * pixels.kK0 + width;
        if (index < 0 || width < 0 || index >= data.length) {
            return false;
        }
        int value = data[index];
        int format = pixels.bh0.FH;
        if (format == 0) {
            value &= 31;
        } else if (format >= 1 && format <= 3) {
            value &= 255;
        } else if (format == 5) {
            value &= 7;
        } else {
            value = 0;
        }
        this.ov.Ob(this.ja, pixels, this.tO, value);
        return true;
    }
}
