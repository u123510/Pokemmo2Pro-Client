package cn.pokemmo.ui.widget.component;

import f.a9_0;

public class NamedActionMenuItem extends a9_0 {
    public final Runnable Hy;
    public final int By;

    public NamedActionMenuItem(String string, Runnable runnable, int n) {
        super(string);
        this.Hy = runnable;
        this.By = n;
    }
}
