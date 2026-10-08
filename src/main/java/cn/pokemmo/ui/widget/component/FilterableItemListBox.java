package cn.pokemmo.ui.widget.component;

import f.*;

import com.badlogic.gdx.graphics.Color;

public class FilterableItemListBox extends h20_0 {
    public static FilterableItemListBox kX;
    public static Color OP;
    public static Color tR;
    public static Color WB;
    public es_1 mT;

    public FilterableItemListBox() {
        this.mT = new es_1();
    }

    static {
        if (f.ok_0.kX == null) {
            try {
                Class.forName(f.ok_0.class.getName());
            } catch (Throwable ignored) {}
        }
    }

    @Override
    public final void EE0(A40 target, int kind, float x, float y, float width, float height) {
        if (this.mT == null) {
            this.mT = new es_1();
        }
        Color color = Color.RED;
        if (kind == 0) {
            throw new NullPointerException();
        }
        int value = kind - 1;
        if (value == 2) {
            color = OP;
        } else if (value == 3) {
            color = tR;
        } else if (value == 4) {
            color = WB;
        }
        UC0 item = (UC0)UC0.rd.obtain();
        item.j80 = x;
        item.Wm0 = y;
        item.IA = width;
        item.Eu0 = height;
        item.Cl0 = color;
        item.rA0 = target;
        this.mT.Ue0(item);
    }

    @Override
    public final void S50(A40 target) {
        if (this.mT == null) {
            this.mT = new es_1();
        }
        es_1 selected = new es_1();
        I2 iterator = this.mT.ZD();
        while (iterator.hasNext()) {
            UC0 item = (UC0)iterator.next();
            if (item.rA0 == target) {
                selected.Ue0(item);
            }
        }
        UC0.rd.freeAll(selected);
        this.mT.fp0(selected, true);
    }

    @Override
    public final j1_0 aM(bk_2 source) {
        A40 target = (A40)source;
        j1_0 result = new j1_0();
        result.Rr0 = source;
        return result;
    }
}
