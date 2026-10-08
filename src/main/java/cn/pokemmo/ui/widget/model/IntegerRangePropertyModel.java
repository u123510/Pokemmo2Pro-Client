package cn.pokemmo.ui.widget.model;

import f.p7_0;

public interface IntegerRangePropertyModel extends p7_0 {
    int getValue();

    int getMinimum();

    int getMaximum();

    void setValue(int val);

    default int vu0() {
        return getMinimum();
    }

    default int OD() {
        return getMaximum();
    }

    default void X90(int var1) {
        setValue(var1);
    }
}
