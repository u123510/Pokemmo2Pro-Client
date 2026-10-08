package cn.pokemmo.ui.widget.component;

import f.co0;

public interface MenuOptionProvider {
    co0[] getOptions();

    default co0[] je0() {
        return getOptions();
    }
}
