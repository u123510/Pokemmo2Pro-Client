package f;

import cn.pokemmo.ui.widget.component.MenuOptionProvider;
import f.co0;

public interface xo_1 extends MenuOptionProvider {
    @Override
    co0[] je0();

    @Override
    default co0[] getOptions() {
        return je0();
    }
}
