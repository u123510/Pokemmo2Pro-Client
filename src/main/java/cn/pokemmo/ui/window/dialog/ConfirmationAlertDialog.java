package cn.pokemmo.ui.window.dialog;

import f.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ConfirmationAlertDialog extends vu_0 {
    public final ArrayList w7;

    public ConfirmationAlertDialog() {
        super();
        this.w7 = new ArrayList();
    }

    public ConfirmationAlertDialog(Collection values) {
        super();
        this.w7 = new ArrayList(values);
    }

    public ConfirmationAlertDialog(Object... values) {
        super();
        this.w7 = new ArrayList(Arrays.asList(values));
    }

    @Override
    public final Object YS(int index) {
        return this.w7.get(index);
    }

    @Override
    public final int ul0() {
        return this.w7.size();
    }

    public final void Ii(Object value) {
        int index = this.w7.size();
        this.w7.add(index, value);
        this.su(index, index);
    }

    public final void A3(Object value) {
        this.w7.add(0, value);
        this.su(0, 0);
    }

    public final void Va(int index) {
        this.w7.remove(index);
        ne_2[] listeners = this.Nw;
        if (listeners != null) {
            for (ne_2 listener : listeners) {
                listener.Oy(index, index);
            }
        }
    }
}
