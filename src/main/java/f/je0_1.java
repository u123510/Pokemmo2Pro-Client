package f;

import cn.pokemmo.ui.widget.component.ToggleableComponent;

public interface je0_1 extends ToggleableComponent {
    @Override
    boolean i80();

    @Override
    default boolean isToggled() {
        return i80();
    }
}
