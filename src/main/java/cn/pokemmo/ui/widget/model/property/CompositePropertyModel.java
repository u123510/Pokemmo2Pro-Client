package cn.pokemmo.ui.widget.model.property;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.util.ArrayList;
import java.util.Iterator;

public class CompositePropertyModel extends BaseObservablePropertyModel implements Iterable {
    public static final MD0 p10;
    public final ArrayList hx;

    public CompositePropertyModel() {
        super();
        this.hx = new ArrayList();
    }

    public CompositePropertyModel(String name) {
        super(name);
        this.hx = new ArrayList();
    }

    static {
        p10 = MD0.cB("hasOpenMenus");
    }

    @Override
    public final Iterator iterator() {
        return this.hx.iterator();
    }

    public final void mA0(String name, Runnable action) {
        this.hx.add(new at_0(name, action));
    }

    @Override
    public le0_2 pl0(TJ0 context, int index) {
        Z80 submenu = new Z80((EP) (Object) this, context, index);
        if (this.F0 != null) {
            submenu.uf(this.F0);
        } else {
            submenu.uf("submenu");
        }
        return submenu;
    }

    public le0_2 tU(TJ0 context, int index, le0_2 owner) {
        int size = this.hx.size();
        le0_2[] items = new le0_2[size];
        int itemCount = this.hx.size();
        for (int i = 0; i < itemCount; ++i) {
            items[i] = ((q90_0) this.hx.get(i)).pl0(context, index);
        }

        X80 menu = new X80(index, (EP) (Object) this, owner);
        menu.WQ(menu.hb(items));
        I7 layout = new I7(menu);

        String style = "menuitem";
        MD0 notFirst = MD0.cB(style.concat("NotFirst"));
        MD0 notLast = MD0.cB(style.concat("NotLast"));
        for (int i = 0; i < size; ++i) {
            if (i > 0) {
                layout.Vv(new al_1(menu, style));
            }

            le0_2 item = items[i];
            layout.Kn0(item);
            KG0 state = item.M;
            state.j70(notFirst, i > 0);
            state.j70(notLast, i < size - 1);
        }

        menu.x40(layout);
        return menu;
    }
}
