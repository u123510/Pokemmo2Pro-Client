package cn.pokemmo.ui.widget.component;

import f.OE0;

public interface ToggleableComponent extends OE0 {
    boolean isToggled();

    default boolean i80() {
        return isToggled();
    }
}
