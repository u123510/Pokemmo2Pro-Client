package cn.pokemmo.ui.widget.text.tag;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.text.tag.BaseTaggedLabelWidget;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public abstract class ItemQualityTagLabel extends qj_2 implements PropertyChangeListener {
    public final r7 sT;

    public ItemQualityTagLabel(r7 owner, String name, Wr icon, int width, int height) {
        super(name);
        this.sT = owner;
        this.sl().Nk(icon);
        int scale = owner.cOm6;
        this.sl().Gy0(scale * width, scale * height);
        this.sl().nq0(scale * 24, scale * 24);
        this.yU();
    }

    @Override
    public final void C(zk0_1 screen) {
        super.C(screen);
        this.sT.gn(this);
    }

    @Override
    public final void N00(zk0_1 screen) {
        this.sT.Ag(this);
        super.N00(screen);
    }

    @Override
    public final void propertyChange(PropertyChangeEvent event) {
        this.yU();
    }

    public final void yU() {
        this.pw0(this.sT.w1);
        this.yj0 = null;
        this.yB0();
        this.SU(this.sT.ln);
    }
}
