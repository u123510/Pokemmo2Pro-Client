package cn.pokemmo.ui.widget.model;

import f.FT;
import f.Mz0;
import f.jb0_1;

public class TableModelAdapter extends FT {
    public final Mz0 Yz0;

    public TableModelAdapter(Mz0 mz0, jb0_1 jb0_1) {
        super(jb0_1);
        this.Yz0 = mz0;
    }

    @Override
    public Object Sx(int i) {
        return this.Yz0.W10.ba[i];
    }
}
