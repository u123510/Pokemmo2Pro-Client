package cn.pokemmo.ui.widget;

import f.*;
import java.util.Iterator;

/**
 * 现代化重构类 - 原始混淆类: f.M5
 */
public class Modern_Ui_M5 extends P8 implements GF0 {

    public Modern_Ui_M5() {
        super();
    }

    public final XS i00(int value, fy_2 container) {
        XS component = new XS((M5)this, value);
        component.gn(container);
        X1 control = component.s90;
        this.ms0.F9(this.ms0.fU(), control);
        this.g6.add(component);
        if (this.g6.size() == 1) {
            this.Zd(component);
        }
        this.g30();
        return component;
    }

    public final void Tj() {
        Iterator iterator = this.g6.iterator();
        while (iterator.hasNext()) {
            com2__3 component = (com2__3) iterator.next();
            if (component instanceof XS) {
                ((XS) component).Tj();
            }
        }
    }
}

