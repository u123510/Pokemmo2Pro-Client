package cn.pokemmo.ui.widget.component;

import f.KG0;
import f.cn_0;

public abstract class NamedComponentFactory {
    public static cn_0 df(KG0 kG0, int n, String string) {
        cn_0 cn_02 = new cn_0(kG0, n);
        cn_02.Sk(string);
        return cn_02;
    }
}
