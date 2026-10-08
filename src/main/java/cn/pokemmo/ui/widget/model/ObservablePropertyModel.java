package cn.pokemmo.ui.widget.model;

import f.u1_0;

public interface ObservablePropertyModel {
    void addChangeListener(Runnable listener);

    void removeChangeListener(u1_0 listener);

    default void Kj(Runnable var1) {
        addChangeListener(var1);
    }

    default void j00(u1_0 var1) {
        removeChangeListener(var1);
    }
}
